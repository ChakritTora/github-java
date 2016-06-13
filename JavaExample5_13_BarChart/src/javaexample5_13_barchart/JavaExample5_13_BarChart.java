/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5_13_barchart;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample5_13_BarChart {

    public static void bar(int data) {
        for (int i=0; i<data; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int data;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your number: ");
        data = scan.nextInt();
        bar(data);
    }
    
}
