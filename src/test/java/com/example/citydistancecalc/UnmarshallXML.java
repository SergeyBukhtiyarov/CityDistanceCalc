package com.example.citydistancecalc;

import com.example.citydistancecalc.entity.Cities;
import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Component
public class UnmarshallXML {
    @Autowired
    CityRepository cityRepository;
    public void unmarshalXml() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Cities.class);
        Unmarshaller un = context.createUnmarshaller();
        Cities cities = (Cities) un.unmarshal (new File("/Users/sergejb/Desktop/City.xml"));
        for (City city: cities.getCities())
        {
            System.out.println(city.getId());
            System.out.println(city.getName());
            cityRepository.save(city);

        }
    }

}
