/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEntities;

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
   
    public void User(String newID, String newPass)
    {
        id = newID;
        password = newPass;
    }
    
    private void Login()
    {
        //Access text file
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
