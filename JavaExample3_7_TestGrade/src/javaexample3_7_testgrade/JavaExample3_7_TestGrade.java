/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3_7_testgrade;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample3_7_TestGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int testScore;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your numeric test score and I will tell you the grade: ");
        
        testScore = scan.nextInt();
        System.out.print("Your grade is ");
        
        if (testScore < 50) {
            System.out.println("F");
            
        } else if (testScore < 60) {
            System.out.println("D");
            
        } else if (testScore < 70) {
            System.out.println("C");
            
        } else if (testScore < 80) {
            System.out.println("B");
            
        } else if (testScore <= 100) {
            System.out.println("A");
            
        } else {
            System.out.println("Unknown");
            
        }
    }
    
}
