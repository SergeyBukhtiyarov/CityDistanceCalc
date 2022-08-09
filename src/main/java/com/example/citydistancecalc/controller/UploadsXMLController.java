package com.example.citydistancecalc.controller;


import com.example.citydistancecalc.Unmarshaller.UnmarshallXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping("/uploads")
public class UploadsXMLController {
    @Autowired
    UnmarshallXML unmarshaller;
    @GetMapping()
    public ResponseEntity unmarshal() throws JAXBException {
        unmarshaller.unmarshalXml();
        return new ResponseEntity(HttpStatus.OK);
    }
}

