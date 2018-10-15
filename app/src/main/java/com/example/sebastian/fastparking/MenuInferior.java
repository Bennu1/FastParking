package com.example.sebastian.fastparking;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
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
                        mMainNav.setItemBackgroundResource(R.color.colorPrimary);

                        return true;

                    case R.id.btn_reserva:
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment (reservarFragment);

                        return true;
                    case R.id.btn_cartera:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                        setFragment (carteraFragment);

                        return true;
                    case R.id.btn_tiempo:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(extenderFreame);

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
}
