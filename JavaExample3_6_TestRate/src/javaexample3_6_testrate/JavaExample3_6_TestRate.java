/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3_6_testrate;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample3_6_TestRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double RATE = 150;
        final int STANDARD = 40;
        double pay = 0.0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of hours worked: ");
        int hours = scan.nextInt();
        
        if (hours > STANDARD) {
            pay = STANDARD * RATE + (hours - STANDARD) * (RATE * 1.5);
            
        } else {
            pay = hours * RATE;
            
        }
        System.out.println("Pay = " + pay);
    }
    
}
