/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_11_returnarray;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_11_ReturnArray {

    public static void main(String[] args) {
        double[] values;
        values = getArray();
        
        for (int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }
    }
    
    public static double[] getArray() {
        double[] array = {1.2, 4.7, 9.5, 13.2, 18.9};
        return array;
    }
    
}
