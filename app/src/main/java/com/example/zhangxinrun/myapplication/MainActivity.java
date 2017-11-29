package com.example.zhangxinrun.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Operand1 = findViewById(R.id.Operand1);
        final EditText Operand2 = findViewById(R.id.Operand2);
        final EditText Result = findViewById(R.id.Result);

        final Button button1 = findViewById(R.id.Button1);
        final Button button2 = findViewById(R.id.Button2);
        final Button button3 = findViewById(R.id.Button3);
        final Button button4 = findViewById(R.id.Button4);
        final Button button5 = findViewById(R.id.Button5);
        final Button button6 = findViewById(R.id.Button6);
        final Button button7 = findViewById(R.id.Button7);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double number1;
                double number2;
                String Answer;

                number1 = Double.parseDouble(Operand1.getText().toString());
                number2 = Double.parseDouble(Operand2.getText().toString());
                Answer = Double.toString( number1 + number2);

                Result.setText(Answer.toCharArray(),0,Answer.length());
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double number1;
                double number2;
                String Answer;

                number1 = Double.parseDouble(Operand1.getText().toString());
                number2 = Double.parseDouble(Operand2.getText().toString());
                Answer = Double.toString( number1 - number2);

                Result.setText(Answer.toCharArray(),0,Answer.length());
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double number1;
                double number2;
                String Answer;

                number1 = Double.parseDouble(Operand1.getText().toString());
                number2 = Double.parseDouble(Operand2.getText().toString());
                Answer = Double.toString( number1 * number2);

                Result.setText(Answer.toCharArray(),0,Answer.length());
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double number1;
                double number2;
                String Answer;

                number1 = Double.parseDouble(Operand1.getText().toString());
                number2 = Double.parseDouble(Operand2.getText().toString());

                if(number2 == 0){
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Alert").setMessage("The Operand2 can't be 0.")
                            .setPositiveButton("OK", null).show();
                }else {
                    Answer = Double.toString(number1 / number2);

                    Result.setText(Answer.toCharArray(), 0, Answer.length());
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double number1;
                double number2;
                String Answer;

                number1 = Double.parseDouble(Operand1.getText().toString());
                number2 = Double.parseDouble(Operand2.getText().toString());

                    if (number2 == 2 && number1 < 0) {
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Alert").setMessage("The Operand1 can't less than 0.")
                                .setPositiveButton("OK", null).show();
                    } else {
                        Answer = Double.toString(Math.pow(number1, 1d / number2));

                        Result.setText(Answer.toCharArray(), 0, Answer.length());
                    }
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double number1;
                double number2;
                String Answer;

                number1 = Double.parseDouble(Operand1.getText().toString());
                number2 = Double.parseDouble(Operand2.getText().toString());
                Answer = Double.toString( Math.pow(number1,number2));

                Result.setText(Answer.toCharArray(),0,Answer.length());
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Operand1.setText("");
                Operand2.setText("");
                Result.setText("");
            }

        });
    }
}

