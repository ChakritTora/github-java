/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_17_bubblesorttest;

/**
 *
 * @author Chakrit Tokuhara
 */
public class IntBubbleSorter {
    public static void bubbleSort(int[] array) {
        
        int maxElement;
        int index;
        int temp;
    
        for (maxElement = array.length-1; maxElement >= 0; maxElement--) {
            for (index = 0; index <= maxElement-1; index++) {
                if (array[index] > array[index+1]) {
                    temp = array[index];
                    array[index] = array[index+1];
                    array[index+1] = temp;
                }
            }
        }
}
}
