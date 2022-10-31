/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.VitalSigns;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author romiltiwari
 */
public class VitalSigns {

    double temp;
    int pulse;
    int bp;
    String date;
    String patientId;

    public VitalSigns(double temp, int pulse, String date, String patientId) {
        this.temp = temp;
        this.pulse = pulse;
        this.date = date;
        this.patientId = patientId;
    }

    public VitalSigns() {
        //TODO
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return date;
    }
 
    
}
