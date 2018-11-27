package com.example.student5.myapplication;

import android.view.View;
import android.widget.TextView;

public class ArtenListener implements View.OnClickListener {
    int a = 0;
    MainActivity main;
    ArtenListener(MainActivity m){
            main = m;
        }
    @Override
    public void onClick(View v){
        TextView t = main.findViewById(R.id.textView);
        if (a==0){
        t.setText("Artem"); a=1;}
        else {t.setText("Ne Artem"); a=0;}
    }
}
