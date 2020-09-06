/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.model;

/**
 *
 * @author OneTouchEspe
 */
public class Income {

    private String id;
    private String amount;
    private String date;
    private String income;
    private String newCategory;

    public Income() {
    }

    public Income(String amount, String date, String income, String newCategory) {
        this.amount = amount;
        this.date = date;
        this.income = income;
        this.newCategory = newCategory;
    }

    public Income(String amount, String date, String income) {
        this.amount = amount;
        this.date = date;
        this.income = income;

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
     * @return the income
     */
    public String getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(String income) {
        this.income = income;
    }

    /**
     * @return the newCategory
     */
    public String getNewCategory() {
        return newCategory;
    }

    /**
     * @param newCategory the newCategory to set
     */
    public void setNewCategory(String newCategory) {
        this.newCategory = newCategory;
    }

    public Income(String newCategory) {
        this.newCategory = newCategory;
    }

}
