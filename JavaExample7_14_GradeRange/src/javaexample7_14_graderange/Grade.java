/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_14_graderange;

/**
 *
 * @author Chakrit Tokuhara
 */
public class Grade {
    private String name;
    private int lowerBound;
    
    public Grade (String grade, int cutoff) {
        this.name = grade;
        this.lowerBound = cutoff;
    }
    
    public String toString() {
        return this.name + "\t" + this.lowerBound;
    }
    
    public void setName(String grade) {
        this.name = grade;
    }
    
    public void setLowerBound(int cutoff) {
        this.lowerBound = cutoff;
    }
    
    public String getName() {
        return name;
    }
    
    public int getLowerBound() {
        return lowerBound;
    }
    
}
