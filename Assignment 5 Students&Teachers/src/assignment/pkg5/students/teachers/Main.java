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
public class Main 
{

    /**
     * @param args the command line arguments
     */
    private static PersonsManager PM = new PersonsManager();
    
    public static void main(String[] args) 
    {
        
        Person james = new Person (101, "James Rholand");
        PM.addPerson(james);
        james.setEmail("jar@easv.dk");
        GradeInfo gi1 = new GradeInfo(10, "Math");
        
        Teacher jeppe = new Teacher (201, "Jeppe Stegger",  "JES");
        PM.addPerson(jeppe);
        jeppe.addSubject("Computer Science");
        jeppe.setEmail("jeo@easv.dk");
        jeppe.setSalary(500);
        
        
        
        Person Fabio = new Student (103, "FAB", "Fabio Moniz");
        PM.addPerson(Fabio);
      
        PM.getPerson(201);
        PM.getPerson(101);
        PM.getPerson(103);
        
        
        
        
        
        
        
        /*List<Person> persons = new ArrayList<>();
         
        Student james = new Student(100, "James Rholand", "Computer Science");
        james.setEmail("jfh@easv.dk");
        GradeInfo gi1 = new GradeInfo(10, "Math");
        james.addGrade(gi1);
        GradeInfo gi2 = new GradeInfo(5, "SDE");
        james.addGrade(gi2); 
        
        Teacher peter = new Teacher(201, "Peter Stegger", "PES");
        peter.setEmail("pes@easv.dk");
        peter.setSalary(550.5);
        peter.addSubject("Computer Science");
        
        
         
        Student billy = new Student(101, "Billy Boba", "Hilly Billy Studies");
        billy.setEmail("bob@easv.dk");
        GradeInfo g3 = new GradeInfo(4, "Math");
        billy.addGrade(g3);
        GradeInfo g4 = new GradeInfo(7, "ITO");
        billy.addGrade(g4);
          
        persons.add(james);
        persons.add(billy);
        persons.add(peter);
        for (Person person : persons)
        {
            System.out.println(person);
        }  */ 
        
    }    
        /*
        Person hans = new Student(100, "Hans Nielsen", "CS");
        hans.setEmail("hni@easv.dk");
        Person niels = new Student (101, "Niels Hansen", "CS");
        niels.setEmail("nha@easv.dk");
        Person ib = new Student (102, "Ib Boesen", "Clown");
        ib.setEmail("ibo@easv.dk");
    
        Person bo = new Student(105, "Bo Ibsen", "SmartyPants");
        bo.setEmail("bib@easv.dk");
        Person bent = new Teacher (202, "Bent H. Petersen");
        Person peter = new Teacher (1337, "Peter Stegger");
        
        peter.setEmail("pes@easv.dk");
        peter.setInitial("PES");
        peter.setMainSubject("LeetProgrammer");
        bent.setEmail("bhp@easv.dk");
        bent.setInitial("BHP");
        bent.setMainSubject("Programming");
        
        printInfoTeacher(bent);
        printInfoTeacher(peter);
        printInfoStudent(hans);
        printInfoStudent(niels);
        printInfoStudent(ib);
        printInfoStudent(bo);
    }
    
    public static void printInfoStudent(Person person)
    {
        System.out.println("Student Name: " + person.getName());
        System.out.println("Student ID: " + person.getId()); 
        System.out.println("Student Email: " + person.getEmail());
        System.out.println("\n");
    }

    public static void printInfoTeacher(Person person)
    {
        System.out.println("Teachers Name: " + person.getName());
        System.out.println("Teachers ID: " + person.getId());
        System.out.println("Teachers Email: " + person.getEmail());
        System.out.println("Teachers Main: " + person.getMainSubject());
        System.out.println("\n");
    }*/

}
