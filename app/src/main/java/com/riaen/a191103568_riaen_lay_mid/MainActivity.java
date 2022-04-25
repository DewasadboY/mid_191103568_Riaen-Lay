package com.riaen.a191103568_riaen_lay_mid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = (Button)  findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Toast.makeText(getApplicationContext(), "Halaman Login", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, loginActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }
            }
        );
    }
}