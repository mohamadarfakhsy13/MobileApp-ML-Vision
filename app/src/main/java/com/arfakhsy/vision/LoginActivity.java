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

    TextView username, password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            if(username.getText().toString().equals("hello@gmail.com") && password.getText().toString().equals("12345")) {
                // correct login and password
                Log.i(TAG, "Success to login");
                Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            } else {
                // incorrect login and password
                Log.e(TAG,"Fail to login");
                Toast.makeText(LoginActivity.this, "LOGIN FAILED!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
    // TODO prevent onclick back button to exit
    // TODO create dashboard page for activity selection. E.g: Image Labelling, Object detection, static picture and real time detection
}