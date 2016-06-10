/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_14_star;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_14_Star {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
    
}
