package com.example.henri.aub.CategoryActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.henri.aub.R;
import com.example.henri.aub.Data.RecipesList;
/**RecipeDetailsActivity class gets data from RecipesList class to display the content of each recipe*/
public class RecipeDetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);

        Intent intent = getIntent();
        Log.d("ZZZ", intent.toString());

        Bundle b = getIntent().getExtras();
        int i = b.getInt("indeksi", 0);

        TextView recipeType = findViewById(R.id.textviewType);
        TextView recipeName = findViewById(R.id.textviewName);
        TextView recipeIngredients = findViewById(R.id.textviewIngredients);

        recipeType.setText(RecipesList.getInstance().getRecipes().get(i).getType());
        recipeName.setText(RecipesList.getInstance().getRecipes().get(i).toString());
        recipeIngredients.setText(RecipesList.getInstance().getRecipes().get(i).getIngredients().toString());
    }
}
