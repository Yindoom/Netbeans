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
public class Student extends Person 
{    
    //private double avarageGrade;
    private String education;
    private List<GradeInfo> gradeReport = new ArrayList<>();    
    //private double grade;
    
    public Student(int id, String name, String education) 
    {
        super(id, name);
        this.education = education;
    }

    public List<GradeInfo> getGradeReport() 
    {
        return gradeReport;
    }

    public String getEducation() 
    {
        return education;
    }
    
    public double getGrade(String subject) 
    {
        for (GradeInfo gradeInfo : gradeReport) {
            if (gradeInfo.getSubject() == subject)
            {
                return gradeInfo.getGrade();
            }
        }
        return -1;
    }
  
     public double getAverageGrade() 
    {
        
        double tempAverage = 0;
        
        for (GradeInfo gradeInfo : gradeReport) 
        {
            tempAverage = tempAverage + gradeInfo.getGrade();            
        }
        tempAverage = tempAverage / gradeReport.size();
        return tempAverage;
    }
   
    public void addGrade(GradeInfo grade)
    {
        gradeReport.add(grade);
    }
    
    @Override
    public String toString() 
    {        
        return "ID\tNAME\t\tEMAIL\t\tEDUCATION\t\tAVG.GRADE\n" + 
                id +"\t"+ name +"\t" + email +"\t" + education +"\t"+ getAverageGrade() + "\n";    
    }
   
}
