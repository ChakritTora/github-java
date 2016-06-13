/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_6_bar;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_6_Bar {

    public static void main(String[] args) {
        int[] data = new int[10];
        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i<10; i++) {
            System.out.print("Insert your line #" + (i+1) + ": ");
            data[i] = scan.nextInt();
        }
        System.out.println();
        
        for (int j=0; j<10; j++) {
            bar(data[j]);
        }
    }
    
    public static void bar(int data) {
        for (int i=1; i<= data; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
