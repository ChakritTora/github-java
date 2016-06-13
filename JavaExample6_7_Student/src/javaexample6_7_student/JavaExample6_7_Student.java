/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_7_student;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample6_7_Student {

    private String id;
    private String name;
    private double gpa;
    
    public void setDetails(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    
    public void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        
    } 
    
    public static void main(String[] args) {
        JavaExample6_7_Student student1 = new JavaExample6_7_Student();
        JavaExample6_7_Student student2 = new JavaExample6_7_Student();
        
        student1.setDetails("02137", "SOMCHAI CHAIDEE", 3.62);
        student2.setDetails("02138", "SAHARAT PITAKKRAI", 3.29);
        
        student1.showDetails();
        System.out.println();
        student2.showDetails();
    }
    
}
