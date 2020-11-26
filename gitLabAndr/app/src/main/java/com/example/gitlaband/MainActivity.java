package com.example.gitlaband;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView resultField;
    public EditText Num1;
    public EditText Num2;

    public Button Min;
    public Button Max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1= (EditText) findViewById(R.id.Num1);
        Num2= (EditText) findViewById(R.id.Num2);
        resultField = (TextView) findViewById(R.id.ResultField);
        Max = (Button) findViewById(R.id.button2);
        Min = (Button) findViewById(R.id.button3);

        Max.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v){
            int a, b, c;

            String S1 = Num1.getText().toString();
            String S2 = Num2.getText().toString();

            a = Integer.parseInt(S1);
            b = Integer.parseInt(S2);

            if (a > b) {
                c = a;
                String S = Integer.toString(c);
                resultField.setText(S);
            }
            if (b>a) {
                c = b;
                String S = Integer.toString(c);
                resultField.setText(S);
            }
            if (a == b) {
                c = a;
                String S = Integer.toString(c);
                resultField.setText(S);
            }
        }
        });

        Min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int N1, N2, N3;

                String S1 = Num1.getText().toString();
                String S2 = Num2.getText().toString();

                N1 = Integer.parseInt(S1);
                N2 = Integer.parseInt(S2);

                if(N1>N2) {
                    N3 = N2;
                    String S = Integer.toString(N3);
                }
                if(N2>N1) {
                    N3 = N1;
                    String S = Integer.toString(N3);
                }
                if (N1 == N2) {
                    String S = Integer.toString(N1);
                    resultField.setText(S);
                }
            }
        });

    }
}