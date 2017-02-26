package com.example.parktaejun.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList arrayList = new ArrayList();
    int count = 0;

    TextView btn_0;
    TextView btn_1;
    TextView btn_2;
    TextView btn_3;
    TextView btn_4;
    TextView btn_5;
    TextView btn_6;
    TextView btn_7;
    TextView btn_8;
    TextView btn_9;

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

        btn_0 = (TextView)findViewById(R.id.zero);
        btn_1 = (TextView)findViewById(R.id.one);
        btn_2 = (TextView)findViewById(R.id.two);
        btn_3 = (TextView)findViewById(R.id.three);
        btn_4 = (TextView)findViewById(R.id.four);
        btn_5 = (TextView)findViewById(R.id.five);
        btn_6 = (TextView)findViewById(R.id.six);
        btn_7 = (TextView)findViewById(R.id.seven);
        btn_8 = (TextView)findViewById(R.id.eight);
        btn_9 = (TextView)findViewById(R.id.nine);

        dot = (TextView)findViewById(R.id.dot);
        submit = (TextView)findViewById(R.id.submit);

        clear = (TextView)findViewById(R.id.clear);
        divide = (TextView)findViewById(R.id.divide);
        multiply = (TextView)findViewById(R.id.multiply);
        minus = (TextView)findViewById(R.id.minus);
        plus = (TextView)findViewById(R.id.plus);

        result = (TextView)findViewById(R.id.result);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

        dot.setOnClickListener(this);
        submit.setOnClickListener(this);

        clear.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        case R.id.clear:

        arrayList.clear();
        result.setText("");


        break;

        case R.id.zero:
        result.setText(result.getText().toString() + "0");
        break;
        case R.id.one:
        result.setText(result.getText().toString() + "1");
        break;
        case R.id.two:
        result.setText(result.getText().toString() + "2");
        break;
        case R.id.three:
        result.setText(result.getText().toString() + "3");
        break;
        case R.id.four:
        result.setText(result.getText().toString() + "4");
        break;
        case R.id.five:
        result.setText(result.getText().toString() + "5");
        break;
        case R.id.six:
        result.setText(result.getText().toString() + "6");
        break;
        case R.id.seven:
        result.setText(result.getText().toString() + "7");
        break;
        case R.id.eight:
        result.setText(result.getText().toString() + "8");
        break;
        case R.id.nine:
        result.setText(result.getText().toString() + "9");
        break;


        case R.id.plus:
        arrayList.add(result.getText().toString());
        result.setText("");
        count = 1;
        break;

        case R.id.minus:
        arrayList.add(result.getText().toString());
        result.setText("");
        count = 2;
        break;

        case R.id.multiply:
        arrayList.add(result.getText().toString());
        result.setText("");
        count = 3;
        break;

        case R.id.divide:
        arrayList.add(result.getText().toString());
        result.setText("");
        count = 4;
        break;


        case R.id.submit:

        int sum1 = 0, sum2 = 0, sum3, count2 = 0;

        double fsum1 = 0, fsum2 = 0, fsum3;


        if (arrayList.isEmpty()) {


            result.setText("");
        } else {

            Object obj = arrayList.get(0);
            String num1 = (String) obj;
            String num2 = result.getText().toString();

            if (num1.contains(".") || num2.contains(".")) {

                count2 = 1;
                fsum1 = Float.parseFloat(num1);
                fsum2 = Float.parseFloat(num2);

            } else {
                sum1 = Integer.parseInt(num1);
                sum2 = Integer.parseInt(num2);
            }
            String val = "";

            switch (count) {
                case 0:

                    result.setText("");


                case 1:

                    if (count2 == 1) {

                        fsum3 = fsum1 + fsum2;

                        val = String.valueOf(fsum3);
                    } else {
                        sum3 = sum1 + sum2;
                        val = String.valueOf(sum3);

                    }

                    result.setText(val);
                    arrayList.clear();
                    break;

                case 2:

                    if (count2 == 1) {

                        fsum3 = fsum1 - fsum2;
                        val = String.valueOf(fsum3);
                    } else {
                        sum3 = sum1 - sum2;
                        val = String.valueOf(sum3);

                    }
                    result.setText(val);
                    arrayList.clear();
                    break;

                case 3:

                    if (count2 == 1) {

                        fsum3 = fsum1 * fsum2;
                        val = String.valueOf(fsum3);
                    } else {
                        sum3 = sum1 * sum2;
                        val = String.valueOf(sum3);

                    }
                    result.setText(val);
                    arrayList.clear();
                    break;

                case 4:

                    if (count2 == 1) {

                        fsum3 = fsum1 / fsum2;
                        val = String.valueOf(fsum3);
                    } else {
                        sum3 = sum1 / sum2;
                        val = String.valueOf(sum3);

                    }
                    result.setText(val);
                    arrayList.clear();
                    break;
            }


        }


        break;

    }


}
}
