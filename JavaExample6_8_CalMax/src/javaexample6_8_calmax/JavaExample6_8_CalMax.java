/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_8_calmax;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_8_CalMax {
    
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input number 1: ");
        num1 = scan.nextInt();
        
        System.out.print("Input number 2: ");
        num2 = scan.nextInt();
        
        int larger = TestMax.max(num1, num2);
        System.out.println("Max is " + larger);
    }
}

class TestMax {
    static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else 
            return num2;
    }
}
