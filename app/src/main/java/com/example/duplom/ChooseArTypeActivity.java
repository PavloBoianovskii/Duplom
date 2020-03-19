package com.example.duplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseArTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_ar_type);
    }

    public void arTypeModelOnPlane(View view) {
        Intent intent = new Intent(this, ModelOnPlaneActivity.class);
        startActivity(intent);
    }

    public void arTypeArImage(View view) {
        Intent intentImage = new Intent(this, ArImageActivity.class);
        startActivity(intentImage);
    }
}
