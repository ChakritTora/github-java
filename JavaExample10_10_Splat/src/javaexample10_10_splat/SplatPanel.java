/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample10_10_splat;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class SplatPanel extends JPanel {
    private Circle circle1, circle2, circle3, circle4, circle5;
    
    public SplatPanel() {
        circle1 = new Circle(30, Color.red, 70, 35);
        circle1 = new Circle(30, Color.red, 70, 35);
        circle1 = new Circle(30, Color.red, 70, 35);
        circle1 = new Circle(30, Color.red, 70, 35);
        circle1 = new Circle(30, Color.red, 70, 35);
        
        setPreferredSize(new Dimension(300, 200));
        setBackground(Color.black);
        
    }
    
    @Override
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        circle1.draw(page);
        circle2.draw(page);
        circle3.draw(page);
        circle4.draw(page);
        circle5.draw(page);
    }
    
}
