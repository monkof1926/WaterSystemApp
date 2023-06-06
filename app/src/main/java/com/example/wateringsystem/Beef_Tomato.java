package com.example.wateringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Beef_Tomato extends AppCompatActivity {

    final TextView Beef_Tomato_Text = (TextView) findViewById(R.id.Beef_Tomato_TextView);

    String Beef_Tomato_Texts = "The Optimal temperature for tomatoes is 25-30 degrees celsius at day time and 16-20 degrees celsius at night time";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef_tomato);

        Beef_Tomato_Text.setText(Beef_Tomato_Texts);
    }
}