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
    String hyperglicemia;
    String hyperlipidemia;
    String insulin;
    String hypertension;
    String heart_cerebro;
    String diabetes;
    String obesity;
    String cholesterol;
    String arteriosclerosis;
    String depression;

    //sets y gets
    public void setName(String name_) {
        this.name = name_;
    }

    public void setAge(int age_) {
        this.age = age_;
    }

    public void setSex(String sex_) {
        this.sex = sex_;
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
}

// ALE: GENERAL SYMPTOMS GETS/SETS Y COGER INFO DE LOS CHECKBOXES (EJEMPLO EN PATIENT INFO)
// LU: MOTOR SYMPTOMS GETS/SETS, COGER INFO DE LOS CHECKBOXES, CLASE CONEXIÓN CLIPS
// ADRI: OTHER PATHOLOGIES GETS/SETS, COGER INFO DE LOS CHECKBOXES
