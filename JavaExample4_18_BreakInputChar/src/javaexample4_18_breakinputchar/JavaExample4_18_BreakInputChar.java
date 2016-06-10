/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_18_breakinputchar;

import java.io.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_18_BreakInputChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            char ch;
            for (;;) {
                ch = (char) System.in.read();
                if (ch == 'q') break;
            }
            
        } catch (IOException e) {
            
        };
    }
    
}
