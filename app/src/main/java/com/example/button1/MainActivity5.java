package com.example.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private RatingBar  ratingBar;
    private TextView   value;
    private Button    button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar3);
        value = (TextView)findViewById(R.id.textView5);
        button =(Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float rating = ratingBar.getRating();
                value.setText(String.valueOf("SCORE"+rating));
            }
                                  }
        );
    }
}