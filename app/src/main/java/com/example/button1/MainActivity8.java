package com.example.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity8 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        radioGroup = findViewById(R.id.radioGroup);
        imageView = findViewById(R.id.imageView6);
        button = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                switch (selectedId) {
                    case R.id.radioButton:
                        imageView.setImageResource(R.drawable.booom);
                        break;
                    case R.id.radioButton2:
                        imageView.setImageResource(R.drawable.button);
                        break;
                    case R.id.radioButton3:
                        imageView.setImageResource(R.drawable.chamchi);
                        break;
                }
            }
        });
    }
}
