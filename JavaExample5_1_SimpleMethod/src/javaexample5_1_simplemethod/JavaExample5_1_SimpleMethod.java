/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5_1_simplemethod;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample5_1_SimpleMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello from the main method.");
        displayMessage();
        
        System.out.println("Back in the main method.");
    }
    
    public static void displayMessage() {
        System.out.println("Hello from the displayMessage method.");
    }
    
}
