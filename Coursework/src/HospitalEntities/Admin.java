/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEntities;

import guis.AdminDashboard;

/**
 *
 * @author Oli
 */
public class Admin extends User{
    
    public Admin(String newID, String newPassword, String newFname,
           String newSname, String newAddress, int newAge, char newGender){
        super(newID, newPassword, newFname, newSname, newAddress, newAge, newGender);
    }
    
        public void CreateDashboard(){
        AdminDashboard window = new AdminDashboard();
        window.setVisible(true);
    }
}
