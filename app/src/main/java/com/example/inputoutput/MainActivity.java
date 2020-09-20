package com.example.inputoutput;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView difference;
    Button subtract;
    EditText firstNum;
    EditText secondNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = (EditText) findViewById(R.id.firstNum);
        secondNum = (EditText) findViewById(R.id.secondNum);
        subtract = (Button) findViewById(R.id.subtract);
        difference = (TextView) findViewById(R.id.difference);

        subtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int leftNum = Integer.parseInt(firstNum.getText().toString());
                int rightNum = Integer.parseInt(secondNum.getText().toString());
                int diff = leftNum - rightNum;
                difference.setText(String.valueOf(diff));

            }
        });
    }
}