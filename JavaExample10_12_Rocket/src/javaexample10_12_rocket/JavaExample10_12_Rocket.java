/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample10_12_rocket;

import javax.swing.JFrame;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample10_12_Rocket {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rocket");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RocketPanel panel = new RocketPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
}
