/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_2_arraydemo;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_2_ArrayDemo {

    public static void main(String[] args) {
        final int EMPLOYEE = 3;
        int[] hours = new int[EMPLOYEE];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the hours worked by " + EMPLOYEE + " employees.");
        
        for (int i=0; i<EMPLOYEE; i++) {
            System.out.print("Employee " + (i+1) + ": ");
            hours[i] = scan.nextInt();
        }
        
        System.out.println();
        System.out.println("The hours you entered are:");
        for (int j=0; j<EMPLOYEE; j++) {
            System.out.println(hours[j]);
        }
    }
    
}
