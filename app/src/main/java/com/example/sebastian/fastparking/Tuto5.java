package com.example.sebastian.fastparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tuto5 extends AppCompatActivity {

    Button btntut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuto5);

        btntut5 = (Button) findViewById(R.id.tuto5);

        btntut5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent op = new Intent(getApplicationContext(), Tuto6.class);
                startActivity(op);
            }
        });
    }
}
