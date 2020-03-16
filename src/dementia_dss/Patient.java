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

    public Patient() {
        this.name = null;
        this.age = 0;
        this.sex = null;
        this.family_his = null;
        this.low_education = null;
        this.behaviour = null;
        this.emotional_instability = null;
        this.right_words = null;
        this.forget_personal = null;
        this.facial_exp = null;
        this.planning_org = null;
        this.forget_recent = null;
        this.sleeping_pattern = null;
        this.loss_smell = null;
        this.incontinence = null;
        this.exposure = null;
        this.smoking = null;
        this.drugConsumption = null;
        this.lack_coord = null;
        this.stand_walk = null;
        this.stiffness = null;
        this.loss_balance = null;
        this.walk_straight = null;
        this.tremor = null;
        this.orientation_high = null;
        this.orientation_low = null;
        this.bradykinesia_low = null;
        this.bradykinesia_medium = null;
        this.bradykinesia_high = null;
        this.downSyndrome = null;
        this.hyperglycemia = null;
        this.hyperlipidemia = null;
        this.insulin = null;
        this.hypertension = null;
        this.heart_cerebro = null;
        this.diabetes = null;
        this.obesity = null;
        this.cholesterol = null;
        this.arteriosclerosis = null;
        this.depression = null;
        this.tremorUni = null;
        this.tremorBi = null;
        this.stiffnessLow = null;
        this.stiffnessHigh = null;
        this.hyperreflexia = null;
        this.lossPhysicalAbilities = null;
    }

    // 'SET' AND 'GET' METHODS:
    // Patient general information 'set' methods:
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

    // General patient information 'get' methods:
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
}
