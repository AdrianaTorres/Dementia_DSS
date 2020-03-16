/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import static userInterface.PatientInfo.patient;

/**
 *
 * @author adria
 */
public class MotorSymptoms extends javax.swing.JFrame {

    /**
     * Creates new form MotorSymptoms
     */
    public MotorSymptoms() {
        initComponents();
        setVisible(true);
        if (patient.getLackCoord() != null) {
            NoCoordination_check.setSelected(true);
        }
        if (patient.getStandWalk() != null) {
            NoStand_check.setSelected(true);
        }
        if (patient.getStiffness() != null) {
            Stiffness_check.setSelected(true);
        }
        if (patient.getLossBalance() != null) {
            LossBalance_check.setSelected(true);
        }
        if (patient.getWalkStraight() != null) {
            StraightWalk_check.setSelected(true);
        }
        if (patient.getTremor() != null) {
            Tremor_check.setSelected(true);
        }
        if ((patient.getOrientationL().matches("None")) && (patient.getOrientationH().matches("None"))) {
            Orientation_box.setSelectedIndex(0);
        }
        if (patient.getOrientationL() != null) {
            Orientation_box.setSelectedIndex(1);
        }
        if (patient.getOrientationH() != null) {
            Orientation_box.setSelectedIndex(2);
        }
        if ((patient.getBradykinesiaL().matches("None")) && (patient.getBradykinesiaM().matches("None")) && (patient.getBradykinesiaH().matches("None"))) {
            Bradykinesia_box.setSelectedIndex(0);
        }
        if (patient.getBradykinesiaL() != null) {
            Bradykinesia_box.setSelectedIndex(1);
        }
        if (patient.getBradykinesiaM() != null) {
            Bradykinesia_box.setSelectedIndex(2);
        }
        if (patient.getBradykinesiaH() != null) {
            Bradykinesia_box.setSelectedIndex(3);
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

        NoCoordination_check = new javax.swing.JCheckBox();
        NoStand_check = new javax.swing.JCheckBox();
        Stiffness_check = new javax.swing.JCheckBox();
        LossBalance_check = new javax.swing.JCheckBox();
        StraightWalk_check = new javax.swing.JCheckBox();
        Tremor_check = new javax.swing.JCheckBox();
        Orientation_box = new javax.swing.JComboBox<>();
        Bradykinesia_box = new javax.swing.JComboBox<>();
        Orientation_label = new javax.swing.JLabel();
        Bradykinesia_label = new javax.swing.JLabel();
        SymptomsPresent_motor = new javax.swing.JLabel();
        Motor_symptoms = new javax.swing.JLabel();
        Next_motor = new javax.swing.JButton();
        Back_motor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NoCoordination_check.setText("Lack of coordination");
        NoCoordination_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoCoordination_checkActionPerformed(evt);
            }
        });

        NoStand_check.setText("Unable to stand/walk");
        NoStand_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoStand_checkActionPerformed(evt);
            }
        });

        Stiffness_check.setText("Stiffness");

        LossBalance_check.setText("Loss of balance");

        StraightWalk_check.setText("Unable to walk straight");

        Tremor_check.setText("Tremor");

        Orientation_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Low", "High" }));
        Orientation_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Orientation_boxActionPerformed(evt);
            }
        });

        Bradykinesia_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Low", "Medium", "High" }));

        Orientation_label.setText("Orientation impairment");

        Bradykinesia_label.setText("Bradykinesia");

        SymptomsPresent_motor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        SymptomsPresent_motor.setText("Select the present symptoms:");

        Motor_symptoms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Motor_symptoms.setText("Motor symptoms");

        Next_motor.setText("Next");
        Next_motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_motorActionPerformed(evt);
            }
        });

        Back_motor.setText("Back");
        Back_motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_motorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SymptomsPresent_motor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Motor_symptoms)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoCoordination_check)
                            .addComponent(NoStand_check)
                            .addComponent(Stiffness_check)
                            .addComponent(LossBalance_check))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Orientation_label)
                                    .addComponent(Bradykinesia_label))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bradykinesia_box, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Orientation_box, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(StraightWalk_check)
                            .addComponent(Tremor_check))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_motor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Next_motor)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Motor_symptoms)
                .addGap(18, 18, 18)
                .addComponent(SymptomsPresent_motor)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoCoordination_check)
                    .addComponent(StraightWalk_check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoStand_check)
                    .addComponent(Tremor_check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stiffness_check)
                    .addComponent(Orientation_label)
                    .addComponent(Orientation_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bradykinesia_label)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LossBalance_check)
                        .addComponent(Bradykinesia_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next_motor)
                    .addComponent(Back_motor))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoCoordination_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoCoordination_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoCoordination_checkActionPerformed

    private void NoStand_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoStand_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoStand_checkActionPerformed

    private void Orientation_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Orientation_boxActionPerformed
        // TODO add your handling code here:
        PatientInfo.patient.getAge();
    }//GEN-LAST:event_Orientation_boxActionPerformed

    private void Next_motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_motorActionPerformed
        Boolean noCoordination = NoCoordination_check.isSelected();
        if (noCoordination) {
            patient.setLackCoord("TRUE");
        } else {
            patient.setLackCoord("FALSE");
        }
        Boolean noStand = NoStand_check.isSelected();
        if (noStand) {
            patient.setStandWalk("TRUE");
        } else {
            patient.setStandWalk("FALSE");
        }
        Boolean stiffness = Stiffness_check.isSelected();
        if (stiffness) {
            patient.setStiffness("TRUE");
        } else {
            patient.setStiffness("FALSE");
        }
        Boolean lossBalance = LossBalance_check.isSelected();
        if (lossBalance) {
            patient.setLossBalance("TRUE");
        } else {
            patient.setLossBalance("FALSE");
        }
        Boolean straightWalk = StraightWalk_check.isSelected();
        if (straightWalk) {
            patient.setWalkStraight("TRUE");
        } else {
            patient.setWalkStraight("FALSE");
        }
        Boolean tremor = Tremor_check.isSelected();
        if (tremor) {
            patient.setTremor("TRUE");
        } else {
            patient.setTremor("FALSE");
        }
        String orientation = (String) Orientation_box.getSelectedItem();
        if (orientation.matches("Low")) {
            patient.setOrientationL(orientation);
            patient.setOrientationH("None");
        } else if (orientation.matches("High")) {
            patient.setOrientationL("None");
            patient.setOrientationH(orientation);
        } else {
            patient.setOrientationL(orientation);
            patient.setOrientationH(orientation);
        }
        String bradykinesia = (String) Bradykinesia_box.getSelectedItem();
        if (bradykinesia.matches("Low")) {
            patient.setBradykinesiaL(bradykinesia);
            patient.setBradykinesiaM("None");
            patient.setBradykinesiaH("None");
        } else if (bradykinesia.matches("Medium")) {
            patient.setBradykinesiaL("None");
            patient.setBradykinesiaM(orientation);
            patient.setBradykinesiaH("None");
        } else if (bradykinesia.matches("High")) {
            patient.setBradykinesiaL("None");
            patient.setBradykinesiaM("None");
            patient.setOrientationH(orientation);
        } else {
            patient.setBradykinesiaL("None");
            patient.setBradykinesiaM("None");
            patient.setBradykinesiaH("None");
        }
        
        dispose();
        new OtherPathologies();
    }//GEN-LAST:event_Next_motorActionPerformed

    private void Back_motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_motorActionPerformed
        dispose();
        new GeneralSymptoms();
    }//GEN-LAST:event_Back_motorActionPerformed

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
            java.util.logging.Logger.getLogger(MotorSymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorSymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorSymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorSymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorSymptoms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_motor;
    private javax.swing.JComboBox<String> Bradykinesia_box;
    private javax.swing.JLabel Bradykinesia_label;
    private javax.swing.JCheckBox LossBalance_check;
    private javax.swing.JLabel Motor_symptoms;
    private javax.swing.JButton Next_motor;
    private javax.swing.JCheckBox NoCoordination_check;
    private javax.swing.JCheckBox NoStand_check;
    private javax.swing.JComboBox<String> Orientation_box;
    private javax.swing.JLabel Orientation_label;
    private javax.swing.JCheckBox Stiffness_check;
    private javax.swing.JCheckBox StraightWalk_check;
    private javax.swing.JLabel SymptomsPresent_motor;
    private javax.swing.JCheckBox Tremor_check;
    // End of variables declaration//GEN-END:variables
}
