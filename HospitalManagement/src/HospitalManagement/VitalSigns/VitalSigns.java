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
    int vitalSignId;
    int patientId;
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private int weight;
    private Date timestamp;

    public int getVitalSignId() {
        return vitalSignId;
    }

    public void setVitalSignId(int vitalSignId) {
        this.vitalSignId = vitalSignId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
     @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
}
