package com.edu.portal.repositories;


import com.edu.portal.models.StudentLoginData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentLoginDataRepo extends MongoRepository<StudentLoginData, String> {

    StudentLoginData findByusername(String username);
    StudentLoginData findBy_id(ObjectId _id);

}
