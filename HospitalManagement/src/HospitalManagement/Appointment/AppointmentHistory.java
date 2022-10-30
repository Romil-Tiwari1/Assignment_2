/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Appointment;

import HospitalManagement.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class AppointmentHistory {
    ArrayList<Appointment> apointmentHistory;
    public AppointmentHistory()
    {
        apointmentHistory=new ArrayList<>();
    }

    public ArrayList<Appointment> getApointmentHistory() {
        return apointmentHistory;
    }

    public void setApointmentHistory(ArrayList<Appointment> apointmentHistory) {
        this.apointmentHistory = apointmentHistory;
    }
    
    
    public Appointment addNewAppointment(){
        Appointment appointment = new Appointment();
        apointmentHistory.add(appointment);
        return appointment;
    }
    
      public ArrayList<Appointment> searchAppointments(String key)
    {
        ArrayList<Appointment> searchAppointmentDirectory = new ArrayList();
        for(Appointment appointment: apointmentHistory)
        {
            if(appointment.getPatientName().toLowerCase().startsWith(key.toLowerCase()))
            {
                    searchAppointmentDirectory.add(appointment);
            }
        }
        return searchAppointmentDirectory;
    }
}
