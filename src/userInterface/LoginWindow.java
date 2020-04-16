/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import dementia_dss.Doctor;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class LoginWindow extends javax.swing.JFrame implements ActionListener {

    Doctor doctor = new Doctor();

    UserPassword userPassword = new UserPassword(doctor);
    NewAccount newAccount = new NewAccount(doctor);

    /**
     * Creates new form LoginWindow
     */
    public LoginWindow() {
        this.setVisible(true);
        initComponents();

        userPassword.setVisible(true);
        newAccount.setVisible(false);
        ButtonsPanel.setVisible(true);

        PrincipalPanel.add(userPassword, BorderLayout.CENTER);
        pack();

        manageButtons();

    }

    public void manageButtons() {
        if (newAccount.isVisible()) {
            NewAccountButton.setEnabled(true);
            SignInButton.setEnabled(false);
        } else {
            NewAccountButton.setEnabled(true);
            SignInButton.setEnabled(true);
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

        ButtonsPanel = new javax.swing.JPanel();
        SignInButton = new javax.swing.JButton();
        NewAccountButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        PrincipalPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonsPanel.setBackground(new java.awt.Color(225, 238, 238));

        SignInButton.setText("Sign in");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });

        NewAccountButton.setText("Create an account");
        NewAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAccountButtonActionPerformed(evt);
            }
        });

        SignUpButton.setText("Sign up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
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
                    .addComponent(NewAccountButton))
                .addGap(30, 30, 30))
        );

        getContentPane().add(ButtonsPanel, java.awt.BorderLayout.PAGE_END);

        PrincipalPanel.setBackground(new java.awt.Color(225, 238, 238));
        PrincipalPanel.setMaximumSize(new java.awt.Dimension(700, 777));
        PrincipalPanel.setPreferredSize(new java.awt.Dimension(700, 777));
        PrincipalPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PrincipalPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAccountButtonActionPerformed
        newAccount.SaveInfo();

        userPassword.setVisible(false);
        newAccount.setVisible(false);

        JOptionPane.showMessageDialog(null, "The account was succesfully created.");

        dispose();
        new Principal_Window();
    }//GEN-LAST:event_NewAccountButtonActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        userPassword.SaveInfo();

        if (userPassword.checkPassword(doctor)) {

            userPassword.setVisible(false);
            newAccount.setVisible(false);

            dispose();
            new Principal_Window();
        } else {
            JOptionPane.showMessageDialog(null, "Wrong credentials. Please try again.");
        }
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        userPassword.SaveInfo();

        //System.out.println("User: " + doctor.getUsername());
        //System.out.println("Password: " + doctor.getPassword());
        //Map<String, Object> keys = RSA.createKeys();
        //PrivateKey privateKey = (PrivateKey) keys.get("private");
        //System.out.println("Password decrypted: " + RSA.decryptPassword(doctor.getPassword(), privateKey));
        userPassword.setVisible(false);
        newAccount.setVisible(true);

        PrincipalPanel.removeAll();
        PrincipalPanel.repaint();
        PrincipalPanel.add(newAccount, BorderLayout.CENTER);
        pack();
    }//GEN-LAST:event_SignUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
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
