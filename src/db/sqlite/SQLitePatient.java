/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sqlite;

import db.interfaces.PatientManager;
import dementia_dss.Patient;
import java.sql.Connection;

/**
 *
 * @author Lucia
 */
public class SQLitePatient implements PatientManager {

    private Connection connection;

    public SQLitePatient(Connection c) {
        this.connection = c;
    }

    @Override
    public Patient getPatientByNIF(int nif) { //Select
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifyPatient(Patient patient) { //Update
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void newPatient(Patient patient) { //Insert
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePatient(Patient patient) { //Delete
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
