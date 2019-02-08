package com.example.henri.aub.Data;

import java.util.ArrayList;
/**Recipes class provides methods for the recipe's name, type(breakfast etc.), total calories, and ingredients*/
public class Recipes {
    private String name;/** recipe's name*/
    private String type; /** recipe's type (breakfast, lunch or dinner)*/
    private ArrayList<Ingredients> ingredients; /**List of all the ingredients*/
    private int totalCalories; /**Total amount of calories in one recipe*/
    /**Constructor for recipe class*/
    Recipes(String name, String type, ArrayList<Ingredients> ingredients) {
        this.name = name;
        this.type = type;
        this.ingredients = ingredients;
        this.totalCalories = getCalories(ingredients);
    }
    /**Method that returns recipe's type (breakfast, lunch or dinner)*/
    public String getType() {
        return this.type;
    }
    /**Method that returns the ingredient data from the ArrayList*/
    public ArrayList<Ingredients> getIngredients() {
        return this.ingredients;
    }
    /**For internal use only, calculates the total amount of calories using the ingredient's data*/
    private int getCalories(ArrayList<Ingredients> ingredients) {
        int totalCal = 0;
        for(int i = 0; i < ingredients.size(); i++) {
            if (IngredientsList.getInstance().getIngredients().contains(ingredients.get(i))) {
                totalCal += IngredientsList.getInstance().getIngredient(i).getCalories();
            }
        }
        return totalCal;
    }
    /**Method that returns the total amount of calories of a recipe*/
    public int getTotalCalories() {
        return this.totalCalories;
    }
    /**Method that returns the recipe's name*/
    public String toString() {
        return this.name;
    }
}