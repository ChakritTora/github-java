/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_3_rectangle2;

import javax.swing.JOptionPane;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_6_RoomAreas {
    
    public static void main(String[] args) {
        double number;
        double totalArea;
        String input;

        JavaExample6_3_Rectangle2 kitchen = new JavaExample6_3_Rectangle2();
        JavaExample6_3_Rectangle2 bedroom = new JavaExample6_3_Rectangle2();
        JavaExample6_3_Rectangle2 den = new JavaExample6_3_Rectangle2();

        input = JOptionPane.showInputDialog("What is the kitchen's length?");
        number = Double.parseDouble(input);
        kitchen.setLength(number);
        
        input = JOptionPane.showInputDialog("What is the kitchen's width?");
        number = Double.parseDouble(input);
        kitchen.setWidth(number);
        
        
        input = JOptionPane.showInputDialog("What is the bedroom's length?");
        number = Double.parseDouble(input);
        bedroom.setLength(number);
        
        input = JOptionPane.showInputDialog("What is the bedroom's width?");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);
        
        
        input = JOptionPane.showInputDialog("What is the den's length?");
        number = Double.parseDouble(input);
        den.setLength(number);
        
        input = JOptionPane.showInputDialog("What is the den's width?");
        number = Double.parseDouble(input);
        den.setWidth(number);
        
        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
        JOptionPane.showMessageDialog(null, "The total area is " + totalArea);
    }
}
