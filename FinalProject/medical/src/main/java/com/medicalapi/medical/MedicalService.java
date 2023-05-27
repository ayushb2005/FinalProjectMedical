package com.medicalapi.medical;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MedicalService {
    @Autowired
    MedicalRepository medicalRepository;

    protected int createPerson(MedicalDetails medicalDetails){
        Map<String,MedicalSolutions> symRes = new HashMap<>();
        for(int i =0; i<MedicalApplication.solutions.size();i++){
            if(medicalDetails.getSym().contains(MedicalApplication.solutions.get(i).getName())){
                //medicalDetails.getSymRes().put(MedicalApplication.solutions.get(i).getName(), MedicalApplication.solutions.get(i));
                symRes.put(MedicalApplication.solutions.get(i).getName(), MedicalApplication.solutions.get(i));
            }
        }
        medicalDetails.setSymRes(symRes);
        medicalRepository.save(medicalDetails);
        return 200;
    }

    protected List<MedicalDetails> getAllDetails(){
        return medicalRepository.findAll();
    }

    protected int deleteById(String id){
        medicalRepository.deleteById(id);
        return 200;
    }

    protected MedicalDetails findPersonById(String id){
        return medicalRepository.findById(id).get();
    }


    protected int deleteSymptomById(DeleteSymptom deleteSymptom){
        List<MedicalDetails> update = medicalRepository.findByName(deleteSymptom.getName(), deleteSymptom.getLastName(),  deleteSymptom.getAge());
        Optional <MedicalDetails> update2 = medicalRepository.findById(update.get(0).getId());
        MedicalDetails update3 = update2.get();
        for(String s: deleteSymptom.getSym()){
            if(update2.isPresent()){
                if(update3.getSymRes().containsKey(s)){
                    update3.getSymRes().remove(s);
                    update3.getSym().remove(s);
                }
            }
        }
        medicalRepository.save(update3); 
        return 200;
    }

    protected List<MedicalSolutions> getMatchingStrings(ArrayList<MedicalSolutions> list, String regex) {
        ArrayList<MedicalSolutions> matches = new ArrayList<MedicalSolutions>();
        Pattern p = Pattern.compile(regex);
    
        for (int i =0;i<list.size();i++) {
          if (p.matcher(list.get(i).getName()).matches()) {
            matches.add(list.get(i));
          }
        }
      
        return matches;
    }
    
    protected List<MedicalSolutions> sortAsc(){
        for (int i = 0; i < MedicalApplication.solutions.size() - 1; i++) {
            for (int j = 0; j < MedicalApplication.solutions.size() - i - 1; j++) {
                if (MedicalApplication.solutions.get(j).getName().compareTo(MedicalApplication.solutions.get(j + 1).getName()) > 0) {
                    MedicalSolutions temp = MedicalApplication.solutions.get(j);
                    MedicalApplication.solutions.set(j, MedicalApplication.solutions.get(j + 1));
                    MedicalApplication.solutions.set(j + 1, temp);
                }
            }
        }
        return MedicalApplication.solutions;
    }
    protected int addSymptomById(DeleteSymptom deleteSymptom){
        List<MedicalDetails> update = medicalRepository.findByName(deleteSymptom.getName(), deleteSymptom.getLastName(),  deleteSymptom.getAge());
        Optional <MedicalDetails> update2 = medicalRepository.findById(update.get(0).getId());
        MedicalDetails update3 = update2.get();
        
        for(String s: deleteSymptom.getSym()){
            update3.getSym().add(s);
        }
        for(String s:update3.getSym()){
            if(!update3.getSymRes().containsKey(s)){
                for(int i =0; i<MedicalApplication.solutions.size();i++){
                    if(update3.getSym().contains(MedicalApplication.solutions.get(i).getName())){
                        update3.getSymRes().put(MedicalApplication.solutions.get(i).getName(),MedicalApplication.solutions.get(i));
                    }
                }
            }
        }
        medicalRepository.save(update3);
        return 200;
    }
    protected Map<String, MedicalSolutions> display(DeleteSymptom deleteSymptom) {
        List<MedicalDetails> update = medicalRepository.findByName(deleteSymptom.getName(), deleteSymptom.getLastName(),
                deleteSymptom.getAge());
        Optional<MedicalDetails> update2 = medicalRepository.findById(update.get(0).getId());
        MedicalDetails update3 = update2.get();
        Map<String, MedicalSolutions> sorted = new TreeMap<>(update3.getSymRes());
        Map<String, MedicalSolutions> ret = new HashMap<String, MedicalSolutions>();
        for (Map.Entry<String, MedicalSolutions> entry : ret.entrySet()) {
            ret.put(entry.getKey(), entry.getValue());
        }
        return update3.getSymRes();
    }
 
}
