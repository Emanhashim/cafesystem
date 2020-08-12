/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafesystem;

import unwanted.Em;
import unwanted.Stud;
import unwanted.Meal_program;
import unwanted.StudentList;
import java.awt.Desktop;
import java.awt.Point;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.DesktopPaneUI;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Nathan
 */
public class MDICafeSystem extends javax.swing.JFrame {

    /**
     * Creates new form Name
     */
    public MDICafeSystem() {
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

        DesktopPane = new javax.swing.JDesktopPane();
        lbluser = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        mnuEmpInfo = new javax.swing.JMenu();
        menuregisteremployee = new javax.swing.JMenuItem();
        menuViewEmployeeInfo = new javax.swing.JMenuItem();
        menustudent = new javax.swing.JMenu();
        menuStudentRegister = new javax.swing.JMenuItem();
        menuStudentList = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuMaterialRegi = new javax.swing.JMenuItem();
        menuMaterialList = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuAddFod = new javax.swing.JMenuItem();
        ViewFoodInformation = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        munmealregester = new javax.swing.JMenuItem();
        mnuprogramlist = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniWindows = new javax.swing.JMenuItem();
        mniLuna = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("               Main MDI Cafe System");
        setBackground(new java.awt.Color(102, 102, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        DesktopPane.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 0, 51));
        lbluser.setText(":");

        fileMenu.setForeground(new java.awt.Color(0, 0, 204));
        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        mnuEmpInfo.setForeground(new java.awt.Color(0, 0, 255));
        mnuEmpInfo.setText("Employee Information");

        menuregisteremployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuregisteremployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuregisteremployee.setText("Register Employee");
        menuregisteremployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuregisteremployeeActionPerformed(evt);
            }
        });
        mnuEmpInfo.add(menuregisteremployee);

        menuViewEmployeeInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuViewEmployeeInfo.setText("Employee Info");
        menuViewEmployeeInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewEmployeeInfoActionPerformed(evt);
            }
        });
        mnuEmpInfo.add(menuViewEmployeeInfo);

        menuBar.add(mnuEmpInfo);

        menustudent.setForeground(new java.awt.Color(0, 0, 255));
        menustudent.setText("Student");

        menuStudentRegister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        menuStudentRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuStudentRegister.setText("Add Student");
        menuStudentRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStudentRegisterActionPerformed(evt);
            }
        });
        menustudent.add(menuStudentRegister);

        menuStudentList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        menuStudentList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuStudentList.setText(" Student List");
        menuStudentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStudentListActionPerformed(evt);
            }
        });
        menustudent.add(menuStudentList);

        menuBar.add(menustudent);

        jMenu3.setForeground(new java.awt.Color(51, 0, 255));
        jMenu3.setText("Material");

        menuMaterialRegi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        menuMaterialRegi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuMaterialRegi.setText("Add Material");
        menuMaterialRegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMaterialRegiActionPerformed(evt);
            }
        });
        jMenu3.add(menuMaterialRegi);

        menuMaterialList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuMaterialList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuMaterialList.setText("Material List");
        menuMaterialList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMaterialListActionPerformed(evt);
            }
        });
        jMenu3.add(menuMaterialList);

        menuBar.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(51, 0, 255));
        jMenu4.setText("Food");

        menuAddFod.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        menuAddFod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuAddFod.setText("Add food");
        menuAddFod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddFodActionPerformed(evt);
            }
        });
        jMenu4.add(menuAddFod);

        ViewFoodInformation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        ViewFoodInformation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewFoodInformation.setText("Food Info");
        ViewFoodInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewFoodInformationActionPerformed(evt);
            }
        });
        jMenu4.add(ViewFoodInformation);

        menuBar.add(jMenu4);

        jMenu1.setForeground(new java.awt.Color(0, 0, 204));
        jMenu1.setText("Meal Program");

        munmealregester.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        munmealregester.setText("Meal Regester");
        munmealregester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                munmealregesterActionPerformed(evt);
            }
        });
        jMenu1.add(munmealregester);

        mnuprogramlist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuprogramlist.setText("Meal Program List");
        mnuprogramlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuprogramlistActionPerformed(evt);
            }
        });
        jMenu1.add(mnuprogramlist);

        menuBar.add(jMenu1);

        jMenu5.setForeground(new java.awt.Color(0, 0, 255));
        jMenu5.setText("Report");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem10.setText("Employee Info");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem11.setText("Student Info");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        menuBar.add(jMenu5);

        jMenu2.setText("UI");

        mniWindows.setText("Windows");
        mniWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniWindowsActionPerformed(evt);
            }
        });
        jMenu2.add(mniWindows);

        mniLuna.setText("Luna");
        mniLuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLunaActionPerformed(evt);
            }
        });
        jMenu2.add(mniLuna);

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        menuBar.add(jMenu2);

        jMenu6.setText("help");

        jMenuItem1.setText("about");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        menuBar.add(jMenu6);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(749, Short.MAX_VALUE))
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void menuStudentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStudentListActionPerformed
        // TODO add your handling code here:
        StudentList1 studlist = new StudentList1();
        DesktopPane.add(studlist);
        studlist.setVisible(true);
        studlist.toFront();
    }//GEN-LAST:event_menuStudentListActionPerformed

    private void menuMaterialListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMaterialListActionPerformed
        // TODO add your handling code here:
        MaterialList materiallist = new MaterialList();
        DesktopPane.add(materiallist);
        materiallist.setVisible(true);
        materiallist.toFront();
    }//GEN-LAST:event_menuMaterialListActionPerformed

    private void menuMaterialRegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMaterialRegiActionPerformed
        // TODO add your handling code here:
        MaterialRegistration1 material = new MaterialRegistration1(this, true);
        material.setLocationRelativeTo(this);
        material.setVisible(true);
    }//GEN-LAST:event_menuMaterialRegiActionPerformed

    private void menuregisteremployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregisteremployeeActionPerformed
        EmployeeRegistration1 Emp = new EmployeeRegistration1(this, true);
        Emp.setLocationRelativeTo(this);
        Emp.setVisible(true);
    }//GEN-LAST:event_menuregisteremployeeActionPerformed

    private void menuViewEmployeeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewEmployeeInfoActionPerformed
        // TODO add your handling code here:
        EmployeeList1 vf = new EmployeeList1();
        DesktopPane.add(vf);
        vf.setVisible(true);
        vf.toFront();
    }//GEN-LAST:event_menuViewEmployeeInfoActionPerformed

    private void menuStudentRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStudentRegisterActionPerformed
        StudentRegistration stu = new StudentRegistration(this, true);
        stu.setLocationRelativeTo(this);
        stu.setVisible(true);
    }//GEN-LAST:event_menuStudentRegisterActionPerformed

    private void menuAddFodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddFodActionPerformed
        // TODO add your handling code here:
        AddFood1 studreg = new AddFood1(this, true);
        studreg.setLocationRelativeTo(this);
        studreg.setVisible(true);
    }//GEN-LAST:event_menuAddFodActionPerformed

    private void ViewFoodInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewFoodInformationActionPerformed
        // TODO add your handling code here:
        FoodInformation1 Food = new FoodInformation1();
        DesktopPane.add(Food);
        Food.toFront();
        Food.setVisible(true);
    }//GEN-LAST:event_ViewFoodInformationActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (UserInfo.role == 1) {
            menuregisteremployee.setEnabled(false);
            menuViewEmployeeInfo.setEnabled(false);
            menuMaterialRegi.setEnabled(false);
            menuMaterialList.setEnabled(false);
        } else if (UserInfo.role == 2) {
          menuStudentRegister.setEnabled(false);
            menuStudentList.setEnabled(false);
            menuregisteremployee.setEnabled(false);
            menuViewEmployeeInfo.setEnabled(false);
            menuMaterialRegi.setEnabled(false);
            menuMaterialList.setEnabled(false);
            
        } else if (UserInfo.role == 2) {

        }
        lbluser.setText(UserInfo.username);
    }//GEN-LAST:event_formWindowOpened

    private void munmealregesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munmealregesterActionPerformed
        MealProgram Meal = new MealProgram(this, true);
        Meal.setLocationRelativeTo(this);
        Meal.setVisible(true);
    }//GEN-LAST:event_munmealregesterActionPerformed

    private void mnuprogramlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuprogramlistActionPerformed
        // TODO add your handling code here:
        MealProgramList meal = new MealProgramList();
        DesktopPane.add(meal);
        meal.toFront();
        meal.setVisible(true);
    }//GEN-LAST:event_mnuprogramlistActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        loadEmployeeList();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        loadStudentList();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void mniWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniWindowsActionPerformed
        // TODO add your handling code here:
        if (mniWindows.isSelected()) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MDICafeSystem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(MDICafeSystem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(MDICafeSystem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(MDICafeSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mniWindowsActionPerformed

    private void mniLunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLunaActionPerformed
        // TODO add your handling code here:
        if (mniLuna.isSelected()) {
            try {
                //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MDICafeSystem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(MDICafeSystem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(MDICafeSystem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(MDICafeSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mniLunaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        members java=new members();
        java.setVisible(true);
        java.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MDICafeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDICafeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDICafeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDICafeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDICafeSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuItem ViewFoodInformation;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lbluser;
    private javax.swing.JMenuItem menuAddFod;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuMaterialList;
    private javax.swing.JMenuItem menuMaterialRegi;
    private javax.swing.JMenuItem menuStudentList;
    private javax.swing.JMenuItem menuStudentRegister;
    private javax.swing.JMenuItem menuViewEmployeeInfo;
    private javax.swing.JMenuItem menuregisteremployee;
    private javax.swing.JMenu menustudent;
    private javax.swing.JMenuItem mniLuna;
    private javax.swing.JMenuItem mniWindows;
    private javax.swing.JMenu mnuEmpInfo;
    private javax.swing.JMenuItem mnuprogramlist;
    private javax.swing.JMenuItem munmealregester;
    // End of variables declaration//GEN-END:variables
private void loadEmployeeList() {
        try {
            Connection conn = ConnectToDB.getConnected();
            String EmpolyeeReport = "src/CafeSystemReport/Report.jrxml";
            JasperReport jspReport = JasperCompileManager.compileReport(EmpolyeeReport);
            JasperPrint jspPrint = JasperFillManager.fillReport(jspReport, null, conn);
            JasperViewer vr = new JasperViewer(jspPrint, false);
            vr.setTitle("Employee List");
//            ImageIcon icon = new ImageIcon("src/sis/images/sis2.jpg");
//            vr.setIconImage(icon.getImage());
            vr.setVisible(true);
        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadStudentList() {
        try {
            Connection conn = ConnectToDB.getConnected();
            String StudentReport = "src/CafeSystemReport/StudentReport.jrxml";
            JasperReport jspReport = JasperCompileManager.compileReport(StudentReport);
            JasperPrint jspPrint = JasperFillManager.fillReport(jspReport, null, conn);
            JasperViewer vr = new JasperViewer(jspPrint, false);
            vr.setTitle("Student List");
            vr.setVisible(true);
        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
