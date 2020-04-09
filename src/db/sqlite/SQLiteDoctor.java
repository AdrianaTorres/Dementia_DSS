/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sqlite;

import db.interfaces.DoctorManager;
import dementia_dss.Doctor;
import java.sql.Connection;

/**
 *
 * @author Lucia
 */
public class SQLiteDoctor implements DoctorManager {

    private Connection connection;

    public SQLiteDoctor(Connection c) {
        this.connection = c;
    }

    @Override
    public Boolean doctorExists(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void newDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
