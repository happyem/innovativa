package com.example.efahlman0920.thadog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class luddestats extends AppCompatActivity {

    public ProgressBar prog1, prog2, prog3, prog4, prog5, prog6, prog7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luddestats);


        prog1 = (ProgressBar) findViewById(R.id.progressBar11);
        prog2 = (ProgressBar) findViewById(R.id.progressBar12);
        prog3 = (ProgressBar) findViewById(R.id.progressBar13);
        prog4 = (ProgressBar) findViewById(R.id.progressBar14);
        prog5 = (ProgressBar) findViewById(R.id.progressBar15);
        prog6 = (ProgressBar) findViewById(R.id.progressBar16);
        prog7 = (ProgressBar) findViewById(R.id.progressBar17);
    }
}
