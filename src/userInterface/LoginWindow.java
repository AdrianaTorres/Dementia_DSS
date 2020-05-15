/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import com.sun.glass.events.KeyEvent;
import db.interfaces.DBManager;
import db.sqlite.SQLiteManager;
import dementia_dss.Doctor;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class LoginWindow extends javax.swing.JFrame implements ActionListener {

    DBManager dbManager = new SQLiteManager();
    Doctor doctor = new Doctor();

    UserPassword userPassword = new UserPassword(doctor);
    NewAccount newAccount = new NewAccount(doctor);

    /**
     * Creates new form LoginWindow
     */
    public LoginWindow(DBManager dbManager) {
        this.dbManager = dbManager;
        initComponents();

        this.setTitle("DmentiApp 21.04");

        userPassword.setVisible(true);
        userPassword.setDbManager(this.dbManager);
        newAccount.setVisible(false);
        ButtonsPanel.setVisible(true);

        PrincipalPanel.add(userPassword, BorderLayout.CENTER);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setLocation(dim.width - this.getSize().width, dim.height - this.getSize().height);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
        pack();

        manageButtons();
    }

    private void manageButtons() {
        if (userPassword.isVisible()) {
            NewAccountButton.setEnabled(false);
            SignInButton.setEnabled(true);
            SignUpButton.setEnabled(true);
            Delete_button.setEnabled(true);
        } else if (newAccount.isVisible()) {
            NewAccountButton.setEnabled(true);
            SignInButton.setEnabled(false);
            SignUpButton.setEnabled(false);
            Delete_button.setEnabled(false);
        }
    }

    private void NewAccountButtonActions() {
        newAccount.SaveInfo();
        dbManager.getDoctorManager().newDoctor(doctor);

        userPassword.setVisible(false);
        newAccount.setVisible(false);
        manageButtons();

        JOptionPane.showMessageDialog(null, "The account was succesfully created.");

        dispose();
        new Principal_Window(dbManager, doctor);
    }

    private void SignInButtonActions() {
        System.out.println("ID doctor: LOGIN WIND" + userPassword.getUsername());
        System.out.println("Password: LOGIN WIND" + userPassword.getPassword());
        System.out.println("Existe el doctor? LOGIN WINDOW - SIGN IN" + dbManager.getDoctorManager().doctorExists(userPassword.getUsername()));
        if (userPassword.checkPassword(userPassword.getUsername(), userPassword.getPassword())) {
            userPassword.SaveInfo();

            userPassword.setVisible(false);
            newAccount.setVisible(false);
            manageButtons();

            dispose();
            new Principal_Window(dbManager, doctor);
        } else {
            JOptionPane.showMessageDialog(null, "Wrong credentials. Please try again.");
        }
    }

    private void SignUpButtonActions() {
        userPassword.SaveInfo();

        userPassword.setVisible(false);
        newAccount.setVisible(true);

        PrincipalPanel.removeAll();
        PrincipalPanel.repaint();
        PrincipalPanel.add(newAccount, BorderLayout.CENTER);
        pack();
        manageButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonsPanel = new javax.swing.JPanel();
        SignInButton = new javax.swing.JButton();
        NewAccountButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        Delete_button = new javax.swing.JButton();
        PrincipalPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        ButtonsPanel.setBackground(new java.awt.Color(225, 238, 238));

        SignInButton.setText("Sign in");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });
        SignInButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SignInButtonKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SignInButtonKeyTyped(evt);
            }
        });

        NewAccountButton.setText("Create an account");
        NewAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAccountButtonActionPerformed(evt);
            }
        });
        NewAccountButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NewAccountButtonKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NewAccountButtonKeyTyped(evt);
            }
        });

        SignUpButton.setText("Sign up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        SignUpButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SignUpButtonKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SignUpButtonKeyTyped(evt);
            }
        });

        Delete_button.setText("Delete account");
        Delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(Delete_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewAccountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SignUpButton)
                .addGap(18, 18, 18)
                .addComponent(SignInButton)
                .addContainerGap())
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignInButton)
                    .addComponent(SignUpButton)
                    .addComponent(NewAccountButton)
                    .addComponent(Delete_button))
                .addGap(30, 30, 30))
        );

        getContentPane().add(ButtonsPanel, java.awt.BorderLayout.PAGE_END);

        PrincipalPanel.setBackground(new java.awt.Color(225, 238, 238));
        PrincipalPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PrincipalPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAccountButtonActionPerformed
        NewAccountButtonActions();
    }//GEN-LAST:event_NewAccountButtonActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        SignInButtonActions();
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        SignUpButtonActions();
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void NewAccountButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewAccountButtonKeyTyped

    }//GEN-LAST:event_NewAccountButtonKeyTyped

    private void SignUpButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SignUpButtonKeyTyped

    }//GEN-LAST:event_SignUpButtonKeyTyped

    private void SignInButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SignInButtonKeyTyped

    }//GEN-LAST:event_SignInButtonKeyTyped

    private void NewAccountButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewAccountButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_A) {
            NewAccountButtonActions();
        }
    }//GEN-LAST:event_NewAccountButtonKeyPressed

    private void SignUpButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SignUpButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_U) {
            SignUpButtonActions();
        }
    }//GEN-LAST:event_SignUpButtonKeyPressed

    private void SignInButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SignInButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_I) {
            SignInButtonActions();
        }
    }//GEN-LAST:event_SignInButtonKeyPressed

    private void Delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_buttonActionPerformed
        userPassword.SaveInfo();
        if (dbManager.getDoctorManager().doctorExists(doctor.getId()) && userPassword.checkPassword(doctor.getId(), userPassword.getPassword())) {
            dbManager.getPatientManager().deletePatientsFromDoctor(doctor);
            dbManager.getDoctorManager().deleteDoctor(doctor);
            userPassword.removeInfo();
            JOptionPane.showMessageDialog(null, "Doctor account successfully deleted.");
        } else {
            if (!dbManager.getDoctorManager().doctorExists(doctor.getId())) {
                JOptionPane.showMessageDialog(null, "The doctor does not exist, so it cannot be deleted.");
            } else if (!userPassword.checkPassword(doctor.getId(), userPassword.getPassword())) {
                JOptionPane.showMessageDialog(null, "Wrong credentials, please enter the right ones to delete the doctor account.");
            }
        }
    }//GEN-LAST:event_Delete_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JButton Delete_button;
    private javax.swing.JButton NewAccountButton;
    private javax.swing.JPanel PrincipalPanel;
    private javax.swing.JButton SignInButton;
    private javax.swing.JButton SignUpButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
