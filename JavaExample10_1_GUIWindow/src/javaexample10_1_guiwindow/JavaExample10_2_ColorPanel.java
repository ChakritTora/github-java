/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample10_1_guiwindow;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample10_2_ColorPanel extends JPanel {
    public JavaExample10_2_ColorPanel(Color backColor) {
        setBackground(backColor);
        
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int x = getWidth()/2 - 60;
        int y = getHeight()/2;
        
        g.setColor(Color.blue);
        g.drawRect(x, y, 120, 20);
        g.setColor(Color.red);
        
        Font font = new Font("Courier", Font.BOLD, 20);
        g.setFont(font);
        g.drawString("Hello world!", x+10, y+15);
    }
}
