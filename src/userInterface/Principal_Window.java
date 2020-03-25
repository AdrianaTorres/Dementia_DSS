/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import dementia_dss.CLIPS_connection;
import dementia_dss.Patient;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class Principal_Window extends javax.swing.JFrame implements ActionListener {

    public Patient patient = new Patient();

    //JPanels:
    Initial_Description description = new Initial_Description();
    Patient_Info patientInfo = new Patient_Info(patient);
    General_Symptoms generalSymptoms = new General_Symptoms(patient);
    Motor_Symptoms motorSymptoms = new Motor_Symptoms(patient);
    Other_Pathologies otherPathologies = new Other_Pathologies(patient);
    Parkinson_Phase parkinsonPhase = new Parkinson_Phase(patient);
    Alzheimer_Phase alzheimerPhase = new Alzheimer_Phase(patient);

    /**
     * Creates new form Principal_Window
     */
    public Principal_Window() {
        initComponents();

        description.setVisible(true);
        patientInfo.setVisible(false);
        generalSymptoms.setVisible(false);
        motorSymptoms.setVisible(false);
        otherPathologies.setVisible(false);
        alzheimerPhase.setVisible(false);
        parkinsonPhase.setVisible(false);
        Buttons_Panel.setVisible(true);

        PrincipalPanel.add(description, BorderLayout.CENTER);
        pack();

        manageButtons();
    }

    public void manageButtons() {
        if (description.isVisible()) {
            Back_Button.setEnabled(false);
            Next_Button.setEnabled(true);
            Submit_Button.setEnabled(false);
        } else if (patientInfo.isVisible() || generalSymptoms.isVisible() || motorSymptoms.isVisible()) {
            Back_Button.setEnabled(true);
            Next_Button.setEnabled(true);
            Submit_Button.setEnabled(false);
        } else if (otherPathologies.isVisible() || alzheimerPhase.isVisible() || parkinsonPhase.isVisible()) {
            Back_Button.setEnabled(true);
            Next_Button.setEnabled(false);
            Submit_Button.setEnabled(true);
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

        Buttons_Panel = new javax.swing.JPanel();
        Submit_Button = new javax.swing.JButton();
        Next_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        PrincipalPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Submit_Button.setText("Submit");
        Submit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_ButtonActionPerformed(evt);
            }
        });

        Next_Button.setText("Next");
        Next_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_ButtonActionPerformed(evt);
            }
        });

        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Buttons_PanelLayout = new javax.swing.GroupLayout(Buttons_Panel);
        Buttons_Panel.setLayout(Buttons_PanelLayout);
        Buttons_PanelLayout.setHorizontalGroup(
            Buttons_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Buttons_PanelLayout.createSequentialGroup()
                .addContainerGap(903, Short.MAX_VALUE)
                .addComponent(Back_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Next_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit_Button)
                .addGap(10, 10, 10))
        );
        Buttons_PanelLayout.setVerticalGroup(
            Buttons_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buttons_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Buttons_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_Button)
                    .addComponent(Next_Button)
                    .addComponent(Back_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Buttons_Panel, java.awt.BorderLayout.PAGE_END);

        PrincipalPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PrincipalPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Next_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_ButtonActionPerformed
        if (description.isVisible()) {
            description.setVisible(false);
            patientInfo.setVisible(true);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(patientInfo, BorderLayout.CENTER);

        } else if (patientInfo.isVisible()) {
            patientInfo.SaveInfo();
            description.setVisible(false);
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(true);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(generalSymptoms, BorderLayout.CENTER);

        } else if (generalSymptoms.isVisible()) {
            generalSymptoms.SaveInfo();
            description.setVisible(false);
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(true);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(motorSymptoms, BorderLayout.CENTER);

        } else if (motorSymptoms.isVisible()) {
            motorSymptoms.SaveInfo();
            description.setVisible(false);
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(true);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(otherPathologies, BorderLayout.CENTER);
        }

        pack();
        manageButtons();
    }//GEN-LAST:event_Next_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        if (patientInfo.isVisible()) {
            patientInfo.SaveInfo();
            description.setVisible(true);
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(description, BorderLayout.CENTER);

        } else if (generalSymptoms.isVisible()) {
            generalSymptoms.SaveInfo();
            description.setVisible(false);
            patientInfo.setVisible(true);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(patientInfo, BorderLayout.CENTER);

        } else if (motorSymptoms.isVisible()) {
            motorSymptoms.SaveInfo();
            description.setVisible(false);
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(true);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(generalSymptoms, BorderLayout.CENTER);

        } else if (otherPathologies.isVisible()) {
            otherPathologies.SaveInfo();
            description.setVisible(false);
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(true);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(motorSymptoms, BorderLayout.CENTER);

        } else if (alzheimerPhase.isVisible()) {
            alzheimerPhase.SaveInfo();
            description.setVisible(false);
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(true);
            alzheimerPhase.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(otherPathologies, BorderLayout.CENTER);

        } else if (parkinsonPhase.isVisible()) {
            parkinsonPhase.SaveInfo();
            description.setVisible(false);
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(true);
            parkinsonPhase.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(otherPathologies, BorderLayout.CENTER);
        }
        pack();
        manageButtons();
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Submit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_ButtonActionPerformed
        if (otherPathologies.isVisible()) {
            otherPathologies.SaveInfo();

            CLIPS_connection clipsConnect = new CLIPS_connection();
            clipsConnect.createPatientAssertion(patient);

            if (patient.getNoDementia()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has NO DEMENTIA.");
            } else if (patient.getAlzheimer()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has ALZHEIMER DISEASE.");
                otherPathologies.setVisible(false);
                alzheimerPhase.setVisible(true);

                PrincipalPanel.removeAll();
                PrincipalPanel.repaint();
                PrincipalPanel.add(alzheimerPhase, BorderLayout.CENTER);

            } else if (patient.getParkinson()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has PARKINSON DISEASE.");
                otherPathologies.setVisible(false);
                parkinsonPhase.setVisible(true);

                PrincipalPanel.removeAll();
                PrincipalPanel.repaint();
                PrincipalPanel.add(parkinsonPhase, BorderLayout.CENTER);

            } else if (patient.getVascularD()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has VASCULAR DEMENTIA.");

                if (patient.getVascularP1()) {
                    JOptionPane.showMessageDialog(null, "Diagnosis is: patient has Vascular dementia PHASES 1-3.");
                } else if (patient.getVascularP2()) {
                    JOptionPane.showMessageDialog(null, "Diagnosis is: patient has Vascular dementia PHASES 4-5.");
                } else if (patient.getVascularP3()) {
                    JOptionPane.showMessageDialog(null, "Diagnosis is: patient has Vascular dementia PHASES 6-7.");
                }
            }
            pack();
            manageButtons();
        }
        if (alzheimerPhase.isVisible()) {
            alzheimerPhase.SaveInfo();

            CLIPS_connection clipsConnect = new CLIPS_connection();
            clipsConnect.createPatientAssertion(patient);

            if (patient.getAlzheimerP1()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has Alzheimer disease PHASE 1.");
            } else if (patient.getAlzheimerP2()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has Alzheimer disease PHASE 2.");
            } else if (patient.getAlzheimerP3()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has Alzheimer disease PHASE 3.");
            }

            manageButtons();
        }

        if (parkinsonPhase.isVisible() && Submit_Button.isSelected()) {
            parkinsonPhase.SaveInfo();

            CLIPS_connection clipsConnect = new CLIPS_connection();
            clipsConnect.createPatientAssertion(patient);

            if (patient.getParkinsonP1()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has Parkinson disease PHASES 1-2.");
            } else if (patient.getParkinsonP2()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has Parkinson disease PHASES 3-4.");
            } else if (patient.getParkinsonP3()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has Parkinson disease PHASE 5.");
            }

            manageButtons();
        }
    }//GEN-LAST:event_Submit_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JPanel Buttons_Panel;
    private javax.swing.JButton Next_Button;
    private javax.swing.JPanel PrincipalPanel;
    private javax.swing.JButton Submit_Button;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
