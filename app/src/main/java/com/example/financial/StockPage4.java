package com.example.financial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class StockPage4 extends AppCompatActivity {

    ImageView fanhhuu;
    Button btn_Addzxg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_stock_page4);

        fanhhuu=findViewById(R.id.fanhhuu);
        fanhhuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(StockPage4.this, StockPage3.class);
                startActivity(intent);
            }
        });

//        btn_Addzxg = (Button)findViewById(R.id.btn_Addzxg);
//
//        btn_Addzxg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(TallyPage.this, "保存成功!", Toast.LENGTH_LONG).show();
//            }
//        });
    }
}