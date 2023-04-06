package com.example.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView tv1, tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        tv1= (TextView) findViewById(R.id.textView);
        tv2= (TextView) findViewById(R.id.textView2);
        tv3= (TextView) findViewById(R.id.textView3);


        tv1.setText("자바코드로변경됬습니다.");
        tv2.setTextColor(Color.BLUE);
        tv2.setTextSize(60);
        tv3.setTypeface(Typeface.SERIF,Typeface.ITALIC);

    }
}