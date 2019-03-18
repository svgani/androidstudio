package com.example.amritha_manoharan.matrix;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TableLayout t1;
    TableLayout t2;
    TableLayout t3;
    Button mul;
    Button back;
    Button clr;
    TextView ma;
    TextView mb;
    TextView mr;
    EditText a1;
    EditText a2;
    EditText a3;
    EditText b1;
    EditText b2;
    EditText b3;
    EditText c1;
    EditText c2;
    EditText c3;
    EditText d1;
    EditText d2;
    EditText d3;
    EditText e1;
    EditText e2;
    EditText e3;
    EditText f1;
    EditText f2;
    EditText f3;
    TextView ra;
    TextView rb;
    TextView rc;
    TextView rd;
    TextView re;
    TextView rf;
    TextView rg;
    TextView rh;
    TextView ri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (EditText)findViewById(R.id.editTexta1);
        a2 = (EditText)findViewById(R.id.editTexta2);
        a3 = (EditText)findViewById(R.id.editTexta3);
        b1 = (EditText)findViewById(R.id.editTexta4);
        b2 = (EditText)findViewById(R.id.editTexta5);
        b3 = (EditText)findViewById(R.id.editTexta6);
        c1 = (EditText)findViewById(R.id.editTexta7);
        c2 = (EditText)findViewById(R.id.editTexta8);
        c3 = (EditText)findViewById(R.id.editTexta9);
        d1 = (EditText)findViewById(R.id.editText1);
        d2 = (EditText)findViewById(R.id.editText2);
        d3 = (EditText)findViewById(R.id.editText3);
        e1 = (EditText)findViewById(R.id.editText4);
        e2 = (EditText)findViewById(R.id.editText5);
        e3 = (EditText)findViewById(R.id.editText6);
        f1 = (EditText)findViewById(R.id.editText7);
        f2 = (EditText)findViewById(R.id.editText8);
        f3 = (EditText)findViewById(R.id.editText9);
        ra = (TextView)findViewById(R.id.a1);
        rb = (TextView)findViewById(R.id.a2);
        rc = (TextView)findViewById(R.id.a3);
        rd = (TextView)findViewById(R.id.b1);
        re = (TextView)findViewById(R.id.b2);
        rf = (TextView)findViewById(R.id.b3);
        rg = (TextView)findViewById(R.id.c1);
        rh = (TextView)findViewById(R.id.c2);
        ri = (TextView)findViewById(R.id.c3);
        t1 = (TableLayout)findViewById(R.id.tableLayout1);
        t2 = (TableLayout)findViewById(R.id.tableLayout2);
        t3 = (TableLayout)findViewById(R.id.tableLayout3);
        mul = (Button)findViewById(R.id.button2);
        clr = (Button)findViewById(R.id.button);
        back = (Button)findViewById(R.id.back);
        ma = (TextView)findViewById(R.id.textView);
        mb = (TextView)findViewById(R.id.textView2);
        mr = (TextView)findViewById(R.id.textView5);

    }

    public void find(View view) {

            String A1=a1.getText().toString();
            String A2=a2.getText().toString();
            String A3=a3.getText().toString();
            String B1=b1.getText().toString();
            String B2=b2.getText().toString();
            String B3=b3.getText().toString();
            String C1=c1.getText().toString();
            String C2=c2.getText().toString();
            String C3=c3.getText().toString();
            String D1=d1.getText().toString();
            String D2=d2.getText().toString();
            String D3=d3.getText().toString();
            String E2=e2.getText().toString();
            String E3=e3.getText().toString();
            String E1=e1.getText().toString();
            String F1=f1.getText().toString();
            String F2=f2.getText().toString();
            String F3=f3.getText().toString();



            double a = Double.parseDouble(A1);
            double b = Double.parseDouble(A2);
            double c = Double.parseDouble(A3);
            double d = Double.parseDouble(B1);
            double e = Double.parseDouble(B2);
            double f = Double.parseDouble(B3);
            double g = Double.parseDouble(C1);
            double h = Double.parseDouble(C2);
            double i = Double.parseDouble(C3);
            double j = Double.parseDouble(D1);
            double k = Double.parseDouble(D2);
            double l = Double.parseDouble(D3);
            double m = Double.parseDouble(E1);
            double n = Double.parseDouble(E2);
            double o = Double.parseDouble(E3);
            double p = Double.parseDouble(F1);
            double q = Double.parseDouble(F2);
            double r = Double.parseDouble(F3);

                    double A = a*j;
                    A = A + b*m;
                    A = A + c*p;
                    double B = a*k;
                    B = B + b*n;
                    B = B + c*q;
                    double C = a*l;
                    C = C + b*o;
                    C = C + c*r;
                    double D = d*j;
                    D = D + e*m;
                    D = D + f*p;
                    double E = d*k;
                    E = E + e*n;
                    E = E + f*q;
                    double F = d*l;
                    F = F + e*o;
                    F = F + f*r;
                    double G = g*j;
                    G = G + h*m;
                    G = G + i*p;
                    double H = g*k;
                    H = H + h*n;
                    H = H + i*q;
                    double I = g*l;
                    I = I + h*o;
                    I = I + i*r;

            t1.setVisibility(View.INVISIBLE);
            t2.setVisibility(View.INVISIBLE);
            t3.setVisibility(View.VISIBLE);
            clr.setVisibility(View.INVISIBLE);
            mul.setVisibility(View.INVISIBLE);
            back.setVisibility(View.VISIBLE);


            ma.setVisibility(View.INVISIBLE);
            mb.setVisibility(View.INVISIBLE);
            mr.setVisibility(View.VISIBLE);

            ra.setText(Double.toString(A));
            rb.setText(Double.toString(B));
            rc.setText(Double.toString(C));
            rd.setText(Double.toString(D));
            re.setText(Double.toString(E));
            rf.setText(Double.toString(F));
            rg.setText(Double.toString(G));
            rh.setText(Double.toString(H));
            ri.setText(Double.toString(I));


    }

    public void clear(View view){

                a1.setText("0");
                a2.setText("0");
                a3.setText("0");
                b1.setText("0");
                b2.setText("0");
                b3.setText("0");
                d1.setText("0");
                d2.setText("0");
                d3.setText("0");
                e1.setText("0");
                e2.setText("0");
                e3.setText("0");
                f1.setText("0");
                f2.setText("0");
                f3.setText("0");
                c1.setText("0");
                c2.setText("0");
                c3.setText("0");
    }

    public void back(View view){
        t1.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
        t3.setVisibility(View.INVISIBLE);

        clr.setVisibility(View.VISIBLE);
        mul.setVisibility(View.VISIBLE);
        back.setVisibility(View.INVISIBLE);

        ma.setVisibility(View.VISIBLE);
        mb.setVisibility(View.VISIBLE);
        mr.setVisibility(View.INVISIBLE);
    }
}
