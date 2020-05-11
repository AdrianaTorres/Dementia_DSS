/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import db.interfaces.DBManager;
import db.sqlite.SQLiteManager;
import dementia_dss.Doctor;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class UserPassword extends javax.swing.JPanel {

    DBManager dbManager = new SQLiteManager();
    Doctor doctor = new Doctor();

    /**
     * Creates new form UserPassword
     */
    public UserPassword() {
        initComponents();
    }

    public void setDbManager(DBManager dbManager) {
        this.dbManager = dbManager;
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
            doctor.setId(usernameEnter.getText());
            System.out.println("El username is: " + doctor.getUsername());
        }
        if (passwordEnter.getText() != null) {

            String password = passwordEnter.getText();
            System.out.println("Password received: " + password);
            int hashPassword = password.hashCode();
            doctor.setPassword(hashPassword);

        }
    }

    public String getUsername() {
        return usernameEnter.getText();
    }

    public int getPassword() {
        String password = passwordEnter.getText();
        int hashPassword = password.hashCode();

        return hashPassword;
    }

    public Boolean checkPassword(String id, int password) {
        System.out.println("Existe el doctor? USERPASSWORD - CHECKPASSWORD " + dbManager.getDoctorManager().doctorExists(id));
        System.out.println("Contraseña que recibe el metodo check" + password);
        if (dbManager.getDoctorManager().doctorExists(id)) {
            Doctor currentDoctor = dbManager.getDoctorManager().getDoctor(id);

            int validPassword = currentDoctor.getPassword();

            System.out.println("Contraseña con la que compara check" + validPassword);

            if (password == validPassword) {
                return true;
            } else {
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "The specified username has not an account yet. Please sign up. ");
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

        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameEnter = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        AppIcon = new javax.swing.JLabel();
        passwordEnter = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(225, 238, 238));
        setMaximumSize(null);

        usernameLabel.setText("NIF:");

        passwordLabel.setText("Password:");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dmentiapp_logo1.png"))); // NOI18N
        jPanel1.add(AppIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel)
                    .addComponent(passwordLabel))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(passwordEnter))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordEnter;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameEnter;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
