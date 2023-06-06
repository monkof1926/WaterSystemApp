package com.example.wateringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class General extends AppCompatActivity {

    final TextView Soil_TextView = (TextView) findViewById(R.id.Soil_TextView);

    String Soil_Text = "The General values are chosen as a mean for the danish climate and the soil humidity is taken after test and from the fablab higrow experiment ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        Soil_TextView.setText(Soil_Text);
    }

}