/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_9_rectangle3;

/**
 *
 * @author Maewdamn
 */
public class JavaExample6_9_Rectangle3 {

    private double length;
    private double width;
    
    public JavaExample6_9_Rectangle3(double length, double width) {
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
