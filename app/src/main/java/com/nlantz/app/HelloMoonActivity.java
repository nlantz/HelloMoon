package com.nlantz.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Nick Lantz on 5/26/14.
 */
public class HelloMoonActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_moon);
    }
}
