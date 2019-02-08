package com.example.henri.aub.BMR;

import android.app.Application;

/**Basal metabolic rate calculator.
The point of this calculator is to estimate the needed daily calorie intake for user,
using the data which user inputs**/

public class BmrCalculator extends Application {
    private String userName;
    private int weight, height;
    private int age, exerciseAmount;
    private char gender;

    /** Constructor, exerAmount is 0, 1 or 2, gender is M (male) or F (female) **/
    public BmrCalculator(String userName, int weight, int height, int age, int exerciseAmount, char gender) {
        this.userName = userName;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.exerciseAmount = exerciseAmount;
        this.gender = gender;

    }

    /**Get or Set **/
    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExerciseAmount() {
        return exerciseAmount;
    }

    public void setExerciseAmount(int exerciseAmount) {
        this.exerciseAmount = exerciseAmount;
    }

    @Override
    public String toString() {
        return "BmrCalculator{" +
                "Your name:'" + userName + '\'' +
                ", Weight:" + weight +
                ", Height:" + height +
                ", Age:" + age +
                ", The level of exercise:" + exerciseAmount +
                ", Gender:" + gender +
                '}';
    }

    /**Calculate BMR method **/
    public float calculateBMR() {
        float bmrValue;
        if (gender == 'm' || gender == 'M') {
            bmrValue = 66.5f + (13.75f * weight) + (5.003f * height) - (6.755f * age);
        } else {
            bmrValue = 655.1f + (9.563f * weight) + (1.850f * height) - (4.676f * age);
        }
        return bmrValue;
    }

    /**Calculate BMR with exercise method **/
    public float bmrExercise() {
        float bmrExercise;
        float bmrValue = calculateBMR();

        if (exerciseAmount == 0) {
            bmrExercise = bmrValue * 1.53f;
        } else if (exerciseAmount == 1) {
            bmrExercise = bmrValue * 1.76f;
        } else {
            bmrExercise = bmrValue * 2.25f;
        }
        return bmrExercise;
    }

}
