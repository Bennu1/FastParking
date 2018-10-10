package com.example.sebastian.fastparking;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Cartera extends AppCompatActivity
{

    private BottomNavigationView bottomNav;
    Button popSali;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartera);

        bottomNav = (BottomNavigationView) findViewById(R.id.barraNav);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.btn_saliendo){

                    popSali = (Button)findViewById(R.id.salida);

                    popSali.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Cartera.this, Saliendo.class);
                            startActivity(intent);
                        }
                    });

                }else if (menuItem.getItemId()== R.id.btn_reserva){

                }else if (menuItem.getItemId()== R.id.btn_cartera){

                }else if (menuItem.getItemId()== R.id.btn_tiempo){

                }

                return false;
            }
        });

    }

}
