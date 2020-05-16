/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import db.interfaces.DBManager;
import db.sqlite.SQLiteManager;
import dementia_dss.Patient;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class Open_Patient extends javax.swing.JPanel {

    DBManager dbManager = new SQLiteManager();
    Patient patient = new Patient();

    /**
     * Creates new form Open_Patient
     */
    public Open_Patient() {
        this.setVisible(true);
        initComponents();
    }

    public void setDbManager(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public Open_Patient(Patient patient) {
        this.patient = patient;
        this.setVisible(true);
        initComponents();

        if (patient != null) {
            if (!patient.getId().equalsIgnoreCase("")) {
                NIF_enter.setText(patient.getId());
            }
        }
    }

    public void SaveInfo() {
        if (NIF_enter.getText() != null && validateNIF(NIF_enter.getText())) {
            patient.setId(NIF_enter.getText());
            System.out.println("Deberia guardar el ID y es:" + patient.getId());
            System.out.println("Get text :" + NIF_enter.getText());
        } else if (!validateNIF(NIF_enter.getText())) {
            JOptionPane.showMessageDialog(null, "Please, enter a valid NIF. ");
        }
    }

    public Boolean isNew(String id) {
        if (dbManager.getPatientManager().patientExists(id)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkEmptyNIF() {
        boolean b;
        if (NIF_enter.getText().equals("")) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    public String getNIF() {
        return NIF_enter.getText();
    }

    public Boolean validateNIF(String NIF) {
        if (NIF.matches("\\d{8}[A-HJ-NP-TV-Z]")) {
            return true;
        } else {
            return false;
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
        NIF_enter = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        appIcon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        delete_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(225, 238, 238));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setText("NIF:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Please, introduce the patient's NIF.");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        appIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dmentiapp_logo1.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient's NIF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(appIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appIcon, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap())
        );

        delete_button.setBackground(new java.awt.Color(0, 153, 153));
        delete_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_button.setText("Delete patient");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(NIF_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_button)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NIF_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        SaveInfo();
        if (dbManager.getPatientManager().patientExists(patient.getId())) {
            dbManager.getPatientManager().deletePatient(patient);
            JOptionPane.showMessageDialog(null, "Patient successfully deleted.");
        } else {
            JOptionPane.showMessageDialog(null, "The patient does not exist, so it cannot be deleted.");
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIF_enter;
    private javax.swing.JLabel appIcon;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
