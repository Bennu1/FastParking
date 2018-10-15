package com.example.sebastian.fastparking;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sebastian.fastparking.R;
import com.facebook.CustomTabMainActivity;

public class MenuInferior extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.btn_saliendo:

                    break;
                case R.id.btn_reserva:

                    return true;
                case R.id.btn_cartera:

                    return true;
                case R.id.btn_tiempo:

                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inferior);

        mMainFrame = (FrameLayout) findViewById(R.id.btn_cartera);
        mMainNav = (BottomNavigationView) findViewById(R.id.barraNav);


    }

}
