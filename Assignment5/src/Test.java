
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
public class Test {

    /**
     * @param args the command line arguments
     */
    private static List<Person> persons = new ArrayList<>();
    
    
    public static void main(String[] args) {
        
        
        Person john = new Person(101, "John");
        Person Amy = new Person(102, "Amy");
        Teacher Jeppe = new Teacher(201, "Jeppe", "JD");
        Student Poop = new Student(103, "Poop", "Maths");
       
        persons.add(john);
        persons.add(Amy);
        persons.add(Jeppe);
        persons.add(Poop);
       
        GradeInfo Hello = new GradeInfo ("CS", 5);
        
        Poop.addGrade(Hello);
        
        System.out.println("ID\tNAME\tEMAIL\tInitials");
        for (Person person : persons) {
            System.out.println(person);            
        }
       
    }
    
}
