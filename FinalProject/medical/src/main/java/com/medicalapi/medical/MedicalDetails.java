package com.medicalapi.medical;


import java.util.Map;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * This class finds the collection database name in MongoDB and has getter and setter methods for the database entities a person has
 * @author Ayush Bhanushali
 * @version 5/20/23
 */
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

    /**
     * 
     * @return unique id of a user
     */
    public String getId() {
        return id;
    }
    /**
     * 
     * @param id set a unique for a new user
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 
     * @return name of a user
     */
    public String getName()
    {
        return name;
    }
    /**
     * 
     * @param name set for a new user
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * 
     * @return gender of a user 
     */
    public String getGender()
    {
        return gender;
    }
    /**
     * 
     * @param gender set of a user
     */
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    /**
     * 
     * @return age of a user
     */
    public int getAge()
    {
        return age;
    }
    /**
     * 
     * @param age set of a new user
     */
    public void setAge(int age)
    {
        this.age = age;
    }
    /**
     * 
     * @return last name of a user
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * 
     * @param lastName set for a new user
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    /**
     * 
     * @return key value pair for symptoms and an object of name, decription,and treatment for it
     */
    public Map<String, MedicalSolutions> getSymRes()
    {
        return symRes;
    }
    /**
     * 
     * @param symRes set updated key value pair for symptoms and an object of name, decription,and treatment for it
     */
    public void setSymRes(Map<String, MedicalSolutions> symRes)
    {
        this.symRes = symRes;
    }
    /**
     * 
     * @return existing symptoms the patient has
     */
    public Set<String> getSym() {
        return sym;
    }
    /**
     * 
     * @param sym set for added/deleted values from the symptoms a patient has
     */
    public void setSym(Set<String> sym) {
        this.sym = sym;
    }


}
