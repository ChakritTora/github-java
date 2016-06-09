/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3_9_testresults;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample3_9_TestResults {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int testScore;
        String input;
        Scanner scan = new Scanner(System.in);
        input = JOptionPane.showInputDialog("Enter your numeric test score and I will tell you the grade:");
        testScore = Integer.parseInt(input);
        
        if (testScore < 50) {
            JOptionPane.showMessageDialog(null, "Your grade is F");
            
        } else if (testScore < 60) {
            JOptionPane.showMessageDialog(null, "Your grade is D");
            
        } else if (testScore < 70) {
            JOptionPane.showMessageDialog(null, "Your grade is C");
            
        } else if (testScore < 80) {
            JOptionPane.showMessageDialog(null, "Your grade is B");
            
        } else if (testScore <= 100) {
            JOptionPane.showMessageDialog(null, "Your grade is A");
            
        } else {
            JOptionPane.showMessageDialog(null, "Your grade is unknown");
            
        }
    }
    
}
