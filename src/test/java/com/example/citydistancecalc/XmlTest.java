package com.example.citydistancecalc;

import com.example.citydistancecalc.entity.Cities;
import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.repository.CityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class XmlTest {
    @Autowired
    CityRepository cityRepository;
    @Test
    public void unmarshalXml() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Cities.class);
        Unmarshaller un = context.createUnmarshaller();
        Cities cities = (Cities) un.unmarshal (new File("/Users/sergejb/Desktop/test.xml"));
        for (City city: cities.getCities())
        {
            cityRepository.save(city);
            System.out.println(city.getId());
            System.out.println(city.getName());
        }
    }
    @Test
    public void marshallXML() {
        File xmlFile = new File("/Users/sergejb/Desktop/test.xml");
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
