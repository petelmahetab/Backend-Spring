package com.Spring.MongoDb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "api_models")
public class ApiModel {

    @Id
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String referenceId;
}
