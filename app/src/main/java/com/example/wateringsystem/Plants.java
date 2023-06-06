package com.example.wateringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Plants extends AppCompatActivity {
    Button btn = (Button)findViewById(R.id.Beef_Tomato);
    Button btn2 = (Button)findViewById(R.id.Butterfly_plant);
    final TextView Beef_Tomato_Text = (TextView) findViewById(R.id.Beef_Tomato_Text);
    final TextView Butterfly_Plant_Text = (TextView) findViewById(R.id.Butterfly_Plant_Text);
    String Beef_Tomato_Texts = "Name: Beef tomato (Lycopersicon L.) \n" +
                              "Placing: In the light best in direct light \n" +
                              "Watering: Always Keep the soil humidity \n" +
                              "Fertilizer: Need fertilizer when watering";
    String Butterfly_Plant_Texts = "Name: Butterfly Plant(Buddleja) \n" +
                                   "Placing: In the light best in direct light \n" +
                                   "Watering: At first it need to be watering regularly then it can take som more \n " +
                                   "Fertilizer: Can be Fertilizer for bigger plants ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants);


        Beef_Tomato_Text.setText(Beef_Tomato_Texts);
        Butterfly_Plant_Text.setText(Butterfly_Plant_Texts);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openBeefTomato();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openButterfly();
            }
        });
    }
    public void openBeefTomato() {
        Intent intent = new Intent(this, Beef_Tomato.class);
        startActivity(intent);
    }
    public void openButterfly() {
        Intent intent = new Intent(this, Butterfly_plant.class);
        startActivity(intent);
    }

}