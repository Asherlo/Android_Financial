package com.example.financial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SenseTextpage extends AppCompatActivity {

    ImageView fanhuihu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sense_textpage);

        fanhuihu=findViewById(R.id.fanhuihu);
        fanhuihu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SenseTextpage.this,SensePage.class);
                startActivity(intent);
            }
        });
    }
}