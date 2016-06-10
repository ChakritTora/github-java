/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4_6_testloopbreak;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample4_6_TestLoopBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 100;
        for (int i=1; i<=num; i++) {
            System.out.println(i);
            if (i >= 10) {
                break;
            }
        }
    }
    
}
