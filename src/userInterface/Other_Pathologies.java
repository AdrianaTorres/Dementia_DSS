/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import db.interfaces.DBManager;
import db.sqlite.SQLiteManager;
import dementia_dss.Patient;
//import icons.*;

/**
 *
 * @author adria
 */
public class Other_Pathologies extends javax.swing.JPanel {

    DBManager dbManager = new SQLiteManager();
    Patient patient = new Patient();

    /**
     * Creates new form Other_Pathologies
     */
    public Other_Pathologies() {
        initComponents();
    }

    public void setDbManager(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public Other_Pathologies(Patient patient) {
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

    public void loadOtherPathologies(Patient patient) {
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
            patient.setHypertension("FALSE");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DownSyndrome_check = new javax.swing.JCheckBox();
        Hyperglycemia_check = new javax.swing.JCheckBox();
        Hyperlypidemia_check = new javax.swing.JCheckBox();
        Hypertension_check = new javax.swing.JCheckBox();
        Insulin_check = new javax.swing.JCheckBox();
        Diabetes_check = new javax.swing.JCheckBox();
        Obesity_check = new javax.swing.JCheckBox();
        HeartAttacks_check = new javax.swing.JCheckBox();
        Cholesterol_check = new javax.swing.JCheckBox();
        Arteriosclerosis_check = new javax.swing.JCheckBox();
        Depression_check = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        appIcon = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        separator = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("General Symptoms");
        jPanel1.add(jLabel3);

        setBackground(new java.awt.Color(225, 238, 238));
        setMaximumSize(new java.awt.Dimension(1345, 671));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Please, mark other pathologies the patient have:");

        DownSyndrome_check.setBackground(new java.awt.Color(225, 238, 238));
        DownSyndrome_check.setText("Down Syndrome");
        DownSyndrome_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownSyndrome_checkActionPerformed(evt);
            }
        });

        Hyperglycemia_check.setBackground(new java.awt.Color(225, 238, 238));
        Hyperglycemia_check.setText("Hyperglicemia");

        Hyperlypidemia_check.setBackground(new java.awt.Color(225, 238, 238));
        Hyperlypidemia_check.setText("Hyperlipidemia");

        Hypertension_check.setBackground(new java.awt.Color(225, 238, 238));
        Hypertension_check.setText("Arterial hypertension");

        Insulin_check.setBackground(new java.awt.Color(225, 238, 238));
        Insulin_check.setText("Insulin resistance");

        Diabetes_check.setBackground(new java.awt.Color(225, 238, 238));
        Diabetes_check.setText("Diabetes");

        Obesity_check.setBackground(new java.awt.Color(225, 238, 238));
        Obesity_check.setText("Obesity");

        HeartAttacks_check.setBackground(new java.awt.Color(225, 238, 238));
        HeartAttacks_check.setText("Recorded heart/cerebrovascular attacks");

        Cholesterol_check.setBackground(new java.awt.Color(225, 238, 238));
        Cholesterol_check.setText("High cholesterol");

        Arteriosclerosis_check.setBackground(new java.awt.Color(225, 238, 238));
        Arteriosclerosis_check.setText("Ateriosclerosis");

        Depression_check.setBackground(new java.awt.Color(225, 238, 238));
        Depression_check.setText("Depression");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Other pathologies");

        appIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dmentiapp_logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appIcon))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(appIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));

        separator.setBackground(new java.awt.Color(0, 153, 153));
        separator.setForeground(new java.awt.Color(0, 153, 153));
        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/otherPathologies2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33)
                                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cholesterol_check)
                                    .addComponent(Diabetes_check)
                                    .addComponent(Hypertension_check)
                                    .addComponent(Arteriosclerosis_check))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HeartAttacks_check)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Obesity_check)
                                            .addComponent(Depression_check)
                                            .addComponent(Hyperglycemia_check))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Insulin_check)
                                            .addComponent(Hyperlypidemia_check)
                                            .addComponent(DownSyndrome_check))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Obesity_check)
                                .addGap(18, 18, 18)
                                .addComponent(Depression_check)
                                .addGap(18, 18, 18)
                                .addComponent(Hyperglycemia_check))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DownSyndrome_check)
                                .addGap(18, 18, 18)
                                .addComponent(Hyperlypidemia_check)
                                .addGap(18, 18, 18)
                                .addComponent(Insulin_check)))
                        .addGap(18, 18, 18)
                        .addComponent(HeartAttacks_check))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cholesterol_check)
                        .addGap(18, 18, 18)
                        .addComponent(Diabetes_check)
                        .addGap(18, 18, 18)
                        .addComponent(Hypertension_check)
                        .addGap(18, 18, 18)
                        .addComponent(Arteriosclerosis_check))
                    .addComponent(jLabel4)
                    .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DownSyndrome_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownSyndrome_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DownSyndrome_checkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Arteriosclerosis_check;
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
    private javax.swing.JLabel appIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables

}
