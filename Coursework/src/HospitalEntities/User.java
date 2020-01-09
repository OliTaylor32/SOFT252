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
    
    protected String id;
    protected String password;
    protected String fName;
    protected String sName;
    protected String address;
    protected int age;
    protected char gender;
   
    public User(String newID, String newPass)
    {
        id = newID;
        password = newPass;
    }
    
    public User(String newID, String newPass, String newFname, String newSname,
        String newAddress, int newAge, char newGender)
    {
        id = newID;
        password = newPass;
        fName = newFname;
        sName = newSname;
        address = newAddress;
        age = newAge;
        gender = newGender;
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
                            
                            String[] prevApp = new String[1];
                            int count = 0;
                            String nextLine = scan.nextLine();
                            while(!"CurrentPrescription".equals(nextLine))
                            {
                                String[] temp = new String[count];
                                temp = prevApp;
                                prevApp = new String[count + 1];
                                for (int i = 0; i < temp.length; i++) {
                                    prevApp[i] = temp[i];
                                }
                                prevApp[count] = nextLine;
                                System.out.println(prevApp[count]);
                                count++;
                                nextLine = scan.nextLine();
                            }
                            
                            String[] prescriptions = new String[1];
                            count = 0;
                            nextLine = scan.nextLine();
                            while(!"End".equals(nextLine))
                            {
                                String[] temp = new String[count];
                                temp = prescriptions;
                                prescriptions = new String[count + 1];
                                for (int i = 0; i < temp.length; i++) {
                                    prescriptions[i] = temp[i];
                                }
                                prescriptions[count] = nextLine;
                                System.out.println(prescriptions[count]);
                                count++;
                                nextLine = scan.nextLine();
                            }
                            Patient p = new Patient(id, password, fName, sName,
                                    address, age, gender, nextApp, prevApp, prescriptions);
                            p.CreateDashboard();
                        }
                        
                        if (id.charAt(0) == 'S')
                        { 
                            fName = scan.nextLine();
                            sName = scan.nextLine();
                            address = scan.nextLine();
                            gender = (scan.nextLine().charAt(0));
                            age = Integer.parseInt(scan.nextLine());
                            
                            Secretary s = new Secretary(id, password, fName, sName,
                                    address, age, gender);
                            s.CreateDashboard();
                        }
                        
                        if (id.charAt(0) == 'D')
                        { 
                            fName = scan.nextLine();
                            sName = scan.nextLine();
                            address = scan.nextLine();
                            gender = (scan.nextLine().charAt(0));
                            age = Integer.parseInt(scan.nextLine());
                            
                            Doctor d = new Doctor(id, password, fName, sName,
                                    address, age, gender);
                            d.CreateDashboard();
                        }
                        
                        if (id.charAt(0) == 'A')
                        { 
                            fName = scan.nextLine();
                            sName = scan.nextLine();
                            address = scan.nextLine();
                            gender = (scan.nextLine().charAt(0));
                            age = Integer.parseInt(scan.nextLine());
                            
                            Doctor d = new Doctor(id, password, fName, sName,
                                    address, age, gender);
                            d.CreateDashboard();
                        }
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
