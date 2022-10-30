/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Patient;

import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class PatientDirectory {
    ArrayList<Patient> patientDirectory;
    private Patient patient;
    public PatientDirectory()
    {
        patientDirectory=new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
     public Patient addNewPatient(Patient patient)
    {
        this.patient = patient;
        patientDirectory.add(patient);
        return patient;
    }
}
