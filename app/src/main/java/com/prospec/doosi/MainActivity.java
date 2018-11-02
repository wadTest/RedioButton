package com.prospec.doosi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// (setContentView)คือ inflate ,ส่วน(R.layout.activity_main)คือ R.<TYPE>.<NAME>

//        TextView tvHello = (TextView) findViewById(R.id.tvHello); //เข้าถึง part R
//        tvHello.setText("Yeah!");//คำที่ขึ้นมา ตอนรันโปรแกรม
    }
}
