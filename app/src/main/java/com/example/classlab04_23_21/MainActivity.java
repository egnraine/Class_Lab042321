package com.example.classlab04_23_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText nameEV;
    private EditText numberEV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nameEV = findViewById(R.id.nameEV);
        this.numberEV = findViewById(R.id.numberEV);
    }

    public void onNextScreenClicked(View v)
    {
        Intent i = new Intent(this, Screen2.class);
        i.putExtra("name", nameEV.getText());
        int valueOfNumber = Integer.parseInt(this.numberEV.getText().toString());
        MySingleton.number = valueOfNumber;
        this.startActivity(i);
    }
}