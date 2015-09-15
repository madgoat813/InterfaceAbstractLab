/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutionLab1;

import javax.swing.JOptionPane;

/**
 *
 * @author tmcfall
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
   
    
    
    public ProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
     public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
     
     public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
     
     public String getCourseNumber() {
        return courseNumber;
    }
     
     public double getCredits() {
        return credits;
    }
     
     public String getCourseName() {
        return courseName;
    }
     public abstract void setPrerequisites(String prerequisites);
     
     public abstract String getPrerequisites();
     
    
}

