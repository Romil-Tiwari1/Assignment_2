/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Community;

import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class CommunityDirectory {
    ArrayList<Community> communityDirectory;
    public CommunityDirectory()
    {
        communityDirectory =new ArrayList<>();
    }

    public ArrayList<Community> getHospitalDirectory() {
        return communityDirectory;
    }

    public void setHospitalDirectory(ArrayList<Community> hospitalDirectory) {
        this.communityDirectory = hospitalDirectory;
    }
}
