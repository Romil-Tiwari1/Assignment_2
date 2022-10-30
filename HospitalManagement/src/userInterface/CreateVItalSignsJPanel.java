/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import HospitalManagement.Patient.Patient;
import HospitalManagement.Patient.PatientDirectory;
import HospitalManagement.VitalSigns.VitalSigns;
import javax.swing.JPanel;

/**
 *
 * @author romiltiwari
 */
public class CreateVItalSignsJPanel extends javax.swing.JPanel {

    private VitalSigns vitalSigns;
    private PatientDirectory patientDirectory;
    private JPanel viewOperationsTask;

    /**
     * Creates new form CreateVItalSignsJPanel
     */
    public CreateVItalSignsJPanel(PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.vitalSigns = new VitalSigns();
    }

    public CreateVItalSignsJPanel(JPanel viewOperationsTask, PatientDirectory patientDirectory) {
        initComponents();
        this.viewOperationsTask = viewOperationsTask;
        this.patientDirectory = patientDirectory;
        this.vitalSigns = new VitalSigns();
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
        lblVitalSign = new javax.swing.JLabel();
        lblTemparature = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtTemp = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblPatientId = new javax.swing.JLabel();
        tctPatientId = new javax.swing.JTextField();

        lblVitalSign.setText("Vital Sign");

        lblTemparature.setText("Temprature");

        lblBloodPressure.setText("Blood Pressure");

        lblPulse.setText("Pulse");

        lblDate.setText("Date");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });

        lblPatientId.setText("PatientId");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBloodPressure)
                            .addComponent(lblTemparature)
                            .addComponent(lblPulse)
                            .addComponent(lblDate)
                            .addComponent(lblPatientId))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTemp, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtBloodPressure)
                            .addComponent(txtPulse)
                            .addComponent(txtDate)
                            .addComponent(tctPatientId)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(lblVitalSign))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btnSave)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblVitalSign)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientId)
                    .addComponent(tctPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTemparature)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(btnSave)
                .addGap(162, 162, 162))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int searchText = Integer.parseInt(tctPatientId.getText());
        Patient searchedPatient = null;
 
        for (Patient patient : patientDirectory.getPatientDirectory()) {
            if (patient.getId() == searchText) {
                searchedPatient = patient;
                break;
            }
        }
        String bloodpressure = txtBloodPressure.getText();
        String Date = txtDate.getText();
        String temp = txtTemp.getText();
        String pulse = txtPulse.getText();
        vitalSigns.setBp(Integer.parseInt(bloodpressure));
        vitalSigns.setDate(Date);
        vitalSigns.setPulse(Integer.parseInt(pulse));
        vitalSigns.setTemp(Double.parseDouble(temp));
        searchedPatient.getVitalHistory().addVitalSign(vitalSigns);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemparature;
    private javax.swing.JLabel lblVitalSign;
    private javax.swing.JTextField tctPatientId;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}
