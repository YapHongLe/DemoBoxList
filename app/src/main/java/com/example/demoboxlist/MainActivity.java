package com.example.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<BoxList>alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listView);
        alBoxList = new ArrayList<>();
        BoxList box1 = new BoxList('B');
        alBoxList.add(box1);
        BoxList box2 = new BoxList('O');
        alBoxList.add(box2);
        BoxList box3 = new BoxList('C');
        alBoxList.add(box3);

        caBox = new CustomAdapter(this, R.layout.row, alBoxList);
        lvBox.setAdapter(caBox);

    }
}
