package com.example.citydistancecalc.Marshaller;

import com.example.citydistancecalc.entity.Cities;
import com.example.citydistancecalc.entity.City;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MarshallXML {

    File xmlFile = new File("/Users/sergejb/Desktop/test.xml");

    public void marshallXML() {
        try {
            JAXBContext context = JAXBContext.newInstance(Cities.class);
            Marshaller m = context.createMarshaller();
            Cities cities = new Cities();
            City samara = new City();
            samara.setId(1L);
            samara.setName("Samara");
            samara.setLatitude(53.20007);
            samara.setLongitude(50.150);
            City novokuibishevsk = new City();
            novokuibishevsk.setId(2L);
            novokuibishevsk.setName("Novokuibishevsk");
            novokuibishevsk.setLatitude(53.09590);
            novokuibishevsk.setLongitude(49.9462);
            List<City> cityList = new ArrayList<>();
            cityList.add(samara);
            cityList.add(novokuibishevsk);
            cities.setCities(cityList);
            m.marshal(cities, System.out);
            m.marshal(cities, xmlFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
