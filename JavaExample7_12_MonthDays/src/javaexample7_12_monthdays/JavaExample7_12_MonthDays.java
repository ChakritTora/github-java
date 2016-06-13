/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_12_monthdays;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_12_MonthDays {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int i=0; i<months.length; i++) {
            System.out.println(months[i] + " has " + days[i] + " days.");
        }
    }
    
}
