package com.example.amritha_manoharan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list = new ArrayList<String>();
    String s1;
    //EditText Add;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_text, list);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        list.add("APPLE");
        list.add("BOY");
        list.add("CAMEL");
        list.add("DOG");
    }

    public void add(View v){
        Intent i = new Intent(MainActivity.this, add.class);
        startActivity(i);
    }

}
