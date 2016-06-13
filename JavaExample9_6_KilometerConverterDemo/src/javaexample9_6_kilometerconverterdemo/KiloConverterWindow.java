/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample9_6_kilometerconverterdemo;

import javax.swing.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class KiloConverterWindow extends JFrame {
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField kiloTextField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 310;
    private final int WINDOW_HEIGHT = 100;
    
    public KiloConverterWindow() {
        setTitle("Kilometer Converter");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        buildPanel();
        add(panel);
        setVisible(true);
    }
    
    public void buildPanel() {
        messageLabel = new JLabel("Enter a distance in kilometers");
        kiloTextField = new JTextField(10);
        calcButton = new JButton("Calculate");
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }
}
