package com.example.henri.aub.Data;
/**Ingredients class provides methods for the name, amount(grams) and calories of each ingredient*/
public class Ingredients {
    private String name; /**Name of the ingredient*/
    private int amount; /**The amount of the ingredient in grams*/
    private int calories; /**Total calories of the amount of the ingredient*/
    /**When creating new ingredients*/
    public Ingredients(String name, int amount, int calories){
        this.name = name;
        this.amount = amount;
        this.calories = calories;
    }
    /**When using existing ingredients*/
    public Ingredients(String name, int amount) {
        this.name = name;
        this.amount = amount;
        this.calories = getCalories(name);
    }
    /**Return ingredient's amount in grams*/
    public int getAmount(){
        return this.amount;
    }
    /**Return this ingredient's calories*/
    public int getCalories(){
        return this.calories;
    }
    /**Get the calories from the singleton where they are defined, using the ingredient name*/
    public int getCalories(String name) {
        return IngredientsList.getInstance().getIngredient(name).getCalories();
    }
    /**Return ingredient's name*/
    public String toString() {
        return this.name;
    }
}
