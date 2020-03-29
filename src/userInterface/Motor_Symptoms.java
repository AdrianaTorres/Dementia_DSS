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

        jPanel5 = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        iconoMarca1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        setBackground(new java.awt.Color(225, 238, 238));
        setMinimumSize(new java.awt.Dimension(853, 375));
        setPreferredSize(new java.awt.Dimension(1260, 777));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Please, mark the present motor symptoms:");

        NoCoordination_check.setBackground(new java.awt.Color(225, 238, 238));
        NoCoordination_check.setText("Lack of coordination");

        NoStand_check.setBackground(new java.awt.Color(225, 238, 238));
        NoStand_check.setText("Unable to stand/walk ");

        Stiffness_check.setBackground(new java.awt.Color(225, 238, 238));
        Stiffness_check.setText("Stiffness");

        LossBalance_check.setBackground(new java.awt.Color(225, 238, 238));
        LossBalance_check.setText("Loss of balance");

        Tremor_check.setBackground(new java.awt.Color(225, 238, 238));
        Tremor_check.setText("Tremor");

        StraightWalk_check.setBackground(new java.awt.Color(225, 238, 238));
        StraightWalk_check.setText("Unable to walk straight");

        Orientation_label.setText("Orientation imparment");

        Orientation_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Low", "High" }));

        Bradykinesia_label.setText("Bradykinesia");

        Bradykinesia_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Low", "Medium", "High" }));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoMarca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/dmentiapp_logo1.png"))); // NOI18N
        jPanel1.add(iconoMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 320, 110));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Motor Symptoms");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Orientation_label)
                                .addComponent(Bradykinesia_label))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Orientation_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bradykinesia_box, 0, 111, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(50, 50, 50)
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
                                    .addComponent(StraightWalk_check)
                                    .addGap(91, 91, 91)
                                    .addComponent(Stiffness_check)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NoCoordination_check)
                                        .addGap(10, 10, 10))
                                    .addComponent(NoStand_check, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LossBalance_check)
                                    .addComponent(Tremor_check))))))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoCoordination_check)
                            .addComponent(LossBalance_check))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoStand_check)
                            .addComponent(Tremor_check))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StraightWalk_check)
                            .addComponent(Stiffness_check))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(Orientation_label)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Orientation_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bradykinesia_label)
                            .addComponent(Bradykinesia_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
    private javax.swing.JLabel iconoMarca1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
