/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEntities;

import guis.SecretaryDashboard;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oli
 */
public class Secretary extends User{
    
    public Secretary(String newID, String newPassword, String newFname,
           String newSname, String newAddress, int newAge, char newGender)
    {
        super(newID, newPassword, newFname, newSname, newAddress, newAge, newGender);
            
    }
    
    public void CreateDashboard(){
        SecretaryDashboard window = new SecretaryDashboard();
        window.setVisible(true);
        window.GetRequests();
    }
    
}
