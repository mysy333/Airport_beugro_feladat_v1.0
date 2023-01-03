package com.example.airport_beugro_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){

               EditText editText1 = (EditText) findViewById(R.id.edittext1);
               String text1 = editText1.getText().toString();

               EditText editText2 = (EditText) findViewById(R.id.edittext2);
               String text2 = editText2.getText().toString();


               if(text1.equals("admin") && text2.equals("Abc1357")) {
                   Toast.makeText(MainActivity.this, "Belépés engedélyezve!", Toast.LENGTH_SHORT).show();
                   openActivity2();
               }
                   else
                   Toast.makeText(MainActivity.this, "Belépés megtagadva!", Toast.LENGTH_SHORT).show();

           }
        });
    }

    public void openActivity2() {
        EditText editText1 = (EditText) findViewById(R.id.edittext1);
        String text1 = editText1.getText().toString();

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text1);
        startActivity(intent);
    }
}