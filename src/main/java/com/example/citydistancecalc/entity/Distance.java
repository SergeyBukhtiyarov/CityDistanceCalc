package com.example.citydistancecalc.entity;

import lombok.Data;

import javax.persistence.Column;
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
    @Column(name = "from_city")
    private String fromCity;
    @Column(name = "to_city")
    private  String toCity;
    private  int distance;
}
