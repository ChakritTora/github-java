/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_14_fahrenheit;

import javax.swing.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_14_Fahrenheit {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        FahrenheitPanel panel = new FahrenheitPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
}
