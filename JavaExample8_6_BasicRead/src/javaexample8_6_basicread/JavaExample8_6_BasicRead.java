/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8_6_basicread;

import java.io.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample8_6_BasicRead {

    public static void main(String[] args) throws IOException {
        FileReader freader = new FileReader("data1.txt");
        BufferedReader inputFile = new BufferedReader(freader);
        
        String str;
        str = inputFile.readLine();
        while (str != null) {
            System.out.println(str);
            str = inputFile.readLine();
        }
        inputFile.close();
        
    }
    
}
