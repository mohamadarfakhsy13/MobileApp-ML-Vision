package com.arfakhsy.vision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "Login Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            if(username.getText().toString().equals("hello@gmail.com") && password.getText().toString().equals("12345")) {
                // correct login and password
                Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "Success to login");
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            } else
                // incorrect login and password
                Toast.makeText(LoginActivity.this, "LOGIN FAILED!!!", Toast.LENGTH_SHORT).show();
                Log.e(TAG, "Fail to login");
        });
    }
    // TODO prevent onclick back button to exit
    // TODO create dashboard page for activity selection. E.g: Image Labelling, Object detection, static picture and real time detection
}