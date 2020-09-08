/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import ec.edu.espe.virtualgamestore.model.Game;
import ec.edu.espe.virtualgamestore.utils.DBManager;
import org.bson.Document;

/**
 *
 * @author José Paulo Velasteguí
 */
public class DataConstructor implements ControllerData {

    DBManager dbManager = new DBManager();
    Document document = new Document();

    @Override
    public void saveGames(Game game) {

        document.put("Pegi", game.getPegi());
        document.put("Id", game.getId());
        document.put("Name", game.getName());
        document.put("Price", game.getPrice());
        System.out.println(document);
        dbManager.saveData("Games", document);
        

    }

}
