package com.example.citydistancecalc.repository;

import com.example.citydistancecalc.entity.Distance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistanceRepository extends JpaRepository<Distance,String> {
    Distance findByFromCityAndToCity(String fromcity, String tocity );
}
