package com.example.hello.pro0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    protected  void init(){
        Button btn1= (Button) findViewById(R.id.pro_1);
        Button btn2= (Button) findViewById(R.id.pro_2);
        Button btn3= (Button) findViewById(R.id.pro_3);
        Button btn4= (Button) findViewById(R.id.pro_4);
        Button btn5= (Button) findViewById(R.id.pro_5);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
     switch (view.getId()){
         case R.id.pro_1:
             Toast.makeText(MainActivity.this,"热门电影",Toast.LENGTH_SHORT).show();
             break;
         case R.id.pro_2:
             Toast.makeText(MainActivity.this,"股票雄鹰",Toast.LENGTH_SHORT).show();
             break;
         case R.id.pro_3:
             Toast.makeText(MainActivity.this,"XYZ阅读器",Toast.LENGTH_SHORT).show();
             break;
         case R.id.pro_4:
             Toast.makeText(MainActivity.this,"最新闻",Toast.LENGTH_SHORT).show();
             break;
         case R.id.pro_5:
             Toast.makeText(MainActivity.this,"毕业设计",Toast.LENGTH_SHORT).show();
             break;







     }


    }
}
