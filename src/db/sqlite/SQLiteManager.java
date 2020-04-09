/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sqlite;

import db.interfaces.DBManager;
import dementia_dss.Doctor;
import dementia_dss.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author adria
 */
public class SQLiteManager implements DBManager {

    private Connection connection;
    private Doctor doctor;
    private Patient patient;

    public SQLiteManager() {
        super();
    }

    public void connect() {
        // Open database connection
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:./db/DBdementiaDSS.db");
            connection.createStatement().execute("PRAGMA foreign_keys = ON");
            doctor = new SQLiteDoctor(connection);
            patient = new SQLitePatient(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Connection getConnection() {
        return connection;
    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // AQUI DEBERIAN CREARSE LAS TABLAS
    @Override
    private static void createTables(Conector conn) {
		Conector con = conn;
		Statement st = null;
		String in = null;

		try {
			st = con.getConnect().createStatement();

			in = "CREATE TABLE ADDRESS " + "(ID integer PRIMARY KEY AUTOINCREMENT NOT NULL," + "CITY varchar(50),"
					+ "STREET varchar(50)," + "CP bigint," + "HOUSENUMBER bigint)";

			st.execute(in);
			st.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + "Address");
		}
	}
    
    @Override
    public void createTables() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
