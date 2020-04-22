/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.interfaces;

import dementia_dss.Doctor;

/**
 *
 * @author adria
 */
public interface DoctorManager {

    public Boolean doctorExists(int id); //Checks if the doctor already exists

    public Doctor getDoctor(int id);

    public String getPassword(Doctor doctor); //Gets the doctor's password

    public void newDoctor(Doctor doctor);

}
