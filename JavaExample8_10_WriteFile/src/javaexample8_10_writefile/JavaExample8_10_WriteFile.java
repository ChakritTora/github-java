/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8_10_writefile;

import java.io.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample8_10_WriteFile {

    public static void main(String[] args) throws IOException {
        String letter = "This is test data";
        FileWriter fw = new FileWriter("WriteData.txt");
        fw.write(letter, 0, 17);
        fw.write(" Test Write data to File A-Z \n");
        for (int i=65; i<91; i++) {
            fw.write((char)i);
        }
        fw.close();
        System.exit(0);
    }
    
}
