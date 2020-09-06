/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.controller;

import ec.edu.espe.personalfinances.view.FrmTableExpense;
import ec.edu.espe.personalfinances.view.FrmTableIncome;

/**
 *
 * @author OneTouchESPE
 */
public class Calculation {

    public double totalBalance() {
        FrmTableExpense frmTableExpenses = new FrmTableExpense();
        String convertDoubleExpense = Double.toString(frmTableExpenses.totalExpense());
        double convertStringExpense = Double.parseDouble(convertDoubleExpense);

        FrmTableIncome frmTableIncomes = new FrmTableIncome();
        String convertDoubleIncome = Double.toString(frmTableIncomes.totalIncome());
        double convertStringIncome = Double.parseDouble(convertDoubleIncome);
        double result;
        result = convertStringIncome - convertStringExpense;
        result = Math.round(result * 100) / 100d;
        return result;

    }

}
