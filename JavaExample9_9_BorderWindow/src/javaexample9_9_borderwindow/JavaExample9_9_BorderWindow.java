/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample9_9_borderwindow;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample9_9_BorderWindow extends JFrame {

    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 300;
    public JavaExample9_9_BorderWindow() {
        setTitle("Border Layout");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new BorderLayout());
        
        JButton button1 = new JButton("North Button");
        JButton button2 = new JButton("South Button");
        JButton button3 = new JButton("East Button");
        JButton button4 = new JButton("West Button");
        JButton button5 = new JButton("Center Button");
        
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.EAST);
        add(button4, BorderLayout.WEST);
        add(button5, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        JavaExample9_9_BorderWindow fw = new JavaExample9_9_BorderWindow();
    }
    
}
