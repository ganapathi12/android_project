package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button student,admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        student=findViewById(R.id.student);
        admin=findViewById(R.id.admin);

        student.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == student.getId()) {
            Intent intent = new Intent(this, signinactivity.class);
            startActivity(intent);
        }
        if(view.getId()==admin.getId()){
            Intent intent = new Intent(this, adminsignin.class);
            startActivity(intent);
        }
    }
}