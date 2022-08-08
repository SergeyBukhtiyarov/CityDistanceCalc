package com.example.citydistancecalc;

import com.example.citydistancecalc.entity.Cities;
import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.repository.CityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
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

}
