package com.example.sebastian.fastparking;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.example.sebastian.fastparking.R;
import com.facebook.CustomTabMainActivity;


public class MenuInferior extends AppCompatActivity
        implements Cartera.OnFragmentInteractionListener,
        Reservar.OnFragmentInteractionListener, Extender.OnFragmentInteractionListener{




    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private Button ubicarme;

    private Cartera carteraFragment;
    private Reservar reservarFragment;
    private Extender extenderFreame;





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



        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);

        reservarFragment = new Reservar();
        carteraFragment = new Cartera();
        extenderFreame= new Extender();



        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {




            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {



                switch (item.getItemId()) {
                    case R.id.btn_saliendo:
                        Intent inten = new Intent(MenuInferior.this,MapsActivity.class);
                        startActivity(inten);



                        return true;

                    case R.id.btn_reserva:

                        setFragment (reservarFragment);

                        return true;
                    case R.id.btn_cartera:

                        setFragment (carteraFragment);

                        return true;
                    case R.id.btn_tiempo:

                        setFragment(extenderFreame);

                        return true;

                    case R.id.btn_menu:
                        Intent inten2 = new Intent(MenuInferior.this,Lateral.class);
                        startActivity(inten2);

                        return true;

                        default:
                            return false;
                }

            }
        });



    }

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();



    }


    @Override
    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }

    //---------------------------------------------------------------






}
