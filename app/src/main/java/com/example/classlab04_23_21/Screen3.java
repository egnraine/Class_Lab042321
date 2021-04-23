package com.example.classlab04_23_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        TextView numberTV = this.findViewById(R.id.numberTV);
        numberTV.setText("" + MySingleton.number);
    }
}