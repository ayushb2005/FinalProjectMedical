package com.medicalapi.medical;
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

    public String createPerson(MedicalDetails medicalDetails){
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
    
    public int updateSolutions(String id, List<MedicalSolutions> solutions){
        Optional < MedicalDetails > medicalDb = medicalRepository.findById(id);
        if(medicalDb.isPresent()){
            MedicalDetails update = medicalDb.get();
            update.setSolutions(solutions);
            medicalRepository.save(update);
        }else{
            return 400;
        }
        return 200;
    }

    public int addSolutions(String id, List<MedicalSolutions> solutions){
        Optional < MedicalDetails > medicalDb = medicalRepository.findById(id);
        if(medicalDb.isPresent()){
            MedicalDetails update = medicalDb.get();
            for(int i =0; i<solutions.size();i++){
                update.getSolutions().add(solutions.get(i));
            }
            update.setSolutions(update.getSolutions());
            medicalRepository.save(update);
        }else{
            return 400;
        }
        return 200;
    }

    
}
