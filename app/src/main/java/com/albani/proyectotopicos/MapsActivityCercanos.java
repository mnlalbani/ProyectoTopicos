package com.albani.proyectotopicos;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityCercanos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_activity_cercanos);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String Restaurante = getIntent().getExtras().getString("Restaurante");
        if (Restaurante.equals("Colmao")){
            LatLng rest = new LatLng(10.464384, -64.173255);
            Marker marker = mMap.addMarker(new MarkerOptions().position(rest).title("Restaurante el Colmao").snippet("Calle Catedral, Cumaná, Sucre"));
            marker.showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rest,16));
        }
        if (Restaurante.equals("Rosita")){
            LatLng rest = new LatLng(10.469761, -64.169031);
            Marker marker = mMap.addMarker(new MarkerOptions().position(rest).title("Heladeria Rosita").snippet("Avenida Gran Mariscal, Cumaná, Sucre"));
            marker.showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rest,16));
        }
        if (Restaurante.equals("Jardin")){
            LatLng rest = new LatLng(10.460935, -64.174778);
            Marker marker = mMap.addMarker(new MarkerOptions().position(rest).title("Les Jardins du Sucre").snippet("Calle Sucre, Cumaná, Sucre"));
            marker.showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rest,16));
        }
        if (Restaurante.equals("Maxi")){
            LatLng rest = new LatLng(10.470389, -64.170039);
            Marker marker = mMap.addMarker(new MarkerOptions().position(rest).title("Maxi Donas").snippet("Edificio Equimarco, PB, Nº 50, Calle Santa Rosa"));
            marker.showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rest,16));
        }
        if (Restaurante.equals("Salim")){
            LatLng rest = new LatLng(10.473090, -64.162469);
            Marker marker = mMap.addMarker(new MarkerOptions().position(rest).title("Salim Pinchos").snippet(" Avenida Miranda, Cumaná, Sucre"));
            marker.showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rest,16));
        }
        if (Restaurante.equals("Rika")){
            LatLng rest = new LatLng(10.471360, -64.167590);
            Marker marker = mMap.addMarker(new MarkerOptions().position(rest).title("Rika's Pizzas").snippet("Parcelamiento Miranda, Cumana"));
            marker.showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rest,16));
        }
        if (Restaurante.equals("Ravioli")){
            LatLng rest = new LatLng(10.472964, -64.166364);
            Marker marker = mMap.addMarker(new MarkerOptions().position(rest).title("Il Ravioli Restaurant").snippet("29 Calle Urdaneta Cumaná 6101Restaurant"));
            marker.showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rest,16));
        }
        if (Restaurante.equals("Donald")){
            LatLng rest = new LatLng(10.472304, -64.163254);
            Marker marker = mMap.addMarker(new MarkerOptions().position(rest).title("McDonalds").snippet("8° Transversal, Cumaná, Sucre"));
            marker.showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rest,16));
        }
    }
}
