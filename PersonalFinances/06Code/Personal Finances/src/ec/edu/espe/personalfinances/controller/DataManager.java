/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.controller;

import ec.edu.espe.personalfinances.model.Expense;
import ec.edu.espe.personalfinances.model.Income;
import ec.edu.espe.personalfinances.model.Uri;

/**
 *
 * @author OneTouchEspe
 */
public interface DataManager {

    public void saveExpense(Expense expense);

    public void saveIncome(Income income);
    
    public boolean saveUriData(Uri uri);

}
