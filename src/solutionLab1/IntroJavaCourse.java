package solutionLab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits);
        setPrerequisites(prerequisites);
    }


    

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    }
    
    
    

    

    

    


    

    

        


