package com.example.user.test;

/**
 * Created by YUNAHKIM on 2017-10-30.
 */

import android.app.FragmentManager;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;


import com.google.android.gms.maps.CameraUpdateFactory;

import com.google.android.gms.maps.GoogleMap;

import com.google.android.gms.maps.MapFragment;

import com.google.android.gms.maps.OnMapReadyCallback;

import com.google.android.gms.maps.model.LatLng;

import com.google.android.gms.maps.model.MarkerOptions;



public class GoogleActivity extends AppCompatActivity

        implements OnMapReadyCallback
{

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.googlemap);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        FragmentManager fragmentManager = getFragmentManager();

        MapFragment mapFragment = (MapFragment)fragmentManager

                .findFragmentById(R.id.googlemap);

        mapFragment.getMapAsync(this);

    }


    @Override

    public void onMapReady(final GoogleMap map) {


        LatLng SEOUL = new LatLng(37.56, 126.97);


        MarkerOptions markerOptions = new MarkerOptions();

        markerOptions.position(SEOUL);

        markerOptions.title("서울");

        markerOptions.snippet("한국의 수도");

        map.addMarker(markerOptions);


        map.moveCamera(CameraUpdateFactory.newLatLng(SEOUL));

        map.animateCamera(CameraUpdateFactory.zoomTo(10));

    }

    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:

                // NavUtils.navigateUpFromSameTask(this);

                finish();

                return true;

        }

        return super.onOptionsItemSelected(item);




    };

}
