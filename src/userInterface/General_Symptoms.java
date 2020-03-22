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

        jLabel1.setText("General Symptoms");

        jLabel2.setText("Please, mark the present symptoms:");

        FamilyHis_check.setText("Family history of disease");

        EducationalLevel_check.setText("Low educational level");

        Behaviour_check.setText("Changes in behaviour");

        EmtionalInst_check.setText("Emotional instability");

        RightWords_check.setText("Difficulties finding the right words");

        ForgetPersonalInfo_check.setText("Forget personal information");

        FacialExp_check.setText("Loss of facial expression");

        PlanningDifficulty_check.setText("Difficulties planning and organizing");

        ForgetRecentInfo_check.setText("Forget recent information");

        SleepPatterns_check.setText("Changes in sleeping patterns");

        Smell_check.setText("Loss of smell");

        Incontinence_check.setText("Urinary or gastric incontinence");

        Chemicals_check.setText("Exposure to chemicals");

        Smoking_check.setText("Smoking");

        DrugConsumption_check.setText("Drug comsuption");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FamilyHis_check)
                            .addComponent(EducationalLevel_check)
                            .addComponent(Behaviour_check)
                            .addComponent(EmtionalInst_check)
                            .addComponent(RightWords_check))
                        .addGap(0, 136, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SleepPatterns_check)
                                .addGap(140, 140, 140)
                                .addComponent(DrugConsumption_check))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ForgetPersonalInfo_check)
                                .addGap(152, 152, 152)
                                .addComponent(Smell_check))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FacialExp_check)
                                .addGap(188, 188, 188)
                                .addComponent(Incontinence_check))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PlanningDifficulty_check)
                                    .addComponent(ForgetRecentInfo_check))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Smoking_check)
                                    .addComponent(Chemicals_check))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(568, 568, 568))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FamilyHis_check)
                    .addComponent(ForgetPersonalInfo_check)
                    .addComponent(Smell_check))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EducationalLevel_check)
                    .addComponent(FacialExp_check)
                    .addComponent(Incontinence_check))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Behaviour_check)
                    .addComponent(PlanningDifficulty_check)
                    .addComponent(Chemicals_check))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmtionalInst_check)
                    .addComponent(ForgetRecentInfo_check)
                    .addComponent(Smoking_check))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RightWords_check)
                    .addComponent(SleepPatterns_check)
                    .addComponent(DrugConsumption_check))
                .addContainerGap(95, Short.MAX_VALUE))
        );
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
