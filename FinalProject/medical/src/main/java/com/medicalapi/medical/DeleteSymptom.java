package com.medicalapi.medical;

import java.util.Set;
/**
    This class is for the routes for the API calls and calling the protected methods from MedicalService 

   @author  Ayush Bhanushali
   @version 5/31/23
 */
public class DeleteSymptom {
    String name;
    String lastName;
    int age;
    Set<String> sym;
    
    /**
     * 
     * @return name of user who wants to get rid of a symptom
     */
    public String getName()
    {
        return name;
    }
    /**
     * 
     * @param name to be set and to be queried 
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * 
     * @return lastName to get from query 
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * 
     * @param lastName to be set and to be queried 
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    /**
     * 
     * @return age from query 
     */
    public int getAge()
    {
        return age;
    }
    /**
     * 
     * @param age to be set and to be queried 
     */
    public void setAge(int age)
    {
        this.age = age;
    }
    /**
     * 
     * @return of symptoms to be deleted/added
     */
    public Set<String> getSym()
    {
        return sym;
    }
    /**
     * 
     * @param sym of setting symptoms to be deleted/added
     */
    public void setSym(Set<String> sym)
    {
        this.sym = sym;
    }

    
}
