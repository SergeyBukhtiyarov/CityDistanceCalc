package com.example.citydistancecalc.entity;
import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Entity
@XmlRootElement(name = "city")
@XmlAccessorType (XmlAccessType.FIELD)
public class City {
    @Id
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
}
