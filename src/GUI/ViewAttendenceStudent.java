/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DbOperation;
import java.awt.Dialog;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sudarsan
 */
public class ViewAttendenceStudent extends javax.swing.JDialog {
    String name;
    /**
     * Creates new form ViewAttendenceStudent
     */
    public ViewAttendenceStudent(String id) throws SQLException {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

        DbOperation dopt = new DbOperation();
        String name = "";
        System.out.println("hello");
        ResultSet rs1=dopt.getNameByID(id);
        if(rs1.next()){
            name+=rs1.getString(1);
            name+="_"+rs1.getString(2);
        }
        this.name=name;
        ResultSet rs = dopt.viewAttendenceStudent(name);
        attendenceTable.setModel(buildTableModel(rs));
    }

    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        attendenceTable = new javax.swing.JTable();

        attendenceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        attendenceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                attendenceTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(attendenceTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attendenceTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendenceTableMouseReleased
        if(evt.getClickCount()==2){
            Object a = attendenceTable.getModel().getValueAt(attendenceTable.getSelectedRow(), attendenceTable.getSelectedColumn());
            if (a.toString().equals("false")) {
                Object date= attendenceTable.getModel().getValueAt(attendenceTable.getSelectedRow(),0);
                String sdate=date.toString();
                
            ReasonAbsent ra;
                try {
                    ra = new ReasonAbsent(sdate,name);
                                ra.setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(ViewAttendenceStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_attendenceTableMouseReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendenceTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
