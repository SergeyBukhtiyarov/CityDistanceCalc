package com.example.citydistancecalc.controller;


import com.example.citydistancecalc.Crowflight;
import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.entity.Distance;
import com.example.citydistancecalc.repository.CityRepository;
import com.example.citydistancecalc.repository.DistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CrowflightCalcController {

    @Autowired
    Crowflight crowflight;
    @Autowired
    CityRepository cityRepository;

    @Autowired
    DistanceRepository distanceRepository;

    @GetMapping()
    public int calculate(@RequestParam(name = "city0") String city0_name,
                         @RequestParam(name = "city1") String city1_name,
                         @RequestParam(name = "calculate") String calculateType) {
        City city0 = cityRepository.findByName(city0_name);
        City city1 = cityRepository.findByName(city1_name);
        Distance distance = null;
        if (calculateType.equals("crowflight"))
            return crowflight.getDistanceHav(city0, city1);
        else if (calculateType.equals("matrix")) {
            distance = distanceRepository.findByFromCityAndToCity(city0_name, city1_name);
//            System.out.println(distance);
        } return distance.getDistance();



    }

    }

