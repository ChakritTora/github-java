/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3_4_circilearea;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample3_4_CircileArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = reader.nextDouble();
        if (radius < 0) {
            System.out.println("Error: Radius must be more than 0.");
            
        } else {
            double area = 3.141 * radius * radius;
            System.out.println("The area is " + area);
            
        }
    }
    
}
