/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import dementia_dss.Patient;

/**
 *
 * @author adria
 */
public class General_Symptoms extends javax.swing.JPanel {

    Patient patient = new Patient();

    /**
     * Creates new form General_Symptoms
     */
    public General_Symptoms() {
        initComponents();
    }

    public General_Symptoms(Patient patient) {
        this.patient = patient;
        initComponents();
        setVisible(true);
        if (patient == null) {
            System.out.println("Patient es null");
        }
        if (patient.getFamilyHis().equalsIgnoreCase("TRUE")) {
            FamilyHis_check.setSelected(true);
        }
        if (patient.getLowEducation().equalsIgnoreCase("TRUE")) {
            EducationalLevel_check.setSelected(true);
        }
        if (patient.getBehaviour().equalsIgnoreCase("TRUE")) {
            Behaviour_check.setSelected(true);
        }
        if (patient.getEmotionalInstability().equalsIgnoreCase("TRUE")) {
            EmtionalInst_check.setSelected(true);
        }
        if (patient.getRightWords().equalsIgnoreCase("TRUE")) {
            RightWords_check.setSelected(true);
        }
        if (patient.getForgetPersonal().equalsIgnoreCase("TRUE")) {
            ForgetPersonalInfo_check.setSelected(true);
        }
        if (patient.getFacialExp().equalsIgnoreCase("TRUE")) {
            FacialExp_check.setSelected(true);
        }
        if (patient.getPlanningOrg().equalsIgnoreCase("TRUE")) {
            PlanningDifficulty_check.setSelected(true);
        }
        if (patient.getForgetRecent().equalsIgnoreCase("TRUE")) {
            ForgetRecentInfo_check.setSelected(true);
        }
        if (patient.getSleepingPattern().equalsIgnoreCase("TRUE")) {
            SleepPatterns_check.setSelected(true);
        }
        if (patient.getLossSmell().equalsIgnoreCase("TRUE")) {
            Smell_check.setSelected(true);
        }
        if (patient.getIncontinence().equalsIgnoreCase("TRUE")) {
            Incontinence_check.setSelected(true);
        }
        if (patient.getExposure().equalsIgnoreCase("TRUE")) {
            Chemicals_check.setSelected(true);
        }
        if (patient.getSmoking().equalsIgnoreCase("TRUE")) {
            Smoking_check.setSelected(true);
        }
        if (patient.getDrugConsumption().equalsIgnoreCase("TRUE")) {
            DrugConsumption_check.setSelected(true);
        }
    }

