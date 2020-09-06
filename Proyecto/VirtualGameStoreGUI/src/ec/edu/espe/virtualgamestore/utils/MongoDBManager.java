/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.utils;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.ReadPreference;
import ec.edu.espe.virtualgamestore.model.Game;

import ec.edu.espe.virtualgamestore.model.User;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Cursor;

/**
 *
 * @author JavaMasters
 */
public class MongoDBManager implements IDataAccessObject {

    Mongo mongo;
    DB db;
    DBCollection dBCollection;
    DBObject dBObject;
    BasicDBObjectBuilder basicDBObject = BasicDBObjectBuilder.start();

    private DBObject createDBObject(Object object) {
        if (object instanceof Game) {
            basicDBObject.append("id", "" + ((Game) object).getId() + "");
            basicDBObject.append("name", "" + ((Game) object).getName() + "");
            basicDBObject.append("price", "" + String.valueOf(((Game) object).getPrice()) + "");
            basicDBObject.append("color", "" + ((Game) object).getColor() + "");
            basicDBObject.append("quantity", "" + ((Game) object).getQuantity() + "");
            basicDBObject.append("pegi", "" + ((Game) object).getPegi() + "");

        } else if (object instanceof User) {
            basicDBObject.append("user", "" + ((User) object).getName() + "");
            basicDBObject.append("password", "" + ((User) object).getPassword() + "");
        }
        return basicDBObject.get();
    }

    private void connectToMongoDB() {
        try {
            mongo = new Mongo("localhost", 27017);
        } catch (UnknownHostException ex) {
            Logger.getLogger(MongoDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private DBCollection selectCollection(Object object) {
        if (object instanceof Game) {
            dBCollection = db.getCollection("Games");
            return dBCollection;
        } else if (object instanceof User) {
            dBCollection = db.getCollection("Users");
            return dBCollection;
        }
        return null;
    }

    @Override
    public void addToFile(Object object) {
        dBObject = createDBObject(object);
        connectToMongoDB();
        db = mongo.getDB("VirutalGameStore");
        dBCollection = selectCollection(object);
        dBCollection.insert(dBObject);
    }

    @Override
    public ArrayList<Object> readObjects(String nameCollection) {
        Object object;
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<DBObject> dbObjects = new ArrayList<>();
        connectToMongoDB();
        db = mongo.getDB("VirtualGameStore");
        dBCollection = db.getCollection(nameCollection);
        DBCursor dBCursor = dBCollection.find();
        while (dBCursor.hasNext()) {
            dBObject = dBCursor.next();
            dbObjects.add(dBObject);
        }

        for (int i = 0; i < dbObjects.size(); i++) {
            if (nameCollection.equals("Games")) {
                BasicDBObject Obj = (BasicDBObject) dbObjects.get(i);
                int id = Integer.parseInt(Obj.getString("id"));
                String name = Obj.getString("name");
                float price = Float.parseFloat(Obj.getString("price"));
                String color = Obj.getString("color");
                int quantity = Integer.parseInt(Obj.getString("quantity"));
                int pegi = Integer.parseInt(Obj.getString("pegi"));

                Game game = new Game(id, name, price, color, quantity, pegi);

                objects.add(game);

            } else if (nameCollection.equals("Users")) {
                BasicDBObject basicObject = (BasicDBObject) dbObjects.get(i);
                String userName = basicObject.getString("user");
                String password = basicObject.getString("password");

                User user = new User(userName, password);
                objects.add(user);
            }
        }

        return objects;
    }

    public void eraseDocument() {

    }

}
