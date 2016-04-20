/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample2_16;

import java.util.Scanner;

/**
 *
 * @author Mr.Chakrit Tokuhara
 */
public class JavaExample2_16 {

    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        int first_num, second_num;
        
        System.out.println("Enter two integers : ");
        
        first_num = console.nextInt();
        second_num = console.nextInt();
        
        System.out.println("First integer is " + first_num);
        System.out.println("Second integer is " + second_num);
    }
    
}
