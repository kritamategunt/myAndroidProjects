package com.example.myandroidprojectudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Project gettingStartedProject = new Project("Getting Started App", "first project with udemy,the default 'Hello World' app", 5);

        Project[] projects = {
                new Project("Getting Started App", "first project with udemy,the default 'Hello World' app", R.drawable.getting_started),
                new Project("Vin Quote", "des2", R.drawable.quote),
                new Project("BMI Calculator", "des3", R.drawable.calculator),
                new Project("Inches Converter", "des4", R.drawable.tape),
                new Project("The hungry developer", "des5", R.drawable.hungry_developer),
        };


    }
}