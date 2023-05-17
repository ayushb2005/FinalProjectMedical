package com.medicalapi.medical;

import java.util.List;
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
    public String createPerson(@RequestBody MedicalDetails medicalDetails){
        return medicalService.createPerson(medicalDetails);
    }


    @GetMapping("/getAll")
    public List<MedicalDetails> getAllDetails(){
        return medicalService.getAllDetails();
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable String id){
        return medicalService.deleteById(id);
    }

    // @PutMapping("updateSolutionsById/{id}")
    // public int updateSolutions(@PathVariable String id, @RequestBody List<MedicalSolutions> solutions){
    //     return medicalService.updateSolutions(id, solutions);
    // }
    
    // @PutMapping("addSolutionsById/{id}")
    // public int addSolutions(@PathVariable String id, @RequestBody List<MedicalSolutions> solutions ){
    //     return medicalService.addSolutions(id, solutions);
    // }
}
