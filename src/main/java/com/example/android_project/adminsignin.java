package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class adminsignin extends AppCompatActivity {

    EditText registrationnumber,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminsignin);

        registrationnumber=findViewById(R.id.registrationnumber);
        password=findViewById(R.id.password);

    }

    public void valid(View view) {
        if(!registrationnumber.getText().toString().isEmpty()){
            String rollno=registrationnumber.getText().toString();
            if(rollno.matches("CB.EN.U4CSE18+[0-9]+[0-9]+[0-9]")){
                Toast.makeText(this,"Welcome " + registrationnumber.getText().toString(), Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this,"enter a valid Registration number", Toast.LENGTH_LONG).show();
            }
        }
        else{
            Toast.makeText(this,"enter a all details", Toast.LENGTH_LONG).show();
        }
    }
}