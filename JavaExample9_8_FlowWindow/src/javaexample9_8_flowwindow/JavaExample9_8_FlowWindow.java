/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample9_8_flowwindow;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample9_8_FlowWindow extends JFrame {
    private final int WINDOW_WIDTH = 200;
    private final int WINDOW_HEIGHT = 105;
    public JavaExample9_8_FlowWindow() {
        setTitle("Flow Layout");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new FlowLayout());
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        
        add(button1);
        add(button2);
        add(button3);
        setVisible(true);
    }

    public static void main(String[] args) {
        JavaExample9_8_FlowWindow fw = new JavaExample9_8_FlowWindow();
    }
    
}
