package com.example.pavel.lab2cherkov;
import android.app.Fragment;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class fragment1 extends Fragment {

    EditText text;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        text =view.findViewById(R.id.pass);
        button=view.findViewById(R.id.button);
        button.setOnClickListener(v->{
            Toast.makeText(view.getContext(),text.getText().toString(), Toast.LENGTH_LONG).show();
        });
        return view;
    }

    public void setText(String item) {
        if(item == "hide") text.setTransformationMethod(new PasswordTransformationMethod());
        else if(item == "show") text.setTransformationMethod(new SingleLineTransformationMethod());
    }
}