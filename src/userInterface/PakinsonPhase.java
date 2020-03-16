/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import javax.swing.JOptionPane;
import static userInterface.PatientInfo.patient;

/**
 *
 * @author Lucia
 */
public class PakinsonPhase extends javax.swing.JFrame {

    /**
     * Creates new form PakinsonPhase
     */
    public PakinsonPhase() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title_text = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LossPhysicalAbilities_check = new javax.swing.JCheckBox();
        Submit_button = new javax.swing.JButton();
        tremor_title = new javax.swing.JLabel();
        Tremor_box = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title_text.setText("Parkinson specific symptoms");

        jLabel2.setText("Select the present symptoms:");

        LossPhysicalAbilities_check.setText("Loss of physical abilities (like swallowing, sitting or talking)");
        LossPhysicalAbilities_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LossPhysicalAbilities_checkActionPerformed(evt);
            }
        });

        Submit_button.setText("Submit");
        Submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_buttonActionPerformed(evt);
            }
        });

        tremor_title.setText("Tremor");

        Tremor_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Unilateral", "Bilateral" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit_button)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LossPhysicalAbilities_check)
                            .addComponent(jLabel2)
                            .addComponent(title_text)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(tremor_title)
                        .addGap(42, 42, 42)
                        .addComponent(Tremor_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(title_text)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(LossPhysicalAbilities_check)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tremor_title)
                    .addComponent(Tremor_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(Submit_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LossPhysicalAbilities_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LossPhysicalAbilities_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LossPhysicalAbilities_checkActionPerformed

    private void Submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_buttonActionPerformed
        /*LossPhysicalAbilities_check = new javax.swing.JCheckBox();
        Submit_button = new javax.swing.JButton();
        tremor_title = new javax.swing.JLabel();
        Tremor_box = new javax.swing.JComboBox<>();*/
        Boolean lossPhysicalAbilities = LossPhysicalAbilities_check.isSelected();
        if (lossPhysicalAbilities) {
            patient.setLossPhysicalAbilities("TRUE");
        } else {
            patient.setLossPhysicalAbilities("FALSE");
        }
        String tremor = (String) Tremor_box.getSelectedItem();
        if (tremor.matches("Unilateral")) {
            patient.setTremorUni(tremor);
            patient.setTremorBi("None");
        } else if (tremor.matches("Bilateral")) {
            patient.setTremorUni("None");
            patient.setTremorBi(tremor);
        } else {
            patient.setTremorUni(tremor);
            patient.setTremorBi(tremor);
        }
        
        dispose();
        JOptionPane.showMessageDialog(null, "Diagnosis is: patient has PARKINSON PHASE ");
    }//GEN-LAST:event_Submit_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(PakinsonPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PakinsonPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PakinsonPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PakinsonPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PakinsonPhase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox LossPhysicalAbilities_check;
    private javax.swing.JButton Submit_button;
    private javax.swing.JComboBox<String> Tremor_box;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel title_text;
    private javax.swing.JLabel tremor_title;
    // End of variables declaration//GEN-END:variables
}
