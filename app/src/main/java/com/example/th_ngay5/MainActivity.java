package com.example.th_ngay5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button buttondk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button = (Button) findViewById (R.id.login);
        buttondk = (Button)  findViewById(R.id.dangky);
        buttondk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(t);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

    }
}