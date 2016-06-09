/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3_5_division;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample3_5_Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number1, number2;
        double quotient;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number1 = keyboard.nextDouble();
        
        System.out.print("Enter another number: ");
        number2 = keyboard.nextDouble();
        
        System.out.println("");
        
        if (number2 == 0) {
            System.out.println("Division by zero is not possible.");
            System.out.println("Please run a program again and enter a number other than zero.");
            
        } else {
            quotient = number1 / number2;
            System.out.println("The quotient of " + number1 + " divided by " + number2 + " is " + quotient);
            
        }
    }
    
}
