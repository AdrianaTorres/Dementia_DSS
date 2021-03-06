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
public class Alzheimer_Phase extends javax.swing.JPanel {

    DBManager dbManager = new SQLiteManager();
    Patient patient = new Patient();

    /**
     * Creates new form Alzheimer_Phase
     */
    public Alzheimer_Phase() {
        initComponents();
    }

    public void setDbManager(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public Alzheimer_Phase(Patient patient) {
        this.patient = patient;
        initComponents();
        String stiffness = (String) Stiffness_box.getSelectedItem();
        if (stiffness.equals("Low")) {
            patient.setStiffnessL("TRUE");
            patient.setStiffnessH("FALSE");
        } else if (stiffness.equals("High")) {
            patient.setStiffnessL("FALSE");
            patient.setStiffnessH("TRUE");
        } else {
            patient.setStiffnessL("FALSE");
            patient.setStiffnessH("FALSE");
        }
        Boolean hyperreflexia = Hyperreflexia_check.isSelected();
        if (hyperreflexia) {
            patient.setHyperreflexia("TRUE");
        } else {
            patient.setHyperreflexia("FALSE");
        }
        Boolean lossPhysicalAbilities = LossPhysicalAbilities_check.isSelected();
        if (lossPhysicalAbilities) {
            patient.setLossPhysicalAbilities("TRUE");
        } else {
            patient.setLossPhysicalAbilities("FALSE");
        }
    }

    public void loadAlzheimerPhase(Patient patient) {
        if (patient.getHyperreflexia().equalsIgnoreCase("TRUE")) {
            Hyperreflexia_check.setSelected(true);
        } else if (patient.getLossPhysicalAbilities().equalsIgnoreCase("TRUE")) {
            LossPhysicalAbilities_check.setSelected(true);
        } else if (patient.getStiffness().equalsIgnoreCase("FALSE") && patient.getStiffnessL().equalsIgnoreCase("FALSE") && patient.getStiffnessH().equalsIgnoreCase("FALSE")) {
            Stiffness_box.setSelectedIndex(0);
        } else if (patient.getStiffnessL().equalsIgnoreCase("TRUE")) {
            Stiffness_box.setSelectedIndex(1);
        } else if (patient.getStiffnessH().equalsIgnoreCase("TRUE")) {
            Stiffness_box.setSelectedIndex(2);
        }
    }

    public void SaveInfo() {
        Boolean hyperreflexia = this.Hyperreflexia_check.isSelected();
        if (hyperreflexia) {
            patient.setHyperreflexia("TRUE");
        } else {
            patient.setHyperreflexia("FALSE");
        }
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
        if (Stiffness_box.getSelectedItem().equals("High")) {
            patient.setStiffnessH("TRUE");
            patient.setStiffnessL("FALSE"); // Lo ponemos a false o lo dejamos en true porque si es high tb es low?
        } else if (Stiffness_box.getSelectedItem().equals("Low")) {
            patient.setStiffnessH("FALSE");
            patient.setStiffnessL("TRUE");
        } else if (Stiffness_box.getSelectedItem().equals("None")) {
            patient.setStiffnessH("FALSE");
            patient.setStiffnessL("FALSE");
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
        Hyperreflexia_check = new javax.swing.JCheckBox();
        LossPhysicalAbilities_check = new javax.swing.JCheckBox();
        Stiffness_box = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        appIcon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        iconAlzheimer = new javax.swing.JLabel();

        setBackground(new java.awt.Color(225, 238, 238));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Please, mark the present symptoms for the system to be able to estimate the phase:");

        jLabel3.setText("Stiffness");

        Hyperreflexia_check.setBackground(new java.awt.Color(225, 238, 238));
        Hyperreflexia_check.setText("Hyperreflexia");

        LossPhysicalAbilities_check.setBackground(new java.awt.Color(225, 238, 238));
        LossPhysicalAbilities_check.setText("Loss of physical abilities");

        Stiffness_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Low", "High" }));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alzheimer Specific Symptoms");

        appIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dmentiapp_logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appIcon))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appIcon, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        iconAlzheimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/alzheimer.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconAlzheimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LossPhysicalAbilities_check)
                            .addComponent(Hyperreflexia_check)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Stiffness_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(112, 112, 112))
                    .addComponent(jLabel2))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconAlzheimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Hyperreflexia_check)
                        .addGap(18, 18, 18)
                        .addComponent(LossPhysicalAbilities_check)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Stiffness_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(474, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Hyperreflexia_check;
    private javax.swing.JCheckBox LossPhysicalAbilities_check;
    private javax.swing.JComboBox<String> Stiffness_box;
    private javax.swing.JLabel appIcon;
    private javax.swing.JLabel iconAlzheimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
