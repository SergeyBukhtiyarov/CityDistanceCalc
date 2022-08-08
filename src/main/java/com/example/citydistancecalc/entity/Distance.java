package com.example.citydistancecalc.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Entity
@XmlRootElement(name = "distance")
@XmlAccessorType(XmlAccessType.FIELD)
public class Distance {
    @Id
    private Long id;
    private double from_city;
    private  double to_city;
    private  double distance;
}
