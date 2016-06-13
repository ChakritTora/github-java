/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample6_14_librarian;

/**
 *
 * @author Chakrit Tokuhara
 */
public class Student {
    private String name;
    private String email;
    
    public Student() {
        this.name = "Unassigned";
        this.email = "Unassigned";
        
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
