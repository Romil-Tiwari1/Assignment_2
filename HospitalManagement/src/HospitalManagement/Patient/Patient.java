/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Patient;

import HospitalManagement.Address.Address;
import HospitalManagement.Appointment.AppointmentHistory;
import HospitalManagement.Person.Person;
import HospitalManagement.Person.PersonDirectory;
import HospitalManagement.VitalSigns.VitalSignsHistory;
import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class Patient extends Person {

    int personId;
    Address address;
    private String patientName;
    private String patientAge;
    private String contactNo;
    private String emailId;
    private VitalSignsHistory vitalSignHistory;
    private AppointmentHistory appointmentHistory;
    private PersonDirectory personDirectory;
    private ArrayList<Person> person;
    private PatientDirectory patientDirectory;
    


    public Patient(int id, String name, int age, String gender,
            String phoneNumber,
            String email, String userType, String userName, String password) {
        super(id, name, age, gender, phoneNumber, email, userType,
                userName, password);
        vitalSignHistory = new VitalSignsHistory();
        appointmentHistory = new AppointmentHistory();
        address = new Address();
        this.patientDirectory = new PatientDirectory();
    }

    public Patient() {
        //TODO
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public VitalSignsHistory getVitalHistory() {
        return vitalSignHistory;
    }

    public void setVitalHistory(VitalSignsHistory vitalHistory) {
        this.vitalSignHistory = vitalHistory;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public AppointmentHistory getApointment() {
        return appointmentHistory;
    }

    public void setApointment(AppointmentHistory apointment) {
        this.appointmentHistory = apointment;
    }
}
