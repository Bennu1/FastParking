package com.example.sebastian.fastparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tuto4 extends AppCompatActivity {

    Button btntut4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuto4);

        btntut4 = (Button) findViewById(R.id.tuto4);

        btntut4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent op = new Intent(getApplicationContext(), Tuto5.class);
                startActivity(op);
            }
        });
    }
}
