package com.example.sebastian.fastparking;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Cartera extends AppCompatActivity
{

    private BottomNavigationView barraNav ;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartera);

      barraNav = (BottomNavigationView) findViewById(R.id.barraNav);
      barraNav.setItemIconTintList(null);

      barraNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
      {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
          {

              return false;
          }
      });


    }

}
