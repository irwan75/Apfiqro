package com.example.afiqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {
    TextView pertanyaan;
    RadioGroup rg ;
    RadioButton pilihanA, pilihanB, pilihanC, pilihanD;
    int nomor = 0;
    public static int hasil,benar,salah;
    String[] pertanyaan_kuis = new  String[]{
            "1. Berapa jumlah huruf hijayyah ?",
            "2. Berapa macam gerakan dalam sholat ?",
            "3. Sholat itu dapat membersihkan ?",
            "4. Carilah Niat wudu yang paling tepat ?",
            "5. Manakah penyebutan yang tepat untuk huruf ini ش",
            "6. Membaca Niat hendaknya ?",
            "7. Sholat Apakah yang membaca qunut ?"
    };

    String[] jawaban = new  String[]{
            "10","23","36","31",
            "4","5","9","7",
            "luka dan hati","hati dan pikiran","badan dari kotoran","hati",
            "نَوَيْتُ الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ فَرْضًا ِللهِ تَعَالَى","نَوَيْتُ الْوُضُوْءَ لِرَفْعِ","اْلاَصْغَرِ فَرْضًا ِللهِ تَعَالَى","الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ",
            "Sin","Shod","Dzal","Syin",
            "di Keraskan","lemah lembut","Dalam Hati","pelan-pelan",
            "Magrib","Dzuhur","Subuh","Isya"

    };


    String[] jawaban_Benar = new  String[]{
            "31",
            "5",
            "hati dan pikiran",
            "نَوَيْتُ الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ فَرْضًا ِللهِ تَعَالَى",
            "Syin",
            "Dalam Hati",
            "Subuh"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        rg = findViewById(R.id.rGroup);
        pertanyaan = findViewById(R.id.quis);
        pilihanA = findViewById(R.id.pilihanA);
        pilihanB = findViewById(R.id.pilihanB);
        pilihanC = findViewById(R.id.pilihanC);
        pilihanD = findViewById(R.id.pilihanD);
        pertanyaan.setText(pertanyaan_kuis[nomor]);
        pilihanA.setText(jawaban[0]);
        pilihanB.setText(jawaban[1]);
        pilihanC.setText(jawaban[2]);
        pilihanD.setText(jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;

    }

    public void next(View view) {
        if(pilihanA.isChecked()||pilihanB.isChecked()||pilihanC.isChecked()||pilihanD.isChecked()){
            RadioButton jawaban_user = findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if(ambil_jawaban_user.equalsIgnoreCase(jawaban_Benar[nomor])) {
                Toast.makeText(this,"Selamat Anda mendapatkan 20 point setiap jawaban benar", Toast.LENGTH_LONG).show();
                benar++;
            }else {
                salah++;
            }
            nomor++;
            if(nomor<pertanyaan_kuis.length){
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                pilihanA.setText(jawaban[(nomor * 4 ) + 0]);
                pilihanB.setText(jawaban[(nomor * 4 ) + 1]);
                pilihanC.setText(jawaban[(nomor * 4 ) + 2]);
                pilihanD.setText(jawaban[(nomor * 4 ) + 3]);
            }else{
                hasil = benar*20;
                Intent selesai = new Intent(Quiz.this, Hasilquis2.class);
                startActivity(selesai);
            }
        }else{
            Toast.makeText(this,"Jawab dulu", Toast.LENGTH_LONG).show();
        }
    }

}
