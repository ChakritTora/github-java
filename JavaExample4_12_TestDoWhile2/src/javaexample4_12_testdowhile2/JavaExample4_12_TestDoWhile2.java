/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_12_testdowhile2;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_12_TestDoWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Please insert number less than 10: ");
            num = scan.nextInt();
            
        } while (num > 10);
        
        System.out.println("OK!");
    }
    
}
