package com.medicalapi.medical;

import java.util.Set;

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
     * @param name 
     */
    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public Set<String> getSym()
    {
        return sym;
    }
    public void setSym(Set<String> sym)
    {
        this.sym = sym;
    }

    
}
