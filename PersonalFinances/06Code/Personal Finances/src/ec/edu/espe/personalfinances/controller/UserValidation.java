/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.personalfinances.model.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author OneTouchEspe
 */
public class UserValidation {

    File file = null;
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    ArrayList<User> user = new ArrayList<>();
    Gson gson = new Gson();
    String line;
    String jsonReader = "";

    public boolean validateUser(String userValidator) {
        boolean confirmation = false;
        try {

            file = new File("User.json");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {

                jsonReader = jsonReader + line;

            }
            jsonReader = jsonReader.replace("\\", "");

            java.lang.reflect.Type usersType = new TypeToken<ArrayList<User>>() {
            }.getType();

            user = gson.fromJson(jsonReader, usersType);

            for (User username : user) {
                if (userValidator.equals(username.getUsername())) {
                    JOptionPane.showMessageDialog(null, "Your username is already in"
                            + " use, please choose another username");
                    return true;
                }
            }

        } catch (Exception e) {

        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (IOException ex) {
            }

        }
        return confirmation;
    }

}
