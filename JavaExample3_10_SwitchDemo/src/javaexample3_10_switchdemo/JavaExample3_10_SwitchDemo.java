/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3_10_switchdemo;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample3_10_SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1, 2, or 3: ");
        
        number = scan.nextInt();
        
        switch(number) {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                System.out.println("This is not 1, 2 or 3");
        }
    }
    
}
