package com.example.citydistancecalc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@Data
@XmlRootElement (name = "distances")
@XmlAccessorType(XmlAccessType.FIELD)
public class Distances {
    @XmlElement(name = "distances")
    private List<Distance> distances;
}
