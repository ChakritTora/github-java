/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample9_2_guiwindow;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample9_2_GUIWindow {

    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("First GUI Program");
        theGUI.setSize(300, 200);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        theGUI.setVisible(true);
    }
    
}
