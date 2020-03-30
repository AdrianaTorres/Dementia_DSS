/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

/**
 *
 * @author adria
 */
public class Doctor {

    String name;
    String surname;
    int age;
    String sex;
    String username;
    String password;

    public void setName(String name_) {
        this.name = name_;
    }

    public void setSurname(String surname_) {
        this.surname = surname_;
    }

    public void setAge(int age_) {
        this.age = age_;
    }

    public void setSex(String sex_) {
        this.sex = sex_;
    }

    public void setUsername(String username_) {
        this.username = username_;
    }

    public void setPassword(String password_) {
        this.password = password_;
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

    public String getSex() {
        return this.sex;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

}
