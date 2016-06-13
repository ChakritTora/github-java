/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5_8_calfx;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample5_8_CalFx {

    /**
     * @param args the command line arguments
     */
    public static int fx(int x) {
        int m;
        m = x*x+5;
        return m;
    }
    
    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            System.out.println("Function of " + i + " = " + fx(i));
        }
    }
    
}
