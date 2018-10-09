package com.example.sebastian.fastparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tuto3 extends AppCompatActivity {

    Button btntut3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuto3);

        btntut3 = (Button) findViewById(R.id.tuto3);

        btntut3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent op = new Intent(getApplicationContext(), Tuto4.class);
                startActivity(op);
            }
        });
    }
}
