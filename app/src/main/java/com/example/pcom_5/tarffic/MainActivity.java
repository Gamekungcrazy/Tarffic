package com.example.pcom_5.tarffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //Main Metod

private  void  createListView() {
    MyData objMyData = new MyData();
    int[] intIcon = objMyData.icon();
    String[] strTitle = objMyData.title();

    MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle);
    ListView myListView = (ListView) findViewById(R.id.listView);
    myListView.setAdapter(objMyAdapter);
    }
} //Main Class
