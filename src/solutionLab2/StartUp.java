/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutionLab2;

/**
 *
 * @author Taylor
 */
public class StartUp {
    public static void main(String[] args) {
        IntroToProgrammingCourse introCourse = new IntroToProgrammingCourse("Intro to Programming Course", "12345", 2.0);
        System.out.println(introCourse.getCourseName());
        System.out.println(introCourse.getCourseNumber());
        System.out.println(introCourse.getCredits());
        
        IntroJavaCourse javaCourse = new IntroJavaCourse("Intro to Java Course", "22345", 3.0, "Intro to Programming Course");
        System.out.println(javaCourse.getCourseName());
        System.out.println(javaCourse.getCourseNumber());
        System.out.println(javaCourse.getCredits());
        System.out.println(javaCourse.getPrerequisites());
        
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java COurse", "33345", 4.0, "Intro to Java Course");
        System.out.println(advancedJava.getCourseName());
        System.out.println(advancedJava.getCourseNumber());
        System.out.println(advancedJava.getCredits());
        System.out.println(advancedJava.getPrerequisites());
    }
}
