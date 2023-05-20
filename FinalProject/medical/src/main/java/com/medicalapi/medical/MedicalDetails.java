package com.medicalapi.medical;


import java.util.Map;
import java.util.Set;
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
    private Map<String, MedicalSolutions> symRes;  
    private Set<String> sym;


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

    public Map<String, MedicalSolutions> getSymRes()
    {
        return symRes;
    }
    public void setSymRes(Map<String, MedicalSolutions> symRes)
    {
        this.symRes = symRes;
    }

    public Set<String> getSym() {
        return sym;
    }

    public void setSym(Set<String> sym) {
        this.sym = sym;
    }


}
