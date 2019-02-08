package com.example.henri.aub.BMR;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.henri.aub.R;

/** BMR menu takes the user's inputted information and processes it with BmrCalculator.class to produce
sufficient figures for CalorieIntake - activity
 */

public class BmrMenu extends Activity {

    private Button nextBtn; /**button to process the information and move to the next activity*/


    /**Necessary data inputs for bmr calculator*/
    private String name;
    private int weight;
    private int height;
    private int age;
    private int exerAmount;
    private char gender;

    EditText nameInput;
    EditText weightInput;
    EditText heightInput;
    EditText ageInput;
    RadioButton genderSelect;
    RadioButton exerSelect;

    /**Calorie export*/
    private int calorieCount;
    public static BmrCalculator user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr_menu);
        nameInput = (EditText) findViewById(R.id.nameText);
        weightInput = (EditText) findViewById(R.id.weightText);
        heightInput = (EditText) findViewById(R.id.heightText);
        ageInput = (EditText) findViewById(R.id.ageText);
        nextBtn = (Button) findViewById(R.id.nextBtn);
        genderSelect = (RadioButton) findViewById(R.id.radioFemale);
        genderSelect = (RadioButton) findViewById(R.id.radioMale);
        exerSelect = (RadioButton) findViewById(R.id.exerRadio1);
        exerSelect = (RadioButton) findViewById(R.id.exerRadio2);
        exerSelect = (RadioButton) findViewById(R.id.exerRadio3);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                weight = Integer.parseInt(weightInput.getText().toString());
                height = Integer.parseInt(heightInput.getText().toString());
                age = Integer.parseInt(ageInput.getText().toString());
                user = new BmrCalculator(name, weight, height, age, exerAmount, gender);
                user.calculateBMR();

                openCalorieintake();

            }

        });
    }

    /**Method for opening next activity*/
    public void openCalorieintake() {
        Intent intent = new Intent(this, CalorieIntake.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view) {
        /**Is the button now checked?*/
        boolean checked = ((RadioButton) view).isChecked();

        /**Check which radio button was clicked*/
        switch(view.getId()) {
            case R.id.radioMale:
                if (checked) {
                    gender = 'M';
                    break;
                }
            case R.id.radioFemale:
                if (checked) {
                    gender = 'F';
                    break;
                }
            case R.id.exerRadio1:
                if (checked) {
                    exerAmount = 0;
                    break;
                }
            case R.id.exerRadio2:
                if (checked) {
                    exerAmount = 1;
                    break;
                }
            case R.id.exerRadio3:
                if (checked) {
                    exerAmount = 2;
                    break;
                }
        }
    }
}
