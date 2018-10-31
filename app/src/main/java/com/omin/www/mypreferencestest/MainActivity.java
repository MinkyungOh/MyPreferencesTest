package com.omin.www.mypreferencestest;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static final int REQUEST_MAIN_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.buttonInput)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonGet)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.buttonInput:
                intent = new Intent(this, ReferenceInputActivity.class);
                break;
            case R.id.buttonGet:
                intent = new Intent(this, ReferenceGetActivity.class);
                break;
        }
        if(intent!=null)
            startActivityForResult(intent, REQUEST_MAIN_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        System.out.println("******************************");
//        System.out.println(requestCode);
//        System.out.println(resultCode);
//        System.out.println(data);
//        System.out.println("******************************");
        super.onActivityResult(requestCode, resultCode, data);
    }
}
