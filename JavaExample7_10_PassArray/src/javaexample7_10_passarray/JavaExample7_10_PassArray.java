/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_10_passarray;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_10_PassArray {

    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int[] numbers = new int[ARRAY_SIZE];
        
        getValues(numbers);
        System.out.println("Here are the numbers that you entered:");
        showArray(numbers);
    }
    
    public static void getValues(int[] numbers) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of " + numbers.length + " numbers:");
        
        for (int i = 0; i<numbers.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = scan.nextInt();
        }
    }
    
    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
