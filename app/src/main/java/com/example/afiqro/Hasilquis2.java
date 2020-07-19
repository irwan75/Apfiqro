package com.example.afiqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Hasilquis2 extends AppCompatActivity {
    TextView hasil,nilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilquis2);
        hasil = findViewById(R.id.hasil);
        nilai = findViewById(R.id.nilai);
        hasil.setText("Jawaban Benar : " + Quiz.benar+"\n Jawaban Salah : " +Quiz.salah);
        nilai.setText(""+Quiz.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent intent = new Intent(Hasilquis2.this, Quiz.class);
        startActivity(intent);

    }

    public void utama(View view){
        finish();
        Intent intent = new Intent(Hasilquis2.this, Home.class);
        startActivity(intent);

    }
}
