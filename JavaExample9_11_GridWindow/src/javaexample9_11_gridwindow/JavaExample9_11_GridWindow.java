/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample9_11_gridwindow;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample9_11_GridWindow extends JFrame {

    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 200;
    public JavaExample9_11_GridWindow() {
        setTitle("Grid Layout");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new GridLayout(2, 3));
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        setVisible(true);
    }

    public static void main(String[] args) {
        JavaExample9_11_GridWindow fw = new JavaExample9_11_GridWindow();
    }
    
}
