/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample9_10_borderpanelwindow;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample9_10_BorderPanelWindow extends JFrame {
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 300;
    public JavaExample9_10_BorderPanelWindow() {
        setTitle("Border Layout");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new BorderLayout());
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        
        JButton button1 = new JButton("North Button");
        JButton button2 = new JButton("South Button");
        JButton button3 = new JButton("East Button");
        JButton button4 = new JButton("West Button");
        JButton button5 = new JButton("Center Button");
        
        panel1.add(button1);
        panel2.add(button2);
        panel3.add(button3);
        panel4.add(button4);
        panel5.add(button5);
        
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
        add(panel3, BorderLayout.EAST);
        add(panel4, BorderLayout.WEST);
        add(panel5, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        JavaExample9_10_BorderPanelWindow fw = new JavaExample9_10_BorderPanelWindow();
    }
    
}
