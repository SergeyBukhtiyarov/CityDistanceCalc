package com.example.citydistancecalc;

import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Crowflight {

    @Autowired
    CityRepository cityRepository;
    public final double AVERAGE_RADIUS_OF_EARTH_KM = 6371;
    public  double hav(double theta){
        double s = Math.sin(theta / 2);
        return s * s;
    }

    public  int getDistanceHav(City city0, City city1) {


        double lat0 = Math.toRadians(city0.getLatitude());
        double lat1 = Math.toRadians(city1.getLatitude());
        double lng0 = Math.toRadians(city0.getLongitude());
        double lng1 = Math.toRadians(city1.getLongitude());
        double dlat = Math.abs(lat0 - lat1);
        double dlng = Math.abs(lng0 - lng1);
        double h = hav(dlat) + Math.cos(lat0) * Math.cos(lat1) * hav(dlng);
        double c = 2 * AVERAGE_RADIUS_OF_EARTH_KM * Math.asin(Math.sqrt(h));
        return (int) (Math.round(c));
    }

}