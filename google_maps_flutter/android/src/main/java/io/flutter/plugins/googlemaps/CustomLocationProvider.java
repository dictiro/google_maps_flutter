package io.flutter.plugins.googlemaps;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;

import com.google.android.gms.maps.LocationSource;

public class CustomLocationProvider implements LocationSource, LocationListener
{
    private OnLocationChangedListener listener;

    public CustomLocationProvider()
    { }

    @Override
    public void activate(OnLocationChangedListener listener)
    {
        this.listener = listener;
    }

    @Override
    public void deactivate()
    {}

    @Override
    public void onLocationChanged(Location location)
    {
        if(listener != null)
        {
            listener.onLocationChanged(location);
        }
    }

    @Override
    public void onProviderDisabled(String provider)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void onProviderEnabled(String provider)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras)
    {
        // TODO Auto-generated method stub

    }
}