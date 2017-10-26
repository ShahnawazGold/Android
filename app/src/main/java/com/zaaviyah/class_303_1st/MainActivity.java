package com.zaaviyah.class_303_1st;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public String msg = "zaaviyah";
    Button bt1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"wellcome on onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"wellcome on onStart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg,"wellcome on onDestroy");
    }

}
