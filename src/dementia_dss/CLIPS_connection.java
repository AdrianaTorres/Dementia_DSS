/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

import dementia_dss.Patient;
import userInterface.PatientInfo;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.clipsrules.jni.CLIPSException;
import net.sf.clipsrules.jni.Environment;

/**
 *
 * @author Lucia
 */
public class CLIPS_connection {   
    public CLIPS_connection() {
        startCLIPS();
    }
    // Main method runs the application creating a CLIPS environment.
    public void startCLIPS () {
        Environment clips = new Environment();
        new userInterface.PatientInfo();
        Patient patient = PatientInfo.patient;
        try {
            clips.load("Dementia_DSS_3.clp");
            clips.reset();
            clips.run();
        } catch (CLIPSException ex) {
            Logger.getLogger(CLIPS_connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createPatientAssertion () {
        
    }
}
