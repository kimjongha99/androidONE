package com.example.button1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewTest extends Activity {
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewtest);

        // ① 데이터 원본 준비
        ArrayList<String> arGeneral = new ArrayList<String>();
        arGeneral.add("김유신");
        arGeneral.add("이순신");
        arGeneral.add("강감찬");
        arGeneral.add("을지문덕");

        // ② 어댑터 준비(선언 및 생성)
        ArrayAdapter<String> Adapter;
        Adapter = new ArrayAdapter<String>  (this,
                android.R.layout.simple_list_item_1, arGeneral);

        // ③ 리스트 뷰와 어댑터 연결
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adapter);
    }
}