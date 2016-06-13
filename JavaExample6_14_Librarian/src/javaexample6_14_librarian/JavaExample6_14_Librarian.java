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
public class JavaExample6_14_Librarian {

    public static void main(String[] args) {
        Student student;
        LibraryCard card1, card2;
        
        student = new Student();
        student.setName("Chakrit Tokuhara");
        student.setEmail("chakrit.tora@gmail.com");
        
        card1 = new LibraryCard();
        card1.setOwner(student);
        card1.checkOut(3);
        
        card2 = new LibraryCard();
        card2.setOwner(student);
        
        System.out.println("Card1 info:");
        System.out.println(card1.toString() + "\n");
        System.out.println("Card2 info:");
        System.out.println(card2.toString() + "\n");
    }
    
}
