/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_3_rectangle2;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_3_Rectangle2 {

    private double length;
    private double width;
    
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
