/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_14_fahrenheit;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class FahrenheitPanel extends JPanel {
    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField fahrenheit;
    
    public FahrenheitPanel() {
        inputLabel = new JLabel("Enter Farenheit temperature: ");
        outputLabel = new JLabel("Temperature in Celsius: ");
        resultLabel = new JLabel(" ");
        fahrenheit = new JTextField(5);
        fahrenheit.addActionListener(new TempListener());
        
        add(inputLabel);
        add(fahrenheit);
        add(outputLabel);
        add(resultLabel);
        setPreferredSize(new Dimension(300, 75));
        setBackground(Color.yellow);
        
    }

    private class TempListener implements ActionListener {

        public TempListener() {
            
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            int fahrenheitTemp, celsiusTemp;
            String text = fahrenheit.getText();
            fahrenheitTemp = Integer.parseInt(text);
            celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
            resultLabel.setText(Integer.toString(celsiusTemp));
        }
        
    }
}
