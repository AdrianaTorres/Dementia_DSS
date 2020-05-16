/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sqlite;

import db.interfaces.PatientManager;
import dementia_dss.Doctor;
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
    public Boolean patientExists(String id) {
        boolean patientCreated = false;
        try {
            System.out.println("Entro al try de patients!! ");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            String query = "SELECT * FROM patients WHERE patients.pat_id = ?"; //doctorId todavia no existe en patient
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                patientCreated = true;
            } else {
                patientCreated = false;
            }

            // System.out.println("Es esto el ID?" + rs.getString(1));
            /*
            if (rs.getString(1) != null) {
                patientCreated = true;
            } else {
                patientCreated = false;
            }*/
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patientCreated;
    }

    /*
    public Boolean patientExists(String id) {
        boolean patientCreated = false;
        System.out.println("Llego aqui");
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            String query = "SELECT * FROM patients WHERE patients.pat_id = ?";
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();

            String id_selected = rs.getString(1);

            if (id_selected.equals(id)) {
                patientCreated = true;
            } else {
                patientCreated = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patientCreated;
    }*/
    @Override
    public Patient getPatientByNIF(String id) {
        Patient newPat = new Patient();
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String query = "SELECT * from patients WHERE patients.pat_id = ?";
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, id);
            System.out.println("ID get patient: " + id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int counter = 0;
                counter++;
                System.out.println("Counter: " + counter);
                // get Patient Info
                String newPatId = rs.getString(1);
                System.out.println("New Pat ID:" + newPatId);
                String patDocId = rs.getString(2);
                String patName = rs.getString(3);
                System.out.println("New Pat name:" + patName);
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

        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newPat;
    }

    @Override
    public void modifyPatient(Patient patient) { //Update
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query = "UPDATE patients SET nameSurname = ?, age = ?, sex = ?, familyHistory = ?, lowEducation = ?, behaviour = ?, emotionInstability = ?,"
                + "rightWords = ?, forgetPersonal = ?, facialExpression = ?, planOrganize = ?, forgetRecent = ?, sleepPattern = ?, lossSmell = ?, incontinence = ?, exposure = ?, smoking = ?, "
                + "drugConsumption = ?, lackCoordination = ?, standWalk = ?, stiffness = ?, lossBalance = ?, walkStraight = ?, tremor = ?, orientationHigh = ?, orientationLow = ?, bradykinesiaLow = ?,"
                + "bradykinesiaMedium = ?, bradykinesiaHigh = ?, downSyndrome = ?, hyperglycemia = ?, hyperlypidemia = ?, insulin = ?, hypertension = ?, heartCerebroAttack = ?, diabetes = ?, obesity = ?,"
                + "cholesterol = ?, arteriosclerosis = ?, depression = ?, tremorUnilat = ?, tremorBilat = ?, stiffnessLow = ?, stiffnessHigh = ?, hyperreflexia = ?, lossPhysicalAbility = ?, noDementia = ?,"
                + "parkinson = ?, alzheimer = ?, vascular = ?, parkinsonP1 = ?, parkinsonP2 = ?, parkinsonP3 = ?, alzheimerP1 = ?, alzheimerP2 = ?, alzheimerP3 = ?, vascularP1 = ?, vascularP2 = ?, vascularP3 = ? WHERE pat_id=?";
        try (PreparedStatement st = c.prepareStatement(query)) {
            st.setString(1, patient.getName());
            st.setInt(2, patient.getAge());
            if (patient.getSex().equals("Male")) {
                st.setString(3, "Male");
            } else {
                st.setString(3, "Female");
            }
            st.setString(4, patient.getFamilyHis());
            st.setString(5, patient.getLowEducation());
            st.setString(6, patient.getBehaviour());
            st.setString(7, patient.getEmotionalInstability());
            st.setString(8, patient.getRightWords());
            st.setString(9, patient.getForgetPersonal());
            st.setString(10, patient.getFacialExp());
            st.setString(11, patient.getPlanningOrg());
            st.setString(12, patient.getForgetRecent());
            st.setString(13, patient.getSleepingPattern());
            st.setString(14, patient.getLossSmell());
            st.setString(15, patient.getIncontinence());
            st.setString(16, patient.getExposure());
            st.setString(17, patient.getSmoking());
            st.setString(18, patient.getDrugConsumption());
            st.setString(19, patient.getLackCoord());
            st.setString(20, patient.getStandWalk());
            st.setString(21, patient.getStiffness());
            st.setString(22, patient.getLossBalance());
            st.setString(23, patient.getWalkStraight());
            st.setString(24, patient.getTremor());
            st.setString(25, patient.getOrientationH());
            st.setString(26, patient.getOrientationL());
            st.setString(27, patient.getBradykinesiaL());
            st.setString(28, patient.getBradykinesiaM());
            st.setString(29, patient.getBradykinesiaH());
            st.setString(30, patient.getDownSyndrome());
            st.setString(31, patient.getHyperglycemia());
            st.setString(32, patient.getHyperlipidemia());
            st.setString(33, patient.getInsulin());
            st.setString(34, patient.getHypertension());
            st.setString(35, patient.getHeartCerebro());
            st.setString(36, patient.getDiabetes());
            st.setString(37, patient.getObesity());
            st.setString(38, patient.getCholesterol());
            st.setString(39, patient.getArteriosclerosis());
            st.setString(40, patient.getDepression());
            st.setString(41, patient.getTremorUni());
            st.setString(42, patient.getTremorBi());
            st.setString(43, patient.getStiffnessL());
            st.setString(44, patient.getStiffnessH());
            st.setString(45, patient.getHyperreflexia());
            st.setString(46, patient.getLossPhysicalAbilities());
            st.setBoolean(47, patient.getNoDementia());
            st.setBoolean(48, patient.getParkinson());
            st.setBoolean(49, patient.getAlzheimer());
            st.setBoolean(50, patient.getVascularD());
            st.setBoolean(51, patient.getParkinsonP1());
            st.setBoolean(52, patient.getParkinsonP2());
            st.setBoolean(53, patient.getParkinsonP3());
            st.setBoolean(54, patient.getAlzheimerP1());
            st.setBoolean(55, patient.getAlzheimerP2());
            st.setBoolean(56, patient.getAlzheimerP3());
            st.setBoolean(57, patient.getVascularP1());
            st.setBoolean(58, patient.getVascularP2());
            st.setBoolean(59, patient.getVascularP3());
            st.setString(60, patient.getId());

            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void newPatient(Patient patient) {
        try { //Insert
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String query = "INSERT INTO patients (pat_id, doctorID, nameSurname, age, sex, familyHistory, lowEducation, behaviour, emotionInstability,"
                    + "rightWords, forgetPersonal, facialExpression, planOrganize, forgetRecent, sleepPattern, lossSmell, incontinence, exposure, smoking, "
                    + "drugConsumption, lackCoordination, standWalk, stiffness, lossBalance, walkStraight, tremor, orientationHigh, orientationLow, bradykinesiaLow,"
                    + "bradykinesiaMedium, bradykinesiaHigh, downSyndrome, hyperglycemia, hyperlypidemia, insulin, hypertension, heartCerebroAttack, diabetes, obesity,"
                    + "cholesterol, arteriosclerosis, depression, tremorUnilat, tremorBilat, stiffnessLow, stiffnessHigh, hyperreflexia, lossPhysicalAbility, noDementia,"
                    + "parkinson, alzheimer, vascular, parkinsonP1, parkinsonP2, parkinsonP3, alzheimerP1, alzheimerP2, alzheimerP3, vascularP1, vascularP2, vascularP3)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            try (PreparedStatement st = c.prepareStatement(query)) {
                st.setString(1, patient.getId());
                st.setString(2, patient.getDoctorId());
                System.out.println("doc id: " + patient.getDoctorId());
                st.setString(3, patient.getName());
                st.setInt(4, patient.getAge());
                if (patient.getSex().equals("Male")) {
                    st.setString(5, "Male");
                } else {
                    st.setString(5, "Female");
                }
                st.setString(6, patient.getFamilyHis());
                st.setString(7, patient.getLowEducation());
                st.setString(8, patient.getBehaviour());
                st.setString(9, patient.getEmotionalInstability());
                st.setString(10, patient.getRightWords());
                st.setString(11, patient.getForgetPersonal());
                st.setString(12, patient.getFacialExp());
                st.setString(13, patient.getPlanningOrg());
                st.setString(14, patient.getForgetRecent());
                st.setString(15, patient.getSleepingPattern());
                st.setString(16, patient.getLossSmell());
                st.setString(17, patient.getIncontinence());
                st.setString(18, patient.getExposure());
                st.setString(19, patient.getSmoking());
                st.setString(20, patient.getDrugConsumption());
                st.setString(21, patient.getLackCoord());
                st.setString(22, patient.getStandWalk());
                st.setString(23, patient.getStiffness());
                st.setString(24, patient.getLossBalance());
                st.setString(25, patient.getWalkStraight());
                st.setString(26, patient.getTremor());
                st.setString(27, patient.getOrientationL());
                st.setString(28, patient.getOrientationH());
                st.setString(29, patient.getBradykinesiaL());
                st.setString(30, patient.getBradykinesiaM());
                st.setString(31, patient.getBradykinesiaH());
                st.setString(32, patient.getDownSyndrome());
                st.setString(33, patient.getHyperglycemia());
                st.setString(34, patient.getHyperlipidemia());
                st.setString(35, patient.getInsulin());
                st.setString(36, patient.getHypertension());
                st.setString(37, patient.getHeartCerebro());
                st.setString(38, patient.getDiabetes());
                st.setString(39, patient.getObesity());
                st.setString(40, patient.getCholesterol());
                st.setString(41, patient.getArteriosclerosis());
                st.setString(42, patient.getDepression());
                st.setString(43, patient.getTremorUni());
                st.setString(44, patient.getTremorBi());
                st.setString(45, patient.getStiffnessL());
                st.setString(46, patient.getStiffnessH());
                st.setString(47, patient.getHyperreflexia());
                st.setString(48, patient.getLossPhysicalAbilities());
                st.setBoolean(49, patient.getNoDementia());
                st.setBoolean(50, patient.getParkinson());
                st.setBoolean(51, patient.getAlzheimer());
                st.setBoolean(52, patient.getVascularD());
                st.setBoolean(53, patient.getParkinsonP1());
                st.setBoolean(54, patient.getParkinsonP2());
                st.setBoolean(55, patient.getParkinsonP3());
                st.setBoolean(56, patient.getAlzheimerP1());
                st.setBoolean(57, patient.getAlzheimerP2());
                st.setBoolean(58, patient.getAlzheimerP3());
                st.setBoolean(59, patient.getVascularP1());
                st.setBoolean(60, patient.getVascularP2());
                st.setBoolean(61, patient.getVascularP3());

                System.out.println("Doctor ID: " + patient.getDoctorId());

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
            String query = "DELETE FROM patients WHERE pat_id = ?";
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, patient.getId());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePatientsFromDoctor(Doctor doctor) {
        try { //Delete
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String query = "DELETE FROM patients WHERE doctorID = ?";
            PreparedStatement st = c.prepareStatement(query);
            st.setString(1, doctor.getId());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLitePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
