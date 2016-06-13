/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_1_testarray;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_1_TestArray {

    public static void main(String[] args) {
        int [] num = new int[8];
        num[0] = 2;
        num[1] = 4;
        num[2] = 6;
        num[3] = 8;
        
        System.out.println("num[0] = " + num[0]);
        System.out.println("num[1] = " + num[1]);
        System.out.println("num[2] = " + num[2]);
        System.out.println("num[3] = " + num[3]);
        System.out.println("num[4] = " + num[4]);
        
        num[3] = num[1+1] + num[0];
        System.out.println("num[3] = " + num[3]);
        
        System.out.println("Length = " + num.length);
    }
    
}
