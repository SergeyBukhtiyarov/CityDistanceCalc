package com.example.citydistancecalc.repository;

import com.example.citydistancecalc.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    City findByName(String name);


}
