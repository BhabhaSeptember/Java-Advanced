/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author User
 */
public class Strings {
    public static void main(String[] args) {
        
        char letter = 'a';
        
        String string1 = "Hello";
        String string2 = " World";
        String string3 = "";
        String dontDoThis = new String ("Bad Practice");
        
        string3 = string1 + string2; //concatenating strings
        
        System.out.println("Output: " + string3 + " || " + letter);
    }
    
}
