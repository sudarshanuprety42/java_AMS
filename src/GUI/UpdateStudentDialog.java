/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DbOperation;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/**
 *
 * @author Sudarsan
 */
public class UpdateStudentDialog extends javax.swing.JDialog {

    public String ID;

    /**
     * Creates new form UpdateStudentDialog
     */
    public UpdateStudentDialog(ArrayList a) {
       
        initComponents();
        clearUpdateUpdateWarnings();
         genderGroup2.add(rMale1);
        genderGroup2.add(rFemale1);
        genderGroup2.add(rOther1);
        ID = (String) a.get(0);
        firstNametxt1.setText(a.get(1).toString());
                lastNametxt1.setText(a.get(2).toString());
                addresstxt1.setText(a.get(4).toString());
                citytxt1.setText(a.get(5).toString());
                phonetxt1.setText(a.get(6).toString());
                if (a.get(3).toString().equals("male")) {
                    rMale1.setSelected(true);
                } else if (a.get(3).toString().equals("female")) {
                    rFemale1.setSelected(true);
                } else {
                    rOther1.setSelected(true);
                }
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date d = null;
                try {
                    d = df.parse(a.get(8).toString());
                } catch (ParseException ex) {
                    Logger.getLogger(Admins_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }

                dob1.setDate(d);
                emailtxt1.setText(a.get(7).toString());
                securitytxt1.setText(a.get(9).toString());
                passwordtxt1.setText(a.get(10).toString());
                
        this.setLocationRelativeTo(null);
        this.setModalityType(ModalityType.APPLICATION_MODAL);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        phonetxt1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        emailtxt1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        passwordtxt1 = new javax.swing.JTextField();
        dob1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        securitytxt1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        rMale1 = new javax.swing.JRadioButton();
        firstNametxt1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        lastNametxt1 = new javax.swing.JTextField();
        lblUfn = new javax.swing.JLabel();
        lblUln = new javax.swing.JLabel();
        lblU3 = new javax.swing.JLabel();
        rFemale1 = new javax.swing.JRadioButton();
        lblU4 = new javax.swing.JLabel();
        rOther1 = new javax.swing.JRadioButton();
        lblU5 = new javax.swing.JLabel();
        lblU6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        citytxt1 = new javax.swing.JTextField();
        lblU7 = new javax.swing.JLabel();
        lblU8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        addresstxt1 = new javax.swing.JTextField();
        lblU1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblU2 = new javax.swing.JLabel();
        nowModitxt = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        usPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("Phone Number:");
        usPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 192, -1, -1));

