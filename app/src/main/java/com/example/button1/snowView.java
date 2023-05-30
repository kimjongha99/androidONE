package com.example.button1;


import java.util.*;

import android.content.*;
import android.graphics.*;
import android.os.*;
import android.view.*;

import androidx.appcompat.app.AppCompatActivity;

// 볼 하나에 대한 정보
class Snow {
    int x, y;
    int rad;
    int dx, dy;
    int color;
    int count;

    // 새로운 볼 생성
    static Snow Create(int x, int y, int Rad) {
        Random Rnd = new Random();
        Snow NewSnow = new Snow();

        NewSnow.x = x;
        NewSnow.y = y;
        NewSnow.rad = Rad;
        do {
            NewSnow.dx = Rnd.nextInt(11) - 5;
            NewSnow.dy = Rnd.nextInt(11) - 5;
        } while (NewSnow.dx == 0 || NewSnow.dy == 0);

        NewSnow.count = 0;
        NewSnow.color = Color.WHITE;

        return NewSnow;
    }

    // 볼 이동
    void Move(int Width, int Height) {
        x += dx;

        if (x < rad || x > Width - rad) {
            dx *= -1;
            count++;
        }

        y += dy; // y 좌표값을 증가시켜 아래로 이동

        if (y > Height - rad) {
            dy = 0; // 아래로 이동할 때 y 방향 속도를 0으로 설정하여 더 이상 이동하지 않도록 함
        }
    }

    // 그리기
    void Draw(Canvas canvas) {
        Paint pnt = new Paint();
        pnt.setAntiAlias(true);

        int r;
        int alpha;

        for (r = rad, alpha = 50; r > 0; r -= 2, alpha += 5) {
            pnt.setColor(Color.argb(alpha, 255, 255, 255)); // 투명도와 흰색으로 설정
            canvas.drawCircle(x, y, r, pnt);
        }
    }

}

public class snowView extends AppCompatActivity {
    MyView vw;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vw = new MyView(this);
        setContentView(vw);
    }
}

class MyView extends View {
    Bitmap mBack;
    ArrayList<Snow> arSnow = new ArrayList<Snow>();
    final static int DELAY = 50;
    final static int RAD = 54;

    public MyView(Context context) {
        super(context);
        mBack = BitmapFactory.decodeResource(context.getResources(), R.drawable.blackview);
        mHandler.sendEmptyMessageDelayed(0,DELAY);
    }

    // 새로운 볼 생성
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Snow NewBall = Snow.Create((int)event.getX(), (int)event.getY(), RAD);
            arSnow.add(NewBall);
            invalidate();
            return true;
        }
        return false;
    }

    // 화면 그리기
    public void onDraw(Canvas canvas) {
        Rect dst = new Rect(0,0,getWidth(),getHeight());
        canvas.drawBitmap(mBack, null, dst, null);
        for (int idx = 0;idx < arSnow.size(); idx++) {
            arSnow.get(idx).Draw(canvas);
        }
    }

    // 볼 이동 및 화면 무효화
    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            Snow B;
            for (int idx = 0;idx < arSnow.size(); idx++) {
                B = arSnow.get(idx);
                B.Move(getWidth(), getHeight());
                if (B.count > 4) {
                    arSnow.remove(idx);
                    idx--;
                }
            }

            invalidate();
            mHandler.sendEmptyMessageDelayed(0,DELAY);
        }
    };
}
