package com.example.android1finalproject.housing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android1finalproject.R;

public class HousingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing);

        Button rent = findViewById(R.id.to_rent);
        Button buy = findViewById(R.id.to_buy);
        Button lease = findViewById(R.id.to_lease);

        rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HousingActivity.this,HousingActivity2.class);
                intent.putExtra("index",0);
                startActivity(intent);
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HousingActivity.this,HousingActivity2.class);
                intent.putExtra("index",1);
                startActivity(intent);
            }
        });

        lease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HousingActivity.this,HousingActivity2.class);
                intent.putExtra("index",2);
                startActivity(intent);
            }
        });
    }
}