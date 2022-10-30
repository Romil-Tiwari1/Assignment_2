/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Person;

/**
 *
 * @author romiltiwari
 */
public class Person {

    public int id;
    public String personName;
    public int age;
    public String gender;
    public String contactNumber;
    public String emailId;
    public String userName;
    public String userPassword;
    public String userType;

    public Person(int id, String name, int age,String gender,
            String phoneNumber,String email, String userType,
            String userName, String userPass)
    {
        this.id=id;
        this.personName=name;
        this.age=age;
        this.gender=gender;
        this.contactNumber=phoneNumber;
       this.emailId=email;
       this.userName = userName;
       this.userPassword = userPass;
       this.userType = userType;
    }
    public Person() {
        
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return personName;
    }

    public void setName(String name) {
        this.personName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
