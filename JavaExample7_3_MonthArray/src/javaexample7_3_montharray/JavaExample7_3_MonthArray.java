/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_3_montharray;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_3_MonthArray {

    public static void main(String[] args) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i=0; i<12; i++) {
            System.out.println("Month " + (i+1) + " has " + days[i] + " days.");
        }
    }
    
}
