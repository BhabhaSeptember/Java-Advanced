/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author User
 */
public class ArrayOperations {
    public static void main(String[] args) {
        
        String[] names = new String[3];
        
        names[0] = "Blue Shirt";
        names[1] = "Red Shirt";
        names[2] = "Black Shirt";
        
        int[] numbers = {100, 200, 300};
        
        for (String name: names) {
            System.out.println("Name: " + name);
        }
        
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
    
}
