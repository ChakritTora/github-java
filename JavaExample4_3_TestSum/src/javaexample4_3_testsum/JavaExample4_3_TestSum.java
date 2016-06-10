/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_3_testsum;

import java.util.Scanner;

/**
 *
 * @author Maewdamn
 */
public class JavaExample4_3_TestSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input your number: ");
        num = scan.nextInt();
        
        for (int i=1; i<=num; i++) {
            sum += i;
        }
        
        System.out.println("Sum is " + sum);
    }
    
}
