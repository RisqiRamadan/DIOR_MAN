package com.example.diorman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivBaju = findViewById(R.id.ivbackbaju);
        ImageView ivKacamata = findViewById(R.id.ivbackkacamata);
        ImageView ivSepatu = findViewById(R.id.ivbacksepatu);
        Button btnMoveBaju = findViewById(R.id.btnbackbaju);
        Button btnMoveKacamata = findViewById(R.id.btnbackkacamata);
        Button btnMoveSepatu = findViewById(R.id.btnbacksepatu);

        ivBaju.setOnClickListener(this);
        ivKacamata.setOnClickListener(this);
        ivSepatu.setOnClickListener(this);
        btnMoveBaju.setOnClickListener(this);
        btnMoveKacamata.setOnClickListener(this);
        btnMoveSepatu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnbackbaju || v.getId() == R.id.ivbackbaju) {
            Intent intentBaju = new Intent(this, BajuActivity.class);
            startActivity(intentBaju);
        }
        if (v.getId() == R.id.btnbackkacamata || v.getId() == R.id.ivbackkacamata) {
            Intent intentKacamata = new Intent(this, KacamataActivity.class);
            startActivity(intentKacamata);
        }
        if (v.getId() == R.id.btnbacksepatu || v.getId() == R.id.ivbacksepatu) {
            Intent intentSepatu = new Intent(this, SepatuActivity.class);
            startActivity(intentSepatu);
        }
    }
}