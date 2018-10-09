package com.example.sebastian.fastparking;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cartera extends AppCompatActivity
{

    private BottomNavigationView barraNav ;
    Button btn_saliendo;


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

      btn_saliendo = (Button) findViewById(R.id.btn_saliendo);

      /* botones */
      btn_saliendo.setOnClickListener(new View.OnClickListener()
      {
          @Override
          public void onClick(View v)
          {
              Intent i = new Intent(getApplicationContext(), Saliendo.class);

          }
      });


    }

}
