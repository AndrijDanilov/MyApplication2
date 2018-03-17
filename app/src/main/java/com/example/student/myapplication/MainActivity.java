package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    private final static String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view){
        if(view.getId()==R.id.Number1) {
            TextView tv1 = (TextView) view;
            tv1.setText("Change");
        }
        else if (view.getId()==R.id.View1){
            view.setVisibility(View.GONE);
        }
    }
}
