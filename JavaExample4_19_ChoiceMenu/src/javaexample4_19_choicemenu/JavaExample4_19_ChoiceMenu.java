/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_19_choicemenu;

import java.io.IOException;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_19_ChoiceMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            char choice;
            do {
                System.out.println("Menu:");
                System.out.println("1. Start game");
                System.out.println("2. Load game");
                System.out.println("3. Setting");
                System.out.println("4. Exit");
                
                System.out.print("Choose one: ");
                do {
                    choice = (char) System.in.read();
                    
                } while (choice == '\n' | choice == '\r');
                System.out.println("");
                
            } while (choice < '1' | choice > '4');
            
        } catch (IOException e) {
            
        };
    }
    
}
