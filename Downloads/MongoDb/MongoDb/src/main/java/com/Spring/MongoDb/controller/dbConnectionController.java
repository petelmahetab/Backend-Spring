package com.Spring.MongoDb.controller;

import com.Spring.MongoDb.model.ApiModel;
import com.Spring.MongoDb.service.serviceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enter")
public class dbConnectionController {

    @Autowired
    public serviceClass service;

    //1.create an Entry using Post
    @PostMapping("/create")
    public String generateRecord(@RequestBody ApiModel model) {
        service.saveRecord(model);
        return "Record Created";
    }

}