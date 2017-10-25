package com.aslan.dima.dimacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainCalcActivity extends AppCompatActivity implements View.OnClickListener {
    private static final  R = ;
    private EditText etNandroid.R.attrum1;
    private TextView qustionMark;
    private EditText edNum2;
    private TextView tvResult;
    private EditText edResult;
    private Button btnPlus;
    private Button btnMinest;
    private Button btnFE;
    private Button btn3la;
    private Button btnKwa;
    private Button btnyosawe;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);
        etNum1 = (EditText) findViewById(R.id.etNum1);
        edNum2 = (EditText) findViewById(R.id.edNum2);
        qustionMark = (TextView) findViewById(R.id.qustionMark);
        tvResult = (TextView) findViewById(R.id.tvResult);
        edResult = (EditText) findViewById(R.id.edResult);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinest = (Button) findViewById(R.id.btnMinest);
        btn3la = (Button) findViewById(R.id.btn3la);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnFE = (Button) findViewById(R.id.btnFE);
        btnKwa = (Button) findViewById(R.id.btnKwa);
        btnyosawe = (Button) findViewById(R.id.btnyosawe);
        btnPlus.setOnClickListener(this);
        btnMinest.setOnClickListener(this);
        btnyosawe.setOnClickListener(this);
        btnKwa.setOnClickListener(this);
        btnFE.setOnClickListener(this);
        btn3la.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }
     // 2.alt enter
    @Override
    public void onClick(View view) {

        //3.to get value from the edit text filed
        String stNum1 = etNum1.getText().toString();
        String stNum2= edNum2.getText().toString();
        //to convert text number to real number


        if (view == btnPlus) {
        //to react this event
            edResult.setText("+");
        }
        if (view == btnMinest)
        {
            edResult.setText("-");
        }
        if (view == btn3la)
        {
            edResult.setText("/");
        }
        if (view == btnFE)
        {
            edResult.setText("x");
        }
        if (view == btnKwa)
        {
            edResult.setText("^");

        }
        if (view == btnyosawe)
        {
            boolean isOk=true;
            if (stNum1.length()==0)// if the field is empty
            {
                isOk=false;
                stNum1.setError("Give number");
            }
            double num1 = Double.parseDouble(stNum1);
            double num2= Double.parseDouble(stNum2);

            double res=0;
           String op=edResult.getText().toString();
            if(op.equals("+"))
            {
                 res =num1+num2;
                edResult.setText(res+"");
            }
            if(op.equals("-")){
                res=num1-num2;
                edResult.setText(res+"");
            }
            if(op.equals("x")){
                res=num1*num2;
                edResult.setText(res+"");
            }
            if(op.equals("/")){
                res=num1/num2;
                edResult.setText(res+"");
            }
            if(op.equals("^")){
                res=Math.pow(num1,num2);
                edResult.setText(res+"");
            }
        }

        if (view == btnClear)
        {
            etNum1.setText("");
            edNum2.setText("");
            edResult.setText("");
            tvResult.setText("?");
        }
    }
}
