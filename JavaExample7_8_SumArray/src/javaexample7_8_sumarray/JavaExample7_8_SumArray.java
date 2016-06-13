/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_8_sumarray;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_8_SumArray {

    public static void main(String[] args) {
        int sum = 0;
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int i : list) {
            sum += i;
        }
        
        System.out.println("Sum = " + sum);
    }
    
}
