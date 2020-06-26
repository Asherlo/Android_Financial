package com.example.financial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SensePage extends AppCompatActivity {

    ImageView fann;

    ImageView shangyi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sense_page);

        fann=findViewById(R.id.fann);
        fann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SensePage.this, MainActivity.class);
                startActivity(intent);
            }
        });



        shangyi=findViewById(R.id.shangyi);
        shangyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SensePage.this,SenseTextpage.class);
                startActivity(intent);
            }
        });
    }
}