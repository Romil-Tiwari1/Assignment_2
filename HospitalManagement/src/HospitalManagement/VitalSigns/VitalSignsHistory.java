/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.VitalSigns;

import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class VitalSignsHistory {
    ArrayList<VitalSigns> vitalSignHistory;
    
    public VitalSignsHistory()
    {
        vitalSignHistory =new ArrayList<>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    public void addVitalSign(VitalSigns vitalSign)
    {
        vitalSignHistory.add(vitalSign);
    }
}
