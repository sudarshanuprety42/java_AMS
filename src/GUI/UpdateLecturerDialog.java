/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DbOperation;
import java.awt.Dialog;
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
public class UpdateLecturerDialog extends javax.swing.JDialog {
String ID;
    /**
     * Creates new form UpdateLecturerDialog
     */
    public UpdateLecturerDialog(ArrayList a) {
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
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
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

        jLabel21.setText("Phone Number:");

        phonetxt1.setToolTipText("Home phone no.");
        phonetxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxt1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Email:");

        jLabel23.setText("Password");

        jLabel25.setText("Date of birth:");

        jLabel26.setText("Security Word:");

        jLabel40.setText("First Name:");

        rMale1.setText("Male");
        rMale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMale1ActionPerformed(evt);
            }
        });

        firstNametxt1.setToolTipText("First Name");

        jLabel41.setText("Last Name:");

        lastNametxt1.setToolTipText("Last Name");
        lastNametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNametxt1ActionPerformed(evt);
            }
        });

        lblUfn.setForeground(new java.awt.Color(204, 0, 0));
        lblUfn.setText("Invalid Firstname!!");

        lblUln.setForeground(new java.awt.Color(204, 0, 0));
        lblUln.setText("Invalid Lastname!");

        lblU3.setForeground(new java.awt.Color(204, 0, 0));
        lblU3.setText("*Enter city!");

        rFemale1.setText("Female");
        rFemale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFemale1ActionPerformed(evt);
            }
        });

        lblU4.setForeground(new java.awt.Color(204, 0, 0));
        lblU4.setText("Invalid Phone Number!!");

        rOther1.setText("Other");
        rOther1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rOther1ActionPerformed(evt);
            }
        });

        lblU5.setForeground(new java.awt.Color(204, 0, 0));
        lblU5.setText("Invalid Email!!");

        lblU6.setForeground(new java.awt.Color(204, 0, 0));
        lblU6.setText("*Enter DOB!!");

        jLabel20.setText("City:");

        citytxt1.setToolTipText("City");

        lblU7.setForeground(new java.awt.Color(204, 0, 0));
        lblU7.setText("*Enter Password!");

        lblU8.setForeground(new java.awt.Color(204, 0, 0));
        lblU8.setText("*Enter Security Word!");

        jLabel27.setText("Address :");

        addresstxt1.setToolTipText("Address 1");

        lblU1.setForeground(new java.awt.Color(204, 0, 0));
        lblU1.setText("*Enter Gender");

        jLabel37.setText("Gender:");

        lblU2.setForeground(new java.awt.Color(204, 0, 0));
        lblU2.setText("Enter address!");

        nowModitxt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        nowModitxt.setForeground(new java.awt.Color(0, 0, 204));
        nowModitxt.setText("You can now modify Student Information and Update");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sudarsan\\Desktop\\AMS_Project\\Icon\\closemini.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usPanelLayout = new javax.swing.GroupLayout(usPanel);
        usPanel.setLayout(usPanelLayout);
        usPanelLayout.setHorizontalGroup(
            usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(nowModitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addGap(137, 137, 137))
            .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(usPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(usPanelLayout.createSequentialGroup()
                                .addComponent(rMale1)
                                .addGap(18, 18, 18)
                                .addComponent(rFemale1)
                                .addGap(18, 18, 18)
                                .addComponent(rOther1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblU1))
                            .addComponent(jLabel27))
                        .addComponent(jLabel22)
                        .addGroup(usPanelLayout.createSequentialGroup()
                            .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordtxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(usPanelLayout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(lblU6))
                                .addGroup(usPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblU7))))
                        .addGroup(usPanelLayout.createSequentialGroup()
                            .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addresstxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(usPanelLayout.createSequentialGroup()
                                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, usPanelLayout.createSequentialGroup()
                                            .addComponent(citytxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblU3)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(phonetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblU2)
                                .addComponent(lblU4)))
                        .addComponent(jLabel25)
                        .addComponent(jLabel23)
                        .addComponent(jLabel26)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(usPanelLayout.createSequentialGroup()
                            .addComponent(securitytxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblU8))
                        .addGroup(usPanelLayout.createSequentialGroup()
                            .addComponent(emailtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblU5))
                        .addGroup(usPanelLayout.createSequentialGroup()
                            .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addComponent(firstNametxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                            .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(usPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblUfn))
                                .addGroup(usPanelLayout.createSequentialGroup()
                                    .addGap(122, 122, 122)
                                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(usPanelLayout.createSequentialGroup()
                                            .addComponent(lastNametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblUln, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                        .addGroup(usPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(273, 273, 273)))))))
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        usPanelLayout.setVerticalGroup(
            usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nowModitxt)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addGap(22, 22, 22))
            .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(usPanelLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel40)
                        .addComponent(jLabel41))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastNametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUfn)
                        .addComponent(lblUln, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel37)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rMale1)
                        .addComponent(rFemale1)
                        .addComponent(rOther1)
                        .addComponent(lblU1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel27)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addresstxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblU2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(citytxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phonetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblU4)
                        .addComponent(lblU3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel22)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblU5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel25)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblU6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel23)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblU7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel26)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(usPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(securitytxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblU8))
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if (isValidInputUpdateStudent()) {
            DbOperation dbopt = new DbOperation();
            dbopt.updateLecturer(getDataSave2());
            usPanel.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        usPanel.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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