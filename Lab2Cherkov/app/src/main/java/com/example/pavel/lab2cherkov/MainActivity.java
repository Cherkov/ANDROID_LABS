package com.example.pavel.lab2cherkov;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements fragment2.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(String link) {
        fragment1 fragment = (fragment1) getFragmentManager().findFragmentById(R.id.fragment1);
        if (fragment != null && fragment.isInLayout()) fragment.setText(link);
    }
}

