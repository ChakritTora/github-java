/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample10_13_simpleapplet;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample10_13_SimpleApplet extends JApplet {

    @Override
    public void init() {
        JLabel label = new JLabel("This is my very first applet.");
        setLayout(new FlowLayout());
        add(label);
    }
    
}
