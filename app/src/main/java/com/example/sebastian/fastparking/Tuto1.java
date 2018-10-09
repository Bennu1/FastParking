package com.example.sebastian.fastparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tuto1 extends AppCompatActivity {

    Button btntut1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuto1);

        btntut1 = (Button) findViewById(R.id.tuto1);

        btntut1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent op = new Intent(getApplicationContext(), Tuto2.class);
                startActivity(op);
            }
        });
    }
}
