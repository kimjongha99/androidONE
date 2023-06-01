package com.example.button1;


import android.app.Activity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAddDel extends Activity {
    ArrayList<String> Items;
    ArrayAdapter<String> Adapter;
    ListView list;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listadddel);
        Items = new ArrayList<String>();
        Items.add("First");
        Items.add("Second");
        Items.add("Third");

        Adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice, Items);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(Adapter);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setOnItemClickListener(mItemClickListener);
        findViewById(R.id.add).setOnClickListener(mClickListener);
        findViewById(R.id.delete).setOnClickListener(mClickListener);
    }


    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            EditText ed = findViewById(R.id.newitem);
            switch (v.getId()) {
                case R.id.add:
                    String text = ed.getText().toString();
                    if (text.length() != 0) {
                        Items.add(text);
                        ed.setText("");
                        Adapter.notifyDataSetChanged();
                    }
                    break;
                case R.id.delete:
                    SparseBooleanArray checkedPositions = list.getCheckedItemPositions();
                    for (int i = checkedPositions.size() - 1; i >= 0; i--) {
                        int position = checkedPositions.keyAt(i);
                        if (checkedPositions.valueAt(i)) {
                            Items.remove(position);
                        }
                    }
                    list.clearChoices();
                    Adapter.notifyDataSetChanged();
                    break;
            }
        }
    };


    AdapterView.OnItemClickListener mItemClickListener
            = new AdapterView.OnItemClickListener()  {
        public void onItemClick(AdapterView parent, View view,
                                int position, long id)  {
            String mes;
            mes = "Select Item = " + Items.get(position);
            Toast.makeText(ListAddDel.this, mes,
                    Toast.LENGTH_SHORT).show();
        }
    };
}