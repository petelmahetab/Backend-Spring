package com.Spring.MongoDb.repository;


import com.Spring.MongoDb.model.ApiModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryInterface  extends MongoRepository<ApiModel,Long> {
}
