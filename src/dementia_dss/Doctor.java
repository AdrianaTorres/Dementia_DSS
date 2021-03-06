/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adria
 */
public class Doctor {

    String id;
    String name;
    String surname;
    int age;
    String sex;
    String username;
    int password;
    List<Patient> patientList;

    public Doctor() {
        this.id = "";
        this.name = "";
        this.surname = "";
        this.age = 0;
        this.sex = "";
        this.username = "";
        this.password = 0; //Ver si esto tiene sentido
        this.patientList = new ArrayList<>();
    }

    // Constructor for queries:
    public Doctor(String newDoctorId, String docName, String docSurname, int docAge, String docSex, String docUsername, int docPassword) {
        this.id = newDoctorId;
        this.name = docName;
        this.surname = docSurname;
        this.age = docAge;
        this.sex = docSex;
        this.username = docUsername;
        this.password = docPassword;
    }

    public void setName(String name_) {
        this.name = name_;
    }

    public void setSurname(String surname_) {
        this.surname = surname_;
    }

    public void setAge(int age_) {
        this.age = age_;
    }

    public void setId(String id_) {
        this.id = id_;
    }

    public void setSex(String sex_) {
        this.sex = sex_;
    }

    public void setUsername(String username_) {
        this.username = username_;
    }

    public void setPassword(int password_) {
        this.password = password_;
    }

    public void setPatientList(List<Patient> patientList_) {
        this.patientList = patientList_;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getId() {
        return this.id;
    }

    public String getSex() {
        return this.sex;
    }

    public String getUsername() {
        return this.username;
    }

    public int getPassword() {
        return this.password;
    }

    public List<Patient> getPatientList() {
        return this.patientList;
    }
}
