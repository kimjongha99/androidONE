package com.example.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class randomNum extends AppCompatActivity {
    private int randomNumber;
    private EditText guessEditText;
    private Button submitButton;
    private Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_num);

        guessEditText = findViewById(R.id.guessEditText);
        submitButton = findViewById(R.id.guessButton);

        randomNumber = random.nextInt(100) + 1;

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGuess();
            }
        });
    }
    private void checkGuess() {
        String guessText = guessEditText.getText().toString();

        if (guessText.isEmpty()) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
            return;
        }

        int guess = Integer.parseInt(guessText);

        if (guess < 1 || guess > 100) {
            Toast.makeText(this, "Please enter a number between 1 and 100", Toast.LENGTH_SHORT).show();
            return;
        }

        if (guess == randomNumber) {
            Toast.makeText(this, "You guessed it right!", Toast.LENGTH_SHORT).show();
        } else if (guess < randomNumber) {
            Toast.makeText(this, "Try higher", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Try lower", Toast.LENGTH_SHORT).show();
        }
    }
}