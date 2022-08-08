package com.example.citydistancecalc.controller;


import com.example.citydistancecalc.Crowflight;
import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CrowflightCalc {

    @Autowired
    Crowflight crowflight;
    @Autowired
    CityRepository cityRepository;
@GetMapping()
    public int calculate() {
    City city0 = cityRepository.findById(1L).orElseThrow();
    City city1 = cityRepository.findById(2L).orElseThrow();
        return crowflight.getDistanceHav(city0,city1);
    }
}
