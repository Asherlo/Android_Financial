package com.example.financial;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageButton lc_gy;
    ImageButton lc_bwl;
    ImageButton lc_jz;
    ImageButton lc_zxg;
    ImageButton lc_cs;
    ImageButton lc_jsq;
    ImageButton lc_exit;

    ImageView zuihou;

    ImageView iv;//定义imageView

    boolean isChanged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //关于界面跳转
        ImageButton lc_gy = (ImageButton) findViewById(R.id.lc_gy);
        lc_gy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AboutPage.class);
                startActivity(i);
            }
        });

        //备忘录跳转
        ImageButton lc_bwl = (ImageButton) findViewById(R.id.lc_bwl);
        lc_bwl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MemoPage.class));
            }
        });

        //记账
        ImageButton lc_jz = (ImageButton) findViewById(R.id.lc_jz);
        lc_jz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TallyPage.class));
            }
        });

        //自选股
        ImageButton lc_zxg = (ImageButton) findViewById(R.id.lc_zxg);
        lc_zxg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,StockPage.class));
            }
        });

        //理财常识
        ImageButton lc_cs = (ImageButton) findViewById(R.id.lc_cs);
        lc_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SensePage.class));
            }
        });

        //计算器
        ImageButton lc_jsq = (ImageButton) findViewById(R.id.lc_jsq);
        lc_jsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CalculatorPage.class));
            }
        });

        //退出
        ImageButton lc_exit = (ImageButton) findViewById(R.id.lc_exit);
        lc_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("退出软件")
                        .setMessage("是否退出软件")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                return;
                            }
                        }).create();
                alertDialog.show();
            }
        });
    }
}