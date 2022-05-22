package com.edu.portal.repositories;


import com.edu.portal.models.StudentData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDataRepo extends MongoRepository<StudentData, String> {

   
}
