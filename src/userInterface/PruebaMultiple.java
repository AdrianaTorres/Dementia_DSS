/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author adria
 */
public class PruebaMultiple implements ActionListener {

    JFrame principalWindow = new JFrame();
    JPanel buttonsPanel = new JPanel();
    JPanel changingPanel = new JPanel();
    JButton nextButton = new JButton("Next");
    JButton backButton = new JButton("Back");
    JButton submitButton = new JButton("Submit");

    public PruebaMultiple() {
        principalWindow.add(buttonsPanel, BorderLayout.SOUTH);
        principalWindow.add(changingPanel, BorderLayout.CENTER);
        principalWindow.setVisible(true);
        changingPanel.add(backButton);
        changingPanel.add(nextButton);
        changingPanel.add(submitButton);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
