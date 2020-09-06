/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.controller;

import ec.edu.espe.personalfinances.model.User;

/**
 *
 * @author OneTouchEspe
 */
public interface UserInterface {
    
    public boolean writeUser(User user);
    public boolean readUser(User user);
    public boolean readAdminUser(User user);
    
}
