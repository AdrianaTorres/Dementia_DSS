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
        //new userInterface.PatientInfo();
        
        try {
            clips.load("Dementia_DSS_3.clp");
            clips.reset();
            clips.run();
        } catch (CLIPSException ex) {
            Logger.getLogger(CLIPS_connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createPatientAssertion (Patient p) {
        String assertion = "(assert (patient (name " + p.getName() + ")(sex " + p.getSex() + ")(age " + p.getAge() +
                           ")(familyHistoryOfDisease " + p.getFamilyHis() + ")(downsSyndrome " + p.getDownSyndrome() + ")(hyperglycemia " + p.getHyperglycemia() +
                           ")(insulineResistance " + p.getInsulin() + ")(hyperlipidemia " + p.getHyperlipidemia() + ")(arterialHypertension " + p.getHypertension() +
                           ")(recordHeartCerebroAttacks " + p.getHeartCerebro() + ")(diabetes " + p.getDiabetes() + ")(smoking " + p.getSmoking() +
                           ")(obesity " + p.getObesity() + ")(highCholesterol " + p.getCholesterol() + ")(lossOfCoordination " + p.getLackCoord() +
                           ")(arteriosclerosis " + p.getArteriosclerosis() + ")(depression " + p.getDepression() + ")(lowLevelsEducation " + p.getLowEducation() +
                           ")(difficultiesWords " + p.getRightWords() + ")(memoryProblems " + p.getForgetRecent() + ")(organizationProblems " + p.getPlanningOrg() +
                           ")(forgetPersonalInfo "  + p.getForgetPersonal() + ")(noStandWalk " + p.getStandWalk() + ")(bradykinesiaL " + p.getBradykinesiaL() + 
                           ")(bradykinesiaM " + p.getBradykinesiaM() + ")(bradykinesiaH " + p.getBradykinesiaH() + ")(orientationImpL " + p.getOrientationL() +
                           ")(orientationImpH " + p.getOrientationH() + ")((behaviour " + p.getBehaviour() + ")(emotionalInstability " + p.getEmotionalInstability() +
                           ")(chemicalsExposure " + p.getExposure() + ")(drugConsumption " + p.get
"(slot tremor)\n" +
"(slot stiffness)\n" +
"(slot balanceLoss)\n" +
"(slot straightWalkingProblems)\n" +
"(slot smellLoss)\n" +
"(slot incontinence)\n" +
"(slot sleepingProblems)\n" +
"(slot facialExpressionLoss)"
    }
}
