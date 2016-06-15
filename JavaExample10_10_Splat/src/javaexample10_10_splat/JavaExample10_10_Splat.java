/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample10_10_splat;

import javax.swing.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample10_10_Splat {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Splat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new SplatPanel());
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
