/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Person;

import HospitalManagement.Patient.Patient;
import HospitalManagement.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class PersonDirectory {

    private ArrayList<Person> personDirectory;
    private boolean flag;
    private Person person;
    private ArrayList<Patient> patientDirectory;

    public PersonDirectory() {
        personDirectory = new ArrayList<>();
        person = new Person();
        patientDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonHistory() {
        return personDirectory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personDirectory = personHistory;
    }

    public Person createAndAddPerson() {
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }

    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }

    public void addNewPerson(Person person)
    { 
        personDirectory.add(person);   
    }
    
    public Person getPerson() {
        return person;
    }
    
    /**
     *
     * @param patientList
     */
    public void populatePatientDirectory(ArrayList<Patient> patientList) {
        this.patientDirectory = patientList;
    }
    
//    public ArrayList<Person> searchPatient(String key)
//    {
//        ArrayList<Person> searchPatientDirectory = new ArrayList();
//        for(Person person: personDirectory)
//        {
//            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
//            {
//                if(person.getPatient()!=null)
//                {
//                    searchPatientDirectory.add(person);
//                }
//            }
//        }
//        return searchPatientDirectory;
//    }
    
    /*
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
     */
//    public ArrayList<Person> searchPerson(String key) {
//        ArrayList<Person> searchPersonDirectory = new ArrayList();
//        for (Person person : personDirectory) {
//            if (person.getUserName().toLowerCase().startsWith(key.toLowerCase())) {
//                searchPersonDirectory.add(person);
//            }
//        }
//        return searchPersonDirectory;
//    }

    public boolean authenticatePerson(String userKey, String passKey) {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for (Person person : personDirectory) {
            if (person.getUserName().toLowerCase().startsWith(userKey.toLowerCase())) {
                if (person.getUserPassword().toLowerCase().startsWith(passKey.toLowerCase())) {
                    flag = true;
                } else {
                    flag = false;
                }
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
