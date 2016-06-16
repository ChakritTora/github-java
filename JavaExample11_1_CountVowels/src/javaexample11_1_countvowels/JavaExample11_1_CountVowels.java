/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample11_1_countvowels;

import javax.swing.JOptionPane;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample11_1_CountVowels {

    public static void main(String[] args) {
        String name;
        int numberOfCharacters, vowelCount = 0;
        char letter;
        name = JOptionPane.showInputDialog(null, "What is your name?");
        numberOfCharacters = name.length();
        
        for(int i=0; i<numberOfCharacters; i++) {
            letter = name.charAt(i);
            
            if (letter == 'a' || letter == 'A' ||
                    letter == 'e' || letter == 'E' ||
                    letter == 'i' || letter == 'I' ||
                    letter == 'o' || letter == 'O' ||
                    letter == 'u' || letter == 'U' ) {
                vowelCount++;
            }
        }
        
        JOptionPane.showMessageDialog(null, name + " your name has " + vowelCount + " vowels");
    }
    
}
