/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample10_1_guiwindow;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample10_1_GUIWindow {

    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("First GUI Program");
        theGUI.setSize(300, 200);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JavaExample10_2_ColorPanel panel = new JavaExample10_2_ColorPanel(Color.white);
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        theGUI.setVisible(true);
    }
    
}
