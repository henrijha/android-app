package com.example.henri.aub;
/**MainActivity class provides a method that opens a new activity depending on which button is pressed*/
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.henri.aub.BMR.BmrMenu;
import com.example.henri.aub.CategoryActivity.CategoryTypeBreakfast;
import com.example.henri.aub.CategoryActivity.CategoryTypeDinner;
import com.example.henri.aub.CategoryActivity.CategoryTypeLunch;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Method that opens a new activity that displays different data based on which button is pressed*/
    public void gotoCategory(View view) {
        Intent intent = null;

        /**If lunch button pressed*/
        if (view == findViewById(R.id.buttonbf)) intent = new Intent(this, CategoryTypeBreakfast.class);
        /**Dinner button pressed*/
        if (view == findViewById(R.id.buttonlun)) intent = new Intent(this, CategoryTypeLunch.class);
        /**Lunch button pressed*/
        if (view == findViewById(R.id.buttondin)) intent = new Intent(this, CategoryTypeDinner.class);
        /**Bmr button pressed*/
        if (view == findViewById(R.id.buttonbmr)) intent = new Intent(this, BmrMenu.class);

        startActivity(intent); /**Start the activity as chosen by if-true-false*/
    }
}
