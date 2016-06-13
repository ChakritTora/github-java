/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_3_rectangle2;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_4_RectangleDemo {
    
    public static void main(String[] args) {
        JavaExample6_3_Rectangle2 box = new JavaExample6_3_Rectangle2();
        box.setLength(10.0);
        box.setWidth(20.0);
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
    }
}
