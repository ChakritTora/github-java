/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5_11_testover1;

/**
 *
 * @author Maewdamn
 */
public class JavaExample5_11_TestOver1 {

    public static int add() {
        return 0;
    }
    
    public static int add(int x) {
        return x;
    }
    
    public static int add(int x, int y) {
        return x+y;
    }
    
    public static int add(int x, int y, int z) {
        return x+y+z;
    }
    
    public static void main(String[] args) {
        System.out.println("Sum = " + add());
        System.out.println("Sum = " + add(3));
        System.out.println("Sum = " + add(2, 5));
        System.out.println("Sum = " + add(2, 3, 4));
    }
    
}
