package com.example.amritha_manoharan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class add extends AppCompatActivity {

    EditText Add;
    String Additem = "hai";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Add = (EditText)findViewById(R.id.additem);

    }
        public void done (View view){
            Intent i = new Intent(add.this, MainActivity.class);
            i.putExtra(Additem,Add.getText().toString());
            startActivity(i);
        }
}