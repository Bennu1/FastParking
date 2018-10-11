package com.example.sebastian.fastparking;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.security.PublicKey;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private BottomNavigationView bottomNav;
    Button popSali;
    MenuItem btnCartera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng bogota = new LatLng(4.7265326, -74.0630622);
        mMap.addMarker(new MarkerOptions().position(bogota).title("Bogotá").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


        // Add a marker in Sydney and move the camera
        LatLng parqueadero1 = new LatLng(4.727013787658549, -74.06031915407259);
        mMap.addMarker(new MarkerOptions().position(parqueadero1).title("Parqueadero").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));


        // Add a marker in Sydney and move the camera
        LatLng parqueadero2 = new LatLng(4.727146911806514, -74.05612194179456);
        mMap.addMarker(new MarkerOptions().position(parqueadero2).title("Parqueadero").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        // Add a marker in Sydney and move the camera

        LatLng parqueadero3 = new LatLng(4.724388126937143, -74.05650375394548);
        mMap.addMarker(new MarkerOptions().position(parqueadero3).title("Parqueadero").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        // Add a marker in Sydney and move the camera

        LatLng parqueadero4 = new LatLng(4.727937906288233, -74.0659031648522);
        mMap.addMarker(new MarkerOptions().position(parqueadero4).title("Parqueadero").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        //final int REQUEST_ACCESS_FINE = 0;

        // if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        // ActivityCompat.checkSelfPermission(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_ACCESS_FINE);


        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);

        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bogota, 50));

        //menu
        bottomNav = (BottomNavigationView) findViewById(R.id.barraNav);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.btn_saliendo){

                    popSali.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MapsActivity.this, Saliendo.class);
                            startActivity(intent);
                        }
                    });

                }else if (menuItem.getItemId()== R.id.btn_reserva){


                }else if (menuItem.getItemId()== R.id.btn_cartera){

                    btnCartera = findViewById(R.id.btn_cartera);

                    btnCartera = menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            Intent intent = new Intent(MapsActivity.this, Saliendo.class);
                            startActivity(intent);
                            return true;
                        }
                    });

                }else if (menuItem.getItemId()== R.id.btn_tiempo){

                }

                return false;
            }
        });



    }
}
