package com.medicalapi.medical;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class MedicalService {
    @Autowired
    MedicalRepository medicalRepository;

   // public Map<String, MedicalSolutions> hMao;
    //solutions will be empty neeed to get from db first index
    public String createPerson(MedicalDetails medicalDetails){
        MedicalDetails.solutions();
        for (String key: medicalDetails.getSymRes().keySet()) {
            if(medicalDetails.getSymRes().get(key).equals(null)){
                for(int i = 0; i<MedicalDetails.solutions.size();i++){
                    if(key.equals(MedicalDetails.solutions.get(i).getName())){
                        medicalDetails.getSymRes().put(key,MedicalDetails.solutions.get(i));
                    }
                }
            }
        }
        medicalRepository.save(medicalDetails);
        return "Person created";
    }

    public List<MedicalDetails> getAllDetails(){
        return medicalRepository.findAll();
    }

    public String deleteById(String id){
        medicalRepository.deleteById(id);
        return "Deleted User";
    }

    // public String updateSolutions(MedicalDetails medicalDetails){
    //     Optional < MedicalDetails > medicalDb = medicalRepository.findById(medicalDetails.getId());
    //     if (medicalDb.isPresent()) {
    //         MedicalDetails productUpdate = medicalDb.get();
    //         productUpdate.setId(medicalDetails.getId());
    //         productUpdate.setName(medicalDetails.getName());
    //         productUpdate.setLastName(medicalDetails.getLastName());
    //         productUpdate.setAge(medicalDetails.getAge());
    //         productUpdate.setGender(medicalDetails.getGender());
    //         productUpdate.setSymptoms(medicalDetails.getSymptoms());
    //         productUpdate.setResults();
    //         medicalRepository.save(productUpdate);
    //     }else{
    //         return "Not found";
    //     }
    //     return "";
    // }
    
    // public int updateSolutions(String id, List<MedicalSolutions> solutions){
    //     Optional < MedicalDetails > medicalDb = medicalRepository.findById(id);
    //     if(medicalDb.isPresent()){
    //         MedicalDetails update = medicalDb.get();
    //         update.setSolutions(solutions);
    //         medicalRepository.save(update);
    //     }else{
    //         return 400;
    //     }
    //     return 200;
    // }

    // public int addSolutions(String id, List<MedicalSolutions> solutions){
    //     Optional < MedicalDetails > medicalDb = medicalRepository.findById(id);
    //     if(medicalDb.isPresent()){
    //         MedicalDetails update = medicalDb.get();
    //         for(int i =0; i<solutions.size();i++){
    //             update.getSolutions().add(solutions.get(i));
    //         }
    //         update.setSolutions(update.getSolutions());
    //         medicalRepository.save(update);
    //     }else{
    //         return 400;
    //     }
    //     return 200;
    // }

    
}
