package com.example.afiqro;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private int loadTime= 7000;
    LinearLayout l1,l2;
    ImageView quron;
    Animation uptodown, downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        quron = findViewById(R.id.quron);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Home = new Intent(MainActivity.this, Home.class);
                startActivity(Home);
                finish();
            }
        },loadTime);
    }
}
