package com.example.financial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StockPage extends AppCompatActivity {

    ImageView fanhhuu;
    Button add_zxg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_stock_page);

        fanhhuu=findViewById(R.id.fanhhuu);
        fanhhuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(StockPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        add_zxg=findViewById(R.id.add_zxg);
        add_zxg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StockPage.this,StockPage2.class);
                startActivity(intent);
            }
        });

    }
}