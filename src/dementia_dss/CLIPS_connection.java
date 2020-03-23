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
            String alzheimerP1 = fact.getSlotValue("alzheimerP1").toString();
            String alzheimerP2 = fact.getSlotValue("alzheimerP2").toString();
            String alzheimerP3 = fact.getSlotValue("alzheimerP3").toString();
            String parkinsonP1 = fact.getSlotValue("parkinsonP1").toString();
            String parkinsonP2 = fact.getSlotValue("parkinsonP2").toString();
            String parkinsonP3 = fact.getSlotValue("parkinsonP3").toString();
            String vascularP1 = fact.getSlotValue("vascularP1").toString();
            String vascularP2 = fact.getSlotValue("vascularP2").toString();
            String vascularP3 = fact.getSlotValue("vascularP3").toString();
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
            if (alzheimerP1.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has Alzheimer PHASE 1. Java");
                p.setAlzheimerP1(true);
            } else if (alzheimerP2.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has Alzheimer PHASE 2. Java");
                p.setAlzheimerP2(true);
            } else if (alzheimerP3.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has Alzheimer PHASE 3. Java");
                p.setAlzheimerP3(true);
            } else if (parkinsonP1.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has Parkinson PHASES 1-2. Java");
                p.setParkinsonP1(true);
            } else if (parkinsonP2.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has Parkinson PHASES 3-4. Java");
                p.setParkinsonP2(true);
            } else if (parkinsonP3.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has Parkinson PHASE 5. Java");
                p.setParkinsonP3(true);
            } else if (vascularP1.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has vascular disease PHASES 1-3. Java");
                p.setVascularP1(true);
            } else if (vascularP2.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has vascular disease PHASES 4-5. Java");
                p.setVascularP2(true);
            } else if (vascularP3.equalsIgnoreCase("TRUE")) {
                System.out.println("The patient has vascular disease PHASES 6-7. Java");
                p.setVascularP3(true);
            }

        } catch (CLIPSException e) {
            Logger.getLogger(CLIPS_connection.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
