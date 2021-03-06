/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.interfaces;

import dementia_dss.Doctor;
import dementia_dss.Patient;

/**
 *
 * @author adria
 */
public interface PatientManager {

    public Boolean patientExists(String id);

    public Patient getPatientByNIF(String id); //Select

    public void modifyPatient(Patient patient); //Update

    public void newPatient(Patient patient); //Insert

    public void deletePatient(Patient patient); //Delete

    public void deletePatientsFromDoctor(Doctor doctor);
}
