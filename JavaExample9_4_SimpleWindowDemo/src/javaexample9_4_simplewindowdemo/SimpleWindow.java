/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample9_4_simplewindowdemo;

import javax.swing.JFrame;

/**
 *
 * @author Chakrit Tokuhara
 */
public class SimpleWindow extends JFrame {
    
    public SimpleWindow() {
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;
        setTitle("A Simple Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }

}
