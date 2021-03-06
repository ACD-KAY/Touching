package com.teamacd.demo;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity_01 extends AppCompatActivity {
    private Button btn;
    private TextView btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);

        /** when the user clicks "登录"*/
        btn=(Button)findViewById(R.id.B_login);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Activity_01.this, Activity_03.class);
                startActivity(it);
            }
        });

        /** when the user clicks ""新用户注册*/
        btn2=(TextView)findViewById(R.id.textView);
        btn2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Activity_01.this, Activity_02.class);
                startActivity(it);
            }
        });
    }
}
