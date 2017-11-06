/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5.students.teachers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mr.Andersen
 */
public class PersonsManager 
{
    private List<Person> persons = new ArrayList<>();
    
    public PersonsManager()
    {
        
    }
    
    public Person getPerson(int id)
    {
        
        for (Person person : persons) 
        {
            if(person.getId() == id)
            {
                System.out.println(person);
            }
        }
        return null;
    }
    
    public void addPerson(Person personClass)
    {
        persons.add(personClass);
    }
    
    public void removePerson(int id)
    {
        for (Person person : persons) 
        {
            if(person.getId() == id)
            {
                persons.remove(id);
            }
        }
    }
    
    public List<Person> getAllPersons(int id)
    {
        for (Person person : persons)
        {
            return persons;
        }
        return null;
    }
    
    public List<Student> getAllStudents()
    {
        List<Student> students = new ArrayList<>();
        
        for (Person person : persons)
        {
            if(person.getClass() == Student.class)
            {
                students.add((Student)(person));
            }
        }
        return students;
    }
    
    public List<Teacher> getAllTeacher()
    {
        List<Teacher>teacher = new ArrayList<>();
        
        for (Person person : persons)
        {
            if(person.getClass() == Teacher.class)
            {
                teacher.add((Teacher)(person));
            }
        }
        return teacher;
    }     
    
    
    
    
}
