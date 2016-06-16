/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample11_4_countjava;

import javax.swing.JOptionPane;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample11_4_CountJava {

    public static void main(String[] args) {
        int javaCount = 0;
        String word;
        while(true) {
            word = JOptionPane.showInputDialog(null, "Next word: ");
            
            if (word.equals("STOP")) {
                break;
            } else if (word.equalsIgnoreCase("Java")) {
                javaCount++;
            }
        }
        System.out.println("'Java' count : " + javaCount);
    } 
}
