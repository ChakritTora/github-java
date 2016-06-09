/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3_8_minofthree;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample3_8_minofthree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, min;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        
        if (num1 < num2) {
            if (num1 < num3) {
                min = num1;
                
            } else {
                min = num3;
                
            }
        } else if (num2 < num3) {
            min = num2;
            
        } else {
            min = num3;
            
        }
        System.out.println("min is " + min);
    }
    
}
