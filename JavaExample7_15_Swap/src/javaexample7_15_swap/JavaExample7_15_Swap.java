/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_15_swap;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_15_Swap {

    public static void main(String[] args) {
        int temp;
        int[] number = {3, 7, 15, 22, 29};
        
        for (int x=0; x<number.length; x++) {
            System.out.print(number[x] + " ");
        }
        
        System.out.println();
        temp = number[3];
        number[3] = number[1];
        number[1] = temp;
        
        for (int x=0; x<number.length; x++) {
            System.out.print(number[x] + " ");
        }
    }
    
}
