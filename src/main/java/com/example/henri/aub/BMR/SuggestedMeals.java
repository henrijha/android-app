package com.example.henri.aub.BMR;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.henri.aub.MainActivity;
import com.example.henri.aub.R;

import java.lang.reflect.Method;

/**SuggestedMeals class provides a menu for users to see recipes for the whole day*/

public class SuggestedMeals extends Activity {

    private Button menu;
    private Button suggestedbf;
    private Button suggestedlunch;
    private Button suggesteddinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggested_meals);

        menu = findViewById(R.id.suggestbuttonMenu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu();
            }
        });

        suggestedbf = findViewById(R.id.suggestbutton1);

        suggestedbf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestedbf();
            }
        });

        suggestedlunch = findViewById(R.id.suggestbutton2);

        suggestedlunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestedlunch();
            }
        });

        suggesteddinner = findViewById(R.id.suggestbutton3);

        suggesteddinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggesteddinner();
            }
        });
    }
    /**Method that leads to main activity*/
    public void openMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    /**Method that leads to suggested breakfast recipes activity*/
    public void openSuggestedbf() {
        Intent intent = new Intent(this, Suggestedbf.class);
        startActivity(intent);
    }
    /**Method that leads to suggested lunch recipes activity*/
    public void openSuggestedlunch(){
        Intent intent = new Intent(this, Suggestedlunch.class);
        startActivity(intent);
    }
    /**Method that leads to suggested dinner recipes activity*/
    public void openSuggesteddinner(){
        Intent intent = new Intent(this, Suggesteddinner.class);
        startActivity(intent);
    }
}
