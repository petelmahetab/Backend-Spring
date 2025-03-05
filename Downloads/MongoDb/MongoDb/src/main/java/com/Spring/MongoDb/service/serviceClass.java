package com.Spring.MongoDb.service;

import com.Spring.MongoDb.model.ApiModel;
import com.Spring.MongoDb.repository.repositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class serviceClass  {

    @Autowired
    public repositoryInterface repointerface;

    public void saveRecord(ApiModel apiModel) {
        repointerface.save(apiModel);
    }

    public List<ApiModel> getAllModels() {
        return repointerface.findAll();
    }

    public Optional<ApiModel> getModelById(Long id) {
       return repointerface.findById(id);

    }

//    public ResponseEntity<ApiModel> updateModel(Long id, ApiModel updatedModel) {
//
//    }

   }
