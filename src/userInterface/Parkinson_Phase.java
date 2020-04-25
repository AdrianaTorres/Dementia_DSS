/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import db.interfaces.DBManager;
import db.sqlite.SQLiteManager;
import dementia_dss.Patient;

/**
 *
 * @author adria
 */
public class Parkinson_Phase extends javax.swing.JPanel {

    DBManager dbManager = new SQLiteManager();
    Patient patient = new Patient();

    /**
     * Creates new form Parkinson_Phase
     */
    public Parkinson_Phase() {
        initComponents();
    }

    public Parkinson_Phase(DBManager dbManager, Patient patient) {
        this.dbManager = dbManager;
        this.patient = patient;
        initComponents();
        Boolean lossPhysicalAbilities = LossPhysicalAbilities_check.isSelected();
        if (lossPhysicalAbilities) {
            patient.setLossPhysicalAbilities("TRUE");
        } else {
            patient.setLossPhysicalAbilities("FALSE");
        }
        String tremor = (String) Tremor_box.getSelectedItem();
        if (tremor.equals("Unilateral")) {
            patient.setTremorUni("TRUE");
            patient.setTremorBi("FALSE");
        } else if (tremor.equals("Bilateral")) {
            patient.setTremorUni("FALSE");
            patient.setTremorBi("TRUE");
        } else {
            patient.setTremorUni("FALSE");
            patient.setTremorBi("FALSE");
        }
    }

    public void SaveInfo() {
        Boolean physicalAbilities = this.LossPhysicalAbilities_check.isSelected();
        if (physicalAbilities) {
            patient.setLossPhysicalAbilities("TRUE");
        } else {
            patient.setLossPhysicalAbilities("FALSE");
        }
        if (physicalAbilities) {
            patient.setLossPhysicalAbilities("TRUE");
        } else {
            patient.setLossPhysicalAbilities("FALSE");
        }
        if (Tremor_box.getSelectedItem().equals("Unilateral")) {
            patient.setTremorUni("TRUE");
            patient.setTremorBi("FALSE"); // Lo ponemos a false o lo dejamos en true porque si es high tb es low?
        } else if (Tremor_box.getSelectedItem().equals("Bilateral")) {
            patient.setTremorUni("FALSE");
            patient.setTremorBi("TRUE");
        } else if (Tremor_box.getSelectedItem().equals("None")) {
            patient.setTremorBi("FALSE");
            patient.setTremorUni("FALSE");
            patient.setTremor("FALSE");
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tremor_box = new javax.swing.JComboBox<>();
        LossPhysicalAbilities_check = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(225, 238, 238));
        setPreferredSize(new java.awt.Dimension(1260, 777));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Please, mark the present symptoms for the system to be able to estimate the phase:");

        jLabel3.setText("Tremor");

        Tremor_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Unilateral", "Bilateral" }));

        LossPhysicalAbilities_check.setBackground(new java.awt.Color(225, 238, 238));
        LossPhysicalAbilities_check.setText("Loss of physical abilities");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dmentiapp_logo1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Parkinson Specific Symptoms");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LossPhysicalAbilities_check)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Tremor_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LossPhysicalAbilities_check)
                    .addComponent(jLabel3)
                    .addComponent(Tremor_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox LossPhysicalAbilities_check;
    private javax.swing.JComboBox<String> Tremor_box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
