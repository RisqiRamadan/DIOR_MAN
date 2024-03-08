package com.example.diorman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetail extends AppCompatActivity{
    public static final String KEY_DATA ="key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView Gambar = findViewById(R.id.ivproduk);
        TextView Name = findViewById(R.id.tvnamaproduk);
        TextView Price = findViewById(R.id.tvhargaproduk);
        TextView Color = findViewById(R.id.tvwarnaproduk);
        TextView Type = findViewById(R.id.tvtipeproduk);
        TextView Size = findViewById(R.id.tvukuranbesarproduk);
        TextView BackLength = findViewById(R.id.tvukuranpanjangproduk);
        TextView CollarType = findViewById(R.id.tvtipekerah);
        TextView MadeIn = findViewById(R.id.tvdibuat);


        Detail detail;
        if (Build.VERSION.SDK_INT >= 33) {
            detail = getIntent().getParcelableExtra(KEY_DATA, Detail.class);
        }else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }

        String sourceGambar = detail.getGambar();
        int sourceGambarID = getResources().getIdentifier(sourceGambar, "drawable", getPackageName());
        Gambar.setImageResource(sourceGambarID);

        Name.setText(detail.getName());
        Price.setText(detail.getPrice());
        Color.setText(detail.getColor());
        Type.setText(detail.getType());
        Size.setText(detail.getSize());
        BackLength.setText(detail.getBackLength());
        CollarType.setText(detail.getCollarType());
        MadeIn.setText(detail.getMadeIn());

    }
}