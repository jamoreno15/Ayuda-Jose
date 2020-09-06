/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.virtualgamestore.gui.view.FrmLogInUser;
import ec.edu.espe.virtualgamestore.gui.view.FrmPrincipalMenuUser;
import ec.edu.espe.virtualgamestore.model.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Virtual Game Store
 */
public class FileManager {

    public void logInJson(String user, String password, String fileName) {
        JSONArray jsonArray = new JSONArray();
        Object object = null;
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader file = new FileReader(fileName);
            object = jsonParser.parse(file);
            jsonArray = (JSONArray) object;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error has ocurred");
        }

        JSONObject object2 = new JSONObject();
        int size = jsonArray.size();
        object2.put("name", user);
        object2.put("Password", password);
        for (int i = 0; i < size; i++) {
            if (object2.equals(jsonArray.get(i))) {
                FrmLogInUser frmLogIn = new FrmLogInUser();
                frmLogIn.setVisible(false);

                FrmPrincipalMenuUser frmPrincipalMenu = new FrmPrincipalMenuUser();
                frmPrincipalMenu.setVisible(true);

                break;
            } else if (i == size - 1) {
                JOptionPane.showMessageDialog(null, "Incorrect User or Password");
            }
        }
    }

    public void registerJson(String password, String email, String user,String age) {

        JSONArray jsonUsers = new JSONArray();
        JSONArray jsonUserData = new JSONArray();
        JSONObject object = new JSONObject();
        JSONParser jsonParser = new JSONParser();
        JSONObject object2 = new JSONObject();
        JSONParser jsonParser2 = new JSONParser();

        try {
            FileReader fileUserData = new FileReader("UserData.json");
            jsonUserData = (JSONArray) jsonParser.parse(fileUserData);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error has ocurred");
        }
        try {
            FileReader fileUsers = new FileReader("Users.json");
            jsonUsers = (JSONArray) jsonParser2.parse(fileUsers);

        } catch (Exception ex) {

        }

        object.put("Password", password);
        object.put("Email", email);
        object2.put("name", user);
        object2.put("Password",password);
        object.put("Age", age);
        object.put("name", user);
        object.put("Password", password);
        jsonUserData.add(object);
        jsonUsers.add(object2);

        //////////////////////////////////////////////////////////////////////////
        File file2 = null;
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        ArrayList<User> name = new ArrayList<>();
        Gson gson = new Gson();
        String line;
        String userJson = "";
        try {

            file2 = new File("Users.json");
            fileReader = new FileReader(file2);
            bufferReader = new BufferedReader(fileReader);

            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);

                userJson = userJson + line;

            }
            userJson = userJson.replace("\\", "");
            //JOptionPane.showMessageDialog(rootPane, toysJson);
            java.lang.reflect.Type usersType = new TypeToken<ArrayList<User>>() {
            }.getType();

            name = gson.fromJson(userJson, usersType);

            for (User userName : name) {
                if (user.equals(userName.getName())) {
                    JOptionPane.showMessageDialog(null, "Your user is already in"
                            + " use, please choose another user");
                    return;
                }

            }

        } catch (Exception e) {
           
        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (IOException e2) {
            }

        }
        ////////////////////////////////////////////////////////////////////////////////

        try {
            FileWriter file = new FileWriter("Users.json");
            file.write(jsonUsers.toJSONString());
            FileWriter fileUsersData = new FileWriter("UserData.json");
            fileUsersData.write(jsonUserData.toJSONString());
            file.close();
            fileUsersData.close();
        } catch (Exception ex) {

        }
        JOptionPane.showMessageDialog(null, "Your User Is Register");
        FrmLogInUser frmLogIn = new FrmLogInUser();
        frmLogIn.setVisible(true);
      

    }
}
