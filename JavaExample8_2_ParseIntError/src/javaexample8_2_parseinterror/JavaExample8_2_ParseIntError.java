/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8_2_parseinterror;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample8_2_ParseIntError {

    public static void main(String[] args) {
        String str = "abcde";
        int number;
        
        try {
            number = Integer.parseInt(str);
            
        } catch (NumberFormatException e) {
            System.out.println("Conversion error: " + e.getMessage());
        }
    }
    
}
