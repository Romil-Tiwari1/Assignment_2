/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import HospitalManagement.Appointment.Appointment;
import HospitalManagement.Appointment.AppointmentHistory;
import HospitalManagement.Person.PersonDirectory;
import HospitalManagement.VitalSigns.VitalSignsHistory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author romiltiwari
 */
public class PatientJPanel extends javax.swing.JPanel {

    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    private AppointmentHistory appointmentHistory;
    private String userName;
    private Appointment appointment;
    

    /**
     * Creates new form PatientJPanel
     */
    public PatientJPanel(JPanel userProcessContainer, 
            PersonDirectory personDirectory, AppointmentHistory 
                    appointmentHistory, Appointment appointment) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        this.appointmentHistory = appointmentHistory;
        this.appointment = appointment;
        loadLoginPanel();
        patientOperations.setVisible(false);
    }

    public PatientJPanel(JPanel userProcessContainer,
            PersonDirectory personDirectory, AppointmentHistory 
                    appointmentHistory,String userName, Appointment appointment ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userName= userName;
        this.appointmentHistory = appointmentHistory;
        this.appointment = appointment;
    }

    private void loadLoginPanel() {
        LoginJPanel patientJPanel
                = new LoginJPanel(viewOperationTask, personDirectory,
                appointmentHistory, appointment);
        viewOperationTask.add("patientJPanel", patientJPanel);
        CardLayout layout = (CardLayout) viewOperationTask.getLayout();
        layout.next(viewOperationTask);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        patientOperationsTask = new javax.swing.JPanel();
        patientOperations = new javax.swing.JPanel();
        appointmentHistoryButton = new javax.swing.JButton();
        vitalsHistory = new javax.swing.JButton();
        bookAppointment = new javax.swing.JButton();
        viewOperationTask = new javax.swing.JPanel();

        appointmentHistoryButton.setText("Appointment History");
        appointmentHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentHistoryButtonActionPerformed(evt);
            }
        });

        vitalsHistory.setText("Vital History");

        bookAppointment.setText("Book Appointment");
        bookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patientOperationsLayout = new javax.swing.GroupLayout(patientOperations);
        patientOperations.setLayout(patientOperationsLayout);
        patientOperationsLayout.setHorizontalGroup(
            patientOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientOperationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(appointmentHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vitalsHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        patientOperationsLayout.setVerticalGroup(
            patientOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientOperationsLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(appointmentHistoryButton)
                .addGap(43, 43, 43)
                .addComponent(vitalsHistory)
                .addGap(41, 41, 41)
                .addComponent(bookAppointment)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout patientOperationsTaskLayout = new javax.swing.GroupLayout(patientOperationsTask);
        patientOperationsTask.setLayout(patientOperationsTaskLayout);
        patientOperationsTaskLayout.setHorizontalGroup(
            patientOperationsTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
            .addGroup(patientOperationsTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(patientOperationsTaskLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(patientOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        patientOperationsTaskLayout.setVerticalGroup(
            patientOperationsTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
            .addGroup(patientOperationsTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(patientOperationsTaskLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(patientOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jSplitPane1.setLeftComponent(patientOperationsTask);

        viewOperationTask.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(viewOperationTask);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

//    private void clearFields() {
//        userNameJInput.setText("");
//        userPasswordJInput.setText("");
//    }

    private void appointmentHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentHistoryButtonActionPerformed
        AppointmentHistoryPanel patientJPanel
                = new AppointmentHistoryPanel(viewOperationTask,
                        appointmentHistory, personDirectory, appointment);
        viewOperationTask.add("patientJPanel", patientJPanel);
        CardLayout layout = (CardLayout) viewOperationTask.getLayout();
        layout.next(viewOperationTask);
    }//GEN-LAST:event_appointmentHistoryButtonActionPerformed

    private void bookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentActionPerformed
        // TODO add your handling code here:
        BookAppointmentJPanel bookAppointment
                = new BookAppointmentJPanel(viewOperationTask,
                        appointmentHistory, appointment);
        viewOperationTask.add("bookAppointment", bookAppointment);
        CardLayout layout = (CardLayout) viewOperationTask.getLayout();
        layout.next(viewOperationTask);
    }//GEN-LAST:event_bookAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmentHistoryButton;
    private javax.swing.JButton bookAppointment;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel patientOperations;
    private javax.swing.JPanel patientOperationsTask;
    private javax.swing.JPanel viewOperationTask;
    private javax.swing.JButton vitalsHistory;
    // End of variables declaration//GEN-END:variables
}
