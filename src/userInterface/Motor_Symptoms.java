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
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Motor Symptoms");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 21, -1, -1));

        jLabel2.setText("Please, mark the present motor symptoms:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 68, -1, -1));

        NoCoordination_check.setText("Lack of coordination");
        add(NoCoordination_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        NoStand_check.setText("Unable to stand/walk ");
        add(NoStand_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 253, -1, -1));

        Stiffness_check.setText("Stiffness");
        add(Stiffness_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 353, -1, -1));

        LossBalance_check.setText("Loss of balance");
        add(LossBalance_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 150, -1, -1));

        Tremor_check.setText("Tremor");
        add(Tremor_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 253, -1, -1));

        StraightWalk_check.setText("Unable to walk straight");
        add(StraightWalk_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 353, -1, -1));

        Orientation_label.setText("Orientation imparment");
        add(Orientation_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 154, -1, -1));

        Orientation_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Low", "High" }));
        add(Orientation_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1111, 151, 111, -1));

        Bradykinesia_label.setText("Bradykinesia");
        add(Bradykinesia_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 248, -1, -1));

        Bradykinesia_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Low", "Medium", "High" }));
        add(Bradykinesia_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1111, 245, -1, -1));
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
