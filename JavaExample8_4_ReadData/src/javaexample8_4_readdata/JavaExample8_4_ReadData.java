/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8_4_readdata;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample8_4_ReadData {

    public static void main(String[] args) {
        byte[] data = new byte[10];
        System.out.println("Insert your input: ");
        try {
            System.in.read(data);
            System.out.print("You entered: ");
            for (int i=0; i<data.length; i++) {
                System.out.print((char)data[i]);
            }
            
        } catch (Exception e) {
            System.out.println("You entered error input.");
        }
    }
    
}
