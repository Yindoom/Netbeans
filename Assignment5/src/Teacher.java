
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yindo
 */
public class Teacher extends Person {
    
    private List<String> subjects = new ArrayList<>();
    private String initials;
    private double salary;
    
    public Teacher(int id, String name, String initials)
    {
        super(id, name);
        this.initials = initials;
    }
    
    public List<String> getSubjects()
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
    
    public void addSubject(String subject)
    {
        subjects.add(subject);
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  getId() + "\t" + getName() + "\t" + getEmail() + "\t" + initials; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
