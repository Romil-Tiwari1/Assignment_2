/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import HospitalManagement.Community.CommunityDirectory;
import HospitalManagement.Patient.PatientDirectory;
import HospitalManagement.Person.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author romiltiwari
 */
public class LoginAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    String admin;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private CommunityDirectory communityDirectory;

    /**
     * Creates new form LoginAdminJPanel
     */
    public LoginAdminJPanel() {
        initComponents();
    }

    public LoginAdminJPanel(JPanel jPanel1,
            PersonDirectory personDirectory, PatientDirectory patientDirectory,
            CommunityDirectory communityDirectory) {
        initComponents();
        this.userProcessContainer = jPanel1;
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
        this.communityDirectory = communityDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanelForm = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        adminUserNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminUserPasswordTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        jLabel3.setText("ADMIN LOGIN PANEL");

        adminUserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUserNameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Admin Username");

        jLabel2.setText("Admin Password");

        adminUserPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUserPasswordTextFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelFormLayout = new javax.swing.GroupLayout(adminPanelForm);
        adminPanelForm.setLayout(adminPanelFormLayout);
        adminPanelFormLayout.setHorizontalGroup(
            adminPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelFormLayout.createSequentialGroup()
                .addGroup(adminPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelFormLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel3))
                    .addGroup(adminPanelFormLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(adminPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(adminPanelFormLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(adminUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminPanelFormLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(adminPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(adminPanelFormLayout.createSequentialGroup()
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(adminUserPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        adminPanelFormLayout.setVerticalGroup(
            adminPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(adminPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminUserNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(adminPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminUserPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(adminPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adminUserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUserNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUserNameTextFieldActionPerformed

    private void adminUserPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUserPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUserPasswordTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:

        if (adminUserNameTextField.getText().toLowerCase()
                .equals("SystemAdmin0710") || adminUserPasswordTextField
                .getText().toLowerCase().equals("system")) {
            JOptionPane.showMessageDialog(this,
                    "Admin Login Success", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            adminPanelForm.removeAll();
            admin = "System";
            AdminJPanel systemAdmin
                    = new AdminJPanel(userProcessContainer,
                            personDirectory, patientDirectory, admin , 
                            communityDirectory);
            userProcessContainer.add("systemAdmin", systemAdmin);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else if (adminUserNameTextField.getText().toLowerCase()
                .equals("CommunityAdmin0710") || adminUserPasswordTextField
                .getText().toLowerCase().equals("community")) {
            JOptionPane.showMessageDialog(this,
                    "Admin Login Success", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            adminPanelForm.removeAll();
            admin = "Community";
            AdminJPanel systemAdmin
                    = new AdminJPanel(userProcessContainer,
                            personDirectory, patientDirectory, admin 
                    ,communityDirectory);
            userProcessContainer.add("systemAdmin", systemAdmin);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(this,
                    "Invalid Credentials", "Error",
                    JOptionPane.ERROR_MESSAGE);
            adminUserNameTextField.setText("");
            adminUserPasswordTextField.setText("");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        adminUserNameTextField.setText("");
        adminUserPasswordTextField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanelForm;
    private javax.swing.JTextField adminUserNameTextField;
    private javax.swing.JTextField adminUserPasswordTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
