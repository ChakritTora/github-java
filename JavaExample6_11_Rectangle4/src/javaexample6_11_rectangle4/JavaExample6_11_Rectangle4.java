/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_11_rectangle4;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_11_Rectangle4 {

    private double length;
    private double width;
    
    public JavaExample6_11_Rectangle4() {
        this.length = 0.0;
        this.width = 0.0;
    }
    
    public JavaExample6_11_Rectangle4(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public double getArea() {
        return this.length * this.width;
    }
    
}
