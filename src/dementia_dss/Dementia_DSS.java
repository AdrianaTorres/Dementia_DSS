/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

import userInterface.*;

/**
 *
 * @author adria
 */
// REMOVE THE RULES FOR READING IN CLIPS. if it appear in what we load to java, it will block it.
// Instead of printing, we put that info in a slot in the template. (slot message) and the message is what we want to print. If we dont remove it, it will print it in the console.
// Move the clips project to the folder of the project.
// Eliminar el fact que crea el paciente con todo a nil.
public class Dementia_DSS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Principal_Window();
    }

}
