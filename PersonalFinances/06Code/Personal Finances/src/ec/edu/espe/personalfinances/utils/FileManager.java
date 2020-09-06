/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author OneTouchEspe
 */
public class FileManager {

    private static FileManager instance = null;

    private FileManager() {

    }

    public void saveJsonArrayIntoFile(String name, JSONArray jsonArray) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter(name);
        fileWriter.write(gson.toJson(jsonArray));
        fileWriter.close();

    }

    public void saveJsonObjectIntoFile(String fileName, JSONObject jsonObject) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(gson.toJson(jsonObject));
        fileWriter.close();
    }

    public void readFile(String fileName) throws FileNotFoundException, IOException {

        FileReader fileReader = new FileReader(fileName);
        fileReader.close();

    }

    public JSONArray convertFileToJsonArray(String fileName) throws FileNotFoundException, ParseException, IOException {
        FileReader fileReader = new FileReader(fileName);
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(fileName);
        fileReader.close();
        return jsonArray;
    }

    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

}
