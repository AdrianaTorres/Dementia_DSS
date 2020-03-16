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
    String lossPhysicalAbilities;
    String tremorUni;
    String tremorBi;

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
    public void setFamilyHis (String family_his_){
        this.family_his = family_his_;
    }
    
    public void setLowEducation (String low_education_){
        this.low_education = low_education_;
    }
    
    public void setBehaviour (String behaviour_){
        this.behaviour = behaviour_;
    }
    
    public void setEmotionalInstability (String emotional_instability_){
        this.emotional_instability = emotional_instability_;
    }
    
    public void setRightWords (String right_words_){
        this.right_words = right_words_;
    }
    
    public void setForgetPersonal (String forget_personal_){
        this.forget_personal = forget_personal_;
    }
    
    public void setFacialExp (String facial_exp_){
        this.facial_exp = facial_exp_;
    }
    
    public void setPlanningOrg (String planning_org_){
        this.planning_org = planning_org_;
    }
    
    public void setForgetRecent (String forget_recent_){
        this.forget_recent = forget_recent_;
    }
    
    public void setSleepingPattern (String sleeping_pattern_){
        this.sleeping_pattern = sleeping_pattern_;
    }
    
    public void setLossSmell (String loss_smell_){
        this.loss_smell = loss_smell_;
    }
    
    public void setIncontinence (String incontinence_){
        this.incontinence = incontinence_;
    }
    
    public void setExposure (String exposure_){
        this.exposure = exposure_;
    }
    
    public void setSmoking (String smoking_){
        this.smoking = smoking_;
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
    public void setLossPhysicalAbilities(String lossPhysicalAbilities_) {
        this.lossPhysicalAbilities = lossPhysicalAbilities_;
    }
    
    public void setTremorUni (String tremorUni_) {
        this.tremorUni = tremorUni_;
    }
    
    public void setTremorBi(String tremorBi_) {
        this.tremorBi = tremorBi_;
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
    
    
    public String getLackCoord () {
        return this.lack_coord;
    }
    
    // Motor symptoms 'get' methods:
    public String getStandWalk () {
        return this.stand_walk;
    }
    
    public String getStiffness () {
        return this.stiffness;
    }

    public String getLossBalance () {
        return this.loss_balance;
    }
    
    public String getWalkStraight () {
        return this.walk_straight;
    }
    
    public String getTremor () {
        return this.tremor;
    }
    
    public String getOrientationL () {
        return this.orientation_low;
    }
    
    public String getOrientationh () {
        return this.orientation_high;
    }
    
    public String getBradykinesiaL () {
        return this.bradykinesia_low;
    }
    
    public String getBradykinesiaM () {
        return this.bradykinesia_medium;
    }
    
    public String getBradykinesiaH () {
        return this.bradykinesia_high;
    }

    // Other pathologies 'get' methods:
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
    public String getLossPhysicalAbilities() {
        return this.lossPhysicalAbilities;
    }
    
    public String getTremorUni() {
        return this.tremorUni;
    }
    
    public String getTremorBi() {
        return this.tremorBi;
    }
}