/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_5_sumnumtime;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_5_SumNumTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your num: ");
        num = scan.nextInt();
                
        for (int i=0; i<=num; i++) {
            System.out.println((num-i) + " + " + i + " = " + num);
        }
    }
    
}
