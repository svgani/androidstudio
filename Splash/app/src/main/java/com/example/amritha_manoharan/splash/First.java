package com.example.amritha_manoharan.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class First extends AppCompatActivity {

    Handler h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(First.this,splash.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
