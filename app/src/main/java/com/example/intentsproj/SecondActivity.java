package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText etNum1;
    EditText etNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);

        Intent intent=getIntent();

        String number1 = intent.getStringExtra("n1");
        String number2 = intent.getStringExtra("n2");

        etNum1.setText(number1);
        etNum2.setText(number2);
    }
}