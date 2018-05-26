package com.example.pavel.lab2cherkov;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Date;

public class fragment2 extends Fragment {
    private fragment2.OnFragmentInteractionListener mListener;

    interface OnFragmentInteractionListener {
        void onFragmentInteraction(String link);
    }
    RadioGroup radioGroup;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        try {
            mListener = (OnFragmentInteractionListener) view.getContext();
        } catch (ClassCastException e) {
            throw new ClassCastException(view.getContext().toString()
                    + " должен реализовывать интерфейс OnFragmentInteractionListener");
        }
        radioGroup=view.findViewById(R.id.radio);
        radioGroup.setOnCheckedChangeListener((v,id)->{
            switch (id){
                case R.id.hint:
                    mListener.onFragmentInteraction("hide");
                    break;
                default:
                    mListener.onFragmentInteraction("show");
                    break;
            }
        });
        // задаем обработчик кнопки
        return view;
    }

    // обновление текстового поля

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

}
