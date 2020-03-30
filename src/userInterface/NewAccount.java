/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import dementia_dss.Doctor;

/**
 *
 * @author adria
 */
public class NewAccount extends javax.swing.JPanel {

    Doctor doctor = new Doctor();

    /**
     * Creates new form NewAccount
     */
    public NewAccount() {
        initComponents();
    }

    public NewAccount(Doctor doctor) {
        this.doctor = doctor;
        initComponents();
        setVisible(true);

        if (doctor != null) {
            if (!doctor.getName().equalsIgnoreCase("")) {
                nameEnter.setText(doctor.getName());
            }
            if (!doctor.getSurname().equalsIgnoreCase("")) {
                surnameEnter.setText(doctor.getSurname());
            }
            if (doctor.getAge() != 0) {
                ageEnter.setText(Integer.toString(doctor.getAge()));
            }
            if (!doctor.getSex().equalsIgnoreCase("")) {
                if (doctor.getSex().matches("Male")) {
                    sexEnter.setSelectedIndex(0);
                } else {
                    sexEnter.setSelectedIndex(1);
                }
            }
        }
    }

    public void SaveInfo() {
        if (nameEnter.getText() != null) {
            doctor.setName(nameEnter.getText());
        }
        if (surnameEnter.getText() != null) {
            doctor.setSurname(surnameEnter.getText());
        }
        if (ageEnter.getText() != null) {
            doctor.setAge(Integer.parseInt(ageEnter.getText()));
        }
        if (sexEnter.getSelectedItem().equals("Male")) {
            doctor.setSex("MALE");
        } else {
            doctor.setSex("FEMALE");
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
        jLabel3 = new javax.swing.JLabel();
        nameEnter = new javax.swing.JTextField();
        surnameEnter = new javax.swing.JTextField();
        ageEnter = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sexEnter = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(225, 238, 238));

        jLabel1.setBackground(new java.awt.Color(225, 238, 238));
        jLabel1.setText("Name:");

        jLabel2.setBackground(new java.awt.Color(225, 238, 238));
        jLabel2.setText("Surname:");

        jLabel3.setBackground(new java.awt.Color(225, 238, 238));
        jLabel3.setText("Age:");

        jLabel4.setBackground(new java.awt.Color(225, 238, 238));
        jLabel4.setText("Sex:");

        sexEnter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(surnameEnter)
                        .addComponent(ageEnter)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(surnameEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ageEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sexEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameEnter;
    private javax.swing.JComboBox<String> sexEnter;
    private javax.swing.JTextField surnameEnter;
    // End of variables declaration//GEN-END:variables
}
