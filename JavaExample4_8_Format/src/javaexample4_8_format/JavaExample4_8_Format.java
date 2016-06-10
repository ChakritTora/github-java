/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_8_format;

import java.text.DecimalFormat;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_8_Format {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number1 = 0.16666666667;
        double number2 = 1.88888888888;
        double number3 = 2.45454545454;
        double number4 = 3.89898989898;
        
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println("number1 = " + formatter.format(number1));
        System.out.println("number2 = " + formatter.format(number2));
        System.out.println("number3 = " + formatter.format(number3));
        System.out.println("number4 = " + formatter.format(number4));
    }
    
}
