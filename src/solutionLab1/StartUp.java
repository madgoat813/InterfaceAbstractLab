/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutionLab1;

/**
 *
 * @author Taylor
 */
public class StartUp {
    public static void main(String[] args) {
        ProgrammingCourse introCourse = new IntroToProgrammingCourse("Intro to Programming Class", "12345", 2.0);
        System.out.println(introCourse.getCourseName());
        System.out.println(introCourse.getCourseNumber());
        System.out.println(introCourse.getCredits());
        
        ProgrammingCourse javaCourse = new IntroJavaCourse("Intro Java Class", "22345", 3.0, "Intro to Programming Class");
        System.out.println(javaCourse.getCourseName());
        System.out.println(javaCourse.getCourseNumber());
        System.out.println(javaCourse.getCredits());
        System.out.println(javaCourse.getPrerequisites());
        
        ProgrammingCourse advancedCourse = new AdvancedJavaCourse("Advanced Java Course", "33345", 4.0, "Intro to Java Class");
        System.out.println(advancedCourse.getCourseName());
        System.out.println(advancedCourse.getCourseNumber());
        System.out.println(advancedCourse.getCredits());
        System.out.println(advancedCourse.getPrerequisites());
    }
}
