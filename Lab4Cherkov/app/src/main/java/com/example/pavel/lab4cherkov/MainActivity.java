package com.example.pavel.lab4cherkov;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

    }

    public void audioClick(View v){
        Intent intent = new Intent(this, Audio.class);
        startActivity(intent);
    }
    public void videoClick(View v){

        Intent intent = new Intent(this, Video.class);
        startActivity(intent);
    }


}
