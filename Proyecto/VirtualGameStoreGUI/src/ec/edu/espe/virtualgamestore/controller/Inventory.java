package ec.edu.espe.virtualgamestore.controller;

import com.google.gson.Gson;

import ec.edu.espe.virtualgamestore.utils.IDataAccessObject;
import ec.edu.espe.virtualgamestore.utils.JsonFileAdministrator;
import ec.edu.espe.virtualgamestore.utils.MongoDBManager;
import ec.edu.espe.virtualgamestore.model.Game;
import ec.edu.espe.virtualgamestore.utils.FileUsers;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Inventory {

    public void addProduct(
            int id, String name, float price,
            String color, int quantity, int pegi
    ) {
        Game game = new Game(id, name, price, color, quantity, pegi);

        System.out.println(game.toString());

        IDataAccessObject dataAccessObject = new MongoDBManager();
        dataAccessObject.addToFile(game);
   
    }

    public void update(ArrayList<Game> inventory) {

        JsonFileAdministrator jsonFile = new JsonFileAdministrator();

        jsonFile.eraseJson(Game.class.getSimpleName());

        inventory.forEach((games) -> {
            jsonFile.addToFile(games);
        });

    }

    public void deleteProduct(ArrayList<Game> listOfGames, int id) {

        for (int i = 0; i < listOfGames.size(); i++) {

            if ((listOfGames.get(i).getId()) == id) {
                listOfGames.remove(i);
            }

        }

        update(listOfGames);

    }

    public void discount(ArrayList<Game> listOfGame, int id, int quantity) {
        int newStock;
        for (int i = 0; i < listOfGame.size(); i++) {

            if ((listOfGame.get(i).getId()) == id) {
                newStock = listOfGame.get(i).getQuantity() - quantity;
                listOfGame.get(i).setQuantity(newStock);
            }

        }

        update(listOfGame);

    }

    public void showProducts() {

        ArrayList<Object> object = new ArrayList<>();
        ArrayList<Game> inventory = new ArrayList<>();
        /*JsonFileAdministrator jsonFile = new JsonFileAdministrator();        
        Gson gson = new Gson();*/
        IDataAccessObject dataAccessObject = new MongoDBManager();

        object = dataAccessObject.readObjects("Games");

        for (Object obj : object) {
            inventory.add((Game) obj);
        }

        /*for (Object obj : object) {
            PairOfShoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, PairOfShoes.class);
            inventory.add(shoes);
        }*/
 /*inventory.forEach((shoe)->{
            System.out.print  ("---------------------------");
            System.out.println(shoe.toString());
            System.out.println("---------------------------");
        });*/
    }

    public ArrayList<Game> showProduct() {
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<Game> inventory = new ArrayList<>();
        /*JsonFileAdministrator jsonFile = new JsonFileAdministrator();        
        Gson gson = new Gson();*/
        IDataAccessObject dataAccessObject = new MongoDBManager();

        objects = dataAccessObject.readObjects("Games");

        for (Object obj : objects) {
            inventory.add((Game) obj);
        }

        /*inventory.forEach((shoe)->{
            System.out.print  ("---------------------------");
            System.out.println(shoe.toString());
            System.out.println("---------------------------");
        });*/
        return inventory;

    }

}
