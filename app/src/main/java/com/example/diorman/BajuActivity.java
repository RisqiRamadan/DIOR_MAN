package com.example.diorman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BajuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baju);

        ImageView ivBaju1 = findViewById(R.id.ivbaju1);
        ImageView ivBaju2 = findViewById(R.id.ivbaju2);
        ImageView ivBaju3 = findViewById(R.id.ivbaju3);
        ImageView ivBaju4 = findViewById(R.id.ivbaju4);
        ImageView ivBaju5 = findViewById(R.id.ivbaju5);
        Button btnDeskripsiBaju1 = findViewById(R.id.btndeskripsibaju1);
        Button btnDeskripsiBaju2 = findViewById(R.id.btndeskripsibaju2);
        Button btnDeskripsiBaju3 = findViewById(R.id.btndeskripsibaju3);
        Button btnDeskripsiBaju4 = findViewById(R.id.btndeskripsibaju4);
        Button btnDeskripsiBaju5 = findViewById(R.id.btndeskripsibaju5);

        ivBaju1.setOnClickListener(this);
        ivBaju2.setOnClickListener(this);
        ivBaju3.setOnClickListener(this);
        ivBaju4.setOnClickListener(this);
        ivBaju5.setOnClickListener(this);
        btnDeskripsiBaju1.setOnClickListener(this);
        btnDeskripsiBaju2.setOnClickListener(this);
        btnDeskripsiBaju3.setOnClickListener(this);
        btnDeskripsiBaju4.setOnClickListener(this);
        btnDeskripsiBaju5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btndeskripsibaju1 || v.getId() == R.id.ivbaju1) {
            Detail baju1 = new Detail();
            baju1.setName("Bobby Sweater");
            baju1.setPrice("Rp. 41.000.000,00");
            baju1.setColor("Color : Blue Cashmere");
            baju1.setType("Type : Regular fit");
            baju1.setSize("Size : M");
            baju1.setBackLength("Back Length : 68 cm");
            baju1.setCollarType("Collar Type : Ribbed round neck, cuffs and hem");
            baju1.setMadeIn("Made In Italy");
            baju1.setGambar("baju1");

            Intent intent = new Intent(BajuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, baju1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsibaju2 || v.getId() == R.id.ivbaju2) {
            Detail baju1 = new Detail();
            baju1.setName("Christian Dior Relaxed-Fit T-Shirt");
            baju1.setPrice("Rp. 20.000.000,00");
            baju1.setColor("Color : Beige");
            baju1.setType("Type : Relaxed fit");
            baju1.setSize("Size : M");
            baju1.setBackLength("Back Length : 68 cm");
            baju1.setCollarType("Collar Type : Ribbed crew neck");
            baju1.setMadeIn("Made In Italy");
            baju1.setGambar("baju2");

            Intent intent = new Intent(BajuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, baju1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsibaju3 || v.getId() == R.id.ivbaju3) {
            Detail baju1 = new Detail();
            baju1.setName("Coach Jacket");
            baju1.setPrice("Rp. 30.000.000,00");
            baju1.setColor("Color : Beige");
            baju1.setType("Type : Cassual fit");
            baju1.setSize("Size : M");
            baju1.setBackLength("Back Length : 70 cm");
            baju1.setCollarType("Collar Type : Shirt Collar");
            baju1.setMadeIn("Made In Japan");
            baju1.setGambar("baju3");

            Intent intent = new Intent(BajuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, baju1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsibaju4 || v.getId() == R.id.ivbaju4) {
            Detail baju1 = new Detail();
            baju1.setName("DIOR AND OTANI WORKSHOP Long-Sleeved Polo Shirt");
            baju1.setPrice("Rp. 40.000.000,00");
            baju1.setColor("Color : Red Cutton");
            baju1.setType("Type : Cassual fit");
            baju1.setSize("Size : M");
            baju1.setBackLength("Back Length : 68 cm");
            baju1.setCollarType("Collar Type : Shirt Collar");
            baju1.setMadeIn("Made In Italy");
            baju1.setGambar("baju4");

            Intent intent = new Intent(BajuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, baju1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsibaju5 || v.getId() == R.id.ivbaju5) {
            Detail baju1 = new Detail();
            baju1.setName("Prince of Wales-Breasted Jacket");
            baju1.setPrice("Rp. 50.000.000,00");
            baju1.setColor("Color : Gray Wool");
            baju1.setType("Type : Cassual fit");
            baju1.setSize("Size : L");
            baju1.setBackLength("Back Length : 76 cm");
            baju1.setCollarType("Collar Type : Pointed Lapels");
            baju1.setMadeIn("Made In Italy");
            baju1.setGambar("baju5");

            Intent intent = new Intent(BajuActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, baju1);
            startActivity(intent);
        }
    }
}