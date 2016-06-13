/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5_12_calgrade;

import javax.swing.JOptionPane;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample5_12_CalGrade {

    public static String calculate(int score) {
        if (score < 50) {
            return "F";
            
        } else if (score < 60) {
            return "D";
            
        } else if (score < 70) {
            return "C";
            
        } else if (score < 80) {
            return "B";
            
        } else if (score <= 100) {
            return "A";
            
        } else {
            return "Unknown";
            
        }
    }
    
    public static void main(String[] args) {
        int score;
        String input;
        input = JOptionPane.showInputDialog("How many your score?");
        score = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "Your score is " + calculate(score));
        
    }
    
}
