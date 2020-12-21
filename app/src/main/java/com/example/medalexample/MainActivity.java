package com.example.medalexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textMessage = findViewById(R.id.textView);
        final Button Button1 = findViewById(R.id.button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button1.setBackgroundColor(Color.GRAY);
                textMessage.setText("You won Gold!");
            }
        });
        final Button Button2 = findViewById(R.id.button2);
        Button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button2.setBackgroundColor(Color.GRAY);
                textMessage.setText("You won Silver!");
            }
        });
        final Button Button3 = findViewById(R.id.button3);
        Button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button3.setBackgroundColor(Color.GRAY);
                textMessage.setText("You won Bronze!");
            }
        });

    }
}