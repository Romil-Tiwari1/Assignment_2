/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Hospital;

import HospitalManagement.Community.Community;
import HospitalManagement.Doctor.DoctorDirectory;

/**
 *
 * @author romiltiwari
 */
public class Hospital {
    int id;
    String name;
    String doctorName;
    String zipCode;
    Community community;
    DoctorDirectory doctorDirectory;
    public Hospital()
    {
      //community=new Community();
      doctorDirectory=new DoctorDirectory();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Hospital(int id, String name, String doctorName, String zipCode) {
        this.id = id;
        this.name = name;
        this.doctorName = doctorName;
        this.zipCode = zipCode;
    }
}
