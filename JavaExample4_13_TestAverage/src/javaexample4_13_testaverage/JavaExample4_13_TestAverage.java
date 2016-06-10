/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_13_testaverage;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_13_TestAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score1, score2, score3;
        double average;
        char again;
        DecimalFormat formatter = new DecimalFormat("#0.00");
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Please input score 1: ");
            score1 = scan.nextInt();
            
            System.out.print("Please input score 2: ");
            score2 = scan.nextInt();
            
            System.out.print("Please input score 3: ");
            score3 = scan.nextInt();
            
            scan.nextLine();
            
            average = (score1 + score2 + score3) / 3.0;
            System.out.println("Average score is " + formatter.format(average) + "\n");
            
            System.out.println("Do you want to continue? y/n: ");
            again = scan.nextLine().charAt(0);
            
        } while (again == 'y' || again == 'Y');
    }
    
}
