package com.example.classlab04_23_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity
{
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        TextView nameTV = this.findViewById(R.id.nameTV);
        TextView numberTV = this.findViewById(R.id.numberTV);
        Intent myIntent = this.getIntent();
        this.name = myIntent.getStringExtra("name");
        numberTV.setText("" + MySingleton.number);
    }
    public void onNextScreenPressed(View v)
    {
        Intent i = new Intent(this, Screen3.class);
        this.startActivity(i);
    }
}