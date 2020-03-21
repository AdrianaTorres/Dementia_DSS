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
public class GeneralSymptoms extends javax.swing.JFrame {

    Patient patient = new Patient();

    /**
     * Creates new form GeneralSymptoms
     */
    public GeneralSymptoms() {
        initComponents();
        setVisible(true);
    }

    public GeneralSymptoms(Patient patient) {
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

        General_symptoms = new javax.swing.JLabel();
        FamilyHis_check = new javax.swing.JCheckBox();
        SymptomsPresent_general = new javax.swing.JLabel();
        EducationalLevel_check = new javax.swing.JCheckBox();
        Behaviour_check = new javax.swing.JCheckBox();
        EmtionalInst_check = new javax.swing.JCheckBox();
        RightWords_check = new javax.swing.JCheckBox();
        ForgetPersonalInfo_check = new javax.swing.JCheckBox();
        PlanningDifficulty_check = new javax.swing.JCheckBox();
        ForgetRecentInfo_check = new javax.swing.JCheckBox();
        SleepPatterns_check = new javax.swing.JCheckBox();
        Smell_check = new javax.swing.JCheckBox();
        Incontinence_check = new javax.swing.JCheckBox();
        Chemicals_check = new javax.swing.JCheckBox();
        FacialExp_check = new javax.swing.JCheckBox();
        Smoking_check = new javax.swing.JCheckBox();
        Next_general = new javax.swing.JButton();
        Back_general = new javax.swing.JButton();
        DrugConsumption_check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        General_symptoms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        General_symptoms.setText("General symptoms");

        FamilyHis_check.setText("Family history of disease");
        FamilyHis_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyHis_checkActionPerformed(evt);
            }
        });

        SymptomsPresent_general.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        SymptomsPresent_general.setText("Select the present symptoms:");

        EducationalLevel_check.setText("Low educational level");
        EducationalLevel_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationalLevel_checkActionPerformed(evt);
            }
        });

        Behaviour_check.setText("Changes in behaviour");

        EmtionalInst_check.setText("Emotional instability");

        RightWords_check.setText("Difficulties finding the right words");

        ForgetPersonalInfo_check.setText("Forget personal information");

        PlanningDifficulty_check.setText("Difficulties planning and organizing");

        ForgetRecentInfo_check.setText("Forget recent information");

        SleepPatterns_check.setText("Changes in sleeping patterns");

        Smell_check.setText("Loss of smell");

        Incontinence_check.setText("Urinary and gastric incontinence");

        Chemicals_check.setText("Expousre to pesticides, herbicides, insecticides, etc");

        FacialExp_check.setText("Loss of facial expression");

        Smoking_check.setText("Smoking");

        Next_general.setText("Next");
        Next_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_generalActionPerformed(evt);
            }
        });

        Back_general.setText("Back");
        Back_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_generalActionPerformed(evt);
            }
        });

        DrugConsumption_check.setText("Drug consumption");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_general)
                .addGap(18, 18, 18)
                .addComponent(Next_general)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(General_symptoms)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FamilyHis_check)
                            .addComponent(EducationalLevel_check)
                            .addComponent(Behaviour_check)
                            .addComponent(EmtionalInst_check)
                            .addComponent(RightWords_check)
                            .addComponent(ForgetPersonalInfo_check)
                            .addComponent(FacialExp_check)
                            .addComponent(SymptomsPresent_general))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlanningDifficulty_check)
                            .addComponent(ForgetRecentInfo_check)
                            .addComponent(SleepPatterns_check)
                            .addComponent(Smell_check)
                            .addComponent(Incontinence_check)
                            .addComponent(Chemicals_check)
                            .addComponent(Smoking_check)
                            .addComponent(DrugConsumption_check))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(General_symptoms)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SymptomsPresent_general))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(PlanningDifficulty_check)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(FamilyHis_check)
                        .addGap(13, 13, 13)
                        .addComponent(EducationalLevel_check)
                        .addGap(18, 18, 18)
                        .addComponent(Behaviour_check)
                        .addGap(18, 18, 18)
                        .addComponent(EmtionalInst_check)
                        .addGap(18, 18, 18)
                        .addComponent(RightWords_check)
                        .addGap(18, 18, 18)
                        .addComponent(ForgetPersonalInfo_check)
                        .addGap(18, 18, 18)
                        .addComponent(FacialExp_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Next_general)
                            .addComponent(Back_general))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ForgetRecentInfo_check)
                        .addGap(18, 18, 18)
                        .addComponent(SleepPatterns_check)
                        .addGap(18, 18, 18)
                        .addComponent(Smell_check)
                        .addGap(18, 18, 18)
                        .addComponent(Incontinence_check)
                        .addGap(18, 18, 18)
                        .addComponent(Chemicals_check)
                        .addGap(18, 18, 18)
                        .addComponent(Smoking_check)
                        .addGap(18, 18, 18)
                        .addComponent(DrugConsumption_check)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FamilyHis_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyHis_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FamilyHis_checkActionPerformed

    private void EducationalLevel_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationalLevel_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EducationalLevel_checkActionPerformed

    private void Next_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_generalActionPerformed
        Boolean familyHis = FamilyHis_check.isSelected();
        if (familyHis) {
            patient.setFamilyHis("TRUE");
        } else {
            patient.setFamilyHis("FALSE");
        }
        Boolean lowEducation = EducationalLevel_check.isSelected();
        if (lowEducation) {
            patient.setLowEducation("TRUE");
        } else {
            patient.setLowEducation("FALSE");
        }
        Boolean behaviour = Behaviour_check.isSelected();
        if (behaviour) {
            patient.setBehaviour("TRUE");
        } else {
            patient.setBehaviour("FALSE");
        }
        Boolean emotionalInstability = EmtionalInst_check.isSelected();
        if (emotionalInstability) {
            patient.setEmotionalInstability("TRUE");
        } else {
            patient.setEmotionalInstability("FALSE");
        }
        Boolean rightWords = RightWords_check.isSelected();
        if (rightWords) {
            patient.setRightWords("TRUE");
        } else {
            patient.setRightWords("FALSE");
        }
        Boolean forgetPersonal = ForgetPersonalInfo_check.isSelected();
        if (forgetPersonal) {
            patient.setForgetPersonal("TRUE");
        } else {
            patient.setForgetPersonal("FALSE");
        }
        Boolean facialExp = FacialExp_check.isSelected();
        if (facialExp) {
            patient.setFacialExp("TRUE");
        } else {
            patient.setFacialExp("FALSE");
        }
        Boolean planningOrg = PlanningDifficulty_check.isSelected();
        if (planningOrg) {
            patient.setPlanningOrg("TRUE");
        } else {
            patient.setPlanningOrg("FALSE");
        }
        Boolean forgetRecent = ForgetRecentInfo_check.isSelected();
        if (forgetRecent) {
            patient.setForgetRecent("TRUE");
        } else {
            patient.setForgetRecent("FALSE");
        }
        Boolean sleepingPattern = SleepPatterns_check.isSelected();
        if (sleepingPattern) {
            patient.setSleepingPattern("TRUE");
        } else {
            patient.setSleepingPattern("FALSE");
        }
        Boolean lossSmell = Smell_check.isSelected();
        if (lossSmell) {
            patient.setLossSmell("TRUE");
        } else {
            patient.setLossSmell("FALSE");
        }
        Boolean incontinence = Incontinence_check.isSelected();
        if (incontinence) {
            patient.setIncontinence("TRUE");
        } else {
            patient.setIncontinence("FALSE");
        }
        Boolean exposure = Chemicals_check.isSelected();
        if (exposure) {
            patient.setExposure("TRUE");
        } else {
            patient.setExposure("FALSE");
        }
        Boolean smoking = Smoking_check.isSelected();
        if (smoking) {
            patient.setSmoking("TRUE");
        } else {
            patient.setSmoking("FALSE");
        }
        Boolean drug = DrugConsumption_check.isSelected();
        if (drug) {
            patient.setDrugConsumption("TRUE");
        } else {
            patient.setDrugConsumption("FALSE");
        }

        dispose();
        //setVisible(false);

        new MotorSymptoms(patient);
    }//GEN-LAST:event_Next_generalActionPerformed

    private void Back_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_generalActionPerformed
        // TODO add your handling code here:
        dispose();

        new PatientInfo(patient);
    }//GEN-LAST:event_Back_generalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneralSymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralSymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralSymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralSymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneralSymptoms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_general;
    private javax.swing.JCheckBox Behaviour_check;
    private javax.swing.JCheckBox Chemicals_check;
    private javax.swing.JCheckBox DrugConsumption_check;
    private javax.swing.JCheckBox EducationalLevel_check;
    private javax.swing.JCheckBox EmtionalInst_check;
    private javax.swing.JCheckBox FacialExp_check;
    private javax.swing.JCheckBox FamilyHis_check;
    private javax.swing.JCheckBox ForgetPersonalInfo_check;
    private javax.swing.JCheckBox ForgetRecentInfo_check;
    private javax.swing.JLabel General_symptoms;
    private javax.swing.JCheckBox Incontinence_check;
    private javax.swing.JButton Next_general;
    private javax.swing.JCheckBox PlanningDifficulty_check;
    private javax.swing.JCheckBox RightWords_check;
    private javax.swing.JCheckBox SleepPatterns_check;
    private javax.swing.JCheckBox Smell_check;
    private javax.swing.JCheckBox Smoking_check;
    private javax.swing.JLabel SymptomsPresent_general;
    // End of variables declaration//GEN-END:variables
}
