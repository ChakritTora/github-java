/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_17_kbln;

import java.io.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_17_Kbln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            char ch;
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
            System.out.println("Your key is " + ch);
        } catch (IOException e) {
            
        };
    }
    
}
