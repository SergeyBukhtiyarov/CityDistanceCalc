package com.example.citydistancecalc.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private double latitude;
    @JsonIgnore
    private double longitude;
}
