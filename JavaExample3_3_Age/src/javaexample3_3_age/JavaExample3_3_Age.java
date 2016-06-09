/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3_3_age;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample3_3_Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MINOR = 21;
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        age = scan.nextInt();
        
        System.out.println("Your entered : " + age);
        if (age < MINOR) {
            System.out.println("Youth is a wonderful thing. Enjoy.");
            
        } 
        System.out.println("Age is a state of mind.");
    }
    
}
