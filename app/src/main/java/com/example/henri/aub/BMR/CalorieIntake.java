package com.example.henri.aub.BMR;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.henri.aub.R;

import org.w3c.dom.Text;

import static com.example.henri.aub.BMR.BmrMenu.user;

/**CalorieIntake menu provides the necessary info for user to see the needed calorie intake*/

public class CalorieIntake extends Activity {

    private Button recipes;

    TextView calorieStay;
    TextView calorieGain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_intake);

        recipes = findViewById(R.id.torecipesBtn);
        recipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestedMeals();
            }
        });

        calorieGain = findViewById(R.id.calorieSurplus);
        calorieStay = findViewById(R.id.calorieMaintain);
        calorieStay.setText(Float.toString(user.bmrExercise()));
        calorieGain.setText(Float.toString(user.bmrExercise() + 400));

    }
    /**Method that leads to the suggested meals activity*/
    public void openSuggestedMeals() {
        Intent intent = new Intent(this, SuggestedMeals.class);
        startActivity(intent);
    }
}
