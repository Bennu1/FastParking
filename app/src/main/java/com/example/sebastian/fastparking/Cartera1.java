package com.example.sebastian.fastparking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sebastian.fastparking.ui.cartera1.Cartera1Fragment;

public class Cartera1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cartera1_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Cartera1Fragment.newInstance())
                    .commitNow();
        }
    }
}
