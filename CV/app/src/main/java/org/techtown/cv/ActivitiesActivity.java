package org.techtown.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivitiesActivity extends AppCompatActivity implements View.OnClickListener {

    Button saveButton;
    EditText editActivities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        editActivities = findViewById(R.id.editActivities);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);

        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        editActivities.setText(sharedPreferences.getString("activities", ""));
    }

    @Override
    public void onClick(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("activities", editActivities.getText().toString());

        editor.commit();
    }

}