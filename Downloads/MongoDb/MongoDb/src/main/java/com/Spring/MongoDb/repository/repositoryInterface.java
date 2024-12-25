package com.Spring.MongoDb.repository;


import com.Spring.MongoDb.model.ApiModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface repositoryInterface  extends MongoRepository<ApiModel,String> {
}
