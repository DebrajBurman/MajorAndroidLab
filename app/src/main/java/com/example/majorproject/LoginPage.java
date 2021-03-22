package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login_page);
    }

    public void toDashboard(View view){
        EditText editText=findViewById(R.id.editTextTextPersonName);
        Toast.makeText(this, "Welcome Back "+editText.getText().toString()+"!!", Toast.LENGTH_LONG).show();
        Intent intent =new Intent(getApplicationContext(),Dashboard.class);
        startActivity(intent);


    }

}