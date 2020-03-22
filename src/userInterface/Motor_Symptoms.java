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
public class Motor_Symptoms extends javax.swing.JPanel {

    Patient patient = new Patient();

    /**
     * Creates new form Motor_Symptoms
     */
    public Motor_Symptoms() {
        initComponents();
    }

    public Motor_Symptoms(Patient patient) {
        this.patient = patient;
        initComponents();
        setVisible(true);

        if (patient.getLackCoord().equalsIgnoreCase("TRUE")) {
            NoCoordination_check.setSelected(true);
        }
        if (patient.getStandWalk().equalsIgnoreCase("TRUE")) {
            NoStand_check.setSelected(true);
        }
        if (patient.getStiffness().equalsIgnoreCase("TRUE")) {
            Stiffness_check.setSelected(true);
        }
        if (patient.getLossBalance().equalsIgnoreCase("TRUE")) {
            LossBalance_check.setSelected(true);
        }
        if (patient.getWalkStraight().equalsIgnoreCase("TRUE")) {
            StraightWalk_check.setSelected(true);
        }
        if (patient.getTremor().equalsIgnoreCase("TRUE")) {
            Tremor_check.setSelected(true);
        }
        if ((patient.getOrientationL().equalsIgnoreCase("FALSE")) && (patient.getOrientationH().equalsIgnoreCase("FALSE"))) {
            Orientation_box.setSelectedIndex(0);
        }
        if (patient.getOrientationL().equalsIgnoreCase("TRUE")) {
            Orientation_box.setSelectedIndex(1);
        }
        if (patient.getOrientationH().equalsIgnoreCase("TRUE")) {
            Orientation_box.setSelectedIndex(2);
        }
        if ((patient.getBradykinesiaL().equalsIgnoreCase("FALSE")) && (patient.getBradykinesiaM().equalsIgnoreCase("FALSE")) && (patient.getBradykinesiaH().equalsIgnoreCase("FALSE"))) {
            Bradykinesia_box.setSelectedIndex(0);
        }
        if (patient.getBradykinesiaL().equalsIgnoreCase("TRUE")) {
            Bradykinesia_box.setSelectedIndex(1);
        }
        if (patient.getBradykinesiaM().equalsIgnoreCase("TRUE")) {
            Bradykinesia_box.setSelectedIndex(2);
        }
        if (patient.getBradykinesiaH().equalsIgnoreCase("TRUE")) {
            Bradykinesia_box.setSelectedIndex(3);
        }
    }

    public void SaveInfo() {
        Boolean lackCoord = this.NoCoordination_check.isSelected();
        if (lackCoord) {
            patient.setLackCoord("TRUE");
        } else {
            patient.setLackCoord("FALSE");
        }
        Boolean unableStand = this.NoStand_check.isSelected();
        if (unableStand) {
            patient.setStandWalk("TRUE");
        } else {
            patient.setStandWalk("FALSE");
        }
        Boolean stiffness = this.Stiffness_check.isSelected();
        if (stiffness) {
            patient.setStiffness("TRUE");
        } else {
            patient.setStiffness("FALSE");
        }
        Boolean lossBalance = this.LossBalance_check.isSelected();
        if (lossBalance) {
            patient.setLossBalance("TRUE");
        } else {
            patient.setLossBalance("FALSE");
        }
        Boolean straightWalk = this.StraightWalk_check.isSelected();
        if (straightWalk) {
            patient.setWalkStraight("TRUE");
        } else {
            patient.setWalkStraight("FALSE");
        }
        Boolean tremor = this.Tremor_check.isSelected();
        if (tremor) {
            patient.setTremor("TRUE");
        } else {
            patient.setTremor("FALSE");
        }
        if (Orientation_box.getSelectedItem().equals("High")) {
            patient.setOrientationH("TRUE");
            patient.setOrientationL("FALSE"); // Lo ponemos a false o lo dejamos en true porque si es high tb es low?
        } else if (Orientation_box.getSelectedItem().equals("Low")) {
            patient.setOrientationH("FALSE");
            patient.setOrientationL("TRUE");
        } else if (Orientation_box.getSelectedItem().equals("None")) {
            patient.setOrientationH("FALSE");
            patient.setOrientationL("FALSE");
        }
        if (Bradykinesia_box.getSelectedItem().equals("High")) {
            patient.setBradykinesiaH("TRUE");
            patient.setBradykinesiaL("FALSE");
            patient.setBradykinesiaM("FALSE");
        } else if (Bradykinesia_box.getSelectedItem().equals("Low")) {
            patient.setBradykinesiaH("FALSE");
            patient.setBradykinesiaL("TRUE");
            patient.setBradykinesiaM("FALSE");
        } else if (Bradykinesia_box.getSelectedItem().equals("Medium")) {
            patient.setBradykinesiaH("FALSE");
            patient.setBradykinesiaL("FALSE");
            patient.setBradykinesiaM("TRUE");
        } else if (Bradykinesia_box.getSelectedItem().equals("None")) {
            patient.setBradykinesiaH("FALSE");
            patient.setBradykinesiaL("FALSE");
            patient.setBradykinesiaM("FALSE");
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
        NoCoordination_check = new javax.swing.JCheckBox();
        NoStand_check = new javax.swing.JCheckBox();
        Stiffness_check = new javax.swing.JCheckBox();
        LossBalance_check = new javax.swing.JCheckBox();
        Tremor_check = new javax.swing.JCheckBox();
        StraightWalk_check = new javax.swing.JCheckBox();
        Orientation_label = new javax.swing.JLabel();
        Orientation_box = new javax.swing.JComboBox<>();
        Bradykinesia_label = new javax.swing.JLabel();
        Bradykinesia_box = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1260, 777));

        jLabel1.setText("Motor Symptoms");

        jLabel2.setText("Please, mark the present motor symptoms:");

        NoCoordination_check.setText("Lack of coordination");

        NoStand_check.setText("Unable to stand/walk ");

        Stiffness_check.setText("Stiffness");

        LossBalance_check.setText("Loss of balance");

        Tremor_check.setText("Tremor");

        StraightWalk_check.setText("Unable to walk straight");

        Orientation_label.setText("Orientation imparment");

        Orientation_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Low", "High" }));

        Bradykinesia_label.setText("Bradykinesia");

        Bradykinesia_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Low", "Medium", "High" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(638, 638, 638)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NoCoordination_check)
                                    .addComponent(NoStand_check)
                                    .addComponent(StraightWalk_check))
                                .addGap(174, 174, 174)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LossBalance_check)
                                            .addComponent(Tremor_check))
                                        .addGap(174, 174, 174)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Orientation_label)
                                            .addComponent(Bradykinesia_label))
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Bradykinesia_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Orientation_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(Stiffness_check))))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoCoordination_check)
                    .addComponent(LossBalance_check)
                    .addComponent(Orientation_label)
                    .addComponent(Orientation_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoStand_check)
                            .addComponent(Tremor_check)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bradykinesia_label)
                            .addComponent(Bradykinesia_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StraightWalk_check)
                    .addComponent(Stiffness_check))
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bradykinesia_box;
    private javax.swing.JLabel Bradykinesia_label;
    private javax.swing.JCheckBox LossBalance_check;
    private javax.swing.JCheckBox NoCoordination_check;
    private javax.swing.JCheckBox NoStand_check;
    private javax.swing.JComboBox<String> Orientation_box;
    private javax.swing.JLabel Orientation_label;
    private javax.swing.JCheckBox Stiffness_check;
    private javax.swing.JCheckBox StraightWalk_check;
    private javax.swing.JCheckBox Tremor_check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
