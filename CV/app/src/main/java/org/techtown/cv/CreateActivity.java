package org.techtown.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class CreateActivity extends AppCompatActivity {

    TextView name_, birth_, address_, email_, phoneNum_, where_, periodCar_, position_, task_,
            school_, periodEdu_, major_, activities_, skills_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        name_ = findViewById(R.id.name_);
        birth_ = findViewById(R.id.birth_);
        address_ = findViewById(R.id.address_);
        email_ = findViewById(R.id.email_);
        phoneNum_ = findViewById(R.id.phoneNum_);
        where_ = findViewById(R.id.where_);
        periodCar_ = findViewById(R.id.periodCar_);
        position_ = findViewById(R.id.position_);
        task_ = findViewById(R.id.task_);
        school_ = findViewById(R.id.school_);
        periodEdu_ = findViewById(R.id.periodEdu_);
        major_ = findViewById(R.id.major_);
        activities_ = findViewById(R.id.activities_);
        skills_ = findViewById(R.id.skills_);

        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        name_.setText(sharedPreferences.getString("name", ""));
        birth_.setText(sharedPreferences.getString("birth", ""));
        address_.setText(sharedPreferences.getString("address", ""));
        email_.setText(sharedPreferences.getString("email", ""));
        phoneNum_.setText(sharedPreferences.getString("phoneNum", ""));
        where_.setText(sharedPreferences.getString("where", ""));
        periodCar_.setText(sharedPreferences.getString("periodCar", ""));
        position_.setText(sharedPreferences.getString("position", ""));
        task_.setText(sharedPreferences.getString("task", ""));
        school_.setText(sharedPreferences.getString("school", ""));
        periodEdu_.setText(sharedPreferences.getString("periodEdu", ""));
        major_.setText(sharedPreferences.getString("major", ""));
        activities_.setText(sharedPreferences.getString("activities", ""));
        skills_.setText(sharedPreferences.getString("skills", ""));
    }
}