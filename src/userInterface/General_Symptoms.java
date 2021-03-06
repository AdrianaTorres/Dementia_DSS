/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import db.interfaces.DBManager;
import db.sqlite.SQLiteManager;
import dementia_dss.Doctor;
import dementia_dss.Patient;

/**
 *
 * @author adria
 */
public class General_Symptoms extends javax.swing.JPanel {

    DBManager dbManager = new SQLiteManager();
    Patient patient = new Patient();

    /**
     * Creates new form General_Symptoms
     */
    public General_Symptoms() {
        initComponents();
    }

    public void setDbManager(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public General_Symptoms(Patient patient, Doctor doctor) {
        this.patient = patient;
        patient.setDoctorId(doctor.getId());
        initComponents();
        setVisible(true);
        if (patient == null) {
            System.out.println("Patient is null");
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

    public void loadGeneralSymptoms(Patient p) {
        if (p.getBehaviour().equals("TRUE")) {
            Behaviour_check.setSelected(true);
        } if (p.getExposure().equals("TRUE")) {
            Chemicals_check.setSelected(true);
        } if (p.getDrugConsumption().equals("TRUE")) {
            DrugConsumption_check.setSelected(true);
        } if (p.getLowEducation().equals("TRUE")) {
            EducationalLevel_check.setSelected(true);
        } if (p.getEmotionalInstability().equals("TRUE")) {
            EmtionalInst_check.setSelected(true);
        } if (p.getFacialExp().equals("TRUE")) {
            FacialExp_check.setSelected(true);
        } if (p.getFamilyHis().equals("TRUE")) {
            FamilyHis_check.setSelected(true);
        } if (p.getForgetPersonal().equals("TRUE")) {
            ForgetPersonalInfo_check.setSelected(true);
        } if (p.getForgetRecent().equals("TRUE")) {
            ForgetRecentInfo_check.setSelected(true);
        } if (p.getIncontinence().equals("TRUE")) {
            Incontinence_check.setSelected(true);
        } if (p.getPlanningOrg().equals("TRUE")) {
            PlanningDifficulty_check.setSelected(true);
        } if (p.getRightWords().equals("TRUE")) {
            RightWords_check.setSelected(true);
        } if (p.getSleepingPattern().equals("TRUE")) {
            SleepPatterns_check.setSelected(true);
        } if (p.getLossSmell().equals("TRUE")) {
            Smell_check.setSelected(true);
        } if (p.getSmoking().equals("TRUE")) {
            Smoking_check.setSelected(true);
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

        jPanel4 = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        appIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        iconGeneralSymptoms = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        setBackground(new java.awt.Color(225, 238, 238));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Please, mark the present symptoms:");

        FamilyHis_check.setBackground(new java.awt.Color(225, 238, 238));
        FamilyHis_check.setText("Family history of disease");

        EducationalLevel_check.setBackground(new java.awt.Color(225, 238, 238));
        EducationalLevel_check.setText("Low educational level");

        Behaviour_check.setBackground(new java.awt.Color(225, 238, 238));
        Behaviour_check.setText("Changes in behaviour");

        EmtionalInst_check.setBackground(new java.awt.Color(225, 238, 238));
        EmtionalInst_check.setText("Emotional instability");

        RightWords_check.setBackground(new java.awt.Color(225, 238, 238));
        RightWords_check.setText("Difficulties finding the right words");

        ForgetPersonalInfo_check.setBackground(new java.awt.Color(225, 238, 238));
        ForgetPersonalInfo_check.setText("Forget personal information");

        FacialExp_check.setBackground(new java.awt.Color(225, 238, 238));
        FacialExp_check.setText("Loss of facial expression");

        PlanningDifficulty_check.setBackground(new java.awt.Color(225, 238, 238));
        PlanningDifficulty_check.setText("Difficulties planning and organizing");

        ForgetRecentInfo_check.setBackground(new java.awt.Color(225, 238, 238));
        ForgetRecentInfo_check.setText("Forget recent information");

        SleepPatterns_check.setBackground(new java.awt.Color(225, 238, 238));
        SleepPatterns_check.setText("Changes in sleeping patterns");

        Smell_check.setBackground(new java.awt.Color(225, 238, 238));
        Smell_check.setText("Loss of smell");
        Smell_check.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Smell_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Smell_checkActionPerformed(evt);
            }
        });

        Incontinence_check.setBackground(new java.awt.Color(225, 238, 238));
        Incontinence_check.setText("Urinary or gastric incontinence");

        Chemicals_check.setBackground(new java.awt.Color(225, 238, 238));
        Chemicals_check.setText("Exposure to chemicals");

        Smoking_check.setBackground(new java.awt.Color(225, 238, 238));
        Smoking_check.setText("Smoking");

        DrugConsumption_check.setBackground(new java.awt.Color(225, 238, 238));
        DrugConsumption_check.setText("Drug comsuption");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        appIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dmentiapp_logo1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("General symptoms");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appIcon))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appIcon)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        iconGeneralSymptoms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/generalSymptoms.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(iconGeneralSymptoms)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FacialExp_check)
                    .addComponent(ForgetPersonalInfo_check)
                    .addComponent(ForgetRecentInfo_check)
                    .addComponent(SleepPatterns_check)
                    .addComponent(Behaviour_check))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightWords_check)
                    .addComponent(DrugConsumption_check)
                    .addComponent(Smoking_check)
                    .addComponent(Chemicals_check)
                    .addComponent(EmtionalInst_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlanningDifficulty_check)
                    .addComponent(FamilyHis_check)
                    .addComponent(Incontinence_check)
                    .addComponent(EducationalLevel_check)
                    .addComponent(Smell_check))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ForgetPersonalInfo_check)
                                    .addComponent(EmtionalInst_check)
                                    .addComponent(PlanningDifficulty_check))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FacialExp_check)
                                    .addComponent(Chemicals_check)
                                    .addComponent(FamilyHis_check))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ForgetRecentInfo_check)
                                    .addComponent(Smoking_check)
                                    .addComponent(Incontinence_check))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SleepPatterns_check)
                                    .addComponent(DrugConsumption_check)
                                    .addComponent(EducationalLevel_check))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Behaviour_check)
                                    .addComponent(RightWords_check)
                                    .addComponent(Smell_check)))
                            .addComponent(jSeparator1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(iconGeneralSymptoms)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Smell_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Smell_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Smell_checkActionPerformed

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
    private javax.swing.JLabel appIcon;
    private javax.swing.JLabel iconGeneralSymptoms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
