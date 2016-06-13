/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_7_basicarray;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_7_BasicArray {

    public static void main(String[] args) {
        final int LIMIT = 15, MULTIPLE = 10;
        int[] list = new int[LIMIT];
        
        for (int i=0; i<LIMIT; i++) {
            list[i] = i * MULTIPLE;
        }
        
        list[5] = 999;
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
    
}
