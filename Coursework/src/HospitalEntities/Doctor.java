/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEntities;

import guis.DoctorDashboard;

/**
 *
 * @author Oli
 */
public class Doctor extends User {
    
    public Doctor(String newID, String newPassword, String newFname,
           String newSname, String newAddress, int newAge, char newGender){
        super(newID, newPassword, newFname, newSname, newAddress, newAge, newGender);
    }
    
    public void CreateDashboard(){
        DoctorDashboard window = new DoctorDashboard();
        window.setVisible(true);
        window.SetName(fName, sName);
    }
}
