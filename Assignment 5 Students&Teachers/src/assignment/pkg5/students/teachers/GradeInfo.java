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
public class GradeInfo
{
    private double grade;
    private String subject;
    
    public GradeInfo(double grade, String subject) 
    {
        this.grade = grade;
        this.subject = subject;
    }
    
    public double getGrade() 
    {
        return grade;
    }

    public String getSubject() 
    {
        return subject;
    }

    @Override
    public String toString() 
    {
        return "GradeInfo{" + "grade=" + grade + ", subject=" + subject + '}';
    }
}
