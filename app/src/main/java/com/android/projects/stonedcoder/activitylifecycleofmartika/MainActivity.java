package com.android.projects.stonedcoder.activitylifecycleofmartika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String  TAG = "MainActivity" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG , "on start method is running ");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG , "on stop method is running ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG , "on destroy method is running ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG , "on pause method is running ");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.d(TAG , "on post resume called ");

    }
}
