/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

/**
 *
 * @author adria
 */
public class Patient {

    // Patient general info variables:
    int id;
    int doctorId;
    String name;
    int age;        
    String sex;
    // General symptoms variables:
    String family_his;
    String low_education;
    String behaviour;
    String emotional_instability;
    String right_words;
    String forget_personal;
    String facial_exp;
    String planning_org;
    String forget_recent;
    String sleeping_pattern;
    String loss_smell;
    String incontinence;
    String exposure;
    String smoking;
    String drugConsumption;
    // Walking symptoms variables:
    String lack_coord;
    String stand_walk;
    String stiffness;
    String loss_balance;
    String walk_straight;
    String tremor;
    String orientation_low;
    String orientation_high;
    String bradykinesia_low;
    String bradykinesia_medium;
    String bradykinesia_high;
    // Other pathologies variables:
    String downSyndrome;
    String hyperglycemia;
    String hyperlipidemia;
    String insulin;
    String hypertension;
    String heart_cerebro;
    String diabetes;
    String obesity;
    String cholesterol;
    String arteriosclerosis;
    String depression;
    // Specific Parkinson symptoms:
    String tremorUni;
    String tremorBi;
    // Specific Alzheimer symptoms:
    String stiffnessLow;
    String stiffnessHigh;
    String hyperreflexia;
    // Specific for both (Parkinson and Alzheimer) symptom:
    String lossPhysicalAbilities;
    Boolean noDementia;
    Boolean parkinson;
    Boolean alzheimer;
    Boolean vascularD;
    Boolean parkinsonP1;
    Boolean parkinsonP2;
    Boolean parkinsonP3;
    Boolean alzheimerP1;
    Boolean alzheimerP2;
    Boolean alzheimerP3;
    Boolean vascularP1;
    Boolean vascularP2;
    Boolean vascularP3;

    public Patient() {
        this.id =0;
        this.doctorId=0;
        this.name = "";
        this.age = 0;        
        this.sex = "";
        this.family_his = "";
        this.low_education = "";
        this.behaviour = "";
        this.emotional_instability = "";
        this.right_words = "";
        this.forget_personal = "";
        this.facial_exp = "";
        this.planning_org = "";
        this.forget_recent = "";
        this.sleeping_pattern = "";
        this.loss_smell = "";
        this.incontinence = "";
        this.exposure = "";
        this.smoking = "";
        this.drugConsumption = "";
        this.lack_coord = "";
        this.stand_walk = "";
        this.stiffness = "";
        this.loss_balance = "";
        this.walk_straight = "";
        this.tremor = "";
        this.orientation_high = "";
        this.orientation_low = "";
        this.bradykinesia_low = "";
        this.bradykinesia_medium = "";
        this.bradykinesia_high = "";
        this.downSyndrome = "";
        this.hyperglycemia = "";
        this.hyperlipidemia = "";
        this.insulin = "";
        this.hypertension = "";
        this.heart_cerebro = "";
        this.diabetes = "";
        this.obesity = "";
        this.cholesterol = "";
        this.arteriosclerosis = "";
        this.depression = "";
        this.tremorUni = "";
        this.tremorBi = "";
        this.stiffnessLow = "";
        this.stiffnessHigh = "";
        this.hyperreflexia = "";
        this.lossPhysicalAbilities = "";
        this.noDementia = false;
        this.alzheimer = false;
        this.parkinson = false;
        this.vascularD = false;
        this.parkinsonP1 = false;
        this.parkinsonP2 = false;
        this.parkinsonP3 = false;
        this.alzheimerP1 = false;
        this.alzheimerP2 = false;
        this.alzheimerP3 = false;
        this.vascularP1 = false;
        this.vascularP2 = false;
        this.vascularP3 = false;
    }
    // Constructor for queries:
    
