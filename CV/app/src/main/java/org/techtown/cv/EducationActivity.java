package org.techtown.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EducationActivity extends AppCompatActivity implements View.OnClickListener {

    Button saveButton;
    EditText editSchool, editPeriodEdu, editMajor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        editSchool = findViewById(R.id.editSchool);
        editPeriodEdu = findViewById(R.id.editPeriodEdu);
        editMajor = findViewById(R.id.editMajor);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);

        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        editSchool.setText(sharedPreferences.getString("school", ""));
        editPeriodEdu.setText(sharedPreferences.getString("periodEdu", ""));
        editMajor.setText(sharedPreferences.getString("major", ""));
    }

    @Override
    public void onClick(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("school", editSchool.getText().toString());
        editor.putString("periodEdu", editPeriodEdu.getText().toString());
        editor.putString("major", editMajor.getText().toString());

        editor.commit();
    }

}