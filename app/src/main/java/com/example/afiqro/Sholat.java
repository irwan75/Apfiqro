package com.example.afiqro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Sholat extends AppCompatActivity {
    ListView listView;
    int[] images = {R.drawable.berdiri,
            R.drawable.takbir,
            R.drawable.sedekap,
            R.drawable.rukuk,
            R.drawable.ittidal,
            R.drawable.sujud,
            R.drawable.antaraduasujud,
            R.drawable.tasayud,
            R.drawable.salam};

    String[] Name = {"Berdiri tegak pada salat fardu hukumnya wajib. Berdiri tegak merupakan salah satu rukun salat. Sikap ini dilakukan sejak sebelum takbiratul ihram. Cara melakukannya adalah sebagai berikut.\n" +
            "1. Posisi badan harus tegak lurus dan tidak membungkuk, kecuali jika sakit.\n" +
            "2. Tangan rapat di samping badan.\n" +
            "3. Kaki direnggangkan, paling lebar selebar bahu.\n" +
            "4. Semua ujung jari kaki menghadap kiblat.\n" +
            "5. Pandangan lurus ke tempat sujud.\n" +
            "6. Posisi badan menghadap kiblat. Akan tetapi, jika tidak mengetahui arah kiblat, boleh menghadap ke arah mana saja. Asal dalam hati tetap berniat menghadap kiblat. ",
            "Menurut kebanyakan ulama caranya adalah sebagai berikut.\n" +
                    "1. Telapak tangan sejajar dengan bahu.\n" +
                    "2. Ujung jari-jari sejajar dengan puncak telinga.\n" +
                    "3. Ujung ibu jari sejajar dengan ujung bawah telinga.\n" +
                    "4. Jari-jari direnggangkan.\n" +
                    "5. Telapak tangan menghadap ke arah kiblat, bukan menghadap ke atas atau ke samping. ",
            "Sedekap dilakukan sesudah mengangkat tangan takbiratulihram. Adapun caranya adalah sebagai berikut.\n" +
                    "a. Telapak tangan kanan diletakkan di atas pergelangan tangan kiri, tidak digenggamkan.\n" +
                    "b. Meletakkan tangan boleh di dada. Boleh juga meletakkannya di atas pusar. Boleh juga meletakkannya di bawah pusar.\n" +
                    "Ketika bersedekap, doa yang pertama dibaca adalah doa iftitah. Setelah selesai iftitah, kemudian membaca surat Al Fatihah. Sesudah membaca surat Al Fatihah, kemudian membaca surat pendek seperti Al Ikhlas, Al ‘Asr, dan An Nasr.",
            "Rukuk artinya membungkukkan badan. Adapun cara melakukannya adalah sebagai berikut.\n" +
                    "1. Angkat tangan sambil mengucapkan takbir. Caranya sama seperti takbiratulihram.\n" +
                    "2. Turunkan badan ke posisi membungkuk.\n" +
                    "3. Kedua tangan menggenggam lutut. Bukan menggenggam betis atau paha. Jari-jari tangan direnggangkan. Posisi tangan lurus, siku tidak ditekuk.\n" +
                    "4. Punggung dan kepala sejajar. Punggung dan kepala dalam posisi mendatar. Tidak terlalu condong ke bawah. Tidak pula mendongah ke atas.\n" +
                    "5. Kaki tegak lurus, lutut tidak ditekuk.\n" +
                    "6. Pinggang direnggangkan dari paha.\n" +
                    "7. Pandangan lurus ke tempat sujud.",
            "Iktidal adalah bangkit dari rukuk. Posisi badan kembali tegak. Ketika bangkit disunahkan mengangkat tangan seperti ketika takbiratulihram. Bersamaan dengan itu membaca kalimat “sami’allahu liman hamidah”. Badan kembali tegak berdiri. Tangan rapat di samping badan. Ada juga yang kembali ke posisi bersedekap seperti halnya ketika membaca surat Al Fatihah. Perbedaan ini terjadi karena beda pemaknaan terhadap hadis dalilnya. Padahal dalil yang digunakan sama. Namun, jumhur ulama sepakat bahwa saat iktidal itu menyimpan tangan rapat di samping badan.\n" +
                    "Sesudah badan mantap tegak berdiri, barulah membaca salah satu doa iktidal.",
            "Sujud artinya menempelkan kening pada lantai. Menurut hadis riwayat Jamaah, ada tujuh anggota badan yang menyentuh lantai ketika sujud, yaitu:\n" +
                    "1. wajah (kening dan hidung),\n" +
                    "2. dua telapak tangan,\n" +
                    "3. dua lutut, dan\n" +
                    "4. dua ujung telapak kaki.\n" +
                    "Cara melakukan sujud adalah sebagai berikut.\n" +
                    "1. Turunkan badan dari posisi iktidal, dimulai dengan menekuk lutut sambil mengucapkan takbir.\n" +
                    "2. Letakkan kedua lutut ke lantai.\n" +
                    "3. Letakkan kedua telapak tangan ke lantai.\n" +
                    "4. Letakkan kening dan hidung ke lantai.\n" +
                    "5. Talapak tangan dibuka, tidak dikepalkan. Akan tetapi, jari-jarinya dirapatkan, dan ini satu-satunya gerakan di mana jari-jari tangan dirapatkan, sementara dalam gerakan lainnya jari-jari ini selalu direnggangkan.",
            "Duduk antara sujud adalah duduk iftirasy, yaitu:\n" +
                    "1. Bangkit dari sujud pertama sambil mengucapkan takbir.\n" +
                    "2. Telapak kaki kiri dibuka dan diduduki.\n" +
                    "3. Telapak kaki kanan tegak. Jari-jarinya menghadap ke arah kiblat.\n" +
                    "4. Badan tegak lurus.\n" +
                    "5. Siku ditekuk. Tangan sejajar dengan paha.\n" +
                    "6. Telapak tangan dibuka. Jari-jarinya direnggangkan dan menghadap ke arah kiblat.\n" +
                    "7. Telapak tangan diletakkan di atas paha. Ujung jari tangan sejajar dengan lutut.\n" +
                    "8. Pandangan lurus ke tempat sujud.\n" +
                    "9. Setelah posisi tumakninah, baru kemudian membaca salah satu doa antara dua sujud.",
            "Tasyahud akhir adalah duduk tawaruk. Caranya adalah.\n" +
                    "1. Bangkit dari sujud kedua, yaitu pada rakaat terakhir salat, sambil membaca takbir.\n" +
                    "2. Telapak kaki kiri dimasukkan ke bawah kaki kanan. Jadi, panggul duduk menyentuh lantai.\n" +
                    "3. Telapak kaki kanan tegak. Jari-jarinya menghadap ke arah kiblat.\n" +
                    "4. Badan tegak lurus.\n" +
                    "5. Siku ditekuk. Tangan sejajar dengan paha.\n" +
                    "6. Telapak tangan dibuka. Jari-jarinya direnggangkan dan menghadap ke arah kiblat.\n" +
                    "7. Telapak tangan diletakkan di atas paha. Ujung jari tangan sejajar dengan lutut.\n" +
                    "8. Disunahkan memberi isyarat dengan telunjuk, yaitu telapak tangan kanan digenggamkan. Kemudian telunjuk diangkat (menunjuk). Dalam posisi ini kemudian membaca doa tasyahud, selawat, dan doa setelah tasyahud akhir.","\n" +
            "Gerakan salam adalah menengok ke arah kanan dan kiri. Menengok dilakukan sampai kira-kira searah dengan bahu. Jika jadi imam dalam salat berjamaah, salam dilakukan sampai terlihat hidung oleh makmum. Menengok dilakukan sambil membaca salam."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat);
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
            View view = getLayoutInflater().inflate(R.layout.customlayoutsholat, null);
            ImageView mImgage = view.findViewById(R.id.imageView);
            TextView nTextView = view.findViewById(R.id.view);

            mImgage.setImageResource(images[position]);
            nTextView.setText(Name[position]);
            return view;
        }
    }
}
