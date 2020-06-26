package com.example.financial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutPage extends AppCompatActivity {

    ImageView fanhhuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_about_page);

        fanhhuu=findViewById(R.id.fanhhuu);
        fanhhuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AboutPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}