    public void SaveInfo() {
        Boolean familyHistory = this.FamilyHis_check.isSelected();
        if (familyHistory) {
            patient.setFamilyHis("TRUE");
        } else {
            patient.setFamilyHis("FALSE");
        }
        Boolean lowEducation = this.EducationalLevel_check.isSelected();
        if (lowEducation) {
            patient.setLowEducation("TRUE");
        } else {
            patient.setLowEducation("FALSE");
        }
        Boolean changesBehaviour = this.Behaviour_check.isSelected();
        if (changesBehaviour) {
            patient.setBehaviour("TRUE");
        } else {
            patient.setBehaviour("FALSE");
        }
        Boolean emotionalInstability = this.EmtionalInst_check.isSelected();
        if (emotionalInstability) {
            patient.setEmotionalInstability("TRUE");
        } else {
            patient.setEmotionalInstability("FALSE");
        }
        Boolean words = this.RightWords_check.isSelected();
        if (words) {
            patient.setRightWords("TRUE");
        } else {
            patient.setRightWords("FALSE");
        }
        Boolean personalInfo = this.ForgetPersonalInfo_check.isSelected();
        if (personalInfo) {
            patient.setForgetPersonal("TRUE");
        } else {
            patient.setForgetPersonal("FALSE");
        }
        Boolean facialExp = this.FacialExp_check.isSelected();
        if (facialExp) {
            patient.setFacialExp("TRUE");
        } else {
            patient.setFacialExp("FALSE");
        }
        Boolean planningOrg = this.PlanningDifficulty_check.isSelected();
        if (planningOrg) {
            patient.setPlanningOrg("TRUE");
        } else {
            patient.setPlanningOrg("FALSE");
        }
        Boolean recentInfo = this.ForgetRecentInfo_check.isSelected();
        if (recentInfo) {
            patient.setForgetRecent("TRUE");
        } else {
            patient.setForgetRecent("FALSE");
        }
        Boolean sleeping = this.SleepPatterns_check.isSelected();
        if (sleeping) {
            patient.setSleepingPattern("TRUE");
        } else {
            patient.setSleepingPattern("FALSE");
        }
        Boolean smell = this.Smell_check.isSelected();
        if (smell) {
            patient.setLossSmell("TRUE");
        } else {
            patient.setLossSmell("FALSE");
        }
        Boolean incontinence = this.Incontinence_check.isSelected();
        if (incontinence) {
            patient.setIncontinence("TRUE");
        } else {
            patient.setIncontinence("FALSE");
        }
        Boolean chemicals = this.Chemicals_check.isSelected();
        if (chemicals) {
            patient.setExposure("TRUE");
        } else {
            patient.setExposure("FALSE");
        }
        Boolean smoking = this.Smoking_check.isSelected();
        if (smoking) {
            patient.setSmoking("TRUE");
        } else {
            patient.setSmoking("FALSE");
        }
        Boolean drugs = this.DrugConsumption_check.isSelected();
        if (drugs) {
            patient.setDrugConsumption("TRUE");
        } else {
            patient.setDrugConsumption("FALSE");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FamilyHis_check = new javax.swing.JCheckBox();
        EducationalLevel_check = new javax.swing.JCheckBox();
        Behaviour_check = new javax.swing.JCheckBox();
        EmtionalInst_check = new javax.swing.JCheckBox();
        RightWords_check = new javax.swing.JCheckBox();
        ForgetPersonalInfo_check = new javax.swing.JCheckBox();
        FacialExp_check = new javax.swing.JCheckBox();
        PlanningDifficulty_check = new javax.swing.JCheckBox();
        ForgetRecentInfo_check = new javax.swing.JCheckBox();
        SleepPatterns_check = new javax.swing.JCheckBox();
        Smell_check = new javax.swing.JCheckBox();
        Incontinence_check = new javax.swing.JCheckBox();
        Chemicals_check = new javax.swing.JCheckBox();
        Smoking_check = new javax.swing.JCheckBox();
        DrugConsumption_check = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(1260, 777));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("General Symptoms");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 21, -1, -1));

        jLabel2.setText("Please, mark the present symptoms:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 71, -1, -1));

        FamilyHis_check.setText("Family history of disease");
        add(FamilyHis_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 126, -1, -1));

        EducationalLevel_check.setText("Low educational level");
        add(EducationalLevel_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 222, -1, -1));

        Behaviour_check.setText("Changes in behaviour");
        add(Behaviour_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 318, -1, -1));

        EmtionalInst_check.setText("Emotional instability");
        add(EmtionalInst_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 425, -1, -1));

        RightWords_check.setText("Difficulties finding the right words");
        add(RightWords_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 541, -1, -1));

        ForgetPersonalInfo_check.setText("Forget personal information");
        add(ForgetPersonalInfo_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 126, -1, -1));

        FacialExp_check.setText("Loss of facial expression");
        add(FacialExp_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 222, -1, -1));

        PlanningDifficulty_check.setText("Difficulties planning and organizing");
        add(PlanningDifficulty_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 318, -1, -1));

        ForgetRecentInfo_check.setText("Forget recent information");
        add(ForgetRecentInfo_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 425, -1, -1));

        SleepPatterns_check.setText("Changes in sleeping patterns");
        add(SleepPatterns_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 541, -1, -1));

        Smell_check.setText("Loss of smell");
        add(Smell_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 126, -1, -1));

        Incontinence_check.setText("Urinary or gastric incontinence");
        add(Incontinence_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 222, -1, -1));

        Chemicals_check.setText("Exposure to chemicals");
        add(Chemicals_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 318, -1, -1));

        Smoking_check.setText("Smoking");
        add(Smoking_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 425, -1, -1));

        DrugConsumption_check.setText("Drug comsuption");
        add(DrugConsumption_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 541, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Behaviour_check;
    private javax.swing.JCheckBox Chemicals_check;
    private javax.swing.JCheckBox DrugConsumption_check;
    private javax.swing.JCheckBox EducationalLevel_check;
    private javax.swing.JCheckBox EmtionalInst_check;
    private javax.swing.JCheckBox FacialExp_check;
    private javax.swing.JCheckBox FamilyHis_check;
    private javax.swing.JCheckBox ForgetPersonalInfo_check;
    private javax.swing.JCheckBox ForgetRecentInfo_check;
    private javax.swing.JCheckBox Incontinence_check;
    private javax.swing.JCheckBox PlanningDifficulty_check;
    private javax.swing.JCheckBox RightWords_check;
    private javax.swing.JCheckBox SleepPatterns_check;
    private javax.swing.JCheckBox Smell_check;
    private javax.swing.JCheckBox Smoking_check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
