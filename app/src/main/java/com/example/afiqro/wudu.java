package com.example.afiqro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class wudu extends AppCompatActivity {
    ListView listView;
    int[] images = {R.drawable.niat,
                    R.drawable.keempat,
                    R.drawable.ketiga,
            R.drawable.muka1,
            R.drawable.lengan1,
            R.drawable.kepala1,
            R.drawable.kaki1,
            R.drawable.berdoa};

    String[] Name = {"Berniatlah Sebelum Wudhu | نَوَيْتُ الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ فَرْضًا ِللهِ تَعَالَى | Nawaitul whudu-a lirof’il hadatsii ashghori fardhon lillaahi ta’aalaa","Cucilah Tangan Sebanyak 3x","Berkumur kumur sebanyak 3x","Basuhlah muka sebanyak 3x",
                    "Basulah Lengan sampai ke siku sebanyak 3x","Basuhlah Kepala setelah itu telinga sebanyak 3x","Basuhlah Kaki sebanyak 3x","\n" +
            " Doa Setelah Wudu : اَشْهَدُاَنْ لَااِلٰهَ اِلَّا اللّٰهُ وَحْدَهُ لَاشَرِيْكَ لَهُ. وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللّٰهُمَّ اجْعَلْنِىْ مِنَاالتَّوَّابِيْنَ، وَجْعَلْنِيْ مِنَ الْمُتَطَهِّرِيْنَ، وَجْعَلْنِىْ مِنْ عِبَادِكَ الصَّالِحِيْنَ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wudu);
        listView = findViewById(R.id.wuduList);
        CustomAdaptor customAdaptor = new CustomAdaptor();
        listView.setAdapter(customAdaptor);
    }
    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView mImgage = view.findViewById(R.id.imageView);
            TextView nTextView = view.findViewById(R.id.view);

            mImgage.setImageResource(images[position]);
            nTextView.setText(Name[position]);
            return view;
        }
    }
}
