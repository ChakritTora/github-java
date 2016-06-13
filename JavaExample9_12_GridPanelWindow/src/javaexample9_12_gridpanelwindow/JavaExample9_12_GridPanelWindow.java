/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample9_12_gridpanelwindow;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample9_12_GridPanelWindow extends JFrame {
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 300;
    public JavaExample9_12_GridPanelWindow() {
        setTitle("Grid Layout");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new GridLayout(2, 3));
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        
        panel1.add(button1);
        panel2.add(button2);
        panel3.add(button3);
        panel4.add(button4);
        panel5.add(button5);
        panel6.add(button6);
        
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        JavaExample9_12_GridPanelWindow fw = new JavaExample9_12_GridPanelWindow();
    }
}
