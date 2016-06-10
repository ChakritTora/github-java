/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_9_totalsales;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_9_TotalSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales;
        String input;
        
        DecimalFormat money = new DecimalFormat("#,##0.00");
        
        input = JOptionPane.showInputDialog("For how many days do you have sales figures?");
        days = Integer.parseInt(input);
        totalSales = 0.0;
        
        for (int count = 1; count <= days; count++) {
            input = JOptionPane.showInputDialog("Enter the sales for day " + count + ":");
            sales = Double.parseDouble(input);
            
            totalSales += sales;
        }
        
        JOptionPane.showMessageDialog(null, "The total sales are " + money.format(totalSales));
        System.exit(0);
    }
    
}
