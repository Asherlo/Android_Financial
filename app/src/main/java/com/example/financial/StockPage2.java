package com.example.financial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StockPage2 extends AppCompatActivity {

    ImageView fanhhuu;
    Button btn_shjys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_stock_page2);

        fanhhuu=findViewById(R.id.fanhhuu);
        fanhhuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(StockPage2.this, StockPage.class);
                startActivity(intent);
            }
        });

        btn_shjys = findViewById(R.id.btn_shjys);
        btn_shjys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StockPage2.this,StockPage3.class);
                startActivity(intent);
            }
        });
    }
}