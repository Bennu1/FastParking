package com.example.sebastian.fastparking;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sebastian.fastparking.R;
import com.facebook.CustomTabMainActivity;

public class MenuInferior extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.btn_saliendo:
                    mTextMessage.setText(R.string.title_home);
                    Toast.makeText(MenuInferior.this, "cliked :D",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_reserva:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.btn_cartera:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.btn_tiempo:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inferior);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.barraNav);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
