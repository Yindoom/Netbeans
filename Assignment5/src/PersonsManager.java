
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
public class PersonsManager {
   
    private List<Person> persons = new ArrayList<>();
    
    public PersonsManager()
    {
        
    }
    
    public Person getPerson(int id)
    {
        for (Person person : persons) {
            if(person.getId() == id)
            {
                return person;
            }
        }
        return null;
        
    }
    
    public void addPerson(Person p)
    {
        persons.add(p);
    }
    
    public void removePerson(int id)
    {
        for (Person person : persons) {
            if(person.getId() == id)
                persons.remove(person);
            
        }
    }
    
    public List<Person> getAllPersons()
    {
        return persons;
    }
    
    public List<Student> getAllStudents()
    {
        List<Student> students = new ArrayList<>();
        for (Person person : persons) {
            if(person.getClass() == Student.class)
                students.add((Student) person);
            
        }
        return students;
    }
    
    public List<Teacher> getAllTeachers()
    {
        List<Teacher> teachers = new ArrayList<>();
        for (Person person : persons) {
            if(person.getClass() == Teacher.class)
                teachers.add((Teacher) person);
            
        }
        return teachers;
    }
    
    public void operation()
    {
        
    }
}
