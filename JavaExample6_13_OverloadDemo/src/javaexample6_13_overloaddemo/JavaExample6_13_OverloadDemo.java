/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_13_overloaddemo;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_13_OverloadDemo {

    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2, 4);
        
        System.out.println("t1.x = " + t1.x);
        System.out.println("t2.x = " + t2.x);
        System.out.println("t3.x = " + t3.x);
        System.out.println("t4.x = " + t4.x);
    }
    
}

class MyClass {
    int x;
    
    MyClass() {
        System.out.println("Inside MyClass()");
        x = 0;
    }
    
    MyClass(int i) {
        System.out.println("Inside MyClass(int i)");
        x = i;
    }
    
    MyClass(double d) {
        System.out.println("Inside MyClass(double d)");
        x = (int)d;
    }
    
    MyClass(int i, int j) {
        System.out.println("Inside MyClass(int i, int j)");
        x = i * j;
    }
}
