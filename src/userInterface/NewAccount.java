/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import dementia_dss.Doctor;
import javax.swing.JOptionPane;

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

    public Boolean validateInt(String numero) {
        if (numero.matches("[0-9]+")) {
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

    public void SaveInfo() {
        if (nameEnter.getText() != null && validateString(nameEnter.getText())) {
            doctor.setName(nameEnter.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Please, enter a valid name. It should only contain characters and spaces. ", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        if (surnameEnter.getText() != null && validateString(surnameEnter.getText())) {
            doctor.setSurname(surnameEnter.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Please, enter a valid surname. It should only contain characters and spaces. ", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        if (ageEnter.getText() != null && validateInt(ageEnter.getText())) {
            doctor.setAge(Integer.parseInt(ageEnter.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Please, enter a valid age. It should be a number. ", "Warning", JOptionPane.INFORMATION_MESSAGE);
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

        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        nameEnter = new javax.swing.JTextField();
        surnameEnter = new javax.swing.JTextField();
        ageEnter = new javax.swing.JTextField();
        sexLabel = new javax.swing.JLabel();
        sexEnter = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        appIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(225, 238, 238));
        setPreferredSize(new java.awt.Dimension(700, 600));

        nameLabel.setBackground(new java.awt.Color(225, 238, 238));
        nameLabel.setText("Name:");

        surnameLabel.setBackground(new java.awt.Color(225, 238, 238));
        surnameLabel.setText("Surname:");

        ageLabel.setBackground(new java.awt.Color(225, 238, 238));
        ageLabel.setText("Age:");

        sexLabel.setBackground(new java.awt.Color(225, 238, 238));
        sexLabel.setText("Sex:");

        sexEnter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        appIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dmentiapp_logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appIcon)
                .addGap(189, 189, 189))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(appIcon))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dmentiapp-doctorIcon2.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(surnameLabel)
                    .addComponent(ageLabel)
                    .addComponent(sexLabel))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameEnter)
                        .addComponent(surnameEnter)
                        .addComponent(ageEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surnameLabel)
                            .addComponent(surnameEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexLabel)
                            .addComponent(sexEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageEnter;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel appIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameEnter;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> sexEnter;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JTextField surnameEnter;
    private javax.swing.JLabel surnameLabel;
    // End of variables declaration//GEN-END:variables
}
