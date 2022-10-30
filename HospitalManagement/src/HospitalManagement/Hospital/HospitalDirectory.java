/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Hospital;

import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalDirectory;
    public HospitalDirectory()
    {
        hospitalDirectory =new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
}
