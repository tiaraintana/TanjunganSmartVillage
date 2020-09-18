package com.example.tanjungansmartvillage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuAfterLogin extends AppCompatActivity {
    TextView informasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_after_login);

        informasi = findViewById(R.id.textView7);
        informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAfterLogin.this, UserProfile.class);
                startActivity(intent);
            }
        });
    }
}