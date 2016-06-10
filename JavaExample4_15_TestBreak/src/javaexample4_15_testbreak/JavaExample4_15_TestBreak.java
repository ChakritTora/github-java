/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_15_testbreak;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_15_TestBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            if (i*i > 100) {
                break;
            }
            System.out.print((i*i) + " ");
        }
    }
    
}
