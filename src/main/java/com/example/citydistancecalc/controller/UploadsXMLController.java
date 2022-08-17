package com.example.citydistancecalc.controller;


import com.example.citydistancecalc.Unmarshaller.UnmarshallXML;
import com.example.citydistancecalc.entity.City;
import com.example.citydistancecalc.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping("/uploads")
public class UploadsXMLController {
    @Autowired
    UnmarshallXML unmarshaller;

    @Autowired
    CityRepository cityRepository;

//    @GetMapping()
//    public ResponseEntity unmarshal() throws JAXBException {
//        unmarshaller.unmarshalXml();
//        return new ResponseEntity(HttpStatus.OK);
//    }


@PostMapping
    public ResponseEntity postInfo (@RequestBody City city){
        cityRepository.save(city);
    System.out.println(city);
    return new ResponseEntity(HttpStatus.OK);
}

}

