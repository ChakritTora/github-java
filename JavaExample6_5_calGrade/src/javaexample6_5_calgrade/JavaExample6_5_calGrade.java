/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_5_calgrade;

/**
 *
 * @author Maewdamn
 */
public class JavaExample6_5_calGrade {

    static class calScore {
        public void calculate() {
            double score = Math.random() * 100;
            System.out.println("Your score is " + (int)score);
            
            if (score < 50) {
                System.out.println("Grade is F");
                
            } else if (score < 60) {
                System.out.println("Grade is D");
                
            } else if (score < 70) {
                System.out.println("Grade is C");
                
            } else if (score < 80) {
                System.out.println("Grade is B");
                
            } else {
                System.out.println("Grade is A");
            }
        }
    }
    
    public static void main(String[] args) {
        calScore obj = new calScore();
        obj.calculate();
    }
    
}
