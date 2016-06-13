/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8_5_filewritedemo;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample8_5_FileWriteDemo {

    public static void main(String[] args) throws IOException {
        String fileName;
        String friendName;
        int numFriends;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many friends do you have? ");
        numFriends = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the filename: ");
        fileName = scan.nextLine();
        
        FileWriter fwriter = new FileWriter(fileName);
        PrintWriter outputFile = new PrintWriter(fwriter);
        
        for (int i=1; i<=numFriends; i++) {
            System.out.print("Enter the name of friend number " + i + ": ");
            friendName = scan.nextLine();
            outputFile.println(friendName);
        }
        outputFile.close();
        System.out.println("Data written to the file.");
    }
    
}
