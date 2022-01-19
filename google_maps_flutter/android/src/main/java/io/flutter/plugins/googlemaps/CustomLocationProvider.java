package io.flutter.plugins.googlemaps;

import android.location.Location;
import android.os.Bundle;

import com.google.android.gms.maps.LocationSource;

public class CustomLocationProvider implements LocationSource
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

    public void onLocationChanged(Location location)
    {
        if(listener != null)
        {
            listener.onLocationChanged(location);
        }
    }
}