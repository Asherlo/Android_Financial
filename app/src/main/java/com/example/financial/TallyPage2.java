package com.example.financial;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TallyPage2 extends AppCompatActivity {

    ImageView fanhhuu;
    public TextView zc;
    public TextView sr;
    private Button Save;
    private Button Look;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tally_page2);

        fanhhuu=findViewById(R.id.fanhhuu);
        fanhhuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TallyPage2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 点击支出跳1
        zc = (TextView)findViewById(R.id.zc);
        zc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TallyPage2.this,TallyPage.class));
            }
        });
        // 点击收入跳2
        sr = (TextView)findViewById(R.id.sr);
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TallyPage2.this,TallyPage2.class));
            }
        });
        // 点击保存弹出保存成功
        Save = (Button)findViewById(R.id.Save);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TallyPage2.this, "保存成功!", Toast.LENGTH_LONG).show();
            }
        });
        // 点击查看账单弹出账单
        Look = (Button)findViewById(R.id.Look);
        Look.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder  = new AlertDialog.Builder(TallyPage2.this);
                builder.setTitle("详细信息" ) ;
                builder.setMessage("2018-03-28  星期三/类型：餐饮/金额：100元/消费账户：现金/消费项目：日常/消费成员：自己" ) ;
                builder.setPositiveButton("确认" ,  null );
                builder.show();
            }
        });
    }
}