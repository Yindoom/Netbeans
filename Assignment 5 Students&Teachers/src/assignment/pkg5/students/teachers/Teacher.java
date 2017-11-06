/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5.students.teachers;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mr.Andersen
 */
public class Teacher extends Person 
{
    private String initials;
    private double salary;
    private List<String> subjects = new ArrayList<>();
    
    public Teacher(int id, String name, String initials) 
    {
        super(id, name);
        this.initials = initials;
    }    
        
    public List getSubjects() 
    {
        return subjects;
    }
    
    public String getInitials() 
    {
        return initials;
    }

    public double getSalary() 
    {
        return salary;
    }
    
    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    
    public void addSubject(String subject)
    {
        subjects.add(subject);
    }

    @Override
    public String toString() 
    {
                
        String tempSubject = "";
              
        if (subjects.size() > 0)
        tempSubject = subjects.get(0);
        
        return "ID\tINITIALS\tNAME\t\tEMAIL\t\tMAIN SUBJECT\t\tSALARY DKR\n" + 
                id + "\t" + initials + "\t\t"+ name +"\t" + email +"\t" + tempSubject +"\t"+ salary + "\n"; 
    }    
}
