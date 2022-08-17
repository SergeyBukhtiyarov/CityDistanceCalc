package com.example.citydistancecalc;

import com.example.citydistancecalc.entity.Cities;
import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.repository.CityRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CityDistanceCalcApplication {

    public static void main(String[] args) throws JAXBException {
        SpringApplication.run(CityDistanceCalcApplication.class, args);



    }

//@Bean
//    public ApplicationRunner dataLoader(CityRepository cityRepository) {
//
//        return args -> {
//            City samara = new City();
//            samara.setId(1L);
//            samara.setName("Samara");
//            samara.setLatitude(53.20007);
//            samara.setLongitude(50.150);
//            City novokuibishevsk = new City();
//            novokuibishevsk.setId(2L);
//            novokuibishevsk.setName("Novokuibishevsk");
//            novokuibishevsk.setLatitude(53.09590);
//            novokuibishevsk.setLongitude(49.9462);
//            cityRepository.save(novokuibishevsk);
//            cityRepository.save(samara);
//
//
//        };
//    }
}





