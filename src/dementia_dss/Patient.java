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

    String name;
    int age;
    String sex;
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

    // Sets and gets methods:
    public void setName(String name_) {
        this.name = name_;
    }

    public void setAge(int age_) {
        this.age = age_;
    }

    public void setSex(String sex_) {
        this.sex = sex_;
    }
    
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

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }
    
    public String getLackCoord () {
        return this.lack_coord;
    }
    
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
    
}

// ALE: GENERAL SYMPTOMS GETS/SETS Y COGER INFO DE LOS CHECKBOXES (EJEMPLO EN OTHER PATHOLOGIES)
// LU: MOTOR SYMPTOMS GETS/SETS, COGER INFO DE LOS CHECKBOXES, CLASE CONEXIÓN CLIPS
// ADRI: OTHER PATHOLOGIES GETS/SETS, COGER INFO DE LOS CHECKBOXES
