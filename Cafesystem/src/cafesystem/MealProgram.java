/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafesystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathan
 */
public class MealProgram extends javax.swing.JDialog {

    /**
     * Creates new form MealProgram
     */
    public MealProgram(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnsave1 = new javax.swing.JButton();
        btnclear1 = new javax.swing.JButton();
        btnexit1 = new javax.swing.JButton();
        checkboxmealstatus1 = new javax.swing.JCheckBox();
        cmbmealcard1 = new javax.swing.JComboBox();
        cmbemployee1 = new javax.swing.JComboBox();
        txtdatchuser1 = new com.toedter.calendar.JDateChooser();
        txtmealprogramcode1 = new javax.swing.JTextField();
        cmbMealtype = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Meal_programCode:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("MealDate:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("MealType:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setText("MealStatus:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setText("Employee_ID:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setText("Meal_Card_ID:");

        btnsave1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnsave1.setForeground(new java.awt.Color(255, 0, 51));
        btnsave1.setText("save");
        btnsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave1ActionPerformed(evt);
            }
        });

        btnclear1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnclear1.setForeground(new java.awt.Color(255, 51, 51));
        btnclear1.setText("clear");
        btnclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear1ActionPerformed(evt);
            }
        });

        btnexit1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnexit1.setForeground(new java.awt.Color(255, 0, 51));
        btnexit1.setText(" exit");
        btnexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit1ActionPerformed(evt);
            }
        });

        checkboxmealstatus1.setText(" ");
        checkboxmealstatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxmealstatus1ActionPerformed(evt);
            }
        });

        cmbmealcard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmealcard1ActionPerformed(evt);
            }
        });

        cmbemployee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbemployee1ActionPerformed(evt);
            }
        });

        txtmealprogramcode1.setText(" ");
        txtmealprogramcode1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmealprogramcode1KeyTyped(evt);
            }
        });

        cmbMealtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BreakFast", "Launch", "Dinner" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnsave1)
                .addGap(30, 30, 30)
                .addComponent(btnclear1)
                .addGap(35, 35, 35)
                .addComponent(btnexit1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtdatchuser1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(checkboxmealstatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbmealcard1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbemployee1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmealprogramcode1)
                    .addComponent(cmbMealtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(267, 267, 267))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtmealprogramcode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtdatchuser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbMealtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(checkboxmealstatus1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbemployee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbmealcard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave1)
                    .addComponent(btnclear1)
                    .addComponent(btnexit1))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 102, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("       Meal program");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave1ActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        PreparedStatement pst = null;

        //cfhcfjcf
        try {
            String sql = "Insert into meal_program (meal_programCode,Meal_Date,Meal_Type,Meal_Status,Employee_ID,Meal_Card_ID) values(?,?,?,?,?,?)";
            int aRow;
            conn = ConnectToDB.getConnected();
            pst = conn.prepareStatement(sql);
            java.util.Date dobPicked = txtdatchuser1.getDate();
            //convert date to MySQL date format
            String datePattern = "yyyy-MM-dd";
            SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
            String dobStr = dateFormatter.format(dobPicked);

            pst.setString(1, txtmealprogramcode1.getText());
            pst.setString(2, dobStr);
            pst.setString(3, cmbMealtype.getSelectedItem().toString());
            //            pst.setString(4, dobStr);
            boolean eat = false;
            if (checkboxmealstatus1.isSelected()) {
                eat = true;
            }

            pst.setBoolean(4, eat);

            pst.setString(5, cmbemployee1.getSelectedItem().toString());
            pst.setString(6, cmbmealcard1.getSelectedItem().toString());
            aRow = pst.executeUpdate();
            if (aRow != 0) {
                JOptionPane.showMessageDialog(this, "saved Successfully.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());

        }

    }//GEN-LAST:event_btnsave1ActionPerformed

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed
        // TODO add your handling code he
        //        checkboxmealstatus.setSelectedIcon(false);

        txtmealprogramcode1.setText(null);
    }//GEN-LAST:event_btnclear1ActionPerformed

    private void btnexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit1ActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_btnexit1ActionPerformed

    private void checkboxmealstatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxmealstatus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxmealstatus1ActionPerformed

    private void cmbmealcard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmealcard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmealcard1ActionPerformed

    private void txtmealprogramcode1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmealprogramcode1KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtmealprogramcode1KeyTyped

    private void cmbemployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbemployee1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbemployee1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        getStudentList();
        getEmployeeList();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MealProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MealProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MealProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MealProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MealProgram dialog = new MealProgram(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btnexit1;
    private javax.swing.JButton btnsave1;
    private javax.swing.JCheckBox checkboxmealstatus1;
    private javax.swing.JComboBox cmbMealtype;
    private javax.swing.JComboBox cmbemployee1;
    private javax.swing.JComboBox cmbmealcard1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser txtdatchuser1;
    private javax.swing.JTextField txtmealprogramcode1;
    // End of variables declaration//GEN-END:variables
private void getStudentList() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rst = null;
        String sql = "Select *From student order by student_ID ASC";
        try {
            conn = ConnectToDB.getConnected();
            stmt = conn.createStatement();
            rst = stmt.executeQuery(sql);
            while (rst.next()) {

                int fcode = rst.getInt("Meal_Card_ID");
                String fname = rst.getString("Meal_Card_ID");
                ComboBoxItem fitem = new ComboBoxItem(fcode, fname);
                cmbmealcard1.addItem(fitem);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());
        }
    }

    private void getEmployeeList() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rst = null;
        String sql = "Select *From employee order by Employee_ID ASC";
        try {
            conn = ConnectToDB.getConnected();
            stmt = conn.createStatement();
            rst = stmt.executeQuery(sql);
            while (rst.next()) {
                int fcode = rst.getInt("Employee_ID");
                String fname = rst.getString("Employee_ID");
                ComboBoxItem fitem = new ComboBoxItem(fcode, fname);
                cmbemployee1.addItem(fitem);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database server error" + e.getMessage());
        }
    }
}
