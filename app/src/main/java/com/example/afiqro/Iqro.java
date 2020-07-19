package com.example.afiqro;

import android.animation.ArgbEvaluator;
import androidx.core.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Iqro extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.hamzah_alif, "Alif",""));
        models.add(new Model(R.drawable.ba, "Ba",""));
        models.add(new Model(R.drawable.ta, "Ta",""));
        models.add(new Model(R.drawable.tsa, "Tsa",""));
        models.add(new Model(R.drawable.jim, "Jim",""));
        models.add(new Model(R.drawable.kha, "Ha",""));

        models.add(new Model(R.drawable.kho, "Kho",""));
        models.add(new Model(R.drawable.dal, "Dal",""));
        models.add(new Model(R.drawable.dzal, "Dzal",""));
        models.add(new Model(R.drawable.ra, "Ro",""));
        models.add(new Model(R.drawable.za, "Zay",""));
        models.add(new Model(R.drawable.sin, "Sin",""));

        models.add(new Model(R.drawable.syin, "Syin",""));
        models.add(new Model(R.drawable.shad, "Shod",""));
        models.add(new Model(R.drawable.dhod, "Dhod",""));
        models.add(new Model(R.drawable.dha, "Tho",""));
        models.add(new Model(R.drawable.dhod, "Zho",""));
        models.add(new Model(R.drawable.tha, "Tha",""));

        models.add(new Model(R.drawable.dha, "Dha",""));
        models.add(new Model(R.drawable.ain, "Ain",""));
        models.add(new Model(R.drawable.ghain, "Ghain",""));
        models.add(new Model(R.drawable.fa, "Fa",""));
        models.add(new Model(R.drawable.qof, "Qof",""));
        models.add(new Model(R.drawable.kaf, "Kaf",""));

        models.add(new Model(R.drawable.lam, "Lam",""));
        models.add(new Model(R.drawable.mim, "Min",""));
        models.add(new Model(R.drawable.nun, "Nun",""));
        models.add(new Model(R.drawable.ha, "Ha",""));
        models.add(new Model(R.drawable.wawu, "Waw",""));
        models.add(new Model(R.drawable.ya, "Ya",""));

        adapter = new Adapter(models, this);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color5),
                getResources().getColor(R.color.color6),
                getResources().getColor(R.color.color7),
                getResources().getColor(R.color.color8),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color5),
                getResources().getColor(R.color.color6),
                getResources().getColor(R.color.color7),
                getResources().getColor(R.color.color8),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color5),
                getResources().getColor(R.color.color6),
                getResources().getColor(R.color.color7),
                getResources().getColor(R.color.color8),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),

        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float v, int i1) {
                if(position < (adapter.getCount() -1) && position < (colors.length -1)){
                    viewPager.setBackgroundColor((Integer) argbEvaluator.evaluate(v,colors[position],colors[position + 1]));
                }else{
                    viewPager.setBackgroundColor(colors[colors.length -1]);
                }
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }
}
