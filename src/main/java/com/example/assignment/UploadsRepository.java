package com.example.assignment;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UploadsRepository extends MongoRepository<Uploads, ObjectId> {
    List<Uploads> findByName(String name);

}
