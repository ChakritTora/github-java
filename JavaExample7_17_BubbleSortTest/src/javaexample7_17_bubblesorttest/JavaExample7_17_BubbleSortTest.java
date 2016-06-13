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
public class JavaExample7_17_BubbleSortTest {

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 6, 4, 2};
        
        System.out.println("Original order: ");
        for (int element : values) {
            System.out.print(element + " ");
        }
        
        IntBubbleSorter.bubbleSort(values);
        
        System.out.println();
        System.out.println("Sorted order: ");
        for (int element : values) {
            System.out.print(element + " ");
        }
    }
    
}
