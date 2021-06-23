package org.techtown.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SkillsActivity extends AppCompatActivity implements View.OnClickListener {

    Button saveButton;
    EditText editSkills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        editSkills = findViewById(R.id.editSkills);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);

        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        editSkills.setText(sharedPreferences.getString("skills", ""));
    }

    @Override
    public void onClick(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("skills", editSkills.getText().toString());

        editor.commit();
    }

}