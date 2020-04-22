/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sqlite;

import db.interfaces.PatientManager;
import dementia_dss.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucia
 */
public class SQLitePatient implements PatientManager {

    private Connection c;

    public SQLitePatient(Connection c) {
        this.c = c;
    }

    @Override
    public Patient getPatientByNIF(String id) {
        Patient newPat = null;
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String query = "SELECT * from patients WHERE id = ?";
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            boolean patientCreated = false;
            while (rs.next()) {
                //if the patent has not been created
                if (!patientCreated) {
                    // get Patient Info
                    int newPatId = rs.getInt(1);
                    int patDocId = rs.getInt(2);
                    String patName = rs.getString(3);
                    int patAge = rs.getInt(4);
                    String patSex = rs.getString(5);
                    String patFamilyHis = rs.getString(6);
                    String patLowEducation = rs.getString(7);
                    String patBehaviour = rs.getString(8);
                    String patEmotionalInstability = rs.getString(9);
                    String patRightWords = rs.getString(10);
                    String patForgetPersonal = rs.getString(11);
                    String patFacialExp = rs.getString(12);
                    String patPlanningOrg = rs.getString(13);
                    String patForgetRecent = rs.getString(14);
                    String patSleepingPattern = rs.getString(15);
                    String patLossSmell = rs.getString(16);
                    String patIncontinence = rs.getString(17);
                    String patExposure = rs.getString(18);
                    String patSmoking = rs.getString(19);
                    String patDrugConsumption = rs.getString(20);
                    String patLackCord = rs.getString(21);
                    String patStandWalk = rs.getString(22);
                    String patStiffness = rs.getString(23);
                    String patLossBalance = rs.getString(24);
                    String patWalkStraight = rs.getString(25);
                    String patTremor = rs.getString(26);
                    String patOrientationLow = rs.getString(27);
                    String patOrientationHigh = rs.getString(28);
                    String patBradykinesiaLow = rs.getString(29);
                    String patBradykinesiaMedium = rs.getString(30);
                    String patBradykinesiaHigh = rs.getString(31);
                    String patDownsSyndrome = rs.getString(32);
                    String patHyperglycemia = rs.getString(33);
                    String patHyperlipidemia = rs.getString(34);
                    String patInsulin = rs.getString(35);
                    String patHypertension = rs.getString(36);
                    String patHeartCerebro = rs.getString(37);
                    String patDiabetes = rs.getString(38);
                    String patObesity = rs.getString(39);
                    String patCholesterol = rs.getString(40);
                    String patArteriosclerosis = rs.getString(41);
                    String patDepression = rs.getString(42);
                    String patTremorUni = rs.getString(43);
                    String patTremorBi = rs.getString(44);
                    String patStiffnessLow = rs.getString(45);
                    String patStiffnessHigh = rs.getString(46);
                    String patHyperreflexia = rs.getString(47);
                    String patLossPhysicalAbilities = rs.getString(48);
                    Boolean patNoDementia = rs.getBoolean(49);
                    Boolean patParkinson = rs.getBoolean(50);
                    Boolean patAlzheimer = rs.getBoolean(51);
                    Boolean patVascularD = rs.getBoolean(52);
                    Boolean patParkinson1 = rs.getBoolean(53);
                    Boolean patParkinson2 = rs.getBoolean(54);
                    Boolean patParkinson3 = rs.getBoolean(55);
                    Boolean patAlzheimer1 = rs.getBoolean(56);
                    Boolean patAlzheimer2 = rs.getBoolean(57);
                    Boolean patAlzheimer3 = rs.getBoolean(58);
                    Boolean patVascularD1 = rs.getBoolean(59);
                    Boolean patVascularD2 = rs.getBoolean(60);
                    Boolean patVascularD3 = rs.getBoolean(61);

                    // Create new patient
                    newPat = new Patient(newPatId, patDocId, patName, patAge, patSex,
                            patFamilyHis, patLowEducation, patBehaviour, patEmotionalInstability, patRightWords,
                            patForgetPersonal, patFacialExp, patPlanningOrg, patForgetRecent, patSleepingPattern,
                            patLossSmell, patIncontinence, patExposure, patSmoking, patDrugConsumption,
                            patLackCord, patStandWalk, patStiffness, patLossBalance, patWalkStraight, patTremor,
                            patOrientationLow, patOrientationHigh, patBradykinesiaLow, patBradykinesiaMedium,
                            patBradykinesiaHigh, patDownsSyndrome, patHyperglycemia, patHyperlipidemia,
                            patInsulin, patHypertension, patHeartCerebro, patDiabetes, patObesity, patCholesterol,
                            patArteriosclerosis, patDepression, patTremorUni, patTremorBi, patStiffnessLow,
                            patStiffnessHigh, patHyperreflexia, patLossPhysicalAbilities, patNoDementia,
                            patParkinson, patAlzheimer, patVascularD, patParkinson1, patParkinson2,
                            patParkinson3, patAlzheimer1, patAlzheimer2, patAlzheimer3, patVascularD1,
                            patVascularD2, patVascularD3);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newPat;
    }

    @Override
    public void modifyPatient(Patient patient) { //Update
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query = "UPDATE patients SET name=?, age=?, sex=?, familyHis=? WHERE id=?";
        try (PreparedStatement st = c.prepareStatement(query)) {
            st.setString(1, patient.getName());
            st.setString(2, patient.getId());
            st.setInt(3, patient.getAge());
            if (patient.getSex().equals("Male")) {
                st.setString(4, "Male");
            } else {
                st.setString(4, "Female");
            }
            st.setString(5, patient.getFamilyHis());

            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void newPatient(Patient patient) {
        try { //Insert
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String query = "INSERT INTO patients (name, surname, age, sex, username, password)" + "VALUES (?,?,?,?,?,?);";
            try (PreparedStatement st = c.prepareStatement(query)) {
                st.setString(1, patient.getName());
                st.setString(2, patient.getId());
                st.setInt(3, patient.getAge());
                if (patient.getSex().equals("Male")) {
                    st.setString(4, "Male");
                } else {
                    st.setString(4, "Female");
                }
                st.setString(5, patient.getFamilyHis());

                st.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletePatient(Patient patient) {
        try { //Delete
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String query = "DELETE FROM patients WHERE id = ?;";
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, patient.getId());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
