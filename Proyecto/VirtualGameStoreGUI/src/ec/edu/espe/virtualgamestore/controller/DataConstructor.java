/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import ec.edu.espe.virtualgamestore.model.Accessory;
import ec.edu.espe.virtualgamestore.model.Game;
import ec.edu.espe.virtualgamestore.utils.DBManager;
import org.bson.Document;

/**
 *
 * @author José Paulo Velasteguí
 */
public class DataConstructor implements ControllerData {

    DBManager dbManager = DBManager.getInstance();

    @Override
    public void saveGames(Game game) {
        Document document = new Document();
        document.put("Pegi", game.getPegi());
        document.put("Id", game.getId());
        document.put("Name", game.getName());
        document.put("Price", game.getPrice());
        dbManager.saveData("Games", document);
        System.out.println(document);

    }

    @Override
    public void saveAccessories(Accessory accessory) {
        Document document = new Document();

        document.put("Id", accessory.getId());
        document.put("Name", accessory.getName());
        document.put("Price", accessory.getPrice());
        dbManager.saveData("Accessory", document);
        System.out.println(document);
    }

}
