/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.model;

//import com.toedter.calendar.JDateChooser;
/**
 *
 * @author OneTouchEspe
 */
public class Expense {

    private String id;
    private String amount;
    private String establishment;
    private String date;
    private String paymentMethod;
    private String expense;
    private String otherCategory;


    public Expense() {
    }


    public Expense(String value, String establishment, String date, String paymentMethod, String expense, String otherCategory) {
        this.amount = value;
        this.establishment = establishment;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.expense = expense;
        this.otherCategory = otherCategory;

    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the establishment
     */
    public String getEstablishment() {
        return establishment;
    }

    /**
     * @param establishment the establishment to set
     */
    public void setEstablishment(String establishment) {
        this.establishment = establishment;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the expense
     */
    public String getExpense() {
        return expense;
    }

    /**
     * @param expense the expense to set
     */
    public void setExpense(String expense) {
        this.expense = expense;
    }

    /**
     * @return the otherCategory
     */
    public String getOtherCategory() {
        return otherCategory;
    }

    /**
     * @param otherCategory the otherCategory to set
     */
    public void setOtherCategory(String otherCategory) {
        this.otherCategory = otherCategory;
    }

    public Expense(String otherCategory) {

        this.otherCategory = otherCategory;
    }

}
