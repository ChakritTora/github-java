/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample11_3_personsearch;

import java.util.Scanner;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample11_3_PersonSearch {

    public static void main(String[] args) {
        String lookUp;
        String[] people = {"Somboon, jack", "Anong, anong",
            "Anong, ao", "Aikapun, ake", "Aikachai, ake", "Piya, ya",
            "Piyaporn, oil", "Sukanya, su", "Sukanya, Brad", "Teera, tee"
        };
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the characters of the last name to look up: ");
        lookUp = scan.nextLine();
        System.out.println("Here are the names that match: ");
        for (String person : people) {
            if (person.startsWith(lookUp)) {
                System.out.println(person);
            }
        }
    }
    
}
