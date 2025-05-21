/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author User
 */
public class StringOperations {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("1. String sb: " + sb);
        sb.append(" world");
        System.out.println("2. String sb: " + sb);
        
        sb.append("!").append(" are").append(" you?");
        System.out.println("3. String sb: " + sb);
        
        sb.insert(12, " How");
        System.out.println("4. String sb: " + sb);
        
//Get length
System.out.println("5. Length of sb: " + sb.length());

//Get Substring
System.out.println("6. Substring of sb: " + sb.substring(0, 5));
        
    }
    
}