        phonetxt1.setToolTipText("Home phone no.");
        phonetxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxt1ActionPerformed(evt);
            }
        });
        usPanel.add(phonetxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 212, 236, -1));

        jLabel22.setText("Email:");
        usPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, -1, -1));
        usPanel.add(emailtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 266, 566, -1));

        jLabel23.setText("Password");
        usPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 347, -1, -1));
        usPanel.add(passwordtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 367, 214, -1));
        usPanel.add(dob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 319, 214, -1));

        jLabel25.setText("Date of birth:");
        usPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, -1, -1));

        jLabel26.setText("Security Word:");
        usPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 397, -1, -1));
        usPanel.add(securitytxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 423, 214, -1));

        jLabel40.setText("First Name:");
        usPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        rMale1.setText("Male");
        rMale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMale1ActionPerformed(evt);
            }
        });
        usPanel.add(rMale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, -1, -1));

        firstNametxt1.setToolTipText("First Name");
        firstNametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNametxt1ActionPerformed(evt);
            }
        });
        usPanel.add(firstNametxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 215, -1));

        jLabel41.setText("Last Name:");
        usPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 43, 83, -1));

        lastNametxt1.setToolTipText("Last Name");
        lastNametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNametxt1ActionPerformed(evt);
            }
        });
        usPanel.add(lastNametxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 65, 239, -1));

        lblUfn.setForeground(new java.awt.Color(204, 0, 0));
        lblUfn.setText("Invalid Firstname!!");
        usPanel.add(lblUfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 68, -1, -1));

        lblUln.setForeground(new java.awt.Color(204, 0, 0));
        lblUln.setText("Invalid Lastname!");
        usPanel.add(lblUln, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 68, -1, -1));

        lblU3.setForeground(new java.awt.Color(204, 0, 0));
        lblU3.setText("*Enter city!");
        usPanel.add(lblU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 215, -1, -1));

        rFemale1.setText("Female");
        rFemale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFemale1ActionPerformed(evt);
            }
        });
        usPanel.add(rFemale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 114, -1, -1));

        lblU4.setForeground(new java.awt.Color(204, 0, 0));
        lblU4.setText("Invalid Phone Number!!");
        usPanel.add(lblU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 215, -1, -1));

        rOther1.setText("Other");
        rOther1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rOther1ActionPerformed(evt);
            }
        });
        usPanel.add(rOther1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 114, -1, -1));

        lblU5.setForeground(new java.awt.Color(204, 0, 0));
        lblU5.setText("Invalid Email!!");
        usPanel.add(lblU5, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 269, -1, -1));

        lblU6.setForeground(new java.awt.Color(204, 0, 0));
        lblU6.setText("*Enter DOB!!");
        usPanel.add(lblU6, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 323, -1, -1));

        jLabel20.setText("City:");
        usPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, 40, -1));

        citytxt1.setToolTipText("City");
        usPanel.add(citytxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, 163, -1));

        lblU7.setForeground(new java.awt.Color(204, 0, 0));
        lblU7.setText("*Enter Password!");
        usPanel.add(lblU7, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 363, -1, -1));

        lblU8.setForeground(new java.awt.Color(204, 0, 0));
        lblU8.setText("*Enter Security Word!");
        usPanel.add(lblU8, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 426, -1, -1));

        jLabel27.setText("Address :");
        usPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, -1, -1));

        addresstxt1.setToolTipText("Address 1");
        addresstxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxt1ActionPerformed(evt);
            }
        });
        usPanel.add(addresstxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, 572, -1));

        lblU1.setForeground(new java.awt.Color(204, 0, 0));
        lblU1.setText("*Enter Gender");
        usPanel.add(lblU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 118, -1, -1));

        jLabel37.setText("Gender:");
        usPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 47, -1));

        lblU2.setForeground(new java.awt.Color(204, 0, 0));
        lblU2.setText("Enter address!");
        usPanel.add(lblU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 168, -1, -1));

        nowModitxt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        nowModitxt.setForeground(new java.awt.Color(0, 0, 204));
        nowModitxt.setText("You can now modify Student Information and Update");
        usPanel.add(nowModitxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 11, 313, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        usPanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 422, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sudarsan\\Desktop\\AMS_Project\\Icon\\closemini.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        usPanel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 11, 30, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phonetxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxt1ActionPerformed

    private void rMale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMale1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMale1ActionPerformed

    private void lastNametxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNametxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNametxt1ActionPerformed

    private void rFemale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFemale1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rFemale1ActionPerformed

    private void rOther1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rOther1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rOther1ActionPerformed
    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public boolean isNumeric(String a) {
        return a.matches("-?\\d+(\\.\\d+)?");
    }

    public boolean isAlphabet(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public void clearUpdateUpdateWarnings() {
        lblU1.setVisible(false);
        lblU2.setVisible(false);
        lblU3.setVisible(false);
        lblU4.setVisible(false);
        lblU5.setVisible(false);
        lblU6.setVisible(false);
        lblU7.setVisible(false);
        lblU8.setVisible(false);
        lblUfn.setVisible(false);
        lblUln.setVisible(false);

    }

    public boolean isValidInputUpdateStudent() {
        clearUpdateUpdateWarnings();
        boolean result = true;
        if (firstNametxt1.getText().isEmpty()) {
            lblUfn.setText("*Enter Firstname");
            lblUfn.setVisible(true);
            result = false;
        } else if (!isAlphabet(firstNametxt1.getText())) {
            lblUfn.setText("Invalid Firstname!");
            lblUfn.setVisible(true);
            result = false;
        }
        if (lastNametxt1.getText().isEmpty()) {
            lblUln.setText("*Enter Lastname");
            lblUln.setVisible(true);
            result = false;
        } else if (!isAlphabet(lastNametxt1.getText())) {
            lblUln.setText("Invalid Lastname!");
            lblUln.setVisible(true);
            result = false;
        }
        if (genderGroup2.isSelected(null)) {
            lblU1.setVisible(true);
            result = false;
        }
        if (addresstxt1.getText().isEmpty()) {
            lblU2.setText("*Enter address");
            lblU2.setVisible(true);
            result = false;
        } else if (!isAlphabet(addresstxt1.getText())) {
            lblU2.setText("Invalid Address!");
            lblU2.setVisible(true);
            result = false;
        }
        if (citytxt1.getText().isEmpty()) {
            lblU3.setText("*Enter City");
            lblU3.setVisible(true);
            result = false;
        } else if (!isAlphabet(citytxt1.getText())) {
            lblU3.setText("Invalid City!");
            lblU3.setVisible(true);
            result = false;
        }
        if (phonetxt1.getText().isEmpty()) {
            lblU4.setText("*Enter Phone");
            lblU4.setVisible(true);
            result = false;
        } else if (!isNumeric(phonetxt1.getText())) {
            lblU4.setText("Invalid Phone!");
            lblU4.setVisible(true);
            result = false;
        }
        if (emailtxt1.getText().isEmpty()) {
            lblU5.setText("*Enter Email");
            lblU5.setVisible(true);
            result = false;
        } else if (!isValidEmailAddress(emailtxt1.getText())) {
            lblU5.setText("Invalid Email!");
            lblU5.setVisible(true);
            result = false;
        }

        if (dob1.getDate() == null) {
            lblU6.setText("*Enter Date!");
            lblU6.setVisible(true);
            result = false;
        } else if (dob1.getDate().compareTo(new Date()) > 0) {
            lblU6.setText("Invalid Date!");
            lblU6.setVisible(true);
            result = false;
        }

        if (passwordtxt1.getText().isEmpty()) {
            lblU7.setVisible(true);
            result = false;
        }
        if (securitytxt1.getText().isEmpty()) {
            lblU8.setVisible(true);
            result = false;
        }
        return result;
    }

    public ArrayList getDataSave2() {
        ArrayList data = new ArrayList();
        data.add(firstNametxt1.getText());
        data.add(lastNametxt1.getText());
        String g;
        if (rMale1.isSelected()) {
            g = "male";
        } else if (rFemale1.isSelected()) {
            g = "female";
        } else {
            g = "other";
        }
        data.add(g);
        data.add(addresstxt1.getText());
        data.add(citytxt1.getText());
        data.add(phonetxt1.getText());
        data.add(emailtxt1.getText());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = dob1.getDate();
        String fd = df.format(d);
        data.add(fd);
        data.add(securitytxt1.getText());
        data.add(passwordtxt1.getText());
        data.add(ID);
        return data;
    }
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if (isValidInputUpdateStudent()) {
            DbOperation dbopt = new DbOperation();
            dbopt.updateStudent(getDataSave2());
            usPanel.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        usPanel.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void addresstxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxt1ActionPerformed

    private void firstNametxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNametxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNametxt1ActionPerformed

    /**
     * @param args the command line arguments
     */
    ButtonGroup genderGroup2 = new ButtonGroup();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt1;
    private javax.swing.JTextField citytxt1;
    private org.jdesktop.swingx.JXDatePicker dob1;
    private javax.swing.JTextField emailtxt1;
    private javax.swing.JTextField firstNametxt1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JTextField lastNametxt1;
    private javax.swing.JLabel lblU1;
    private javax.swing.JLabel lblU2;
    private javax.swing.JLabel lblU3;
    private javax.swing.JLabel lblU4;
    private javax.swing.JLabel lblU5;
    private javax.swing.JLabel lblU6;
    private javax.swing.JLabel lblU7;
    private javax.swing.JLabel lblU8;
    private javax.swing.JLabel lblUfn;
    private javax.swing.JLabel lblUln;
    private javax.swing.JLabel nowModitxt;
    private javax.swing.JTextField passwordtxt1;
    private javax.swing.JTextField phonetxt1;
    private javax.swing.JRadioButton rFemale1;
    private javax.swing.JRadioButton rMale1;
    private javax.swing.JRadioButton rOther1;
    private javax.swing.JTextField securitytxt1;
    private javax.swing.JButton updateBtn;
    private javax.swing.JPanel usPanel;
    // End of variables declaration//GEN-END:variables
}
