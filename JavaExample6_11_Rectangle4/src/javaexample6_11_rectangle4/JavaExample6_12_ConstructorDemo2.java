/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_11_rectangle4;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_12_ConstructorDemo2 {
    
    public static void main(String[] args) {
        JavaExample6_11_Rectangle4 boxA = new JavaExample6_11_Rectangle4();
        JavaExample6_11_Rectangle4 boxB = new JavaExample6_11_Rectangle4(5.0, 3.0);
        
        System.out.println("The Box A's area is " + boxA.getArea());
        System.out.println("The Box B's area is " + boxB.getArea());
    }
}
