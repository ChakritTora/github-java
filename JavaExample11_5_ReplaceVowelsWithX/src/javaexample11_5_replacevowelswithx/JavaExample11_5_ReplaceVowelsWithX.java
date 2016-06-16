/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample11_5_replacevowelswithx;

import javax.swing.JOptionPane;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample11_5_ReplaceVowelsWithX {

    public static void main(String[] args) {
        StringBuffer tempStringBuffer;
        String inSentence;
        int numberOfCharacters;
        char letter;
        inSentence = JOptionPane.showInputDialog(null, "Enter a sentence : ");
        tempStringBuffer = new StringBuffer(inSentence);
        numberOfCharacters = tempStringBuffer.length();
        
        for (int index = 0; index < numberOfCharacters; index++) {
            letter = tempStringBuffer.charAt(index);
            if (letter == 'a' || letter == 'A' ||
                    letter == 'e' || letter == 'E' ||
                    letter == 'i' || letter == 'I' ||
                    letter == 'o' || letter == 'O' ||
                    letter == 'u' || letter == 'U' ) {
                tempStringBuffer.setCharAt(index, 'X');
            }
        }
        System.out.println("Input: " + inSentence + "\n");
        System.out.println("Output: " + tempStringBuffer);
    }
    
}
