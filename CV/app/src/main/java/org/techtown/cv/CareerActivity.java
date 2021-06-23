package org.techtown.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CareerActivity extends AppCompatActivity implements View.OnClickListener {

    Button saveButton;
    EditText editWhere, editPeriodCar, editPosition, editTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);

        editWhere = findViewById(R.id.editWhere);
        editPeriodCar = findViewById(R.id.editPeriodCar);
        editPosition = findViewById(R.id.editPosition);
        editTask = findViewById(R.id.editTask);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);

        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        editWhere.setText(sharedPreferences.getString("where", ""));
        editPeriodCar.setText(sharedPreferences.getString("periodCar", ""));
        editPosition.setText(sharedPreferences.getString("position", ""));
        editTask.setText(sharedPreferences.getString("task", ""));
    }

    @Override
    public void onClick(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("where", editWhere.getText().toString());
        editor.putString("periodCar", editPeriodCar.getText().toString());
        editor.putString("position", editPosition.getText().toString());
        editor.putString("task", editTask.getText().toString());

        editor.commit();
    }

}