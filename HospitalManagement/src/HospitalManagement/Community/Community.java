/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Community;

import HospitalManagement.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class Community {
    private String city;
    private String zipCode;
    private ArrayList<Community> communityList;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public ArrayList<Community> getHospitalList() {
        return communityList;
    }

    public void setHospitalList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }

    public Community(String city, String zipCode, ArrayList<Community> communityList) {
        this.city = city;
        this.zipCode = zipCode;
        this.communityList = communityList;
    }
}
