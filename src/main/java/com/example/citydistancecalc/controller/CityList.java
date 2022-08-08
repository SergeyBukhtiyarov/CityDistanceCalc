package com.example.citydistancecalc.controller;

import com.example.citydistancecalc.entity.Cities;
import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.repository.CityRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityList {
    @Autowired
    CityRepository cityRepository;

    @GetMapping()
    public List<City> cities () {
        return cityRepository.findAll();
    };

}
