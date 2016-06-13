/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_9_passelements;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_9_PassElements {

    public static void main(String[] args) {
        int[] number = {5, 10, 15, 20, 25, 30, 35, 40};
        
        for (int index : number) {
            showValue(index);
        }
    }
    
    public static void showValue(int num) {
        System.out.print(num + " ");
    }
    
}
