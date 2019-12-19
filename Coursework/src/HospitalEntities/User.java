/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEntities;

import guis.PatientDashboard;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Oli
 */
public class User {
    
    private String id;
    private String password;
    private String fName;
    private String sName;
    private String address;
    private int age;
    private char gender;
   
    public User(String newID, String newPass)
    {
        id = newID;
        password = newPass;
    }
    
    public void Login ()
    {
        boolean valid = false;
        File textFile = new File("D://SOFT252//SOFT252//Coursework//Data.txt");
        Scanner scan;
        try 
        {
            scan = new Scanner(textFile);
            
            while(scan.hasNextLine())
            {
                if (scan.nextLine().equals(id)) {
                    if (scan.nextLine().equals(password)) {
                        valid = true;
                        if (id.charAt(0) == 'P')
                        { 
                            fName = scan.nextLine();
                            sName = scan.nextLine();
                            address = scan.nextLine();
                            gender = (scan.nextLine().charAt(0));
                            age = Integer.parseInt(scan.nextLine());
                            String nextApp = scan.nextLine();
                            
                            PatientDashboard window = new PatientDashboard();
                            window.setVisible(true);
                        }
                        break;
                    }
                }
            }
        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("error, File not found");
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(valid);
        
        //Check forID
            //If there check for password
                //If it matches Get all other data
                //and create the correct subclass 
                //and construct it using that data
                //close this window and open correct
                //Dashboard
        //else pop-up window saying incorrect id/password
        //close textfile screen.
    }
    
    private void CreateAcc()
    {
        //Hide this window and open create account window
    }
    
    
    
}
