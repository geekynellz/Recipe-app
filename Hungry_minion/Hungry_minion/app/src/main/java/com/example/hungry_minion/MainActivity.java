package com.example.hungry_minion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView SignUpRedirectText = findViewById(R.id.SignUpRedirectText);
        SignUpRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the second activity
                Intent intent = new Intent(MainActivity.this, signupActivity.class);
                startActivity(intent);
            }
        });
    }
}