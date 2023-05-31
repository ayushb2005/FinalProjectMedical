package com.medicalapi.medical;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 * Interface for extending MongoRepository so that queries can be made and methods can be used from it 
 * @author Ayush Bhanushali
 * @version 5/27/23
 */
@Repository
public interface MedicalRepository extends MongoRepository<MedicalDetails,String>{
    /**
     * 
     * @param name to be queried
     * @param lastName to be queried
     * @param age to be queried
     * @return a list of object of MedicalDetails of the user that is found in the DB
     */
    List<MedicalDetails> findByName(String name, String lastName, int age);



}
