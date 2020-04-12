/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sqlite;

import db.interfaces.DBManager;
import db.interfaces.DoctorManager;
import db.interfaces.PatientManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author adria
 */
public class SQLiteManager implements DBManager {

    private Connection connection;
    private DoctorManager doctorM;
    private PatientManager patientM;

    public SQLiteManager() {
        super();
    }

    @Override
    public void connect() {
        // Open database connection
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:./db/DBdementiaDSS.db");
            connection.createStatement().execute("PRAGMA foreign_keys = ON");
            doctorM = new SQLiteDoctor(connection);
            patientM = new SQLitePatient(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Connection getConnection() {
        return connection;
    }

    @Override
    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PatientManager getPatientManager() {
        return patientM;
    }

    public DoctorManager getDoctorManager() {
        return doctorM;
    }

    @Override
    public void createTables() {
        Statement st;

        try {
            st = connection.createStatement();            
            String tablePatients = "CREATE TABLE patients (" + "pat_ID INTEGER," + "doctorID INTEGER," +
                                   "nameSurname TEXT," + "age INTEGER NOT NULL," + "sex TEXT NOT NULL," +
                                   "familyHistory TEXT," + "lowEducation TEXT," + "behaviour TEXT," + "emotionInstability TEXT," +
                                   "rightWords TEXT," + "forgetPersonal TEXT," + "facialExpression TEXT," +
                                   "planOrganize TEXT," + "forgetRecent TEXT," + "sleepPattern TEXT," +
                                   "lossSmell TEXT," + "incontinence TEXT," + "exposure TEXT," +
                                   "smoking TEXT," + "drugConsumption TEXT," + "lackCoordination TEXT," +
                                   "standWalk TEXT," + "stiffness TEXT," + "lossBalance TEXT," +
                                   "walkStraight TEXT," + "tremor TEXT," + "orientationHigh TEXT," +
                                   "orientationLow TEXT," + "bradykinesiaLow TEXT," + "bradykinesiaMedium TEXT," +
                                   "bradykinesiaHigh TEXT," + "downSyndrome TEXT," + "hyperglycemia TEXT," +
                                   "hyperlypidemia TEXT," + "insulin TEXT," + "hypertension TEXT," +
                                   "heartCerebroAttack TEXT," + "diabetes TEXT," + "obesity TEXT," +
                                   "cholesterol TEXT," + "arteriosclerosis TEXT," + "depression TEXT," +
                                   "tremorUnilat TEXT," + "tremorBilat TEXT," + "stiffnessLow TEXT," +
                                   "stiffnessHigh TEXT," + "hyperreflexia TEXT," + "lossPhysicalAbility TEXT," +                    
                                   // How do we want to enter the dementia, following same rule as in "patient" class or simply like: dementia --> alzheimer (eg).
                                   "noDementia TEXT," + "parkinson TEXT," + "alzheimer TEXT," +
                                   "vascular TEXT," + "parkinsonP1 TEXT," + "parkinsonP2 TEXT," +
                                   "parkinsonP3 TEXT," + "alzheimerP1 TEXT," + "alzheimerP2 TEXT," +
                                   "alzheimerP3 TEXT," + "vascularP1 TEXT," + "vascularP2 TEXT," +
                                   "vascularP3 TEXT," + /*"dementia TEXT," + "phase INTEGER," +*/ "PRIMARY KEY (pat_ID)," +
                                   "FOREIGN KEY (doctorID) REFERENCES doctors(doc_id) ON DELETE SET NULL ON UPDATE CASCADE)";
            st.executeUpdate(tablePatients);
            
            st = connection.createStatement();
            String tableDoctors = "CREATE TABLE doctors (" + "doc_id INTEGER," + "name TEXT," +
                                  "surname TEXT," + "age INTEGER," + "sex TEXT," + "username TEXT," +
                                  "password TEXT," + "PRIMARY KEY (doc_id))";
            st.executeUpdate(tableDoctors);
            
            st.close();
        } catch (SQLException ex) {
            if(ex.getMessage().contains("already exists")) {
            } else {
                ex.printStackTrace();
            }
        }
    }
}
