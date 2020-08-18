package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
    }

    public void opensecondActivity(View view){
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("n1",etNum1.getText().toString());
        intent.putExtra("n2",etNum2.getText().toString());

        Toast.makeText(this, "Opening Calculator...", Toast.LENGTH_SHORT).show();

        startActivity(intent);
    }
}