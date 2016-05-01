package com.example.shubham.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.*;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;


public class splash extends Activity {protected boolean _active = true;
    protected int _splashTime = 3000; // time to display the splash screen in ms



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView gyroView = (ImageView) findViewById(R.id.gyro);
        gyroView.setBackgroundResource(R.drawable.gyro_animation);
        AnimationDrawable gyroAnimation = (AnimationDrawable) gyroView.getBackground();
        gyroAnimation.start();

        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (_active && (waited < _splashTime)) {
                        sleep(100);
                        if (_active) {
                            waited += 100;
                        }
                    }
                } catch (Exception e) {

                } finally {

                    startActivity(new Intent(splash.this,LoginActivity.class));
                    finish();
                }
            };
        };
        splashTread.start();
    }
}


