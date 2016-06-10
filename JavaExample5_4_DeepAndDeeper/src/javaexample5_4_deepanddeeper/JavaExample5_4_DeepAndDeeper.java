/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5_4_deepanddeeper;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample5_4_DeepAndDeeper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("I am starting in main.");
        deep();
        System.out.println("Now I am back in main.");
    }
    
    public static void deep() {
        System.out.println("I am now in deep.");
        deeper();
        System.out.println("Now I am back in deep.");
    }
    
    public static void deeper() {
        System.out.println("Now I am in deeper.");
    }
}
