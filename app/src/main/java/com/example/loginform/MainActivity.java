package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.et_username);
        EditText password = findViewById(R.id.et_password);

        Button buttonlogin = findViewById(R.id.btn_login);

        // Logical Login Form
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("Indra Adi") && password.getText().toString().equals("12345")) {
                    // Benar
                    Toast.makeText(MainActivity.this, "LOGIN ANDA BERHASIL", Toast.LENGTH_SHORT).show();
                } else {
                    // Salah
                    Toast.makeText(MainActivity.this, "GAGAL MELAKUKAN LOGIN :(", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}