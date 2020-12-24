package com.example.myapplication001;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText firstnumber;
    private EditText secondnumber;
    private Button summ;
    private Button difference;
    private Button quotient;
    private Button composition;
    private double firstNum = 0;
    private double secondNum = 0;
    private double score = 0;
    private TextView textscore;
    private String Txt1;
    private String Txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnumber = findViewById(R.id.name_edit1);
        secondnumber = findViewById(R.id.name_edit2);
        summ = findViewById(R.id.next_btn1);
        difference = findViewById(R.id.next_btn2);
        quotient = findViewById(R.id.next_btn4);
        composition = findViewById(R.id.next_btn3);
        textscore = findViewById(R.id.textScore);
        summ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Txt1 = firstnumber.getText().toString();
                if (Txt1.equals(""))
                    Txt1 = "0";
                Txt2 = secondnumber.getText().toString();
                if (Txt2.equals(""))
                    Txt2 = "0";
                firstNum = Double.parseDouble(Txt1);
                secondNum = Double.parseDouble(Txt2);
                    score = firstNum + secondNum;
                    textscore.setText(String.valueOf(score));
                }
        });
        difference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Txt1 = firstnumber.getText().toString();
                if (Txt1.equals(""))
                    Txt1 = "0";
                Txt2 = secondnumber.getText().toString();
                if (Txt2.equals(""))
                    Txt2 = "0";
                firstNum = Double.parseDouble(Txt1);
                secondNum = Double.parseDouble(Txt2);
                    score = firstNum - secondNum;
                    textscore.setText(String.valueOf(score));
            }
        });
            quotient.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    Txt1 = firstnumber.getText().toString();
                    if (Txt1.equals(""))
                        Txt1 = "0";
                    Txt2 = secondnumber.getText().toString();
                    if (Txt2.equals(""))
                        Txt2 = "0";
                    firstNum = Double.parseDouble(Txt1);
                    secondNum = Double.parseDouble(Txt2);
                    if (secondNum == 0) {
                        Toast.makeText(getApplicationContext(), "Знаменатель не может быть равен 0", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        score = firstNum / secondNum;
                        textscore.setText(String.valueOf(score));
                    }
                }
            });
        composition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Txt1 = firstnumber.getText().toString();
                if (Txt1.equals(""))
                    Txt1 = "0";
                Txt2 = secondnumber.getText().toString();
                if (Txt2.equals(""))
                    Txt2 = "0";
                firstNum = Double.parseDouble(Txt1);
                secondNum = Double.parseDouble(Txt2);
                    score = firstNum*secondNum;
                    textscore.setText(String.valueOf(score));
            }
        });
    }
}