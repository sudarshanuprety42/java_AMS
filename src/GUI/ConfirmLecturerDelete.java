/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DbOperation;
import java.awt.Dialog;

/**
 *
 * @author Sudarsan
 */
public class ConfirmLecturerDelete extends javax.swing.JDialog {

    /**
     * Creates new form ConfirmLecturerDelete
     */
    public ConfirmLecturerDelete() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        okBtn1.setVisible(false);
    }
  public void set(String id,String name){
        idConfirmtxt1.setText(id);
        nameConfirmtxt1.setText(name);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okBtn1 = new javax.swing.JButton();
        qsnlbl1 = new javax.swing.JLabel();
        yesBtn1 = new javax.swing.JButton();
        noBtn1 = new javax.swing.JButton();
        idlbl1 = new javax.swing.JLabel();
        namelbl1 = new javax.swing.JLabel();
        idConfirmtxt1 = new javax.swing.JTextField();
        nameConfirmtxt1 = new javax.swing.JTextField();

        okBtn1.setText("Ok");
        okBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtn1ActionPerformed(evt);
            }
        });

        qsnlbl1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        qsnlbl1.setForeground(new java.awt.Color(51, 51, 255));
        qsnlbl1.setText("Are you sure you want to delete lecturer of:");

        yesBtn1.setText("Yes");
        yesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtn1ActionPerformed(evt);
            }
        });

        noBtn1.setText("No");
        noBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBtn1ActionPerformed(evt);
            }
        });

        idlbl1.setText("ID:");

        namelbl1.setText("Name:");

        idConfirmtxt1.setEditable(false);

        nameConfirmtxt1.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idlbl1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameConfirmtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idConfirmtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(okBtn1)))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(yesBtn1)
                        .addGap(28, 28, 28)
                        .addComponent(noBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(qsnlbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qsnlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn1)
                    .addComponent(idConfirmtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idlbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameConfirmtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesBtn1)
                    .addComponent(noBtn1))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtn1ActionPerformed
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_okBtn1ActionPerformed

    private void yesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtn1ActionPerformed
        DbOperation dbopt = new DbOperation();
        dbopt.DeleteLecturer(idConfirmtxt1.getText());
        idConfirmtxt1.setVisible(false);
        nameConfirmtxt1.setVisible(false);
        idlbl1.setVisible(false);
        namelbl1.setVisible(false);
        qsnlbl1.setText("          Delete Successful");
        okBtn1.setVisible(true);
        yesBtn1.setVisible(false);
        noBtn1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBtn1ActionPerformed

    private void noBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBtn1ActionPerformed
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_noBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmLecturerDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmLecturerDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmLecturerDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmLecturerDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmLecturerDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idConfirmtxt1;
    private javax.swing.JLabel idlbl1;
    private javax.swing.JTextField nameConfirmtxt1;
    private javax.swing.JLabel namelbl1;
    private javax.swing.JButton noBtn1;
    private javax.swing.JButton okBtn1;
    private javax.swing.JLabel qsnlbl1;
    private javax.swing.JButton yesBtn1;
    // End of variables declaration//GEN-END:variables
}
