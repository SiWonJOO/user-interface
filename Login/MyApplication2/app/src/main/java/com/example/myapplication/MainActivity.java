package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView sign;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //회원가입 버튼
        sign = findViewById(R.id.join_button);

        //회원가입 버튼 클릭시, 회원가입 페이지로 이동
        sign.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_signup.class);
            startActivity(intent);
        });
    }
}