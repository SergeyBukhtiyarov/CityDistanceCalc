package com.example.citydistancecalc.controller;


import com.example.citydistancecalc.entity.Cities;
import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBException;
import java.util.List;

@RestController
@RequestMapping("/uploads")
public class UploadsXMLController {

    @Autowired
    CityRepository cityRepository;

//    @GetMapping()
//    public ResponseEntity unmarshal() throws JAXBException {
//        unmarshaller.unmarshalXml();
//        return new ResponseEntity(HttpStatus.OK);
//    }


@PostMapping
    public ResponseEntity postInfo (@RequestBody Cities cities){
        cityRepository.saveAll(cities.getCities());
    System.out.println(cities);
    return new ResponseEntity(HttpStatus.OK);
}
//    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
//    public ResponseEntity postInfo (@RequestBody City city){
//       System.out.println(city);
//        return new ResponseEntity(HttpStatus.OK);
//    }
}

