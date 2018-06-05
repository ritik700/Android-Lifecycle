package com.example.ritik.mypehli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
public static final String mytag = "the_custom_msg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(mytag,"onCreate called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(mytag,"onRestart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(mytag,"onResume called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(mytag,"onStart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(mytag,"onPause called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(mytag,"onDestroy called");
    }
}
