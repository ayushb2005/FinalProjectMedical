package com.medicalapi.medical;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;   
import org.springframework.web.bind.annotation.RestController;

/**
    This class is for the routes for the API calls and calls the protected methods from MedicalService  

   @author  Ayush Bhanushali
   @version 5/29/23
 */
@RestController
@RequestMapping("/api/medical")
public class MedicalController {
    @Autowired
    MedicalService medicalService;

    /**
     * 
     * @param medicalDetails passes a class of a person name, lastName, age, gender, and symptoms
     * @return a http status code of 200 if the person is sucessfully entered in the db, otherwise 400 is sent
     */
    @PostMapping("/createPerson")
    public int createPerson(@RequestBody MedicalDetails medicalDetails){
        return medicalService.createPerson(medicalDetails);
    }

    /**
     * 
     * @return all a list of all the people in the database in json format
     */
    @GetMapping("/getAll")
    public List<MedicalDetails> getAllDetails(){
        return medicalService.getAllDetails();
    }

    /**
     * 
     * @param id for the person to be deleted from the db
     * @return http status code of 200 if the person if sucessfully deleted from the db, otherwise 400 is sent 
     */
    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable String id){
        return medicalService.deleteById(id);
    }

    /**
     * 
     * @param id for the person's retrieval of information in the db
     * @return a person's information in json format
     */
    @GetMapping("/getById/{id}")
    public MedicalDetails findPersonById(@PathVariable String id){
        return medicalService.findPersonById(id);
    }
    
    /**
     * 
     * @param deleteSymptom is a class that has a person's name, lastName, age, sym(symptom) so that they can be looked up in the db and delete the symptom that they don't have anymore
     * @return http status code of 200 if the symptom if sucessfully deleted from the db, otherwise 400 is sent  
     */
    @PutMapping("/deleteSymptomById")
    public int deleteSymptomById(@RequestBody DeleteSymptom deleteSymptom){
        return medicalService.deleteSymptomById(deleteSymptom);
    }
    
    /**
     * 
     * @return arraylist of symptoms in ascending order from A to Z
     */
    @GetMapping("/sortASC")
    public List<MedicalSolutions> sortAsc(){
        return medicalService.sortAsc();
    }
    
    /**
     * 
     * @param deleteSymptom class passed as a parameter so that a person can be found and then their symptoms can be updated in the DB
     * @return http status code of 200 if the symptom if sucessfully deleted from the db, otherwise 400 is sent  
     */
    @PutMapping("/addSymptomById")
    public int addSymptomById(@RequestBody DeleteSymptom deleteSymptom){
        return medicalService.addSymptomById(deleteSymptom);
    }

    /**
     * 
     * @param deleteSymptom is passed as a paramater to find their info in db 
     * @return their symptoms and solutions in a key value pair
     */
    @PutMapping("/display")
    public Map<String,MedicalSolutions> display(@RequestBody DeleteSymptom deleteSymptom){
        return medicalService.display(deleteSymptom);
    }

    /**
     * 
     * @param deleteSymptom class used as request body to query name,lastName, and age to check if the user is in the DB
     * @return an http status code of 200 if the user exists otherwise 400 is returned
     */
    @PostMapping("/checkExistingUser")
    public int checkExistingUser(@RequestBody DeleteSymptom deleteSymptom){
        return medicalService.checkExistingUser(deleteSymptom);
    }
}
