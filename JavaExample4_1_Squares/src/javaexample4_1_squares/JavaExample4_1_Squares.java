/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_1_squares;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_1_Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        System.out.println("Number          Number Squared");
        System.out.println("------------------------------");
        for (number = 1; number <= 10; number++) {
            System.out.println(number + "\t\t" + number * number);
        }
    }
    
}
