/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_14_graderange;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_14_GradeRange {

    public static void main(String[] args) {
        Grade[] grades =
        {
            new Grade("A", 95), new Grade("A-", 90),
            new Grade("B+", 87), new Grade("B", 85), new Grade("B-", 80),
            new Grade("C+", 77), new Grade("C", 75), new Grade("C-", 70),
            new Grade("D+", 67), new Grade("D", 65), new Grade("D-", 60),
            new Grade("F", 0)
        };
        
        for (Grade letterGrade : grades)
            System.out.println(letterGrade);
    }
    
}
