package com.example.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class checkbox extends AppCompatActivity {
    ImageView imageView3 ,imageView4, imageView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);

    }
    public void onCheckboxClicked(View view){
        boolean checked =((CheckBox)view).isChecked();

        switch (view.getId()){
            case R.id.checkBox4:
                if(checked) imageView3.setImageResource(R.drawable.booom);
                else imageView3.setImageResource(0);
                break;
            case R.id.checkBox5:
                if(checked) imageView4.setImageResource(R.drawable.dice_5);
                else imageView4.setImageResource(0);
                break;
            case R.id.checkBox6:
                if(checked) imageView5.setImageResource(R.drawable.chamchi);
                else imageView5.setImageResource(0);
                break;
        }
    }
}