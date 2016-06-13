/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_20_lengths;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_20_Lengths {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}};
        
        System.out.println("The number of row is " + numbers.length);
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("The number of columns in row " + index + " is " + numbers[index].length);
        }
    }
    
}
