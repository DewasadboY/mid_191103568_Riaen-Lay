package com.riaen.a191103568_riaen_lay_mid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    EditText username,password;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)  findViewById(R.id.editUsername);
        password = (EditText)  findViewById(R.id.editPassword);
        buttonLogin = (Button)  findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("rukawa") && passwordKey.equals("1sampai8")) {
                    //jika login sukses
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(loginActivity.this, profil.class);
                    loginActivity.this.startActivity(intent);
                    finish();
                } else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.this);
                    builder.setMessage("Username atau Password Salah")
                            .setNegativeButton("Retry",null).create().show();
                }
            }
        });
    }
}