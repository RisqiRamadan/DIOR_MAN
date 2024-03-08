package com.example.diorman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class KacamataActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kacamata);

        ImageView ivKacamata1 = findViewById(R.id.ivkacamata1);
        ImageView ivKacamata2 = findViewById(R.id.ivkacamata2);
        ImageView ivKacamata3 = findViewById(R.id.ivkacamata3);
        ImageView ivKacamata4 = findViewById(R.id.ivkacamata4);
        ImageView ivKacamata5 = findViewById(R.id.ivkacamata5);
        Button btnDeskripsiKacamata1 = findViewById(R.id.btndeskripsikacamata1);
        Button btnDeskripsiKacamata2 = findViewById(R.id.btndeskripsikacamata2);
        Button btnDeskripsiKacamata3 = findViewById(R.id.btndeskripsikacamata3);
        Button btnDeskripsiKacamata4 = findViewById(R.id.btndeskripsikacamata4);
        Button btnDeskripsiKacamata5 = findViewById(R.id.btndeskripsikacamata5);

        ivKacamata1.setOnClickListener(this);
        ivKacamata2.setOnClickListener(this);
        ivKacamata3.setOnClickListener(this);
        ivKacamata4.setOnClickListener(this);
        ivKacamata5.setOnClickListener(this);
        btnDeskripsiKacamata1.setOnClickListener(this);
        btnDeskripsiKacamata2.setOnClickListener(this);
        btnDeskripsiKacamata3.setOnClickListener(this);
        btnDeskripsiKacamata4.setOnClickListener(this);
        btnDeskripsiKacamata5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btndeskripsikacamata1 || v.getId() == R.id.ivkacamata1) {
            Detail kacamata1 = new Detail();
            kacamata1.setName("Dior3D S1I");
            kacamata1.setPrice("Rp. 9.900.000,00");
            kacamata1.setColor("Color : Khaki");
            kacamata1.setType("Type : Rectangular Sunglasses");
            kacamata1.setSize("Lenses : 2 Inches");
            kacamata1.setBackLength("Bridge : 0.5 Inches");
            kacamata1.setCollarType("Frame : Khaki nylon Cannage Frame");
            kacamata1.setMadeIn("Made In Italy");
            kacamata1.setGambar("kacamata1");

            Intent intent = new Intent(KacamataActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, kacamata1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsikacamata2 || v.getId() == R.id.ivkacamata2) {
            Detail kacamata2 = new Detail();
            kacamata2.setName("NeoDior S4U");
            kacamata2.setPrice("Rp. 10.500.000,00");
            kacamata2.setColor("Color : Gray");
            kacamata2.setType("Type : Rectangular Sunglasses");
            kacamata2.setSize("Lenses : 2.5 Inches");
            kacamata2.setBackLength("Bridge : 0.5 Inches");
            kacamata2.setCollarType("Frame : Gunmetal frame");
            kacamata2.setMadeIn("Made In Italy");
            kacamata2.setGambar("kacamata2");

            Intent intent = new Intent(KacamataActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, kacamata2);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsikacamata3 || v.getId() == R.id.ivkacamata3) {
            Detail kacamata3 = new Detail();
            kacamata3.setName("CD Diamond M1U");
            kacamata3.setPrice("Rp. 11.500.000,00");
            kacamata3.setColor("Color : Gray");
            kacamata3.setType("Type : Rectangular Sunglasses");
            kacamata3.setSize("Lenses : 2.5 Inches");
            kacamata3.setBackLength("Bridge : 0.5 Inches");
            kacamata3.setCollarType("Frame : Gunmetal frame");
            kacamata3.setMadeIn("Made In Italy");
            kacamata3.setGambar("kacamata3");

            Intent intent = new Intent(KacamataActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, kacamata3);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsikacamata4 || v.getId() == R.id.ivkacamata4) {
            Detail kacamata4 = new Detail();
            kacamata4.setName("CD Diamond S6F");
            kacamata4.setPrice("Rp. 11.800.000,00");
            kacamata4.setColor("Color : Transparant Green");
            kacamata4.setType("Type : Square Sunglasses");
            kacamata4.setSize("Lenses : 2 Inches");
            kacamata4.setBackLength("Bridge : 0.5 Inches");
            kacamata4.setCollarType("Frame : Transparent beige acetate frame");
            kacamata4.setMadeIn("Made In Italy");
            kacamata4.setGambar("kacamata4");

            Intent intent = new Intent(KacamataActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, kacamata4);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsikacamata5 || v.getId() == R.id.ivkacamata5) {
            Detail kacamata4 = new Detail();
            kacamata4.setName("DiorBlackSuit S10I");
            kacamata4.setPrice("Rp. 7.460.000,00");
            kacamata4.setColor("Color : Translucent Beige and Brown");
            kacamata4.setType("Type : Rectangular Sunglasses");
            kacamata4.setSize("Lenses : 2 Inches");
            kacamata4.setBackLength("Bridge : 1 Inches");
            kacamata4.setCollarType("Frame : Effect acetate frame");
            kacamata4.setMadeIn("Made In Italy");
            kacamata4.setGambar("kacamata5");

            Intent intent = new Intent(KacamataActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, kacamata4);
            startActivity(intent);
        }
    }
}