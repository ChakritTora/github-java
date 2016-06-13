/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_21_arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_21_ArrayListDemo {

    public static void main(String[] args) {
        ArrayList nameList = new ArrayList();
        nameList.add("Twat");
        nameList.add("Java");
        nameList.add("Micro");
        
        System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");
        for (int index=0; index<nameList.size(); index++) {
            System.out.println(nameList.get(index));
        }
    }
    
}
