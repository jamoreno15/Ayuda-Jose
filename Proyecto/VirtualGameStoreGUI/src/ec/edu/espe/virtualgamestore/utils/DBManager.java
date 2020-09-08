/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.utils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.virtualgamestore.gui.view.FrmGameAdmin;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.json.simple.JSONObject;

/**
 *
 * @author JavaMasters
 */
public class DBManager {

    private static DBManager instance = null;
    public MongoDatabase connection;

    private DBManager() {
        connection = startConnection();
    }

    private MongoDatabase startConnection() {
        try {
            String[] configuration = getConfiguration();
            String uri = "mongodb+srv://";
            uri += configuration[0] + ":";
            uri += configuration[1] + "@";
            uri += configuration[2] + "/";
            uri += configuration[3] + "?retryWrites=true&w=majority";
            MongoClientURI connectionString = new MongoClientURI(uri);
            MongoClient mongoClient = new MongoClient(connectionString);
            return mongoClient.getDatabase(configuration[3]);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private String[] getConfiguration() throws FileNotFoundException {
        String[] configuration = new String[4];
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("HostConfiguration.json"));
        JSONObject jsonConfig = gson.fromJson(reader, JSONObject.class);
        System.out.println("ARCHIVE: " + jsonConfig.toJSONString());
        configuration[0] = (String) jsonConfig.get("username");
        configuration[1] = (String) jsonConfig.get("password");
        configuration[2] = (String) jsonConfig.get("host");
        configuration[3] = (String) jsonConfig.get("database");
        return configuration;
    }

    public static DBManager getInstance() {
        if (instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    public void saveData(String collection, Document document) {
        MongoCollection<Document> addCollection = connection.getCollection(collection);
        addCollection.insertOne(document);

    }

    /*public void saveConsoles(String id, String name, String price, String edition) {
        BasicDBObject document = new BasicDBObject();
        document.put("Id", "'" + id + "'");
        document.put("Name", "'" + name + "'");
        document.put("Price", "'" + price + "'");
        document.put("Edition", "'" + edition + "'");
        dbNames.insert(document);

    }

    public void saveAccesory(String id, String name, String price, String color) {
        BasicDBObject document = new BasicDBObject();
        document.put("Id", "'" + id + "'");
        document.put("Name", "'" + name + "'");
        document.put("Price", "'" + price + "'");
        document.put("Color", "'" + color + "'");
        dbNames.insert(document);

    }

    public void saveToy(String id, String name, String size, String material, String price) {
        BasicDBObject document = new BasicDBObject();
        document.put("Id", "'" + id + "'");
        document.put("Name", "'" + name + "'");
        document.put("Size", "'" + size + "'");
        document.put("Material", "'" + material + "'");
        document.put("Price", "'" + price + "'");
        dbNames.insert(document);

    }*/
}
