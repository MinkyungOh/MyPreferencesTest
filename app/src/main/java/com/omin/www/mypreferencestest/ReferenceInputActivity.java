package com.omin.www.mypreferencestest;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReferenceInputActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextName, editTextPassword, editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_input);

        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);

        SharedPreferences sharedPreferences = getSharedPreferences("AWEPrefs", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("nameKey", "");
        String password = sharedPreferences.getString("passwordKey", "");
        String email = sharedPreferences.getString("emailKey", "");

        editTextName.setText(name);
        editTextPassword.setText(password);
        editTextEmail.setText(email);

        ((Button)findViewById(R.id.buttonSave)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonBack)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSave:
                String nameText = editTextName.getText().toString();
                String passwordText = editTextPassword.getText().toString();
                String emailText = editTextEmail.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("AWEPrefs", Context.MODE_PRIVATE).edit();
                editor.putString("nameKey", nameText);
                editor.putString("passwordKey", passwordText);
                editor.putString("emailKey", emailText);
                editor.commit();
                break;
            case R.id.buttonBack:
                break;
        }

        super.finish();
    }
}
