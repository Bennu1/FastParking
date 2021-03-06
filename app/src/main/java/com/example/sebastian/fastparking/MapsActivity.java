package com.example.sebastian.fastparking;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
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
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.security.PublicKey;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerDragListener, GoogleMap.OnInfoWindowClickListener {

    private GoogleMap mMap;

    BottomNavigationView bottomNav;
    Button popSali;
    MenuItem btnCartera;
    private Marker InfoWindow1, InfoWindow2,InfoWindow3,InfoWindow4,InfoWindow5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
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
        LatLng parqueadero1 = new LatLng(4.6083912117733945, -74.06835822170791);
        InfoWindow1 = googleMap.addMarker(new MarkerOptions()
                .position(parqueadero1)
                .title("Parquedero dinoko")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
        );


        // Add a marker in Sydney and move the camera
        LatLng parqueadero2 = new LatLng(4.607304253784321, -74.06701526294225);
        InfoWindow2 = googleMap.addMarker(new MarkerOptions()
                .position(parqueadero2)
                .title("Parquedero Lucho")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
        );

        // Add a marker in Sydney and move the camera

        LatLng parqueadero3 = new LatLng(4.6065974625055475, -74.06969580864687);
        InfoWindow3 = googleMap.addMarker(new MarkerOptions()
                        .position(parqueadero3)
                        .title("Parquedero xia")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
        );

        // Add a marker in Sydney and move the camera

        LatLng parqueadero4 = new LatLng(4.605612237265234, -74.06878527622428);
        InfoWindow4 = googleMap.addMarker(new MarkerOptions()
        .position(parqueadero4)
        .title("Parquedero Juana")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
        );

        LatLng parqueadero5 = new LatLng(4.608381612314815, -74.06865350222813);
        InfoWindow5 = googleMap.addMarker(new MarkerOptions()
                .position(parqueadero5)
                .title("Parquedero nix")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
        );

        //final int REQUEST_ACCESS_FINE = 1;

        // if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        // ActivityCompat.checkSelfPermission(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_ACCESS_FINE);


        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION,}, 1000);
        } else {
            locationStart();
        }

        //Dialog
        googleMap.setOnInfoWindowClickListener(this);

    }
    private void locationStart() {
        LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        final boolean gpsEnabled = mlocManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if (!gpsEnabled) {
            Intent settingsIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(settingsIntent);
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION,}, 1000);
            return;
        }

        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bogota, 200));
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);





    }

    @Override
    public void onMarkerDragStart(Marker marker) {

    }

    @Override
    public void onMarkerDrag(Marker marker) {

    }

    @Override
    public void onMarkerDragEnd(Marker marker) {

    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        if (marker.equals(InfoWindow1)){

            ParkingFragment.newInstance(marker.getTitle(),
                    getString(R.string.Parkinginfo1))
                    .show(getSupportFragmentManager(), null);

        }if (marker.equals(InfoWindow2)){

            ParkingFragment2.newInstance(marker.getTitle(),
                    getString(R.string.Parkinginfo2))
                    .show(getSupportFragmentManager(), null);

        }if (marker.equals(InfoWindow3)){

            ParkingFragment3.newInstance(marker.getTitle(),
                    getString(R.string.Parkinginfo3))
                    .show(getSupportFragmentManager(), null);

        }if (marker.equals(InfoWindow4)){

            ParkingFragment4.newInstance(marker.getTitle(),
                    getString(R.string.Parkinginfo4))
                    .show(getSupportFragmentManager(), null);

        }
        if (marker.equals(InfoWindow5)){

            ParkingFragment4.newInstance(marker.getTitle(),
                    getString(R.string.Parkinginfo5))
                    .show(getSupportFragmentManager(), null);

        }

    }

}
