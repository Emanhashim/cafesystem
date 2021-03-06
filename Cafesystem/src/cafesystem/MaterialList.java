/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafesystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nathan
 */
public class MaterialList extends javax.swing.JInternalFrame {

    /**
     * Creates new form MaterialList1
     */
    public MaterialList() {
        initComponents();
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
        tblMateriallist = new javax.swing.JTable();
        btnrefresh = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnDelate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setClosable(true);
        setForeground(new java.awt.Color(51, 0, 153));
        setIconifiable(true);
        setMaximizable(true);
        setTitle("                                 Material List");

        tblMateriallist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        tblMateriallist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food_ID", "Material_Number", "MaterialName"
            }
        ));
        jScrollPane1.setViewportView(tblMateriallist);

        btnrefresh.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(51, 0, 153));
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(51, 0, 153));
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelate.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        btnDelate.setForeground(new java.awt.Color(51, 0, 153));
        btnDelate.setText("Delete");
        btnDelate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelateActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 0, 153));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNew)
                .addGap(26, 26, 26)
                .addComponent(btnDelate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrefresh))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        readmaterial();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        insertmaterial();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDelateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelateActionPerformed
        // TODO add your handling code here:
        deletematerial();
    }//GEN-LAST:event_btnDelateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updatematerial();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelate;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMateriallist;
    // End of variables declaration//GEN-END:variables
        Connection conn = null;
    Statement stmt = null;
    ResultSet rst = null;

    private void readmaterial() {

        DefaultTableModel MaterialTblModel = (DefaultTableModel) tblMateriallist.getModel();
        MaterialTblModel.setRowCount(0);
        String sql = "Select * From material order by Material_No ASC";
        try {
            conn = ConnectToDB.getConnected();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = stmt.executeQuery(sql);
            int row = 0;
            while (rst.next()) {
                MaterialTblModel.addRow(new Object[]{rst.getInt("Food_ID"), rst.getInt("Material_No"), rst.getString("Material_Name")});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());
        }
    }

    private void insertmaterial() {
        DefaultTableModel MaterialList = (DefaultTableModel) tblMateriallist.getModel();
        if (btnNew.getText().equalsIgnoreCase("New")) {
            int emptrow = MaterialList.getRowCount() + 1;
            MaterialList.setRowCount(emptrow);
            btnNew.setText("Save");
        } else {
            int newrow = MaterialList.getRowCount() - 1;
            try {

                rst.moveToInsertRow();
                rst.updateString("Food_ID", MaterialList.getValueAt(newrow, 0).toString());
                rst.updateString("Material_No", MaterialList.getValueAt(newrow, 1).toString());
                rst.updateString("Material_Name", MaterialList.getValueAt(newrow, 2).toString());
                rst.insertRow();
                rst.moveToCurrentRow();
                JOptionPane.showMessageDialog(this, "Record saved successfully.");
                btnNew.setText("New");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());
            }
        }
    }

    private void updatematerial() {
        DefaultTableModel MaterialList = (DefaultTableModel) tblMateriallist.getModel();
        try {
            int resp = JOptionPane.showConfirmDialog(this, "Are you sure you want to update the selected record?");
            if (resp == JOptionPane.YES_OPTION) {
                int row = tblMateriallist.getSelectedRow() + 1;
                rst.absolute(row);
                rst.updateString("Food_ID", MaterialList.getValueAt(tblMateriallist.getSelectedRow(), 0).toString());
                rst.updateString("Material_No", MaterialList.getValueAt(tblMateriallist.getSelectedRow(), 1).toString());
                rst.updateString("Material_Name", MaterialList.getValueAt(tblMateriallist.getSelectedRow(), 2).toString());
                rst.updateRow();
                JOptionPane.showMessageDialog(this, "Record updated successfully.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());
        }
    }

    private void deletematerial() {
        try {
            int resp = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the selected record?");
            if (resp == JOptionPane.YES_OPTION) {
                int row = tblMateriallist.getSelectedRow() + 1;
                rst.absolute(row);
                rst.deleteRow();
                JOptionPane.showMessageDialog(this, "Record deleted successfully.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());
        }
    }

}