    public Patient(int newPatId, int patDocId, String patName, int patAge, String patSex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Patient( int newPatId, int patDocId, String patName, int patAge, String patSex, 
            String patFamilyHis, String patLowEducation, String patBehaviour, 
            String patEmotionalInstability, String patRightWords, String patForgetPersonal,
            String patFacialExp, String patPlanningOrg, String patForgetRecent, 
            String patSleepingPattern, String patLossSmell, String patIncontinence, 
            String patExposure, String patSmoking, String patDrugConsumption, String patLackCord, 
            String patStandWalk, String patStiffness, String patLossBalance, String patWalkStraight, 
            String patTremor, String patOrientationLow, String patOrientationHigh,
            String patBradykinesiaLow, String patBradykinesiaMedium, String patBradykinesiaHigh, 
            String patDownsSyndrome, String patHyperglycemia, String patHyperlipidemia, 
            String patInsulin, String patHypertension, String patHeartCerebro, String patDiabetes, 
            String patObesity, String patCholesterol, String patArteriosclerosis, String patDepression, 
            String patTremorUni, String patTremorBi, String patStiffnessLow, String patStiffnessHigh, 
            String patHyperreflexia, String patLossPhysicalAbilities, Boolean patNoDementia, 
            Boolean patParkinson, Boolean patAlzheimer, Boolean patVascularD, Boolean patParkinson1, 
            Boolean patParkinson2, Boolean patParkinson3, Boolean patAlzheimer1, Boolean patAlzheimer2, 
            Boolean patAlzheimer3, Boolean patVascularD1, Boolean patVascularD2, Boolean patVascularD3 ) 
       {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // 'SET' AND 'GET' METHODS:
    // Patient general information 'set' methods:
    public void setId (int id_) {
        this.id = id_;
    }
    
    public void setDoctorId (int docId_){
        this.doctorId = docId_;
    }
    
    public void setName(String name_) {
        this.name = name_;
    }

    public void setAge(int age_) {
        this.age = age_;
    }
    

    public void setSex(String sex_) {
        this.sex = sex_;
    }

    // General symptoms 'set' methods:
    public void setFamilyHis(String family_his_) {
        this.family_his = family_his_;
    }

    public void setLowEducation(String low_education_) {
        this.low_education = low_education_;
    }

    public void setBehaviour(String behaviour_) {
        this.behaviour = behaviour_;
    }

    public void setEmotionalInstability(String emotional_instability_) {
        this.emotional_instability = emotional_instability_;
    }

    public void setRightWords(String right_words_) {
        this.right_words = right_words_;
    }

    public void setForgetPersonal(String forget_personal_) {
        this.forget_personal = forget_personal_;
    }

    public void setFacialExp(String facial_exp_) {
        this.facial_exp = facial_exp_;
    }

    public void setPlanningOrg(String planning_org_) {
        this.planning_org = planning_org_;
    }

    public void setForgetRecent(String forget_recent_) {
        this.forget_recent = forget_recent_;
    }

    public void setSleepingPattern(String sleeping_pattern_) {
        this.sleeping_pattern = sleeping_pattern_;
    }

    public void setLossSmell(String loss_smell_) {
        this.loss_smell = loss_smell_;
    }

    public void setIncontinence(String incontinence_) {
        this.incontinence = incontinence_;
    }

    public void setExposure(String exposure_) {
        this.exposure = exposure_;
    }

    public void setSmoking(String smoking_) {
        this.smoking = smoking_;
    }

    public void setDrugConsumption(String drug) {
        this.drugConsumption = drug;
    }

    // Motor symptoms 'set' methods:
    public void setLackCoord(String lackCoord) {
        this.lack_coord = lackCoord;
    }

    public void setStandWalk(String standWalk) {
        this.stand_walk = standWalk;
    }

    public void setStiffness(String stiffness_) {
        this.stiffness = stiffness_;
    }

    public void setLossBalance(String lossBalance) {
        this.loss_balance = lossBalance;
    }

    public void setWalkStraight(String walkStraight) {
        this.walk_straight = walkStraight;
    }

    public void setTremor(String tremor_) {
        this.tremor = tremor_;
    }

    public void setOrientationL(String orientationL) {
        this.orientation_low = orientationL;
    }

    public void setOrientationH(String orientationH) {
        this.orientation_high = orientationH;
    }

    public void setBradykinesiaL(String bradykinesiaL) {
        this.bradykinesia_low = bradykinesiaL;
    }

    public void setBradykinesiaM(String bradykinesiaM) {
        this.bradykinesia_medium = bradykinesiaM;
    }

    public void setBradykinesiaH(String bradykinesiaH) {
        this.bradykinesia_high = bradykinesiaH;
    }

    // Other pathologies 'set' methods:
    public void setDownSyndrome(String downSyndrome_) {
        this.downSyndrome = downSyndrome_;
    }

    public void setHyperglycemia(String hyperglycemia_) {
        this.hyperglycemia = hyperglycemia_;
    }

    public void setInsulin(String insulin_) {
        this.insulin = insulin_;
    }

    public void setHyperlipidemia(String hyperlipidemia_) {
        this.hyperlipidemia = hyperlipidemia_;
    }

    public void setHypertension(String hypertension_) {
        this.hypertension = hypertension_;
    }

    public void setHeartCerebro(String heart_cerebro_) {
        this.heart_cerebro = heart_cerebro_;
    }

    public void setDiabetes(String diabetes_) {
        this.diabetes = diabetes_;
    }

    public void setObesity(String obesity_) {
        this.obesity = obesity_;
    }

    public void setCholesterol(String cholesterol_) {
        this.cholesterol = cholesterol_;
    }

    public void setArteriosclerosis(String arteriosclerosis_) {
        this.arteriosclerosis = arteriosclerosis_;
    }

    public void setDepression(String depression_) {
        this.depression = depression_;
    }

    // Specific Parkinson symptoms' 'set' methods:
    public void setTremorUni(String tremorUni_) {
        this.tremorUni = tremorUni_;
    }

    public void setTremorBi(String tremorBi_) {
        this.tremorBi = tremorBi_;
    }

    // Specific Alzheimer symptoms' 'set' methods:
    public void setStiffnessL(String stiffnessL) {
        this.stiffnessLow = stiffnessL;
    }

    public void setStiffnessH(String stiffnessH) {
        this.stiffnessHigh = stiffnessH;
    }

    public void setHyperreflexia(String hyperreflexia_) {
        this.hyperreflexia = hyperreflexia_;
    }

    // Specific for both (Parkinson and Alzheimer) symptom' 'set' mehtod:
    public void setLossPhysicalAbilities(String lossPhysicalAbilities_) {
        this.lossPhysicalAbilities = lossPhysicalAbilities_;
    }

    public void setNoDementia(Boolean noDementia_) {
        this.noDementia = noDementia_;
    }

    public void setParkinson(Boolean parkinson) {
        this.parkinson = parkinson;
    }

    public void setAlzheimer(Boolean alzheimer) {
        this.alzheimer = alzheimer;
    }

    public void setVascularD(Boolean vascular) {
        this.vascularD = vascular;
    }

    public void setParkinsonP1(Boolean parkinsonP1) {
        this.parkinsonP1 = parkinsonP1;
    }

    public void setParkinsonP2(Boolean parkinsonP2) {
        this.parkinsonP2 = parkinsonP2;
    }

    public void setParkinsonP3(Boolean parkinsonP3) {
        this.parkinsonP3 = parkinsonP3;
    }

    public void setAlzheimerP1(Boolean alzheimerP1) {
        this.alzheimerP1 = alzheimerP1;
    }

    public void setAlzheimerP2(Boolean alzheimerP2) {
        this.alzheimerP2 = alzheimerP2;
    }

    public void setAlzheimerP3(Boolean alzheimerP3) {
        this.alzheimerP3 = alzheimerP3;
    }

    public void setVascularP1(Boolean vascularP1) {
        this.vascularP1 = vascularP1;
    }

    public void setVascularP2(Boolean vascularP2) {
        this.vascularP2 = vascularP2;
    }

    public void setVascularP3(Boolean vascularP3) {
        this.vascularP3 = vascularP3;
    }

    // General patient information 'get' methods:
     
    public int getId() {
        return this.id;
    }
    
    public int getDoctorId(){
        return this.doctorId;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
   
    public String getSex() {
        return this.sex;
    }

    // General symptoms 'get' methods:
    public String getFamilyHis() {
        return this.family_his;
    }

    public String getLowEducation() {
        return this.low_education;
    }

    public String getBehaviour() {
        return this.behaviour;
    }

    public String getEmotionalInstability() {
        return this.emotional_instability;
    }

    public String getRightWords() {
        return this.right_words;
    }

    public String getForgetPersonal() {
        return this.forget_personal;
    }

    public String getFacialExp() {
        return this.facial_exp;
    }

    public String getPlanningOrg() {
        return this.planning_org;
    }

    public String getForgetRecent() {
        return this.forget_recent;
    }

    public String getSleepingPattern() {
        return this.sleeping_pattern;
    }

    public String getLossSmell() {
        return this.loss_smell;
    }

    public String getIncontinence() {
        return this.incontinence;
    }

    public String getExposure() {
        return this.exposure;
    }

    public String getSmoking() {
        return this.smoking;
    }

    public String getDrugConsumption() {
        return this.drugConsumption;
    }

    public String getLackCoord() {
        return this.lack_coord;
    }

    // Motor symptoms 'get' methods:
    public String getStandWalk() {
        return this.stand_walk;
    }

    public String getStiffness() {
        return this.stiffness;
    }

    public String getLossBalance() {
        return this.loss_balance;
    }

    public String getWalkStraight() {
        return this.walk_straight;
    }

    public String getTremor() {
        return this.tremor;
    }

    public String getOrientationL() {
        return this.orientation_low;
    }

    public String getOrientationH() {
        return this.orientation_high;
    }

    public String getBradykinesiaL() {
        return this.bradykinesia_low;
    }

    public String getBradykinesiaM() {
        return this.bradykinesia_medium;
    }

    public String getBradykinesiaH() {
        return this.bradykinesia_high;
    }

    // Other pathologies 'get' methods:
    public String getDownSyndrome() {
        return this.downSyndrome;
    }

    public String getHyperglycemia() {
        return this.hyperglycemia;
    }

    public String getInsulin() {
        return this.insulin;
    }

    public String getHyperlipidemia() {
        return this.hyperlipidemia;
    }

    public String getHypertension() {
        return this.hypertension;
    }

    public String getHeartCerebro() {
        return this.heart_cerebro;
    }

    public String getDiabetes() {
        return this.diabetes;
    }

    public String getObesity() {
        return this.obesity;
    }

    public String getCholesterol() {
        return this.cholesterol;
    }

    public String getArteriosclerosis() {
        return this.arteriosclerosis;
    }

    public String getDepression() {
        return this.depression;
    }

    // Specific Parkinson symptoms' 'get' methods:
    public String getTremorUni() {
        return this.tremorUni;
    }

    public String getTremorBi() {
        return this.tremorBi;
    }

    // Specific Alzheimer symptoms' 'get' methods:
    public String getStiffnessL() {
        return this.stiffnessLow;
    }

    public String getStiffnessH() {
        return this.stiffnessHigh;
    }

    public String getHyperreflexia() {
        return this.hyperreflexia;
    }

    // Specific for both (Parkinson and Alzheimer) symptom' 'get' mehtod:
    public String getLossPhysicalAbilities() {
        return this.lossPhysicalAbilities;
    }

    public Boolean getNoDementia() {
        return this.noDementia;
    }

    public Boolean getParkinson() {
        return this.parkinson;
    }

    public Boolean getAlzheimer() {
        return this.alzheimer;
    }

    public Boolean getVascularD() {
        return this.vascularD;
    }

    public Boolean getParkinsonP1() {
        return this.parkinsonP1;
    }

    public Boolean getParkinsonP2() {
        return this.parkinsonP2;
    }

    public Boolean getParkinsonP3() {
        return this.parkinsonP3;
    }

    public Boolean getAlzheimerP1() {
        return this.alzheimerP1;
    }

    public Boolean getAlzheimerP2() {
        return this.alzheimerP2;
    }

    public Boolean getAlzheimerP3() {
        return this.alzheimerP3;
    }

    public Boolean getVascularP1() {
        return this.vascularP1;
    }

    public Boolean getVascularP2() {
        return this.vascularP2;
    }

    public Boolean getVascularP3() {
        return this.vascularP3;
    }

}
