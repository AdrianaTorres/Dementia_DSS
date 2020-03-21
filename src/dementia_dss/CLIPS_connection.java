/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.clipsrules.jni.CLIPSException;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;

/*
PREGUNTAS:
1. Siempre sale no dementia
2. Enlaces JFrame --> Next, al volver no se queda marcado.
3. FindAllfacts --> se puede cambiar por FindFact
4. Excepciones al runnear.


 */
/**
 *
 * @author Lucia
 */
public class CLIPS_connection {

    Environment clips = new Environment();

    public CLIPS_connection() {
        startCLIPS();
    }

    public void startCLIPS() {
        try {
            clips.load("Dementia_DSS_3.clp");
            clips.reset();
            clips.run();
        } catch (CLIPSException ex) {
            Logger.getLogger(CLIPS_connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createPatientAssertion(Patient p) {
        String assertionOverallSymptoms = "(assert (patient (name " + p.getName() + ")(sex " + p.getSex() + ")(age " + p.getAge()
                + ")(familyHistoryOfDisease " + p.getFamilyHis() + ")(downsSyndrome " + p.getDownSyndrome() + ")(hyperglycemia " + p.getHyperglycemia()
                + ")(insulinResistance " + p.getInsulin() + ")(hyperlipidemia " + p.getHyperlipidemia() + ")(arterialHypertension " + p.getHypertension()
                + ")(recordHeartCerebroAttacks " + p.getHeartCerebro() + ")(diabetes " + p.getDiabetes() + ")(smoking " + p.getSmoking()
                + ")(obesity " + p.getObesity() + ")(highCholesterol " + p.getCholesterol() + ")(lossOfCoordination " + p.getLackCoord()
                + ")(arteriosclerosis " + p.getArteriosclerosis() + ")(depression " + p.getDepression() + ")(lowLevelsEducation " + p.getLowEducation()
                + ")(difficultiesWords " + p.getRightWords() + ")(memoryProblems " + p.getForgetRecent() + ")(organizationProblems " + p.getPlanningOrg()
                + ")(forgetPersonalInfo " + p.getForgetPersonal() + ")(noStandWalk " + p.getStandWalk() + ")(bradykinesiaL " + p.getBradykinesiaL()
                + ")(bradykinesiaM " + p.getBradykinesiaM() + ")(bradykinesiaH " + p.getBradykinesiaH() + ")(orientationImpL " + p.getOrientationL()
                + ")(orientationImpH " + p.getOrientationH() + ")(behaviour " + p.getBehaviour() + ")(emotionalInstability " + p.getEmotionalInstability()
                + ")(chemicalsExposure " + p.getExposure() + ")(drugConsumption " + p.getDrugConsumption() + ")(tremor " + p.getTremor() + ")(stiffness "
                + p.getStiffness() + ")(balanceLoss " + p.getLossBalance() + ")(straightWalkingProblems " + p.getWalkStraight() + ")(smellLoss " + p.getLossSmell()
                + ")(incontinence " + p.getIncontinence() + ")(sleepingProblems " + p.getSleepingPattern() + ")(facialExpressionLoss " + p.getFacialExp() + ")))";

        System.out.println("Asserting: " + assertionOverallSymptoms);
        try {
            clips.reset();
            clips.eval(assertionOverallSymptoms);
            clips.run();
            FactAddressValue fact = clips.findFact("patient");
            String noDementia = fact.getSlotValue("noDementia").toString();
            String alzheimer = fact.getSlotValue("alzheimer").toString();
            String parkinson = fact.getSlotValue("parkinson").toString();
            String vascular = fact.getSlotValue("vascular").toString();
            System.out.println("No disease: " + noDementia + " Alz " + alzheimer + " Park " + parkinson + " Vas " + vascular);
            if (noDementia.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has no dementia. Java");
                p.setNoDementia(true);
            } else if (alzheimer.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has Alzheimer. Java");
                p.setAlzheimer(true);
            } else if (parkinson.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has Parkinson. Java");
                p.setParkinson(true);
            } else {
                System.out.println("The patient has vascular disease. Java");
                p.setVascularD(true);
            }

        } catch (CLIPSException e) {
            Logger.getLogger(CLIPS_connection.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
