/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

import db.interfaces.DBManager;
import db.interfaces.DoctorManager;
import db.interfaces.PatientManager;
import db.sqlite.SQLiteManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import userInterface.*;

/**
 *
 * @author adria
 */
public class Dementia_DSS {

    private static DBManager dbManager;
    private static DoctorManager doctorManager;
    private static PatientManager patientManager;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dbManager = new SQLiteManager();
        dbManager.connect();
        doctorManager = dbManager.getDoctorManager();
        patientManager = dbManager.getPatientManager();
        dbManager.createTables();
        Welcome_Window welcomeWindow = new Welcome_Window();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Dementia_DSS.class.getName()).log(Level.SEVERE, null, ex);
        }
        welcomeWindow.dispose();
        new LoginWindow(dbManager);
    }

}
