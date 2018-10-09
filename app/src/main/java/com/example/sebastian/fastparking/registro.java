package com.example.sebastian.fastparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro extends AppCompatActivity {

    Button btnregre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnregre = (Button) findViewById(R.id.btn_reg);

        btnregre.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent op = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(op);
            }
        });
    }
}
