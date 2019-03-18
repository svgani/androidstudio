package com.example.amritha_manoharan.leap_year;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ey;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.text);
        ey = (EditText)findViewById(R.id.year);
    }

    public void check(View view) {
        String s1 = ey.getText().toString();
        if (s1.length() == 0) {
            ey.setError("Required");
            result.setText("Please Enter The Required Fields");
            result.setTextColor(Color.parseColor("#ff0000"));
        }
        else {
            int y = Integer.parseInt(s1);
            if(y%4 == 0||y%100 != 0 && y%400 == 0){
                result.setText("The Year "+Integer.toString(y)+" Is A Leap_Year");
                result.setTextColor(Color.parseColor("#2702E2"));
            }
            else {
                result.setText("The Year "+Integer.toString(y)+" Is Not A Leap_Year");
                result.setTextColor(Color.parseColor("#213223"));
            }
        }
            ey.setText("");
            ey.setHint("Next Year");
    }
}
