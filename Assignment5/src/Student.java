
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
public class Student extends Person {
    
     private List<GradeInfo> gradeReport = new ArrayList<>();
     private String education;
     
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
     
         private double AverageGrade;

    /**
     * Get the value of AverageGrade
     *
     * @return the value of AverageGrade
     */
    public double getAverageGrade() 
    {
        double tempAverage = 0;
        
        for (GradeInfo GradeInfo : gradeReport) {
            tempAverage = tempAverage + GradeInfo.getGrade();
        }
        tempAverage = tempAverage / gradeReport.size();
        return tempAverage;
    }
    
    public int getGrade()
    {
        for (GradeInfo gradeInfo : gradeReport) {
            return gradeInfo.getGrade();
        }
        return -1;
    }
    
    public void addGrade(GradeInfo grade)
    {
        gradeReport.add(grade);
    }

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getEmail() + "\t" + education + "\t" + getAverageGrade();
    }
    
    

}
