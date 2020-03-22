/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import dementia_dss.CLIPS_connection;
import dementia_dss.Patient;

/**
 *
 * @author adria
 */
public class OtherPathologies extends javax.swing.JFrame {

    Patient patient = new Patient();

    /**
     * Creates new form OtherPathologies
     */
    public OtherPathologies() {
        initComponents();
        setVisible(true);
    }

    public OtherPathologies(Patient patient) {
        this.patient = patient;
        initComponents();
        setVisible(true);

        if (patient.getDownSyndrome().equalsIgnoreCase("TRUE")) {
            DownSyndrome_check.setSelected(true);
        }
        if (patient.getHyperglycemia().equalsIgnoreCase("TRUE")) {
            Hyperglycemia_check.setSelected(true);
        }
        if (patient.getHyperlipidemia().equalsIgnoreCase("TRUE")) {
            Hyperlypidemia_check.setSelected(true);
        }
        if (patient.getInsulin().equalsIgnoreCase("TRUE")) {
            Insulin_check.setSelected(true);
        }
        if (patient.getHypertension().equalsIgnoreCase("TRUE")) {
            Hypertension_check.setSelected(true);
        }
        if (patient.getHeartCerebro().equalsIgnoreCase("TRUE")) {
            HeartAttacks_check.setSelected(true);
        }
        if (patient.getDiabetes().equalsIgnoreCase("TRUE")) {
            Diabetes_check.setSelected(true);
        }
        if (patient.getObesity().equalsIgnoreCase("TRUE")) {
            Obesity_check.setSelected(true);
        }
        if (patient.getCholesterol().equalsIgnoreCase("TRUE")) {
            Cholesterol_check.setSelected(true);
        }
        if (patient.getArteriosclerosis().equalsIgnoreCase("TRUE")) {
            Arteriosclerosis_check.setSelected(true);
        }
        if (patient.getDepression().equalsIgnoreCase("TRUE")) {
            Depression_check.setSelected(true);
        }
    }

