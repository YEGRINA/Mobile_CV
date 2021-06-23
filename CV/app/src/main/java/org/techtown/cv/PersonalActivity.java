package org.techtown.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersonalActivity extends AppCompatActivity implements View.OnClickListener {

    Button saveButton;
    EditText editName, editBirth, editAddress, editEmail, editPhoneNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        editName = findViewById(R.id.editName);
        editBirth = findViewById(R.id.editBirth);
        editAddress = findViewById(R.id.editAddress);
        editEmail = findViewById(R.id.editEmail);
        editPhoneNum = findViewById(R.id.editPhoneNum);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);

        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        editName.setText(sharedPreferences.getString("name", ""));
        editBirth.setText(sharedPreferences.getString("birth", ""));
        editAddress.setText(sharedPreferences.getString("address", ""));
        editEmail.setText(sharedPreferences.getString("email", ""));
        editPhoneNum.setText(sharedPreferences.getString("phoneNum", ""));
    }

    @Override
    public void onClick(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("spf", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("name", editName.getText().toString());
        editor.putString("birth", editBirth.getText().toString());
        editor.putString("address", editAddress.getText().toString());
        editor.putString("email", editEmail.getText().toString());
        editor.putString("phoneNum", editPhoneNum.getText().toString());

        editor.commit();
    }

}