package com.example.amritha_manoharan.recycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     RecyclerView RecyclerView;
     RecyclerView.Adapter Adapter;
     RecyclerView.LayoutManager LayoutManager;

    ArrayList<String> list = new ArrayList<String>();
    String s1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v){
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }
}
