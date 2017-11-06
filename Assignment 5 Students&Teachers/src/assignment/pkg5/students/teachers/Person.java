/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5.students.teachers;

/**
 *
 * @author mr.Andersen
 */
public class Person 
{
    
    public int id;
    public String email;
    public String name;
            
    public Person(int id, String name)
    {
        this.id = id;
        this.email = email;
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getId() 
    {
        return id;
    }
    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public String getEmail() 
    {
        return email;
    }
    
    public void setEmail(String email) 
    {
        this.email = email;
    }

    @Override
    public String toString() 
    {
        return "ID\tNAME\t\tEMAIL\t\tEDUCATION\t\tAVG.GRADE\n" + 
            id +"\t"+ name +"\t" + email +"\t" +"\t" + "\n";  
    }
    
    
    
}
