package com.Spring.MongoDb.service;

import com.Spring.MongoDb.model.ApiModel;
import com.Spring.MongoDb.repository.repositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceClass  {

    @Autowired
    public repositoryInterface repointerface;

    public void saveRecord(ApiModel apiModel) {
      repointerface.save(apiModel);
    }
}
