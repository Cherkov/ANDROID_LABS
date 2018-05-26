package com.example.pavel.lab1cherkov;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class fragment1 extends Fragment {
    RadioGroup radioGroup;
    EditText text;
    Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1, container, false);
        text =rootView.findViewById(R.id.pass);
        button=rootView.findViewById(R.id.button);
        radioGroup=rootView.findViewById(R.id.radio);
        button.setOnClickListener(v->{
            Toast.makeText(rootView.getContext(),text.getText().toString(), Toast.LENGTH_LONG).show();
        });

        return rootView;
    }
}

