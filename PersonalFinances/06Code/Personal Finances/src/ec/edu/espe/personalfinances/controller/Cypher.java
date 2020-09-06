/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.controller;

/**
 *
 * @author OneTouchEspe
 */
public class Cypher {

    public static String encrypt(String password) {

        char save[];
        save = password.toCharArray();
        for (int i = 0; i < save.length; i++) {
            save[i] = (char) (save[i] + (char) 1);

        }
        String passwordEncryption = String.valueOf(save);
        return passwordEncryption;
    }

    public static String decrypt(String encrypted) {
        char save[];
        save = encrypted.toCharArray();
        for (int i = 0; i < save.length; i++) {
            save[i] = (char) (save[i] - (char) 1);

        }
        String passwordDecryption = String.valueOf(save);
        return passwordDecryption;
    }
}
