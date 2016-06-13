/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8_9_simplefilewriter;

import java.io.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample8_9_SimpleFileWriter {

    public static void main(String[] args) {
        String output = "To thine own self be true";
        int rawData;
        try {
            FileWriter fwriter = new FileWriter("NewFile.txt");
            for (int i=0; i<output.length(); i++) {
                rawData = (int) output.charAt(i);
                fwriter.write(rawData);
            }
            fwriter.close();
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
