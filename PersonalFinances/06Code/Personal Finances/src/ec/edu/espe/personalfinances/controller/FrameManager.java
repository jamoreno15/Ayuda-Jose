/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.controller;

import ec.edu.espe.personalfinances.model.Expense;
import ec.edu.espe.personalfinances.model.Income;
import ec.edu.espe.personalfinances.model.Uri;
import ec.edu.espe.personalfinances.utils.DBManager;
import ec.edu.espe.personalfinances.utils.FileManager;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.json.simple.JSONObject;

/**
 *
 * @author OneTouchEspe
 */
public class FrameManager implements DataManager {

    DBManager dbManager = DBManager.getInstance();
    Document document = new Document();
    JSONObject jsonObject = new JSONObject();
    FileManager fileManager = FileManager.getInstance();
    boolean confirmation = true;
    String blank = "";

    @Override
    public void saveExpense(Expense expense) {
        document.put("expense", expense.getExpense());
        document.put("date", expense.getDate());
        document.put("establishment", expense.getEstablishment());
        document.put("paymentMethod", expense.getPaymentMethod());
        document.put("amount", expense.getAmount());
        if (expense.getOtherCategory() == null) {
            dbManager.saveData("Expense", document);
            JOptionPane.showMessageDialog(null, "Data Saved");
        } else {
            document.put("otherCategory", expense.getOtherCategory());
            dbManager.saveData("Expense", document);
            JOptionPane.showMessageDialog(null, "Data Saved");
        }

    }

    @Override
    public void saveIncome(Income income) {
        document.put("income", income.getIncome());
        document.put("date", income.getDate());
        document.put("amount", income.getAmount());
        if (income.getNewCategory() == null) {
            dbManager.saveData("Income", document);
            JOptionPane.showMessageDialog(null, "Data Saved");
        } else {
            document.put("otherCategory", income.getNewCategory());
            dbManager.saveData("Income", document);
            JOptionPane.showMessageDialog(null, "Data Saved");
        }
    }

    @Override
    public boolean saveUriData(Uri uri) {

        if (uri.getUsername().equals(blank) || uri.getPassword().equals(blank)
                || uri.getHost().equals(blank) || uri.getDatabase().equals(blank)) {
            JOptionPane.showMessageDialog(null, "Fill all the information please");
            return confirmation = false;
        }
        jsonObject.put("username", uri.getUsername());
        jsonObject.put("password", uri.getPassword());
        jsonObject.put("host", uri.getHost());
        jsonObject.put("database", uri.getDatabase());
        try {
            fileManager.saveJsonObjectIntoFile("UriString.json", jsonObject);
            JOptionPane.showMessageDialog(null, "The cluster was configured successfully");
            confirmation = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error has ocurred");
            confirmation = false;
        }
        return confirmation;
    }
}
