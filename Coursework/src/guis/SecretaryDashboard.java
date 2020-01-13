/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import HospitalEntities.Secretary;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oli
 */
public final class SecretaryDashboard extends javax.swing.JFrame {

    private File textFile = new File("test/Data.txt");
    /**
     * Creates new form SecretaryDashboard
     */
    public SecretaryDashboard() { //On load get new account requests and delete requests shown to the user.
        initComponents();
        GetRequests();
        GetDeleteRequests();
    }
    
    public void GetRequests() //Show the next account request.
    {
        boolean found = false;
        try {
            Scanner scan;
            
            scan = new Scanner(textFile);
            
            while(scan.hasNextLine())
            {
                
         
                if (scan.nextLine().equals("AccRequest") && found == false)
                {
                    txt_password.setText(scan.nextLine());
                    txt_fName.setText(scan.nextLine());
                    txt_sName.setText(scan.nextLine());
                    txt_address.setText(scan.nextLine());
                    txt_age.setText(scan.nextLine());
                    txt_gender.setText(scan.nextLine());
                    found = true;
                }
                
            }
            if (found == false) //If there are no requests 
            {
                    txt_password.setText("No Requests");
                    txt_fName.setText("No Requests");
                    txt_sName.setText("No Requests");
                    txt_address.setText("No Requests");
                    txt_age.setText("No Requests");
                    txt_gender.setText("No Requests");
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Secretary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void GetDeleteRequests() //Show the next delete request.
    {
        boolean found = false;
        try {
            Scanner scan;
            
            scan = new Scanner(textFile);
            
            while(scan.hasNextLine())
            {
                if (scan.nextLine().equals("DeleteRequest") && found == false)
                {
                    txt_reqDelID.setText(scan.nextLine());
                    scan.nextLine();
                    txt_reqDelFName.setText(scan.nextLine());
                    txt_reqDelSName.setText(scan.nextLine());
                    found = true;
                }
                
            }
            if (found == false) //If there are no requests 
            {
                txt_reqDelID.setText("No Requests");
                txt_reqDelFName.setText("No Requests");
                txt_reqDelSName.setText("No Requests");
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Secretary.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
    private String GenerateID() //returns the next avaliable ID slot. used when creating new accounts
    {
        String id;
        id = "ERROR";
        try {
            Scanner scan = new Scanner(textFile);
            boolean free = true;
            id = "P";
            for (int i = 1; i < 10; i++) {
                free = true;
                while(scan.hasNextLine() == true)
                    if (scan.nextLine().equals("P000" + Integer.toString(i))){ //ID is already in use
                        free = false; 
                        break;
                    }  
                if (free == true) {
                    id = "P000" + Integer.toString(i);
                    break;
                }
            }
            if ("ERROR".equals(id)) { //If an ID still hasn't beena ssigned
                for (int i = 10; i < 100; i++) {
                    free = true;
                    while(scan.hasNextLine() == true)
                        if (scan.nextLine().equals("P00" + Integer.toString(i))) {
                            free = false;
                            break;
                        }  
                    if (free == true) {
                        id = "P00" + Integer.toString(i);
                        break;
                    }
                }   
            }
            if ("ERROR".equals(id)) {
                for (int i = 100; i < 1000; i++) {
                    free = true;
                    while(scan.hasNextLine() == true)
                        if (scan.nextLine().equals("P0" + Integer.toString(i))) {
                            free = false;
                            break;
                        }  
                    if (free == true) {
                        id = "P0" + Integer.toString(i);
                        break;
                    }
                }   
            }
            
            if ("ERROR".equals(id)) {
                for (int i = 1000; i < 10000; i++) {
                    free = true;
                    while(scan.hasNextLine() == true)
                        if (scan.nextLine().equals("P" + Integer.toString(i))) {
                            free = false;
                            break;
                        }  
                    if (free == true) {
                        id = "P" + Integer.toString(i);
                        break;
                    }
                }   
            }

            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_fName = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        btn_approve = new javax.swing.JButton();
        btn_reject = new javax.swing.JButton();
        txt_sName = new javax.swing.JTextField();
        lbl_delAcc = new javax.swing.JLabel();
        txt_delAccID = new javax.swing.JTextField();
        btn_delAccDelete = new javax.swing.JButton();
        lbl_delAccID = new javax.swing.JLabel();
        lbl_reqDel = new javax.swing.JLabel();
        lbl_reqDelName = new javax.swing.JLabel();
        txt_reqDelFName = new javax.swing.JTextField();
        txt_reqDelSName = new javax.swing.JTextField();
        lbl_reqDelID = new javax.swing.JLabel();
        txt_reqDelID = new javax.swing.JTextField();
        btn_reqDelApprove = new javax.swing.JButton();
        btn_reqDelReject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Accout Requests:");

        txt_fName.setEditable(false);
        txt_fName.setText("No Requests");

        txt_address.setEditable(false);
        txt_address.setText("No Requests");

        txt_age.setEditable(false);
        txt_age.setText("No Requests");

        txt_gender.setEditable(false);
        txt_gender.setText("No Requests");

        jLabel2.setText("Name:");

        jLabel3.setText("Address:");

        jLabel4.setText("Age:");

        jLabel5.setText("Gender:");

        jLabel6.setText("Password:");

        txt_password.setEditable(false);
        txt_password.setText("No Requests");

        btn_approve.setText("Approve");
        btn_approve.setName(""); // NOI18N
        btn_approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_approveActionPerformed(evt);
            }
        });

        btn_reject.setText("Reject");
        btn_reject.setName(""); // NOI18N
        btn_reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rejectActionPerformed(evt);
            }
        });

        txt_sName.setEditable(false);
        txt_sName.setText("No Requests");

        lbl_delAcc.setText("Delete Accounts:");

        txt_delAccID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_delAccIDActionPerformed(evt);
            }
        });

        btn_delAccDelete.setText("Delete");
        btn_delAccDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delAccDeleteActionPerformed(evt);
            }
        });

        lbl_delAccID.setText("ID");

        lbl_reqDel.setText("Requests to Delete:");

        lbl_reqDelName.setText("Name:");

        txt_reqDelFName.setEditable(false);
        txt_reqDelFName.setText("No Requests");

        txt_reqDelSName.setEditable(false);
        txt_reqDelSName.setText("No Requests");

        lbl_reqDelID.setText("ID:");

        txt_reqDelID.setEditable(false);
        txt_reqDelID.setText("No Requests");

        btn_reqDelApprove.setText("Approve");
        btn_reqDelApprove.setName(""); // NOI18N
        btn_reqDelApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reqDelApproveActionPerformed(evt);
            }
        });

        btn_reqDelReject.setText("Reject");
        btn_reqDelReject.setName(""); // NOI18N
        btn_reqDelReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reqDelRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_fName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_sName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(txt_gender, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_reqDelApprove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reqDelReject))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_reqDelName, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_reqDelID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_reqDelFName, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(txt_reqDelID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_reqDelSName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_reqDel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_delAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_delAccID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_delAccID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delAccDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_approve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_reject)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_sName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btn_approve)
                    .addComponent(btn_reject))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_reqDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_reqDelFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_reqDelName)
                            .addComponent(txt_reqDelSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_reqDelID)
                            .addComponent(txt_reqDelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_delAcc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_delAccID)
                            .addComponent(txt_delAccID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delAccDelete))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reqDelApprove)
                    .addComponent(btn_reqDelReject))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Create the requested account by changing "account request" with a unique ID number
    private void btn_approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_approveActionPerformed
        try {
            Scanner scan;
            
            scan = new Scanner(textFile);
            int lineCount = 0;
            
            //count how many lines the data file has
            while(scan.hasNextLine())
            {
                scan.nextLine();
                lineCount++;
            }
            
            scan.close();
            
            String[] data = new String[lineCount + 4]; //insert the textfile into a string array
            //Find the first instance of an account request (And only the first)
            scan = new Scanner(textFile);
            int i = 0;
            boolean found = false;
            while(scan.hasNextLine())
            {
                data[i] = scan.nextLine();
                if (data[i].equals("AccRequest") && found == false)
                {
                    found = true;
                    data[i] = GenerateID(); //Genrate unique Patient ID
                    //Scan in patient data
                    for (int j = 0; j < 6; j++) {
                    i++;
                    data[i] = scan.nextLine(); 
                    }
                    //Add storing headers (Allows the Patient to easily display this information is a user friendly way)
                    i++;
                    data[i] = "No Appointments";
                    i++;
                    data[i] = "Previous Appointments";
                    i++;
                    data[i] = "CurrentPrescription";
                    i++;
                    data[i] = "End";
                }
                i++;
            }
            
            scan.close();
            
            //Write the array with changes to the text file to the textFile (Overwriting the text already inside)
            try {
                FileWriter write = new FileWriter(textFile, false);
                write.flush();
                for (int j = 0; j < data.length; j++) {
                    write.write(data[j]);
                    System.out.println(data[j]);
                    write.write(System.getProperty( "line.separator" ));
                }
                write.close();
                
                
            } catch (IOException ex) {
                Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetRequests(); //Update to see if there are more requests
                
    }//GEN-LAST:event_btn_approveActionPerformed
    //Reject the request to add an account by deleting all information ties to the account request
    private void btn_rejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rejectActionPerformed
        try {
            Scanner scan;
            
            scan = new Scanner(textFile);
            int lineCount = 0;
            //Count how long the text file is
            while(scan.hasNextLine())
            {
                scan.nextLine();
                lineCount++;
            }
            
            scan.close();
            
            String[] data = new String[lineCount - 6]; //STore data in array (Shorter as its deleting data)
            scan = new Scanner(textFile);
            int i = 0;
            boolean found = false;
            while(scan.hasNextLine())
            {
                data[i] = scan.nextLine();
                if (data[i].equals("AccRequest") && found == false) //Find the first instance of an account request (ONLY)
                {
                    found = true;
                    for (int j = 0; j < 6; j++) {
                        scan.nextLine(); //Skip saving data relating to the account request.
                    }
                    if (scan.hasNextLine() == true) {
                        data[i] = scan.nextLine(); //Overwirite "Accrequest" with the next line in the file
                    }
                    else{
                        data[i] = ""; //If this was the last line, just add a blank 
                    }

                }
                i++;
            }
            
            scan.close();
            //Write the array with changes to the text file to the textFile (Overwriting the text already inside)
            try {
                FileWriter write = new FileWriter(textFile, false);
                write.flush();
                for (int j = 0; j < data.length; j++) {
                    write.write(data[j]);
                    System.out.println(data[j]);
                    write.write(System.getProperty( "line.separator" ));
                }
                write.close();
                
                
            } catch (IOException ex) {
                Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
            GetRequests(); //Update to see if there are more requests
    }//GEN-LAST:event_btn_rejectActionPerformed
    //Approve Delete request by removing all information associated with account in question
    private void btn_reqDelApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reqDelApproveActionPerformed
        try {
            Scanner scan;
            
            scan = new Scanner(textFile);
            int lineCount = 0;
            //Count how long the text file is
            while(scan.hasNextLine())
            {
                scan.nextLine();
                lineCount++;
            }
            
            scan.close();
            
            String[] data = new String[lineCount];
            scan = new Scanner(textFile);
            int i = 0;
            boolean found = false;
            while(scan.hasNextLine())
            {
                data[i] = scan.nextLine();
                if (data[i].equals("DeleteRequest") && found == false) //Find the first instance of an account request (ONLY)
                {
                    int delLines = 1;
                    found = true;
                    //Count how many lines have been skipped
                    while(!(scan.nextLine().equals("End")))
                    {
                       delLines++;
                    }
                    //change the lenght of the data array to fit with how many lines have been deleted.
                    String[] temp = new String[i];
                    temp = data;
                    data = new String[lineCount - delLines];
                    for (int j = 0; j < i; j++) {
                        data[j] = temp[j];
                    }
                    //Overwirite "Delete Request" with next line or blank
                    if (scan.hasNextLine() == true) {
                        data[i] = scan.nextLine();
                    }
                    else{
                        data[i] = "";
                    }

                }
                i++;
            }
            
            scan.close();
            
            //Write the array with changes to the text file to the textFile (Overwriting the text already inside)
            try {
                FileWriter write = new FileWriter(textFile, false);
                write.flush();
                for (int j = 0; j < data.length; j++) {
                    write.write(data[j]);
                    System.out.println(data[j]);
                    write.write(System.getProperty( "line.separator" ));
                }
                write.close();
                
                
            } catch (IOException ex) {
                Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
            GetDeleteRequests();
    }//GEN-LAST:event_btn_reqDelApproveActionPerformed
    //Reject a request to delete an account by taking out the "deleteRequest" line
    private void btn_reqDelRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reqDelRejectActionPerformed
        try {
            Scanner scan;
            
            scan = new Scanner(textFile);
            int lineCount = 0;
            
            while(scan.hasNextLine())
            {
                scan.nextLine();
                lineCount++;
            }
            
            scan.close();
            
            String[] data = new String[lineCount - 1];
            scan = new Scanner(textFile);
            int i = 0;
            boolean found = false;
            while(scan.hasNextLine())
            {
                data[i] = scan.nextLine();
                if (data[i].equals("DeleteRequest") && found == false)
                {
                    found = true;
                    data[i] = scan.nextLine();

                }
                i++;
            }
            
            scan.close();
            //Write the array with changes to the text file to the textFile (Overwriting the text already inside)
            try {
                FileWriter write = new FileWriter(textFile, false);
                write.flush();
                for (int j = 0; j < data.length; j++) {
                    write.write(data[j]);
                    System.out.println(data[j]);
                    write.write(System.getProperty( "line.separator" ));
                }
                write.close();
                
                
            } catch (IOException ex) {
                Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
            GetDeleteRequests();
    }//GEN-LAST:event_btn_reqDelRejectActionPerformed

    private void txt_delAccIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_delAccIDActionPerformed

    }//GEN-LAST:event_txt_delAccIDActionPerformed
    //Delete a patient account by searching for an ID and deleting all information pertaining to it
    private void btn_delAccDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delAccDeleteActionPerformed
        try {
            if (txt_delAccID.getText().charAt(0) == 'P'){
                Scanner scan;

                scan = new Scanner(textFile);
                int lineCount = 0;

                while(scan.hasNextLine())
                {
                    scan.nextLine();
                    lineCount++;
                }

                scan.close();

                String[] data = new String[lineCount];
                scan = new Scanner(textFile);
                int i = 0;
                boolean found = false;
                while(scan.hasNextLine())
                {
                    data[i] = scan.nextLine();
                    if (data[i].equals(txt_delAccID.getText()) && found == false)
                    {
                        int delLines = 1;
                        found = true;
                        while(!(scan.nextLine().equals("End")))
                        {
                           delLines++;
                        }
                        String[] temp = new String[i];
                        temp = data;
                        data = new String[lineCount - delLines];
                        for (int j = 0; j < i; j++) {
                            data[j] = temp[j];
                        }
                        if (scan.hasNextLine() == true) {
                            data[i] = scan.nextLine();
                        }
                        else{
                            data[i] = "";
                        }

                    }
                    i++;
                }

                scan.close();

                try {
                    FileWriter write = new FileWriter(textFile, false);
                    write.flush();
                    for (int j = 0; j < data.length; j++) {
                        write.write(data[j]);
                        System.out.println(data[j]);
                        write.write(System.getProperty( "line.separator" ));
                    }
                    write.close();


                } catch (IOException ex) {
                    Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecretaryDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
            GetDeleteRequests();                  
    }//GEN-LAST:event_btn_delAccDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SecretaryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretaryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretaryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretaryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretaryDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_approve;
    private javax.swing.JButton btn_delAccDelete;
    private javax.swing.JButton btn_reject;
    private javax.swing.JButton btn_reqDelApprove;
    private javax.swing.JButton btn_reqDelReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_delAcc;
    private javax.swing.JLabel lbl_delAccID;
    private javax.swing.JLabel lbl_reqDel;
    private javax.swing.JLabel lbl_reqDelID;
    private javax.swing.JLabel lbl_reqDelName;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_delAccID;
    private javax.swing.JTextField txt_fName;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_reqDelFName;
    private javax.swing.JTextField txt_reqDelID;
    private javax.swing.JTextField txt_reqDelSName;
    private javax.swing.JTextField txt_sName;
    // End of variables declaration//GEN-END:variables
}
