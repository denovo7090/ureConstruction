package com.example.ureconstruction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ButtonPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_practice);

    }

    public void goToMapsActivity(View view) {
        Intent intent3 = new Intent(this, MapsActivity.class);
        startActivity(intent3);
    }

    public void goToMainActivity(View view) {
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);
    }

}