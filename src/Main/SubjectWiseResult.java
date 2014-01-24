/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultRowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import run.DBConnect;

public class SubjectWiseResult extends javax.swing.JFrame {

    private int whichROw;
    DefaultTableModel model;

    public SubjectWiseResult() {
        initComponents();
        retrieveSubjectNames();
        fillSubjectCombo();
        
        model = new DefaultTableModel();
        // StudentMarksTable.setModel(model);
        model.addColumn("USN");
        model.addColumn("NAME");
        model.addColumn("INTERNAL");
        model.addColumn("EXTERNAL");
        model.addColumn("TOTAL");
        bSubmit.doClick();

        studentMarksTable.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        subjectCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bSubmit = new javax.swing.JButton();
        lastValue = new javax.swing.JSpinner();
        firstValue = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentMarksTable = new javax.swing.JTable();
        lcount = new javax.swing.JLabel();
        bSave = new javax.swing.JButton();
        bClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("in");

        subjectCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Any" }));
        subjectCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectComboActionPerformed(evt);
            }
        });

        jLabel2.setText("and");

        jLabel1.setText("How many got marks between ");

        bSubmit.setText("OK");
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        lastValue.setModel(new javax.swing.SpinnerNumberModel(125, 0, 125, 1));

        firstValue.setModel(new javax.swing.SpinnerNumberModel(0, 0, 125, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lastValue, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subjectCombo, 0, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSubmit)
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(subjectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(bSubmit)
                    .addComponent(lastValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        studentMarksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "USN", "Name", "Internal", "External", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentMarksTable);

        lcount.setText("COUNT WILL BE DIPLAYED HERE");

        bSave.setText("Save Results");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bClose.setText("Close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lcount))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSave)
                .addGap(36, 36, 36)
                .addComponent(bClose)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lcount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSave)
                    .addComponent(bClose))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjectComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectComboActionPerformed
        bSubmit.doClick();
    }//GEN-LAST:event_subjectComboActionPerformed

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        Statement stmt = null;
        ResultSet rs = null;
        String query = "";
        Connection con = DBConnect.connection;
        int lowLimit = Integer.parseInt(firstValue.getValue().toString())-1;
        int highLimit = Integer.parseInt(lastValue.getValue().toString())+1;
        //get USN from user

        model.setRowCount(0);
        studentMarksTable.setModel(model);
        // System.out.println("after trim " + .trim());
        query = "select DISTINCT * from RESULTTABLE";
        //query = "select DISTINCT NAME,USN from RESULTTABLE";
        try {
            //stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            int rowCount = 0;
            while (rs.next()) {
                if (subjectCombo.getSelectedIndex() == 8) {
                    int flag = 0;
                    for (int i = 3; i < 35; i += 4) {
                        if (Integer.parseInt(rs.getString(i)) < lowLimit || Integer.parseInt(rs.getString(i)) > highLimit) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        model.insertRow(rowCount++, new Object[]{rs.getString(1), rs.getString(2), rs.getString(35), rs.getString(36), rs.getString(36)});
                    }
                    

                }
                else if(subjectCombo.getSelectedIndex() == 9){
                    int flag = 0;
                    for (int i = 3; i < 35; i += 4) {
                        if (Integer.parseInt(rs.getString(i)) > lowLimit || Integer.parseInt(rs.getString(i)) < highLimit) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 1) {
                        model.insertRow(rowCount++, new Object[]{rs.getString(1), rs.getString(2), rs.getString(35), rs.getString(36), rs.getString(36)});
                    }
                }
                else {
                    whichROw = subjectCombo.getSelectedIndex() * 4 + 3;
                    //System.out.println(rs.getString(1) + "  " + rs.getString(whichROw) + " " + rs.getString(whichROw + 1) + " " + rs.getString(whichROw + 2) + " " + rs.getString(whichROw + 3));
                    // System.out.println("lowLimit is : "+lowLimit + " highLimit is : " +highLimit + " total is : " + Integer.parseInt(rs.getString(whichROw+2)));
                    if (Integer.parseInt(rs.getString(whichROw + 2)) > lowLimit) {
                        if (Integer.parseInt(rs.getString(whichROw + 2)) < highLimit) {
                            model.insertRow(rowCount++, new Object[]{rs.getString(1), rs.getString(2), rs.getString(whichROw), rs.getString(whichROw + 1), rs.getString(whichROw + 2)});
                        } else {

                        }
                    } else {
                        System.out.println(rs.getString(1) + " is not listed");
                    }
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error : " + ex);
        }
        lcount.setText(Integer.toString(model.getRowCount()) + " of them scored between " + firstValue.getValue() + " and " + lastValue.getValue());

    }//GEN-LAST:event_bSubmitActionPerformed

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        
    }//GEN-LAST:event_bSaveActionPerformed

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
            java.util.logging.Logger.getLogger(SubjectWiseResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectWiseResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectWiseResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectWiseResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectWiseResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bSubmit;
    private javax.swing.JSpinner firstValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner lastValue;
    private javax.swing.JLabel lcount;
    private javax.swing.JTable studentMarksTable;
    private javax.swing.JComboBox subjectCombo;
    // End of variables declaration//GEN-END:variables

    private void fillSubjectCombo() {

        Vector comboBoxItems = new Vector();

        for (int i = 0; i < MainForm.subNamesV.size(); i++) {
            //System.out.println(MainForm.subNamesV.get(i));
            comboBoxItems.add(MainForm.subNamesV.get(i));
        }
        comboBoxItems.add("All");
        comboBoxItems.add("Any");
        DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxItems);

        subjectCombo.setModel(model);

    }
    
    private void retrieveSubjectNames() {
        MainForm.subNamesV.clear();
        Connection con = DBConnect.connection;
        ResultSet rs = null;
        String sql = "Select * From SUBJECTTABLE";
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                MainForm.subNamesV.add(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(resultFetch.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
