package com.example.button1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.appcompat.widget.ViewUtils;

public class MyView extends View {
    public MyView (Context context) {
        super(context);
        setBackgroundColor(Color.BLUE);
    }
    @Override
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(20);
        canvas.drawLine(100,100,800,100,paint);
        canvas.drawRect(100,300,700,700,paint);
        canvas.drawCircle(100,100,100,paint );
        paint.setTextSize(80);
        canvas.drawText("this is a test",100,900,paint);

    }


}