    public void SaveInfo() {
        Boolean downSyndrome = this.DownSyndrome_check.isSelected();
        if (downSyndrome) {
            patient.setDownSyndrome("TRUE");
        } else {
            patient.setDownSyndrome("FALSE");
        }
        Boolean hyperglycemia = this.Hyperglycemia_check.isSelected();
        if (hyperglycemia) {
            patient.setHyperglycemia("TRUE");
        } else {
            patient.setHyperglycemia("FALSE");
        }
        Boolean insulin = this.Insulin_check.isSelected();
        if (insulin) {
            patient.setInsulin("TRUE");
        } else {
            patient.setInsulin("FALSE");
        }
        Boolean hyperlipidemia = this.Hyperlypidemia_check.isSelected();
        if (hyperlipidemia) {
            patient.setHyperlipidemia("TRUE");
        } else {
            patient.setHyperlipidemia("FALSE");
        }
        Boolean hypertension = this.Hypertension_check.isSelected();
        if (hypertension) {
            patient.setHypertension("TRUE");
        } else {
            patient.setHyperlipidemia("FALSE");
        }
        Boolean heartCerebro = this.HeartAttacks_check.isSelected();
        if (heartCerebro) {
            patient.setHeartCerebro("TRUE");
        } else {
            patient.setHeartCerebro("FALSE");
        }
        Boolean diabetes = this.Diabetes_check.isSelected();
        if (diabetes) {
            patient.setDiabetes("TRUE");
        } else {
            patient.setDiabetes("FALSE");
        }
        Boolean obesity = this.Obesity_check.isSelected();
        if (obesity) {
            patient.setObesity("TRUE");
        } else {
            patient.setObesity("FALSE");
        }
        Boolean cholesterol = this.Cholesterol_check.isSelected();
        if (cholesterol) {
            patient.setCholesterol("TRUE");
        } else {
            patient.setCholesterol("FALSE");
        }
        Boolean arteriosclerosis = this.Arteriosclerosis_check.isSelected();
        if (arteriosclerosis) {
            patient.setArteriosclerosis("TRUE");
        } else {
            patient.setArteriosclerosis("FALSE");
        }
        Boolean depression = this.Depression_check.isSelected();
        if (depression) {
            patient.setDepression("TRUE");
        } else {
            patient.setDepression("FALSE");
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

        Pathologies_symptoms = new javax.swing.JLabel();
        SymptomsPresent_pathologies = new javax.swing.JLabel();
        Hyperglycemia_check = new javax.swing.JCheckBox();
        Insulin_check = new javax.swing.JCheckBox();
        Hyperlypidemia_check = new javax.swing.JCheckBox();
        Hypertension_check = new javax.swing.JCheckBox();
        HeartAttacks_check = new javax.swing.JCheckBox();
        Diabetes_check = new javax.swing.JCheckBox();
        Obesity_check = new javax.swing.JCheckBox();
        Cholesterol_check = new javax.swing.JCheckBox();
        Arteriosclerosis_check = new javax.swing.JCheckBox();
        Depression_check = new javax.swing.JCheckBox();
        Submit_pathologies = new javax.swing.JButton();
        Back_pathologies = new javax.swing.JButton();
        DownSyndrome_check = new javax.swing.JCheckBox();
        prueba = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setSize(new java.awt.Dimension(0, 0));

        Pathologies_symptoms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pathologies_symptoms.setText("Other patologies");

        SymptomsPresent_pathologies.setText("Select the present symptoms:");

        Hyperglycemia_check.setText("Hyperglycemia");

        Insulin_check.setText("Insulin resistance");

        Hyperlypidemia_check.setText("Hyperlipidemia");

        Hypertension_check.setText("Arterial hypertension");

        HeartAttacks_check.setText("Recorded heart/cerebrovascular attacks");

        Diabetes_check.setText("Diabetes");

        Obesity_check.setText("Obesity");

        Cholesterol_check.setText("High cholesterol");

        Arteriosclerosis_check.setText("Arteriosclerosis");

        Depression_check.setText("Depression");

        Submit_pathologies.setText("Submit");
        Submit_pathologies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_pathologiesActionPerformed(evt);
            }
        });

        Back_pathologies.setText("Back");
        Back_pathologies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_pathologiesActionPerformed(evt);
            }
        });

        DownSyndrome_check.setText("Down Syndrome");

        prueba.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(533, Short.MAX_VALUE)
                        .addComponent(Back_pathologies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Submit_pathologies))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HeartAttacks_check)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DownSyndrome_check)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Hyperglycemia_check)
                                        .addComponent(Hyperlypidemia_check))
                                    .addComponent(Insulin_check)
                                    .addComponent(Hypertension_check))
                                .addGap(179, 179, 179)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Depression_check)
                                    .addComponent(Arteriosclerosis_check)
                                    .addComponent(Obesity_check)
                                    .addComponent(Diabetes_check)
                                    .addComponent(Cholesterol_check)))
                            .addComponent(SymptomsPresent_pathologies)
                            .addComponent(Pathologies_symptoms))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(prueba)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Pathologies_symptoms)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SymptomsPresent_pathologies)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DownSyndrome_check)
                    .addComponent(Diabetes_check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hyperglycemia_check)
                    .addComponent(Obesity_check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hyperlypidemia_check)
                    .addComponent(Cholesterol_check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insulin_check)
                    .addComponent(Arteriosclerosis_check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hypertension_check)
                    .addComponent(Depression_check))
                .addGap(18, 18, 18)
                .addComponent(HeartAttacks_check)
                .addGap(32, 32, 32)
                .addComponent(prueba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_pathologies)
                    .addComponent(Back_pathologies))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_pathologiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_pathologiesActionPerformed
        SaveInfo();
        /*Boolean downSyndrome = DownSyndrome_check.isSelected();
        if (downSyndrome) {
            patient.setDownSyndrome("TRUE");
        } else {
            patient.setDownSyndrome("FALSE");
        }
        Boolean hyperglycemia = Hyperglycemia_check.isSelected();
        if (hyperglycemia) {
            patient.setHyperglycemia("TRUE");
        } else {
            patient.setHyperglycemia("FALSE");
        }
        Boolean insulin = Insulin_check.isSelected();
        if (insulin) {
            patient.setInsulin("TRUE");
        } else {
            patient.setInsulin("FALSE");
        }
        Boolean hyperlipidemia = Hyperlypidemia_check.isSelected();
        if (hyperlipidemia) {
            patient.setHyperlipidemia("TRUE");
        } else {
            patient.setHyperlipidemia("FALSE");
        }
        Boolean hypertension = Hypertension_check.isSelected();
        if (hypertension) {
            patient.setHypertension("TRUE");
        } else {
            patient.setHyperlipidemia("FALSE");
        }
        Boolean heartCerebro = HeartAttacks_check.isSelected();
        if (heartCerebro) {
            patient.setHeartCerebro("TRUE");
        } else {
            patient.setHeartCerebro("FALSE");
        }
        Boolean diabetes = Diabetes_check.isSelected();
        if (diabetes) {
            patient.setDiabetes("TRUE");
        } else {
            patient.setDiabetes("FALSE");
        }
        Boolean obesity = Obesity_check.isSelected();
        if (obesity) {
            patient.setObesity("TRUE");
        } else {
            patient.setObesity("FALSE");
        }
        Boolean cholesterol = Cholesterol_check.isSelected();
        if (cholesterol) {
            patient.setCholesterol("TRUE");
        } else {
            patient.setCholesterol("FALSE");
        }
        Boolean arteriosclerosis = Arteriosclerosis_check.isSelected();
        if (arteriosclerosis) {
            patient.setArteriosclerosis("TRUE");
        } else {
            patient.setArteriosclerosis("FALSE");
        }
        Boolean depression = Depression_check.isSelected();
        if (depression) {
            patient.setDepression("TRUE");
        } else {
            patient.setDepression("FALSE");
        }*/
        dispose();
        new MotorSymptoms(patient);
    }//GEN-LAST:event_Back_pathologiesActionPerformed

    private void Submit_pathologiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_pathologiesActionPerformed
        /*Boolean downSyndrome = DownSyndrome_check.isSelected();
        if (downSyndrome) {
            patient.setDownSyndrome("TRUE");
        } else {
            patient.setDownSyndrome("FALSE");
        }
        Boolean hyperglycemia = Hyperglycemia_check.isSelected();
        if (hyperglycemia) {
            patient.setHyperglycemia("TRUE");
        } else {
            patient.setHyperglycemia("FALSE");
        }
        Boolean insulin = Insulin_check.isSelected();
        if (insulin) {
            patient.setInsulin("TRUE");
        } else {
            patient.setInsulin("FALSE");
        }
        Boolean hyperlipidemia = Hyperlypidemia_check.isSelected();
        if (hyperlipidemia) {
            patient.setHyperlipidemia("TRUE");
        } else {
            patient.setHyperlipidemia("FALSE");
        }
        Boolean hypertension = Hypertension_check.isSelected();
        if (hypertension) {
            patient.setHypertension("TRUE");
        } else {
            patient.setHyperlipidemia("FALSE");
        }
        Boolean heartCerebro = HeartAttacks_check.isSelected();
        if (heartCerebro) {
            patient.setHeartCerebro("TRUE");
        } else {
            patient.setHeartCerebro("FALSE");
        }
        Boolean diabetes = Diabetes_check.isSelected();
        if (diabetes) {
            patient.setDiabetes("TRUE");
        } else {
            patient.setDiabetes("FALSE");
        }
        Boolean obesity = Obesity_check.isSelected();
        if (obesity) {
            patient.setObesity("TRUE");
        } else {
            patient.setObesity("FALSE");
        }
        Boolean cholesterol = Cholesterol_check.isSelected();
        if (cholesterol) {
            patient.setCholesterol("TRUE");
        } else {
            patient.setCholesterol("FALSE");
        }
        Boolean arteriosclerosis = Arteriosclerosis_check.isSelected();
        if (arteriosclerosis) {
            patient.setArteriosclerosis("TRUE");
        } else {
            patient.setArteriosclerosis("FALSE");
        }
        Boolean depression = Depression_check.isSelected();
        if (depression) {
            patient.setDepression("TRUE");
        } else {
            patient.setDepression("FALSE");
        }*/
        SaveInfo();

        CLIPS_connection clipsConnect = new CLIPS_connection();
        clipsConnect.createPatientAssertion(patient);

        dispose();
        //JOptionPane.showMessageDialog(null, "Diagnosis is: patient has ");
        /*
        if (pateint.getNoDementia){
            new NoDementia();
        }*/
    }//GEN-LAST:event_Submit_pathologiesActionPerformed

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
            java.util.logging.Logger.getLogger(OtherPathologies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtherPathologies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtherPathologies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtherPathologies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtherPathologies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Arteriosclerosis_check;
    private javax.swing.JButton Back_pathologies;
    private javax.swing.JCheckBox Cholesterol_check;
    private javax.swing.JCheckBox Depression_check;
    private javax.swing.JCheckBox Diabetes_check;
    private javax.swing.JCheckBox DownSyndrome_check;
    private javax.swing.JCheckBox HeartAttacks_check;
    private javax.swing.JCheckBox Hyperglycemia_check;
    private javax.swing.JCheckBox Hyperlypidemia_check;
    private javax.swing.JCheckBox Hypertension_check;
    private javax.swing.JCheckBox Insulin_check;
    private javax.swing.JCheckBox Obesity_check;
    private javax.swing.JLabel Pathologies_symptoms;
    private javax.swing.JButton Submit_pathologies;
    private javax.swing.JLabel SymptomsPresent_pathologies;
    private javax.swing.JLabel prueba;
    // End of variables declaration//GEN-END:variables
}
