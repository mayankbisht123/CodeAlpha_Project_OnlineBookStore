package com.example.codealpha_project_onlinebookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView img=findViewById(R.id.imageView2);
        Animation anime= AnimationUtils.loadAnimation(this,R.anim.visibility);
        img.setAnimation(anime);

        sharedPreferences=getSharedPreferences("Account",MODE_PRIVATE);
        Boolean b=sharedPreferences.getBoolean("check",false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(!b) {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    startActivity(new Intent(SplashActivity.this,page.class));
                }

                finish();
            }
        },5000);

    }
}