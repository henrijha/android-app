package com.example.henri.aub.Data;
import java.util.ArrayList;
/**IngredientsList class (singleton) provides a data list of the ingredients and their data(name, amount, calories) and other return methods*/

public class IngredientsList {
    private static final IngredientsList ourInstance = new IngredientsList();
    private ArrayList<Ingredients> ingredients;

    public static IngredientsList getInstance() {
        return ourInstance;
    }
    /**Data list of each ingredient's name, amount and calories*/
    private IngredientsList() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredients("Kidney Beans",100,333));
        ingredients.add(new Ingredients("White rice",100,365));
        ingredients.add(new Ingredients("Sriracha sauce",100,125));
        ingredients.add(new Ingredients("Ketchup",100,112));
        ingredients.add(new Ingredients("Tomato sauce",100,29));
        ingredients.add(new Ingredients("Black pepper",100,250));
        ingredients.add(new Ingredients("Brown pasta",100,370));
        ingredients.add(new Ingredients("Minced meat",100,333));
        ingredients.add(new Ingredients("Sliced onion",100,40));
        ingredients.add(new Ingredients("Salt",100,0));
        ingredients.add(new Ingredients("Oregano",100,270));
        ingredients.add(new Ingredients("Olive oil",100,880));
        ingredients.add(new Ingredients("Quinoa",100,340));
        ingredients.add(new Ingredients("Spinach",100,23));
        ingredients.add(new Ingredients("Chickpea",100,360));
        ingredients.add(new Ingredients("Sun-dried tomatoes",100,200));
        ingredients.add(new Ingredients("Corn kernels",100,64));
        ingredients.add(new Ingredients("Sliced tomato",100,18));
        ingredients.add(new Ingredients("Balsamic vinegar",100,80));



    }
    /**Method that returns ingredient data*/
    public ArrayList<Ingredients> getIngredients() {
        return this.ingredients;
    }
    /**Method that returns a specific ingredient*/
    public Ingredients getIngredient(int i) {
        return this.ingredients.get(i);
    }
    /**Method that returns a specific ingredient by name*/
    public Ingredients getIngredient(String name) {
        int index = this.ingredients.indexOf(name);
        return getIngredient(index);
    }
}
