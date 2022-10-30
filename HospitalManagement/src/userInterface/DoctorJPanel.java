/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import HospitalManagement.Appointment.AppointmentHistory;
import HospitalManagement.Patient.Patient;
import HospitalManagement.Patient.PatientDirectory;
import HospitalManagement.Person.PersonDirectory;
import HospitalManagement.VitalSigns.VitalSignsHistory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author romiltiwari
 */
public class DoctorJPanel extends javax.swing.JPanel {

    private PersonDirectory personDirectory;
    private AppointmentHistory appointmentHistory;
    private VitalSignsHistory vitalSignsHistory;
    private PatientDirectory patientDirectory;
    private String userName;
    private Patient patient;

    public DoctorJPanel(JPanel userProcessContainer, PersonDirectory 
            personDirectory, VitalSignsHistory vitalSignsHistory, 
            String userName, Patient patient, PatientDirectory
                            patientDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.vitalSignsHistory = vitalSignsHistory;
        this.userName = userName;
        this.patient = patient;
        this.patientDirectory = patientDirectory;
    }

    public DoctorJPanel(JPanel userProcessContainer,
            PersonDirectory personDirectory,
            AppointmentHistory appointmentHistory, VitalSignsHistory 
                    vitalSignsHistor, Patient patient, PatientDirectory
                            patientDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.appointmentHistory = appointmentHistory;
        this.vitalSignsHistory = vitalSignsHistor;
        this.patientDirectory = patientDirectory;
        this.patient = patient;
        loadLoginPanel();
        doctorOperationsTask.setVisible(false);
    }
    
    private void loadLoginPanel() {
        LoginDoctorJPanel loginDoctorJPanel
                = new LoginDoctorJPanel(viewOperationsTask, 
                        personDirectory, vitalSignsHistory, patientDirectory, 
                        patient);
        viewOperationsTask.add("loginDoctorJPanel", loginDoctorJPanel);
        CardLayout layout = (CardLayout) viewOperationsTask.getLayout();
        layout.next(viewOperationsTask);
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
        doctorOperationsTask = new javax.swing.JPanel();
        patientDetailsButton = new javax.swing.JButton();
        recordObservationButton = new javax.swing.JButton();
        viewOperationsTask = new javax.swing.JPanel();

        patientDetailsButton.setText("Patient Details");
        patientDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsButtonActionPerformed(evt);
            }
        });

        recordObservationButton.setText("Record Observation");
        recordObservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordObservationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doctorOperationsTaskLayout = new javax.swing.GroupLayout(doctorOperationsTask);
        doctorOperationsTask.setLayout(doctorOperationsTaskLayout);
        doctorOperationsTaskLayout.setHorizontalGroup(
            doctorOperationsTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorOperationsTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doctorOperationsTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recordObservationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        doctorOperationsTaskLayout.setVerticalGroup(
            doctorOperationsTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorOperationsTaskLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(patientDetailsButton)
                .addGap(68, 68, 68)
                .addComponent(recordObservationButton)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(doctorOperationsTask);

        viewOperationsTask.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(viewOperationsTask);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void recordObservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordObservationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recordObservationButtonActionPerformed

    private void patientDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsButtonActionPerformed
        // TODO add your handling code here:
        ViewPatientJPanel viewPatientJPanel
                = new ViewPatientJPanel(viewOperationsTask,
                        patientDirectory, personDirectory, patient);
        viewOperationsTask.add("viewPatientJPanel", viewPatientJPanel);
        CardLayout layout = (CardLayout) viewOperationsTask.getLayout();
        layout.next(viewOperationsTask);
    }//GEN-LAST:event_patientDetailsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel doctorOperationsTask;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton patientDetailsButton;
    private javax.swing.JButton recordObservationButton;
    private javax.swing.JPanel viewOperationsTask;
    // End of variables declaration//GEN-END:variables
}
