package com.medicalapi.medical;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Query;

@Repository
public interface MedicalRepository extends MongoRepository<MedicalDetails,String>{
    List<MedicalDetails> findByName(String name, String lastName, int age);



}
