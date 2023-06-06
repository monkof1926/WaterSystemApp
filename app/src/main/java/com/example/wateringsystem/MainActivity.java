package com.example.wateringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private EditText dateEdit;
    Button btnPlants = (Button)findViewById(R.id.Plants);
    Button btnGeneral = (Button)findViewById(R.id.General);
    Button btnButterfly = (Button)findViewById(R.id.Butterfly);
    Button btnTomato = (Button)findViewById(R.id.Tomato);
    WebView GoogleSheetWater1 = (WebView) findViewById(R.id.GoogleSheet);

    WebSettings webSettings = GoogleSheetWater1.getSettings();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateEdit = findViewById(R.id.Date);
        setContentView(GoogleSheetWater1);
        GoogleSheetWater1.loadUrl("https://script.google.com/macros/s/AKfycbyodLGc8M4wi89K8u_RRgYPE45tWQGehH4PbR_-fvyR3QtGBAjZsCG6WOx3AiyllKhWpQ/exec?");
        webSettings.setJavaScriptEnabled(true);
        GoogleSheetWater1.refreshDrawableState();
        btnPlants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openPlants();}
        });
        btnGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGeneral();
            }
        });
        btnButterfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButterfly();
            }
        });
        btnTomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBeef();
            }
        });

        dateEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();

                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                dateEdit.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        },
                       day, month, year);
                datePickerDialog.show();
            }
        });
    }
    public void openPlants() {
        Intent intent = new Intent(this, Plants.class);
        startActivity(intent);
    }
    public void openButterfly(){
        Intent intent = new Intent(this, Butterfly_plant.class);
        startActivity(intent);
    }
    public void  openBeef(){
        Intent intent = new Intent(this, Beef_Tomato.class);
        startActivity(intent);
    }
    public void  openGeneral(){
        Intent intent = new Intent(this, General.class);
        startActivity(intent);
    }
}