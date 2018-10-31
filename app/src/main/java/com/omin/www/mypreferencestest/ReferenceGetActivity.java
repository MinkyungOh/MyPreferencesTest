package com.omin.www.mypreferencestest;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReferenceGetActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_get);

        SharedPreferences sharedPreferences = getSharedPreferences("AWEPrefs", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("nameKey", "");
        String password = sharedPreferences.getString("passwordKey", "");
        String email = sharedPreferences.getString("emailKey", "");

        ((TextView)findViewById(R.id.textViewName)).setText("Name: " + name);
        ((TextView)findViewById(R.id.textViewPassword)).setText("Password: " + password);
        ((TextView)findViewById(R.id.textViewEmail)).setText("Email: " + email);

        ((Button)findViewById(R.id.buttonBack)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.finish();
    }
}
