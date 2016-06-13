/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5_9_localvars;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample5_9_LocalVars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        texas();
        california();
    }
    
    public static void texas() {
        int birds = 5000;
        System.out.println("In Texas there are " + birds + " birds.");
    }
    
    public static void california() {
        int birds = 3500;
        System.out.println("In California there are " + birds + " birds.");
    }
    
}
