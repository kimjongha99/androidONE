package com.example.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button colorButton = findViewById(R.id.colorButton);
        Button colorButton1 = findViewById(R.id.colorButton1);
        Button colorButton2 = findViewById(R.id.colorButton2);
        Button colorButton3 = findViewById(R.id.colorButton3);
        Button colorButton4 = findViewById(R.id.colorButton4);

        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int red = (int) (Math.random() * 256);
                int green = (int) (Math.random() * 256);
                int blue = (int) (Math.random() * 256);

                int randomColor = Color.rgb(red, green, blue);
                colorButton.setBackgroundColor(randomColor);

            }
        });
        colorButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int red = (int) (Math.random() * 256);
                int green = (int) (Math.random() * 256);
                int blue = (int) (Math.random() * 256);

                int randomColor = Color.rgb(red, green, blue);
                colorButton1.setBackgroundColor(randomColor);

            }
        });colorButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int red = (int) (Math.random() * 256);
                int green = (int) (Math.random() * 256);
                int blue = (int) (Math.random() * 256);

                int randomColor = Color.rgb(red, green, blue);
                colorButton2.setBackgroundColor(randomColor);

            }
        });colorButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int red = (int) (Math.random() * 256);
                int green = (int) (Math.random() * 256);
                int blue = (int) (Math.random() * 256);

                int randomColor = Color.rgb(red, green, blue);
                colorButton3.setBackgroundColor(randomColor);

            }
        });colorButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int red = (int) (Math.random() * 256);
                int green = (int) (Math.random() * 256);
                int blue = (int) (Math.random() * 256);

                int randomColor = Color.rgb(red, green, blue);
                colorButton4.setBackgroundColor(randomColor);

            }
        });

    }
}