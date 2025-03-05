package com.Spring.MongoDb.controller;

import com.Spring.MongoDb.model.ApiModel;
import com.Spring.MongoDb.service.serviceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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
@GetMapping
public List<ApiModel> getAllModels(){
        return service.getAllModels();
    }

    @GetMapping("/id/{id}")
    public Optional<ApiModel> getModelById(@PathVariable Long id){
        return service.getModelById(id);
    }


}