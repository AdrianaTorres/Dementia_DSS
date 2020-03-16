/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

import dementia_dss.Patient;
import userInterface.PatientInfo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.clipsrules.jni.CLIPSException;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;

/**
 *
 * @author Lucia
 */
public class CLIPS_connection {
    Environment clips = new Environment();
    
    public CLIPS_connection() {
        startCLIPS();
    }
    
    public void startCLIPS () {
        try {
            clips.load("Dementia_DSS_3.clp");
            clips.reset();
            clips.run();
        } catch (CLIPSException ex) {
            Logger.getLogger(CLIPS_connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createPatientAssertion (Patient p) {
        String assertionOverallSymptoms = "(assert (patient (name " + p.getName() + ")(sex " + p.getSex() + ")(age " + p.getAge() +
                                          ")(familyHistoryOfDisease " + p.getFamilyHis() + ")(downsSyndrome " + p.getDownSyndrome() + ")(hyperglycemia " + p.getHyperglycemia() +
                                          ")(insulinResistance " + p.getInsulin() + ")(hyperlipidemia " + p.getHyperlipidemia() + ")(arterialHypertension " + p.getHypertension() +
                                          ")(recordHeartCerebroAttacks " + p.getHeartCerebro() + ")(diabetes " + p.getDiabetes() + ")(smoking " + p.getSmoking() +
                                          ")(obesity " + p.getObesity() + ")(highCholesterol " + p.getCholesterol() + ")(lossOfCoordination " + p.getLackCoord() +
                                          ")(arteriosclerosis " + p.getArteriosclerosis() + ")(depression " + p.getDepression() + ")(lowLevelsEducation " + p.getLowEducation() +
                                          ")(difficultiesWords " + p.getRightWords() + ")(memoryProblems " + p.getForgetRecent() + ")(organizationProblems " + p.getPlanningOrg() +
                                          ")(forgetPersonalInfo "  + p.getForgetPersonal() + ")(noStandWalk " + p.getStandWalk() + ")(bradykinesiaL " + p.getBradykinesiaL() + 
                                          ")(bradykinesiaM " + p.getBradykinesiaM() + ")(bradykinesiaH " + p.getBradykinesiaH() + ")(orientationImpL " + p.getOrientationL() +
                                          ")(orientationImpH " + p.getOrientationH() + ")(behaviour " + p.getBehaviour() + ")(emotionalInstability " + p.getEmotionalInstability() +
                                          ")(chemicalsExposure " + p.getExposure() + ")(drugConsumption " + p.getDrugConsumption() + ")(tremor " + p.getTremor() + ")(stiffness " +
                                          p.getStiffness() + ")(balanceLoss " + p.getLossBalance() + ")(straightWalkingProblems " + p.getWalkStraight() + ")(smellLoss " + p.getLossSmell() +
                                          ")(incontinence " + p.getIncontinence() + ")(sleepingProblems " + p.getSleepingPattern() + ")(facialExpressionLoss " + p.getFacialExp() + ")))";
        
        System.out.println("Asserting: " + assertionOverallSymptoms);
        try {
            clips.eval(assertionOverallSymptoms);
            clips.run();
            List<FactAddressValue> findAllFacts = clips.findAllFacts("patient");
            System.out.println("List Size+" + findAllFacts.size());
            String disease = findAllFacts.get(0).getSlotValue("noDementia").toString();
            System.out.println("Answer: " + disease);
        } catch (CLIPSException e) {
            Logger.getLogger(CLIPS_connection.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
}
