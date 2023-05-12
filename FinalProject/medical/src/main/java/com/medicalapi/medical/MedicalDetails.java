package com.medicalapi.medical;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "info")
public class MedicalDetails {
    @Id
    private String id;

    private String name;
    private String lastName;
    private int age; 
    private String gender;
    private List<String> symptoms;
    private List<String> results;

    private List<MedicalSolutions> solutions;
      

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public List<String> getSymptoms()
    {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms)
    {
        this.symptoms = symptoms;
    }

    public List<String> getResults()
    {
        return results;
    }


    public void setResults(List<String> results)
    {
        this.results = results;
    }

    public List<MedicalSolutions> getSolutions()
    {
        return solutions;
    }
    public void setSolutions(List<MedicalSolutions> solutions)
    {
        this.solutions = solutions;
    }




}
