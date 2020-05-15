/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sqlite;

import db.interfaces.DoctorManager;
import dementia_dss.Doctor;
import dementia_dss.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucia
 */
public class SQLiteDoctor implements DoctorManager {

    private Connection c;

    public SQLiteDoctor(Connection c) {
        this.c = c;
    }

    @Override
    public Boolean doctorExists(String id) {
        boolean doctorCreated = false;
        try {

            String query = "SELECT * FROM doctors WHERE doctors.doc_id = ?"; //doctorId todavia no existe en patient
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                doctorCreated = true;
            } else {
                doctorCreated = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doctorCreated;
    }

    @Override
    public Doctor getDoctor(String id) {
        Doctor newDoc = null;
        try {
            Patient newPat;
            List<Patient> patientsList;
            patientsList = new ArrayList<>();
            String query = "SELECT * FROM doctors AS d JOIN patients AS p ON d.doc_id = p.doctorID WHERE d.doc_id = ?"; //doctorId todavia no existe en patient
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            boolean doctorCreated = false;
            while (rs.next()) {
                //if the doctor has not been created
                if (!doctorCreated) {
                    //get the doctor information
                    String newDoctorId = rs.getString(1);
                    String docName = rs.getString(2);
                    String docSurname = rs.getString(3);
                    int docAge = rs.getInt(4);
                    String docSex = rs.getString(5);
                    String docUsername = rs.getString(6);
                    int docPassword = rs.getInt(7);

                    //create new doctor:
                    newDoc = new Doctor(newDoctorId, docName, docSurname, docAge, docSex,
                            docUsername, docPassword);
                }
                //get patient information:
                String patientId = rs.getString(8);
                String patDocId = rs.getString(9);
                String patName = rs.getString(10);
                int patAge = rs.getInt(11);
                String patSex = rs.getString(12);
                String patFamilyHis = rs.getString(13);
                String patLowEducation = rs.getString(14);
                String patBehaviour = rs.getString(15);
                String patEmotionalInstability = rs.getString(16);
                String patRightWords = rs.getString(17);
                String patForgetPersonal = rs.getString(18);
                String patFacialExp = rs.getString(19);
                String patPlanningOrg = rs.getString(20);
                String patForgetRecent = rs.getString(21);
                String patSleepingPattern = rs.getString(22);
                String patLossSmell = rs.getString(23);
                String patIncontinence = rs.getString(24);
                String patExposure = rs.getString(25);
                String patSmoking = rs.getString(26);
                String patDrugConsumption = rs.getString(27);
                String patLackCord = rs.getString(28);
                String patStandWalk = rs.getString(29);
                String patStiffness = rs.getString(30);
                String patLossBalance = rs.getString(31);
                String patWalkStraight = rs.getString(32);
                String patTremor = rs.getString(33);
                String patOrientationLow = rs.getString(34);
                String patOrientationHigh = rs.getString(35);
                String patBradykinesiaLow = rs.getString(36);
                String patBradykinesiaMedium = rs.getString(37);
                String patBradykinesiaHigh = rs.getString(38);
                String patDownsSyndrome = rs.getString(39);
                String patHyperglycemia = rs.getString(40);
                String patHyperlipidemia = rs.getString(41);
                String patInsulin = rs.getString(42);
                String patHypertension = rs.getString(43);
                String patHeartCerebro = rs.getString(44);
                String patDiabetes = rs.getString(45);
                String patObesity = rs.getString(46);
                String patCholesterol = rs.getString(47);
                String patArteriosclerosis = rs.getString(48);
                String patDepression = rs.getString(49);
                String patTremorUni = rs.getString(50);
                String patTremorBi = rs.getString(51);
                String patStiffnessLow = rs.getString(52);
                String patStiffnessHigh = rs.getString(53);
                String patHyperreflexia = rs.getString(54);
                String patLossPhysicalAbilities = rs.getString(55);
                Boolean patNoDementia = rs.getBoolean(56);
                Boolean patParkinson = rs.getBoolean(57);
                Boolean patAlzheimer = rs.getBoolean(58);
                Boolean patVascularD = rs.getBoolean(59);
                Boolean patParkinson1 = rs.getBoolean(60);
                Boolean patParkinson2 = rs.getBoolean(61);
                Boolean patParkinson3 = rs.getBoolean(62);
                Boolean patAlzheimer1 = rs.getBoolean(63);
                Boolean patAlzheimer2 = rs.getBoolean(64);
                Boolean patAlzheimer3 = rs.getBoolean(65);
                Boolean patVascularD1 = rs.getBoolean(66);
                Boolean patVascularD2 = rs.getBoolean(67);
                Boolean patVascularD3 = rs.getBoolean(68);

                // Create new patient
                newPat = new Patient(patientId, patDocId, patName, patAge, patSex,
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

                patientsList.add(newPat);
            }
            newDoc.setPatientList(patientsList);

        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newDoc;
    }

    @Override
    public String getPassword(Doctor doctor) { //Select
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void newDoctor(Doctor doctor) { //Insert
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        try {
            String query = "INSERT INTO doctors (doc_id, name, surname, age, sex, username, password)"
                    + "VALUES (?,?,?,?,?,?,?);";
            PreparedStatement st = c.prepareStatement(query);

            st.setString(1, doctor.getId());
            st.setString(2, doctor.getName());
            st.setString(3, doctor.getSurname());
            st.setInt(4, doctor.getAge());
            if (doctor.getSex().equals("Male")) {
                st.setString(5, "Male");
            } else {
                st.setString(5, "Female");
            }
            st.setString(6, doctor.getUsername());
            st.setInt(7, doctor.getPassword());

            st.executeUpdate();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteDoctor(Doctor doctor) {
        try { //Delete
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String query = "DELETE FROM doctors WHERE doc_id = ?";
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, doctor.getId());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
