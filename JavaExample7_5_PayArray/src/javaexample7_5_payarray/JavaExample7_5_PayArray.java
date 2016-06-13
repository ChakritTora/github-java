/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_5_payarray;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_5_PayArray {
    
    public static void main(String[] args) {
        final int EMPLOYEE = 5;
        double payRate;
        double grossPay;
        int[] hours = new int[EMPLOYEE];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the hours worked by " + EMPLOYEE + " employees who all earn the same hourly rate");
        for (int i=0; i<EMPLOYEE; i++) {
            System.out.print("Employee #" + (i+1) + ": ");
            hours[i] = scan.nextInt();
        }
        
        System.out.println();
        System.out.print("Enter the hourly pay rate for each employee: ");
        payRate = scan.nextDouble();
        
        System.out.println();
        System.out.println("Here is each employee's gross pay:");
        for (int j=0; j<EMPLOYEE; j++) {
            grossPay = hours[j] * payRate;
            System.out.println("Employee #" + (j+1) + ": $" + grossPay);
        }
    }
    
}
