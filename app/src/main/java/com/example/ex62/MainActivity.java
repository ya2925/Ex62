package com.example.ex62;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Switch sw;
    RadioGroup rg;
    RadioButton red, green, blue, yellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize the variables
        btn = findViewById(R.id.action);
        sw = findViewById(R.id.sw);
        rg = findViewById(R.id.rGroup);
        red = findViewById(R.id.Red);
        green = findViewById(R.id.Green);
        blue = findViewById(R.id.Blue);
        yellow = findViewById(R.id.Yellow);
    }

    /**
     * this will be on click of the button and every radio button
     * if the switch is on, change the background color immediately
     * if the switch is off, change the background color only when the button is pressed
     * @param view the view that was clicked
     */
    public void click(View view){
        if(sw.isChecked() || view.getId() == R.id.action){
            if(red.isChecked()){
                setActivityBackgroundColor(Color.parseColor("#FF0000"));
            }
            else if(green.isChecked()){
                setActivityBackgroundColor(Color.parseColor("#00FF00"));
            }
            else if(blue.isChecked()){
                setActivityBackgroundColor(Color.parseColor("#0000FF"));
            }
            else if(yellow.isChecked()){
                setActivityBackgroundColor(Color.parseColor("#FFFF00"));
            }
        }

    }

    /**
     * set the background color of the activity
     * @param color the color to set the background to
     */
    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}