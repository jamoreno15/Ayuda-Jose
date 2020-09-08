/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.utils;

import java.util.ArrayList;

/**
 *
 * @author JavaMasters
 */
public interface IDataAccessObject {

    public void addToFile(Object object);

    public ArrayList<Object> readObjects(String nameClass);

}
