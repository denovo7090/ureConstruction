package com.example.ureconstruction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

    public void goToopenNavi(View view) {
        EditText address;
        address = (EditText)findViewById(R.id.addressText);
        String location = address.getText().toString();
        location = location.replace(" ", "+");

        Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + location));
        startActivity(i);
    }
}