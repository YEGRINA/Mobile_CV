package org.techtown.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button perButton, carButton, eduButton, actButton, skiButton, createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        perButton = findViewById(R.id.perButton);
        carButton = findViewById(R.id.carButton);
        eduButton = findViewById(R.id.eduButton);
        actButton = findViewById(R.id.actButton);
        skiButton = findViewById(R.id.skiButton);
        createButton = findViewById(R.id.createButton);

        perButton.setOnClickListener(this);
        carButton.setOnClickListener(this);
        eduButton.setOnClickListener(this);
        actButton.setOnClickListener(this);
        skiButton.setOnClickListener(this);
        createButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == perButton) {
            Intent intent = new Intent(this, PersonalActivity.class);
            startActivity(intent);
        } else if(v == carButton) {
            Intent intent = new Intent(this, CareerActivity.class);
            startActivity(intent);
        } else if(v == eduButton) {
            Intent intent = new Intent(this, EducationActivity.class);
            startActivity(intent);
        } else if(v == actButton) {
            Intent intent = new Intent(this, ActivitiesActivity.class);
            startActivity(intent);
        } else if(v == skiButton) {
            Intent intent = new Intent(this, SkillsActivity.class);
            startActivity(intent);
        } else if(v == createButton) {
            Intent intent = new Intent(this, CreateActivity.class);
            startActivity(intent);
        }
    }
}