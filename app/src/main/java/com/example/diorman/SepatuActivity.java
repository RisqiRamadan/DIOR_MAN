package com.example.diorman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SepatuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepatu);

        ImageView ivSepatu1 = findViewById(R.id.ivsepatu1);
        ImageView ivSepatu2 = findViewById(R.id.ivsepatu2);
        ImageView ivSepatu3 = findViewById(R.id.ivsepatu3);
        ImageView ivSepatu4 = findViewById(R.id.ivsepatu4);
        ImageView ivSepatu5 = findViewById(R.id.ivsepatu5);
        Button btnDeskripsiSepatu1 = findViewById(R.id.btndeskripsisepatu1);
        Button btnDeskripsiSepatu2 = findViewById(R.id.btndeskripsisepatu2);
        Button btnDeskripsiSepatu3 = findViewById(R.id.btndeskripsisepatu3);
        Button btnDeskripsiSepatu4 = findViewById(R.id.btndeskripsisepatu4);
        Button btnDeskripsiSepatu5 = findViewById(R.id.btndeskripsisepatu5);

        ivSepatu1.setOnClickListener(this);
        ivSepatu2.setOnClickListener(this);
        ivSepatu3.setOnClickListener(this);
        ivSepatu4.setOnClickListener(this);
        ivSepatu5.setOnClickListener(this);
        btnDeskripsiSepatu1.setOnClickListener(this);
        btnDeskripsiSepatu2.setOnClickListener(this);
        btnDeskripsiSepatu3.setOnClickListener(this);
        btnDeskripsiSepatu4.setOnClickListener(this);
        btnDeskripsiSepatu5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btndeskripsisepatu1 || v.getId() == R.id.ivsepatu1) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Dior Buffalo Lace-Up Boot");
            sepatu1.setPrice("Rp. 29.000.000,00");
            sepatu1.setColor("Color : Black");
            sepatu1.setType("Type : Boot");
            sepatu1.setSize("Weight : 24 ounces");
            sepatu1.setBackLength("Size : 43 cm");
            sepatu1.setCollarType("Shoe Type : High-top");
            sepatu1.setMadeIn("Made In Italy");
            sepatu1.setGambar("sepatu1");

            Intent intent = new Intent(SepatuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsisepatu2 || v.getId() == R.id.ivsepatu2) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("B57 Mid-Top Sneaker");
            sepatu1.setPrice("Rp. 24.000.000,00");
            sepatu1.setColor("Color : Blue and Cream");
            sepatu1.setType("Type : Sneaker");
            sepatu1.setSize("Weight : 16 ounces");
            sepatu1.setBackLength("Size : 39 cm");
            sepatu1.setCollarType("Shoe Type : Mid-top");
            sepatu1.setMadeIn("Made In Italy");
            sepatu1.setGambar("sepatu2");

            Intent intent = new Intent(SepatuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsisepatu3 || v.getId() == R.id.ivsepatu3) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("B9S Skater Sneaker ");
            sepatu1.setPrice("Rp. 43.000.000,00");
            sepatu1.setColor("Color : Beige");
            sepatu1.setType("Type : Sneaker");
            sepatu1.setSize("Weight : 23.5 ounces");
            sepatu1.setBackLength("Size : 42 cm");
            sepatu1.setCollarType("Shoe Type : Low-top");
            sepatu1.setMadeIn("Made In Italy");
            sepatu1.setGambar("sepatu3");

            Intent intent = new Intent(SepatuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsisepatu4 || v.getId() == R.id.ivsepatu4) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Dior Buffalo Loafer ");
            sepatu1.setPrice("Rp. 28.000.000,00");
            sepatu1.setColor("Color : Black");
            sepatu1.setType("Type : Loafer");
            sepatu1.setSize("Weight : 23.5 ounces");
            sepatu1.setBackLength("Size : 42 cm");
            sepatu1.setCollarType("Shoe Type : Low-top");
            sepatu1.setMadeIn("Made In Italy");
            sepatu1.setGambar("sepatu4");

            Intent intent = new Intent(SepatuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsisepatu5 || v.getId() == R.id.ivsepatu5) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Dior Granville Loafer ");
            sepatu1.setPrice("Rp. 20.000.000,00");
            sepatu1.setColor("Color : Brown Suede");
            sepatu1.setType("Type : Loafer");
            sepatu1.setSize("Weight : 12.5 ounces");
            sepatu1.setBackLength("Size : 36 cm");
            sepatu1.setCollarType("Shoe Type : Low-top");
            sepatu1.setMadeIn("Made In Italy");
            sepatu1.setGambar("sepatu5");

            Intent intent = new Intent(SepatuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sepatu1);
            startActivity(intent);
        }
    }
}