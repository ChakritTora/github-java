/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample7_22_beatles;

import java.util.ArrayList;

/**
 *
 * @author Chakrit Tokuhara
 */
public class JavaExample7_22_Beatles {

    public static void main(String[] args) {
        ArrayList band = new ArrayList();
        band.add("Porn");
        band.add("Pet");
        band.add("Jo");
        band.add("Goft");
        
        System.out.println(band);
        
        int location = band.indexOf("Pet");
        band.remove(location);
        
        System.out.println(band);
        
        System.out.println("At index 1: " + band.get(1));
        band.add(2, "Rose");
        
        System.out.println(band);
        System.out.println("Size of the band: " + band.size());
    }
    
}
