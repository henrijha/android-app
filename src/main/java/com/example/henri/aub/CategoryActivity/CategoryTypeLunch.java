package com.example.henri.aub.CategoryActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.henri.aub.R;
import com.example.henri.aub.Data.Recipes;
import com.example.henri.aub.Data.RecipesList;
/**CategoryTypeLunch class implements an adapter for recipe ListView and an OnItemClickListener for viewing recipe details on a new activity*/

public class CategoryTypeLunch extends Activity {

    private CategoryTypeLunch thisActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category2);

        thisActivity = this;

        /**Adapter for recipe ListView (lunch)*/
        ListView lv = findViewById(R.id.recipeList);
        lv.setAdapter(new ArrayAdapter<Recipes>(
                this,
                android.R.layout.simple_list_item_1,
                RecipesList.getInstance().getFromCategory("Lunch"))
        );
        /**On click, moves to next activity and gets lunch recipes*/
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent nextActivity = new Intent(thisActivity, RecipeDetailsActivity.class);
                nextActivity.putExtra("indeksi", i+3);
                startActivity(nextActivity);
            }
        });
    }
}
