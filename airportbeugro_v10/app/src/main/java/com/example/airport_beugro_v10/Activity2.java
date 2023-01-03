package com.example.airport_beugro_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private Spinner citiesSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent  intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView textView1 = (TextView) findViewById(R.id.textview1);

        textView1.setText(text);


         // vezérlő keresése azonosító alapján
        citiesSpinner = findViewById(R.id.varosokSpinner);
        // spinner inicializálása
        initCitiesSpinner();
    }
    private void initCitiesSpinner() {
        // lista megjelenítéséhez létrehozunk egy adapter-t
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.varos_nevek, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        citiesSpinner.setAdapter(adapter);
    }
}