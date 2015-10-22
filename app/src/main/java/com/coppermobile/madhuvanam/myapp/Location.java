package com.coppermobile.madhuvanam.myapp;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by madhuvanam on 10/13/15.
 */
public class Location extends Activity {
    private GoogleMap map;
    private final LatLng LOCATION_DALLAS = new LatLng(32.4776, -96.7968);
    private LatLng location;
    String country;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        Bundle bundle = getIntent().getExtras();
        country = bundle.getString("country");
        map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
        map.addMarker(new MarkerOptions().position(LOCATION_DALLAS).title("Dallas Baby"));
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(LOCATION_DALLAS, 17);
        map.animateCamera(cameraUpdate);
    }

}

