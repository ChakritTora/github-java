/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5_7_twoargs;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample5_7_TwoArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 4.5;
        double b = 6.9;
        showSum(a, b);
    }
    
    public static void showSum(double a, double b) {
        double sum;
        sum = a + b;
        System.out.println("The sum is " + sum);
    }
    
}
