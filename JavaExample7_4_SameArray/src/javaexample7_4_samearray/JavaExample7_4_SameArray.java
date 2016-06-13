/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_4_samearray;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_4_SameArray {
    
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10};
        int[] array2 = array1;
        
        array1[0] = 200;
        array2[4] = 1000;
        
        System.out.println("The contents of array1:");
        for (int i=0; i<5; i++) {
            System.out.println("array1[" + i + "] = " + array1[i]);
        }
        System.out.println();
        
        System.out.println("The contents of array2:");
        for (int j=0; j<5; j++) {
            System.out.println("array2[" + j + "] = " + array2[j]);
        }
    }
    
}
