/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEntities;

import guis.DoctorDashboard;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oli
 */
public class Doctor extends User {
    
    private DoctorDashboard window;
    private String feedback;
    private File textFile = new File("test/Data.txt");
            
    public Doctor(String newID, String newPassword, String newFname,
           String newSname, String newAddress, int newAge, char newGender){
        super(newID, newPassword, newFname, newSname, newAddress, newAge, newGender);
        feedback = GetFeedback();
    }
    
    public void CreateDashboard(){
        window = new DoctorDashboard();
        window.setVisible(true);
        window.SetDoctor(this);
        window.ShowFeedback();
    }
    
    public String GetFeedback(){
        String retrieve = "No Feedback";
        try {
            System.out.println(id);
            Scanner scan;
            
            scan = new Scanner(textFile);
            while(scan.hasNextLine())
            {
                if (scan.nextLine().equals(id)) {
                    System.out.println("Found id");
                    for (int i = 0; i < 6; i++) {
                        scan.nextLine();
                    }
                    retrieve = scan.nextLine();
                    break;
                }
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DoctorDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(retrieve);
        return retrieve;
    }
        
        public String GetFName(){
            return fName;
        }
        
        public String GetSName(){
            return sName;
        }
        
        public String GetID(){
            return id;
        }
}
