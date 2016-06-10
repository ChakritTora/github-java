/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_7_sumthreefive;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_7_SumThreeFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nsum = " + sum);
    }
    
}
