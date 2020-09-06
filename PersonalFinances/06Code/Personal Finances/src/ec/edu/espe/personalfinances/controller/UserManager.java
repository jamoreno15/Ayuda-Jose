/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.personalfinances.model.User;
import ec.edu.espe.personalfinances.utils.FileManager;
import ec.edu.espe.personalfinances.view.FrmLogin;
import ec.edu.espe.personalfinances.view.FrmMainMenu;
import ec.edu.espe.personalfinances.view.FrmRegisterNewUser;
import java.io.FileReader;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author OneTouchEspe
 */
public class UserManager implements UserInterface {

    FileManager fileManager = FileManager.getInstance();
    Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
    JSONObject jsonObject = new JSONObject();
    JSONParser jsonParser = new JSONParser();
    JSONArray jsonArray = new JSONArray();
    Object object = null;
    FrmLogin login = new FrmLogin();
    FrmMainMenu mainMenu = new FrmMainMenu();
    FrmRegisterNewUser registerFrame = new FrmRegisterNewUser();
    UserValidation userValidation = new UserValidation();
    boolean confirmation = true;
    String blank = "";

    @Override
    public boolean writeUser(User user) {

        try {
            FileReader fileReader = new FileReader("User.json");
            jsonArray = (JSONArray) jsonParser.parse(fileReader);
            fileReader.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        jsonObject.put("username", user.getUsername());
        jsonObject.put("password", user.getPassword());
        jsonArray.add(jsonObject);

        if (userValidation.validateUser(user.getUsername())) {
            return confirmation = false;
        }

        if (user.getPassword().equals(blank) && user.getUsername().equals(blank)) {
            JOptionPane.showMessageDialog(null, "Username and Password fields are empty");
            return confirmation = false;
        }

        if (user.getUsername().equals(blank)) {
            JOptionPane.showMessageDialog(null, "Username field is empty");
            return confirmation = false;
        }

        if (user.getPassword().equals(blank)) {
            JOptionPane.showMessageDialog(null, "Password field is empty");
            return confirmation = false;
        }

        try {
            fileManager.saveJsonArrayIntoFile("User.json", jsonArray);
            JOptionPane.showMessageDialog(null, "The User is successfully registered");
            confirmation = true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error has ocurred");
            confirmation = false;

        }
        return confirmation;
    }

    @Override
    public boolean readUser(User user) {

        try {
            FileReader fileReader = new FileReader("User.json");
            object = jsonParser.parse(fileReader);
            jsonArray = (JSONArray) object;
            fileReader.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!! Try again");
            confirmation = false;
        }

        int size = jsonArray.size();
        jsonObject.put("username", user.getUsername());
        jsonObject.put("password", user.getPassword());
        if (user.getPassword().equals(blank) && user.getUsername().equals(blank)) {
            JOptionPane.showMessageDialog(null, "Username and Password fields are empty");
            return confirmation = false;
        }

        if (user.getUsername().equals(blank)) {
            JOptionPane.showMessageDialog(null, "Username field is empty");
            return confirmation = false;
        }

        if (user.getPassword().equals(blank)) {
            JOptionPane.showMessageDialog(null, "Password field is empty");
            return confirmation = false;
        }
        for (int i = 0; i < size; i++) {
            if (jsonObject.equals(jsonArray.get(i))) {
                JOptionPane.showMessageDialog(null, "Log in successfully, welcome!");
                confirmation = true;
                break;
            } else if (i == size - 1) {
                JOptionPane.showMessageDialog(null, "Incorrect User/Password");
                confirmation = false;
            }

        }
        return confirmation;
    }

    @Override
    public boolean readAdminUser(User user) {
        try {
            FileReader fileReader = new FileReader("AdminUsers.json");
            object = jsonParser.parse(fileReader);
            jsonArray = (JSONArray) object;
            fileReader.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!! Try again");
            confirmation = false;

        }

        int size = jsonArray.size();
        jsonObject.put("username", user.getUsername());
        jsonObject.put("password", user.getPassword());

        for (int i = 0; i < size; i++) {
            if (jsonObject.equals(jsonArray.get(i))) {
                JOptionPane.showMessageDialog(null, "Log in successfully, welcome!");
                confirmation = true;
                break;
            } else if (i == size - 1) {
                JOptionPane.showMessageDialog(null, "Incorrect User/Password");
                confirmation = false;
            }

        }
        return confirmation;
    }
}
