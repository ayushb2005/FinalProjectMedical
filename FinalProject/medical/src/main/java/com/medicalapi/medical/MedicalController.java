package com.medicalapi.medical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;    
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medical")
public class MedicalController {
    @Autowired
    MedicalService medicalService;

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @PostMapping("/createPerson")
    public int createPerson(@RequestBody MedicalDetails medicalDetails){
        return medicalService.createPerson(medicalDetails);
    }


    @GetMapping("/getAll")
    public List<MedicalDetails> getAllDetails(){
        return medicalService.getAllDetails();
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable String id){
        return medicalService.deleteById(id);
    }

    @GetMapping("/getById/{id}")
    public MedicalDetails findPersonById(@PathVariable String id){
        return medicalService.findPersonById(id);
    }
    
    @PutMapping("/deleteSymptomById")
    public int deleteSymptomById(@RequestParam String name, @RequestParam String lastName, @RequestParam int age, @RequestBody String[] arr){
        Set<String> sym = new HashSet<String>();
        for(String s: arr){
            sym.add(s);
        }
        return medicalService.deleteSymptomById(name, lastName, age, sym);
    }
}
