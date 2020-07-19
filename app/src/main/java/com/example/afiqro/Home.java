package com.example.afiqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
    private LinearLayout iqroImg, wuduImg, sholatImg, quizImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iqroImg = findViewById(R.id.iqro);
        wuduImg = findViewById(R.id.wudu);
        sholatImg = findViewById(R.id.sholat);
        quizImg = findViewById(R.id.quiz);
        iqroImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Iqro.class);
                startActivity(intent);
            }
        });
        wuduImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, wudu.class);
                startActivity(intent);
            }
        });
        sholatImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Sholat.class);
                startActivity(intent);
            }
        });
        quizImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Quiz.class);
                startActivity(intent);

            }
        });


    }
}
