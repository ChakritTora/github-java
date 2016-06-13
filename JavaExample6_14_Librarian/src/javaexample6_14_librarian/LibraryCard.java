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
public class LibraryCard {
    private Student owner;
    private int borrowCount;
    
    public LibraryCard() {
        this.owner = null;
        this.borrowCount = 0;
    }
    
    public void checkOut(int numOfBooks) {
        this.borrowCount += numOfBooks;
    }
    
    public int getNumberOfBooks() {
        return this.borrowCount;
    }
    
    public void setOwner(Student student) {
        this.owner = student;
    }
    
    public String getOwnerName() {
        return owner.getName();
    }
    
    public String toString() {
        return "Owner Name: " + owner.getName() + "\n" +
               "      Email: " + owner.getEmail() + "\n" +
               "      Books borrowed: " + this.borrowCount;
    }
}
