/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_16_teststudent;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_16_TestStudent {

    public static void main(String[] args) {
        JavaExample6_15_Student s1, s2, s3;
        s1 = new JavaExample6_15_Student();
        s2 = new JavaExample6_15_Student();
        s3 = new JavaExample6_15_Student();
        
        s2.setName("Kittisak");
        s2.setScore(1, 75);
        s2.setScore(2, 85);
        s2.setScore(3, 91);
        
        s3.setName("Surachet");
        s3.setScore(1, 78);
        s3.setScore(2, 69);
        s3.setScore(3, 95);
        
        System.out.println();
        System.out.println(s1.toString());
        System.out.println(s1.getName() + "'s highscore is " + s1.getHighScore());
        System.out.println();
        System.out.println(s2.toString());
        System.out.println(s2.getName() + "'s highscore is " + s2.getHighScore());
        System.out.println();
        System.out.println(s3.toString());
        System.out.println(s3.getName() + "'s highscore is " + s3.getHighScore());
    }
    
}
