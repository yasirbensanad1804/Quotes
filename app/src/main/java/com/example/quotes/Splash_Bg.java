package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Bg extends Activity {
    private int waktu_loading = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__bg);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new  Intent(Splash_Bg.this, MainActivity.class);
                startActivity(splash);
                finish();
            }
        }, waktu_loading);
    }
}
