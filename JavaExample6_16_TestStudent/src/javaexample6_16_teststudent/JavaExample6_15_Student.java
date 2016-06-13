/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_16_teststudent;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_15_Student {
    private String name;
    private int test1;
    private int test2;
    private int test3;
    
    public JavaExample6_15_Student() {
        this.name = " ";
        this.test1 = 0;
        this.test2 = 0;
        this.test3 = 0;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setScore(int time, int score) {
        if (time == 1) this.test1 = score;
        else if (time == 2) this.test2 = score;
        else if (time == 3) this.test3 = score;
    }
    
    public int getScore(int time) {
        if (time == 1) return this.test1;
        else if (time == 2) return this.test2;
        else if (time == 3) return this.test3;
        else return 0;
    }
    
    public int getAverage() {
        return (this.test1 + this.test2 + this.test3) / 3;
    } 
    
    public int getHighScore() {
        if (this.test1 > this.test2) {
            if (this.test1 > this.test3) {
                return this.test1;
                
            } else return this.test3;
                
        } else if (this.test2 > this.test3) {
            return this.test2;
            
        } else return this.test3;
    }
    
    @Override
    public String toString() {
        String str;
        str = "Name:   " + this.name + "\n" + "Test 1: " + this.test1 + "\n" +
                "Test 2: " + this.test2 + "\n" + "Test 3: " + this.test3 + "\n" +
                "Average: " + this.getAverage();
        return str;
    }
}
