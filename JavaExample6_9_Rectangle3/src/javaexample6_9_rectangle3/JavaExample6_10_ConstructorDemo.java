/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_9_rectangle3;

/**
 *
 * @author Maewdamn
 */
public class JavaExample6_10_ConstructorDemo {
    public static void main(String[] args) {
        JavaExample6_9_Rectangle3 box = new JavaExample6_9_Rectangle3(8.0, 12.0);
        
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
    }
}
