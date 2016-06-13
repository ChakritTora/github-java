/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8_7_filesum;

import java.io.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample8_7_FileSum {

    public static void main(String[] args) throws IOException{
        double sum;
        String str;
        FileReader freader = new FileReader("number.txt");
        BufferedReader inputFile = new BufferedReader(freader);
        
        sum = 0.0;
        str = inputFile.readLine();
        while (str != null) {
            sum = sum + Double.parseDouble(str);
            str = inputFile.readLine();
        }
        inputFile.close();
        System.out.println("The sum of the numbers in number.txt is " + sum);
    }
    
}
