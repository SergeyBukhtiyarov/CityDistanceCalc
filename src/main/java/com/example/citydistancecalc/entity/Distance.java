package com.example.citydistancecalc.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Distance {
    @Id
    private Long id;
    private double from_city;
    private  double to_city;
    private  double distance;
}
