package com.example.amritha_manoharan.words;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button find;
    Button clear;
    EditText num;
    TextView words;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find = (Button)findViewById(R.id.Find);
        clear = (Button)findViewById(R.id.clear);
        num = (EditText) findViewById(R.id.num);
        words = (TextView) findViewById(R.id.words);
    }

    public void clear(View view){
        num.setText("");
        words.setText("");
    }

    public void Find(View view){
        String s1 = num.getText().toString();
        if (s1.length() == 0) {
            num.setError("Required");
            num.setHint("Enter Number");
            words.setText("");
        }
        else if (s1.length() >= 7) {
            words.setText("Please Enter The Number In The Range \n 0  To  999999");
            words.setTextColor(Color.parseColor("#ff0000"));
        }
        else {
            num.setText("");
            words.setText(s1+" = ");
            num.setHint("Next Number");
            int n = Integer.parseInt(s1);
            count = 0;
            digits(n);
            word(n);
            words.setTextColor(Color.parseColor("#FF8B309F"));
        }

    }

    public void digits(int y){

        while(y!=0)
        {
            y=y/10;
            count += 1;
        }
       // words.setText( words.getText()+count);
    }

    public void word(int x){

        if(count==0)
            words.setText("0 = zero");
        if(count==1)
            switch1(x);
        if(count==2)
            tens(x);
        if(count==3)
            hundreds(x);
        if(count==4)
            thousands(x);
        if(count==5)
            tenthousands(x);
        if(count==6)
            lakh(x);
    }

    public void tens(int x){
            int x1,y;
            if((x>9&&x<=19) || x%10==0)
            {
                switch2(x);
            }
            else
            {
                x1=x%10;
                x=x/10;
                y=x*10;
                switch2(y);
                switch1(x1);
            }
    }

    public void hundreds(int x){
        int z,y=x;
        x=y%100;
        z=y/100;
        switch1(z);
        if(y>=100)
            words.setText( words.getText()+"hundred ");
        if(x!=0)
            words.setText( words.getText()+"and ");
        tens(x);
    }

    public void thousands(int x){
        int z,y=x;
        x=y%1000;
        z=y/1000;
        switch1(z);
        if(y>=1000)
            words.setText( words.getText()+"thousand ");
        if(x!=0)
            hundreds(x);

    }

    public void tenthousands(int x){
        int z,y=x;
        x=y%1000;
        z=y/1000;
        tens(z);
        if(y>=10000)
            words.setText( words.getText()+"thousand ");
        thousands(x);

    }

    public void lakh(int x){
        int z,y=x;
        x=y%100000;
        z=y/100000;
        tens(z);
        if(y>=100000)
            words.setText( words.getText()+"lakh ");
        tenthousands(x);
    }

    public void switch1(int x) {
        switch (x) {
            case 1:
                words.setText( words.getText()+"one ");
                break;
            case 2:
                words.setText( words.getText()+"two ");
                break;
            case 3:
                words.setText( words.getText()+"three ");
                break;
            case 4:
                words.setText( words.getText()+"four ");
                break;
            case 5:
                words.setText( words.getText()+"five ");
                break;
            case 6:
                words.setText( words.getText()+"six ");
                break;
            case 7:
                words.setText( words.getText()+"seven ");
                break;
            case 8:
                words.setText( words.getText()+"eight ");
                break;
            case 9:
                words.setText( words.getText()+"nine ");
                break;
        }
    }

    public void switch2(int x){
        switch(x)
        {
            case 10  : words.setText( words.getText()+"ten ");
                break;
            case 11 : words.setText( words.getText()+"eleven ");;
                break;
            case 12 : words.setText( words.getText()+"twelve ");
                break;
            case 13 : words.setText( words.getText()+"thirteen ");
                break;
            case 14 : words.setText( words.getText()+"fourteen ");
                break;
            case 15 : words.setText( words.getText()+"fifteen ");
                break;
            case 16 : words.setText( words.getText()+"sixteen ");
                break;
            case 17 : words.setText( words.getText()+"seventeen ");
                break;
            case 18 : words.setText( words.getText()+"eighteen ");
                break;
            case 19 : words.setText( words.getText()+"nineteen ");
                break;
            case 20  : words.setText( words.getText()+"twenty ");
                break;
            case 30  : words.setText( words.getText()+"thitry ");
                break;
            case 40 : words.setText( words.getText()+"fourty ");;
                break;
            case 50 : words.setText( words.getText()+"fifty ");
                break;
            case 60 : words.setText( words.getText()+"sixty ");
                break;
            case 70 : words.setText( words.getText()+"seventy ");
                break;
            case 80 : words.setText( words.getText()+"eighty ");
                break;
            case 90 : words.setText( words.getText()+"ninety ");
                break;
        }
    }
}
