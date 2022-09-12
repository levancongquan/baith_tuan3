package com.example.th_ngay5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button btnlogin;
    Button btndangky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btndangky = (Button)findViewById(R.id.btdangky1);
        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(x);
            }
        });
        btnlogin = (Button) findViewById(R.id.btlogin1);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(i);
            }

        });
    }
}