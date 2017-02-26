package com.example.parktaejun.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView zero;
    TextView one;
    TextView two;
    TextView three;
    TextView four;
    TextView five;
    TextView six;
    TextView seven;
    TextView eight;
    TextView nine;

    TextView dot;
    TextView submit;

    TextView clear;
    TextView divide;
    TextView multiply;
    TextView minus;
    TextView plus;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (TextView)findViewById(R.id.zero);
        one = (TextView)findViewById(R.id.one);
        two = (TextView)findViewById(R.id.two);
        three = (TextView)findViewById(R.id.three);
        four = (TextView)findViewById(R.id.four);
        five = (TextView)findViewById(R.id.five);
        six = (TextView)findViewById(R.id.six);
        seven = (TextView)findViewById(R.id.seven);
        eight = (TextView)findViewById(R.id.eight);
        nine = (TextView)findViewById(R.id.nine);

        dot = (TextView)findViewById(R.id.dot);
        submit = (TextView)findViewById(R.id.submit);

        clear = (TextView)findViewById(R.id.clear);
        divide = (TextView)findViewById(R.id.divide);
        multiply = (TextView)findViewById(R.id.multiply);
        minus = (TextView)findViewById(R.id.minus);
        plus = (TextView)findViewById(R.id.plus);

        result = (TextView)findViewById(R.id.result);


    }
}
