/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import db.interfaces.DBManager;
import db.sqlite.SQLiteManager;
import dementia_dss.CLIPS_connection;
import dementia_dss.Doctor;
import dementia_dss.Patient;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class Principal_Window extends javax.swing.JFrame implements ActionListener {

    DBManager dbManager = new SQLiteManager();
    public Patient patient = new Patient();
    public Doctor doctor = new Doctor();

    //JPanels:
    Open_Patient openPatient;
    Patient_Info patientInfo;
    General_Symptoms generalSymptoms;
    Motor_Symptoms motorSymptoms;
    Other_Pathologies otherPathologies;
    Parkinson_Phase parkinsonPhase;
    Alzheimer_Phase alzheimerPhase;

    Boolean parkinsonPhaseWind = false;
    Boolean alzheimerPhaseWind = false;

    // JButtons control:
    Boolean n_button = false;
    Boolean b_button = false;
    Boolean s_button = false;
    Boolean alt_button = false;

    /**
     * Creates new form Principal_Window
     */
    public Principal_Window(DBManager dbManager, Doctor doctor) {
        this.dbManager = dbManager;
        this.doctor = doctor;
        this.setVisible(true);
        initComponents();

        openPatient = new Open_Patient(patient);
        patientInfo = new Patient_Info(patient);
        generalSymptoms = new General_Symptoms(patient, doctor);
        motorSymptoms = new Motor_Symptoms(patient);
        otherPathologies = new Other_Pathologies(patient);
        parkinsonPhase = new Parkinson_Phase(patient);
        alzheimerPhase = new Alzheimer_Phase(patient);

        this.setTitle("DmentiApp 21.04");

        /*Next_Button.setMnemonic(KeyEvent.VK_N);
        Back_Button.setMnemonic(KeyEvent.VK_B);
        Submit_Button.setMnemonic(KeyEvent.VK_S);*/
        openPatient.setVisible(true);
        patientInfo.setVisible(false);
        generalSymptoms.setVisible(false);
        motorSymptoms.setVisible(false);
        otherPathologies.setVisible(false);
        alzheimerPhase.setVisible(false);
        parkinsonPhase.setVisible(false);
        Buttons_Panel.setVisible(true);

        openPatient.setDbManager(this.dbManager);
        patientInfo.setDbManager(this.dbManager);
        generalSymptoms.setDbManager(this.dbManager);
        motorSymptoms.setDbManager(this.dbManager);
        otherPathologies.setDbManager(this.dbManager);
        alzheimerPhase.setDbManager(this.dbManager);
        parkinsonPhase.setDbManager(this.dbManager);

        PrincipalPanel.add(openPatient, BorderLayout.CENTER);
        pack();
        this.setLocationRelativeTo(null);
        manageButtons();
    }

    private void manageButtons() {
        if (openPatient.isVisible()) {
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

//    public void generateMessageDialog() {
//        JFrame messageDialog = new JFrame();
//        JButton button = new JButton();
//        JLabel message = new JLabel();
//
//        messageDialog.setTitle("Warning!");
//
//        message.setText("Please, enter the data before continuing.");
//        //message.setSize(250, 300);
//        messageDialog.add(message, BorderLayout.CENTER);
//        //messageDialog.setLocation(null);
//
//        //messageDialog.add(message);
//
//        button.setText("OK");
//        button.setLocation(10, 10);
//        messageDialog.add(message, BorderLayout.NORTH);
//        messageDialog.add(button, BorderLayout.SOUTH);
//        //messageDialog.add(button);
//
//        //messageDialog.setBounds(300, 300, 150, 100);
//        //messageDialog.setSize(20, 15);
//        messageDialog.setLocation(300, 400);
//        messageDialog.pack();
//        messageDialog.setVisible(true);
//
//        button.addActionListener(new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                messageDialog.dispose();
//            }
//        });
//    }
    public Boolean validateInt(int numero) {
        String cadena = Integer.toString(numero);
        if (cadena.matches("[0-9]+")) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean validateNIF(String NIF) {
        if (NIF.matches("\\d{8}[A-HJ-NP-TV-Z]")) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean validateString(String string) {
        if (string.matches("[A-Za-z\\s]+")) {
            return true;
        } else {
            return false;
        }
    }

    public void backButtonActions() {
        if (patientInfo.isVisible()) {
            if ((Back_Button.isEnabled()) && (patientInfo.checkEmptyFields())) {
                JOptionPane.showMessageDialog(null, "Please, enter the data before continuing ");
            } else {
                patientInfo.SaveInfo();
                openPatient.setVisible(true);
                patientInfo.setVisible(false);
                generalSymptoms.setVisible(false);
                motorSymptoms.setVisible(false);
                otherPathologies.setVisible(false);

                PrincipalPanel.removeAll();
                PrincipalPanel.repaint();
                PrincipalPanel.add(openPatient, BorderLayout.CENTER);
            }
        } else if (generalSymptoms.isVisible()) {
            generalSymptoms.SaveInfo();
            patientInfo.setVisible(true);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(patientInfo, BorderLayout.CENTER);

        } else if (motorSymptoms.isVisible()) {
            motorSymptoms.SaveInfo();
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(true);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(generalSymptoms, BorderLayout.CENTER);

        } else if (otherPathologies.isVisible()) {
            otherPathologies.SaveInfo();
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(true);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(motorSymptoms, BorderLayout.CENTER);

        } else if (alzheimerPhase.isVisible()) {
            alzheimerPhase.SaveInfo();
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
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(true);
            parkinsonPhase.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(otherPathologies, BorderLayout.CENTER);
        }
    }

    public void nextButtonActions() {
        if (openPatient.isVisible()) {

            if ((Back_Button.isEnabled()) && (openPatient.checkEmptyNIF())) {
                JOptionPane.showMessageDialog(null, "Please, enter the data before continuing. ");
            } else {
                openPatient.SaveInfo();
                if (validateNIF(patient.getId())) {
                    openPatient.setVisible(false);
                    patientInfo.setVisible(true);
                    generalSymptoms.setVisible(false);
                    motorSymptoms.setVisible(false);
                    otherPathologies.setVisible(false);

                    PrincipalPanel.removeAll();
                    PrincipalPanel.repaint();
                    PrincipalPanel.add(patientInfo, BorderLayout.CENTER);

                } else {
                    JOptionPane.showMessageDialog(null, "Please, enter a valid NIF. It should have 8 numbers followed by an uppercase letter. ");
                }
            }
        } else if (patientInfo.isVisible()) {
            if ((Next_Button.isEnabled()) && (patientInfo.checkEmptyFields())) {
                JOptionPane.showMessageDialog(null, "Please, enter a 'Name' and 'Age'\n"
                        + "           before continuing.");
            } else {
                patientInfo.SaveInfo();
                if (validateInt(patient.getAge()) && patient.getAge() != 0 && validateString(patient.getName())) {
                    patientInfo.setVisible(false);
                    generalSymptoms.setVisible(true);
                    motorSymptoms.setVisible(false);
                    otherPathologies.setVisible(false);

                    PrincipalPanel.removeAll();
                    PrincipalPanel.repaint();
                    PrincipalPanel.add(generalSymptoms, BorderLayout.CENTER);
                }

            }
        } else if (generalSymptoms.isVisible()) {
            generalSymptoms.SaveInfo();
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(true);
            otherPathologies.setVisible(false);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(motorSymptoms, BorderLayout.CENTER);

        } else if (motorSymptoms.isVisible()) {
            motorSymptoms.SaveInfo();
            patientInfo.setVisible(false);
            generalSymptoms.setVisible(false);
            motorSymptoms.setVisible(false);
            otherPathologies.setVisible(true);

            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.add(otherPathologies, BorderLayout.CENTER);
        }
    }

    public void submitButtonActions() {
        if (otherPathologies.isVisible()) {
            otherPathologies.SaveInfo();

            CLIPS_connection clipsConnect = new CLIPS_connection();
            clipsConnect.createPatientAssertion(patient);

            if (patient.getNoDementia()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has NO DEMENTIA.");

                if (openPatient.isNew(patient.getId())) {
                    System.out.println("Paciente nuevo de ID: " + patient.getId());
                    dbManager.getPatientManager().newPatient(patient);
                } else {
                    System.out.println("Paciente viejo de ID:" + patient.getId());
                    dbManager.getPatientManager().modifyPatient(patient);
                }
                new Final_Window(dbManager, doctor);
                dispose();

            } else if (patient.getAlzheimer()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has ALZHEIMER DISEASE.");
                otherPathologies.setVisible(false);
                alzheimerPhaseWind = true;
                alzheimerPhase.setVisible(true);

                PrincipalPanel.removeAll();
                PrincipalPanel.repaint();
                PrincipalPanel.add(alzheimerPhase, BorderLayout.CENTER);

            } else if (patient.getParkinson()) {
                JOptionPane.showMessageDialog(null, "Diagnosis is: patient has PARKINSON DISEASE.");
                otherPathologies.setVisible(false);
                parkinsonPhaseWind = true;
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

                if (openPatient.isNew(patient.getId())) {
                    System.out.println("Paciente nuevo de ID: " + patient.getId());
                    dbManager.getPatientManager().newPatient(patient);
                } else {
                    System.out.println("Paciente viejo de ID:" + patient.getId());
                    dbManager.getPatientManager().modifyPatient(patient);
                }
                new Final_Window(dbManager, doctor);
                dispose();

            }
            pack();
            manageButtons();

        } else {
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

            if (parkinsonPhase.isVisible()) {
                /*parkinsonPhase.setVisible(true);

                PrincipalPanel.removeAll();
                PrincipalPanel.repaint();
                PrincipalPanel.add(parkinsonPhase, BorderLayout.CENTER);
                pack();
                 */
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
            if (openPatient.isNew(patient.getId())) {
                System.out.println("Paciente nuevo de ID: " + patient.getId());
                dbManager.getPatientManager().newPatient(patient);
            } else {
                System.out.println("Paciente viejo de ID:" + patient.getId());
                dbManager.getPatientManager().modifyPatient(patient);
            }

            new Final_Window(dbManager, doctor);
            dispose();

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
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        Buttons_Panel.setBackground(new java.awt.Color(225, 238, 238));
        Buttons_Panel.setPreferredSize(new java.awt.Dimension(906, 35));

        Submit_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Submit_Button.setText("Submit");
        Submit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_ButtonActionPerformed(evt);
            }
        });
        Submit_Button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Submit_ButtonKeyPressed(evt);
            }
        });

        Next_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Next_Button.setText("Next");
        Next_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_ButtonActionPerformed(evt);
            }
        });
        Next_Button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Next_ButtonKeyPressed(evt);
            }
        });

        Back_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Back_Button.setText("Back");
        Back_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });
        Back_Button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Back_ButtonKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Back_ButtonKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout Buttons_PanelLayout = new javax.swing.GroupLayout(Buttons_Panel);
        Buttons_Panel.setLayout(Buttons_PanelLayout);
        Buttons_PanelLayout.setHorizontalGroup(
            Buttons_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Buttons_PanelLayout.createSequentialGroup()
                .addContainerGap(567, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Next_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        Buttons_PanelLayout.setVerticalGroup(
            Buttons_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buttons_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Next_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Buttons_Panel, java.awt.BorderLayout.PAGE_END);

        PrincipalPanel.setBackground(new java.awt.Color(225, 238, 238));
        PrincipalPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PrincipalPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Next_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_ButtonActionPerformed
        // Works when button is clicked with mouse.
        nextButtonActions();
        pack();
        manageButtons();
    }//GEN-LAST:event_Next_ButtonActionPerformed

    private void Submit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_ButtonActionPerformed
        // Works when button is clicked with mouse.
        submitButtonActions();
    }//GEN-LAST:event_Submit_ButtonActionPerformed

    private void Back_ButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Back_ButtonKeyPressed
        // Works when ALT+B is typed.
        System.out.println("Se ha presionado B" + evt);
        if (evt.getKeyCode() == KeyEvent.VK_B) {
            backButtonActions();
            pack();
            manageButtons();
        }
    }//GEN-LAST:event_Back_ButtonKeyPressed

    private void Next_ButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Next_ButtonKeyPressed
        // Works when ALT+N is typed.
        if (evt.getKeyCode() == KeyEvent.VK_N) {
            nextButtonActions();
            pack();
            manageButtons();
        }
    }//GEN-LAST:event_Next_ButtonKeyPressed

    private void Submit_ButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Submit_ButtonKeyPressed
        // Works when ALT+S is typed.
        if (evt.getKeyCode() == KeyEvent.VK_S) {
            submitButtonActions();
        }
    }//GEN-LAST:event_Submit_ButtonKeyPressed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        // Works when button is clicked with mouse.
        backButtonActions();
        pack();
        manageButtons();
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Back_ButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Back_ButtonKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Back_ButtonKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    /**
     * @param args the command line arguments
     */
    // ESTO ESTÁ COMENTADO PORQUE ES UNA PRUEBA. EN PRINCIPIO EL ÚNICO 'MAIN' QUE DEBERÍA HABER ES EN LA CLASE DEMENTIA_DSS QUE ES LA PRINCIPAL DEL PROYECTO Y DESDE LA QUE SE EJECUTA TODO.
    /*public static void main(String args[]) {*/
 /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
 /*try {
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
        }*/
    //</editor-fold>

    /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Window().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JPanel Buttons_Panel;
    private javax.swing.JButton Next_Button;
    private javax.swing.JPanel PrincipalPanel;
    private javax.swing.JButton Submit_Button;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
