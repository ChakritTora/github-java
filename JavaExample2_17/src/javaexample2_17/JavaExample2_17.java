/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample2_17;

import java.util.Scanner;

/**
 *
 * @author Mr.Chakrit Tokuhara
 */
public class JavaExample2_17 {

    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        String firstName, lastName;
        int age;
        double grade;
        
        System.out.println("Enter your first name and last name : ");
        firstName = console.next();
        lastName = console.next();
        
        System.out.println("Enter your age : ");
        age = console.nextInt();
        
        System.out.println("Enter your grade : ");
        grade = console.nextDouble();
        
        System.out.println("");
        System.out.println("My name is " + firstName + " " + lastName);
        System.out.println("I am " + age + " years old");
        System.out.println("My grade is " + grade);
        
    }
    
}
