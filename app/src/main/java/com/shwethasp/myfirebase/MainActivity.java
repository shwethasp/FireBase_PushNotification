package com.shwethasp.myfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//  use the following link to send notification to the devices
// Here first select your "app" then go to notification and copy the "" registered token " click to send message
// https://console.firebase.google.com/