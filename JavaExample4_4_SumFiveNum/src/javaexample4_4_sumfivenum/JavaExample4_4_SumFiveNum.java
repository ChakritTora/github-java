/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_4_sumfivenum;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_4_SumFiveNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, sum;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please insert your first num: ");
        num1 = scan.nextInt();
        
        System.out.print("Please insert your second num: ");
        num2 = scan.nextInt();
        
        System.out.print("Please insert your third num: ");
        num3 = scan.nextInt();
        
        System.out.print("Please insert your fourth num: ");
        num4 = scan.nextInt();
        
        System.out.print("Please insert your fifth num: ");
        num5 = scan.nextInt();
        
        sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("Sum = " + sum);
    }
    
}
