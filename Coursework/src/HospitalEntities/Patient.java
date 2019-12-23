/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEntities;

import guis.PatientDashboard;

/**
 *
 * @author Oli
 */
public class Patient extends User{
    private String nextApp;
    private String[] appHistory;
    private String[] prescription;
    
    public Patient(String newID, String newPassword, String newFname,
           String newSname, String newAddress, int newAge, char newGender, 
           String newNextApp, String[] newAppHistory, String[] newPerscription){
        
        super(newID, newPassword, newFname, newSname, newAddress, newAge, newGender);
        nextApp = newNextApp;
        appHistory = newAppHistory;
        prescription = newPerscription;
        
    }
    
    public void CreateDashboard()
    {
        PatientDashboard window = new PatientDashboard();
        window.setVisible(true);
        window.showInfo(nextApp, appHistory, prescription);
    }
    
}
