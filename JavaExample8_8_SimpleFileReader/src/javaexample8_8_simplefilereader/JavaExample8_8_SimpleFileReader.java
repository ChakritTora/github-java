/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8_8_simplefilereader;

import java.io.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample8_8_SimpleFileReader {

    public static void main(String[] args) {
        int rawData;
        char ch;
        try {
            FileReader freader = new FileReader("GoodFile.txt");
            rawData = freader.read();
            while (rawData != -1) {
                ch = (char) rawData;
                System.out.print(ch);
                rawData = freader.read();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
