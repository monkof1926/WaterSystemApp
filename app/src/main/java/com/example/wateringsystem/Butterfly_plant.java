package com.example.wateringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Butterfly_plant extends AppCompatActivity {

    final TextView Butterfly_Plant_Text = (TextView) findViewById(R.id.Butterfly_TextView);

    String Butterfly_Text = "Butterfly bush need a temperature between 16.6 to 34.3 degrees celsius and a relative humidity of 79.4% as well as a minimum of 10.5 cm a month";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterfly_plant);

        Butterfly_Plant_Text.setText(Butterfly_Text);
    }
}