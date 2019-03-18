package com.example.amritha_manoharan.recycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText Add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Add = (EditText)findViewById(R.id.additem);

    }
    public void done (View view){
        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(i);
    }
}
