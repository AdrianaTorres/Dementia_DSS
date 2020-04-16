/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import dementia_dss.Doctor;
import dementia_dss.RSA;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Map;

/**
 *
 * @author adria
 */
public class UserPassword extends javax.swing.JPanel {

    Doctor doctor = new Doctor();
    Map<String, Object> keys = RSA.createKeys();
    PublicKey publicKey = (PublicKey) keys.get("public");
    PrivateKey privateKey = (PrivateKey) keys.get("private");

    /**
     * Creates new form UserPassword
     */
    public UserPassword() {
        initComponents();
    }

    public UserPassword(Doctor doctor) {
        this.doctor = doctor;
        initComponents();
        setVisible(true);

        if (doctor != null) {
            if (!doctor.getUsername().equalsIgnoreCase("")) {
                usernameEnter.setText(doctor.getUsername());
            }
            /* Dejo esto comentado porque no creo que tenga sentido guardar la conraseña por temas de seguridad.
            if (!doctor.getPassword().equalsIgnoreCase("")) {
                passwordEnter.setText(doctor.getPassword());
            }*/

        }
    }

    public void SaveInfo() {
        if (usernameEnter.getText() != null) {
            doctor.setUsername(usernameEnter.getText());
            System.out.println("El username is: " + doctor.getUsername());
        }
        if (passwordEnter.getText() != null) {

            String password = passwordEnter.getText();
            String encryptedPassword = RSA.encryptPassword(password, publicKey);
            doctor.setPassword(encryptedPassword);

        }
    }

    public Boolean checkPassword(Doctor doctor) {
        //doctor exists??
        // si --> get pass

        String validPassword = ""; //= Vete a la base de datos, busca el user, coge la contraseña
        validPassword = RSA.decryptPassword(validPassword, privateKey);

        String password = doctor.getPassword();
        password = RSA.decryptPassword(password, privateKey);

        if (password.equals(validPassword)) {
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
        usernameEnter = new javax.swing.JTextField();
        passwordEnter = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(225, 238, 238));

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78)
                        .addComponent(usernameEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(80, 80, 80)
                        .addComponent(passwordEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(usernameEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(passwordEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwordEnter;
    private javax.swing.JTextField usernameEnter;
    // End of variables declaration//GEN-END:variables
}
