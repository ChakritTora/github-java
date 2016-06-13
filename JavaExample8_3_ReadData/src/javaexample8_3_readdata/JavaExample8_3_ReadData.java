/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8_3_readdata;

import java.io.IOException;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample8_3_ReadData {

    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Insert your input: ");
        System.in.read(data);
        System.out.print("\nYou entered: ");
        for (int i=0; i<data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
    
}
