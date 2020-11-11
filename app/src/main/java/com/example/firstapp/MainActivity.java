package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText number1, number2;
    Button btnPlus, btnMinus;
    Button btnMulti, btnDivide;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivide = findViewById(R.id.btnDivide);

        tvResult = findViewById(R.id.tvResult);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        int res = 0;
        if(view.getId() == R.id.btnPlus){
            res = Integer.parseInt(number1.getText().toString())+ Integer.parseInt(number2.getText().toString());
        }
        else if(view.getId()==R.id.btnMinus){
            res = Integer.parseInt(number1.getText().toString())-
                    Integer.parseInt(number2.getText().toString());
        }
        else if (view.getId()==R.id.btnMulti) {
            res = Integer.parseInt(number1.getText().toString()) *
                    Integer.parseInt(number2.getText().toString());
        }
        else if (view.getId()==R.id.btnMulti) {
            res = Integer.parseInt(number1.getText().toString()) /
                    Integer.parseInt(number2.getText().toString());
        }

        tvResult.setText("Result: " + res);
    }
    public void btnPlusClicked(View view){
        int res = Integer.parseInt(number1.getText().toString()) +
                Integer.parseInt(number2.getText().toString());

        tvResult.setText("Result: " +res);
    }

    public void btnMinusClicked(View view){
        int res = Integer.parseInt(number1.getText().toString()) -
                Integer.parseInt(number2.getText().toString());

        tvResult.setText("Result: " +res);
    }

    public void btnMultiClicked(View view){
        int res = Integer.parseInt(number1.getText().toString()) *
                Integer.parseInt(number2.getText().toString());

        tvResult.setText("Result: " +res);
    }

    public void btnDivideClicked(View view){
        int res = Integer.parseInt(number1.getText().toString()) /
                Integer.parseInt(number2.getText().toString());

        tvResult.setText("Result: " +res);
    }

}