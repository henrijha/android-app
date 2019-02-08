package com.example.henri.aub.Data;

import java.util.ArrayList;
import java.util.Arrays;
/**RecipesList class (singleton) provides a data list of each recipe's name, ingredients and ingredient's data(name, amount, calories) and other return methods*/
    public class RecipesList {
        private static final RecipesList ourInstance = new RecipesList();
        private ArrayList<Recipes> recipes;

    public static RecipesList getInstance() {
        return ourInstance;
    }
/**Data list of each recipe's name, ingredients and ingredient's data(name, amount, calories)*/
    private RecipesList() {
        recipes = new ArrayList<>();
        recipes.add(new Recipes("Let's get this bread", "Breakfast", new ArrayList<Ingredients>(Arrays.asList( new Ingredients("Oats",0,0), new Ingredients("Wholemilk",0,0),
                new Ingredients("Frozen berries",0,0)))));

        recipes.add(new Recipes("Praise the sun", "Breakfast", new ArrayList<Ingredients>(Arrays.asList( new Ingredients("Oats",0,0), new Ingredients("Dates",0,0),
                new Ingredients("Eggs",0,0), new Ingredients("Wholemilk",0,0), new Ingredients("Banana",0,0)))));

        recipes.add(new Recipes("Wake me up", "Breakfast", new ArrayList<Ingredients>(Arrays.asList( new Ingredients("Oats",0,0), new Ingredients("Wholemilk",0,0),
                new Ingredients("Dates",0,0), new Ingredients("Olive oil",0,0)))));

        recipes.add(new Recipes("The AUB Special", "Lunch", new ArrayList<Ingredients>(Arrays.asList( new Ingredients("White rice",0,0), new Ingredients("Kidney beans",0,0),
                new Ingredients("Sriracha sauce",0,0), new Ingredients("Tomato sauce",0,0), new Ingredients("Ketchup",0,0),
                new Ingredients("Black pepper",0,0), new Ingredients("Sunflower seeds",0,0)))));

        recipes.add(new Recipes("The Grind", "Lunch", new ArrayList<Ingredients>(Arrays.asList( new Ingredients("Brown pasta",0,0), new Ingredients("Minced meat",0,0),
                new Ingredients("Tomato sauce",0,0), new Ingredients("Sliced onion",0,0), new Ingredients("Salt",0,0),
                new Ingredients("Black pepper",0,0), new Ingredients("Oregano",0,0)))));

        recipes.add(new Recipes("Spicy Unit", "Lunch", new ArrayList<Ingredients>(Arrays.asList( new Ingredients("Brown pasta",0,0), new Ingredients("Kidney beans",0,0),
                new Ingredients("Chili powder",0,0), new Ingredients("Corn kernels",0,0), new Ingredients("Minced meat",0,0),
                new Ingredients("Sliced onion",0,0), new Ingredients("Tomato sauce",0,0), new Ingredients("Flour",0,0), new Ingredients("Olive oil",0,0)))));

        recipes.add(new Recipes("King salad", "Dinner", new ArrayList<Ingredients>(Arrays.asList( new Ingredients("Quinoa",0,0), new Ingredients("Spinach",0,0),
                new Ingredients("Chickpeas",0,0), new Ingredients("Sun-dried tomatoes",0,0), new Ingredients("Olive oil",0,0)))));

        recipes.add(new Recipes("Cold pasta salad", "Dinner", new ArrayList<Ingredients>(Arrays.asList( new Ingredients("Cold pasta",0,0), new Ingredients("Spinach",0,0),
                new Ingredients("Corn kernels",0,0), new Ingredients("Sliced tomato",0,0), new Ingredients("Sliced onion",0,0), new Ingredients("Balsamic vinegar",0,0),
                new Ingredients("Olive oil",0,0)))));

        recipes.add(new Recipes("Absolute omelette", "Dinner", new ArrayList<Ingredients>(Arrays.asList( new Ingredients("Eggs",0,0), new Ingredients("Bell peppers",0,0),
                new Ingredients("Sliced onion",0,0), new Ingredients("Salt",0,0), new Ingredients("Black pepper",0,0), new Ingredients("Sliced tomato",0,0)))));

    }

    public ArrayList<Recipes> getRecipes() {
        return this.recipes;
    }

    public ArrayList<Recipes> getFromCategory(String category) {
        ArrayList<Recipes> localrecipes = new ArrayList<>();
        for (Recipes recipes1 : recipes) {
            if (recipes1.getType().equals(category)) {
                localrecipes.add(recipes1);
            }
        }
        return localrecipes;
    }

    public Recipes getRecipe(int i) {
        return this.recipes.get(i);
    }
}
