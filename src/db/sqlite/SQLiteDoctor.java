/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sqlite;

import dementia_dss.Doctor;
import java.sql.Connection;

/**
 *
 * @author Lucia
 */
public class SQLiteDoctor extends Doctor {
    private Connection connection;
    
    public SQLiteDoctor (Connection c) {
        this.connection = c;
    }
}
