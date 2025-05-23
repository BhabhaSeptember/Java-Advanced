package lesson07;

//MAP INTERFACE

//A collection that stores multiple key-value pairs
//Key: Unique identifier for each element in a collection
//Value: A value stored in the element associated with the key

//Also called associative arrays

//Map interface represents mappings and not a collection of objects...
//...so they do not extend the Collection interface

import java.util.Map;
import java.util.Set;
import java.util.TreeMap; //implementation of Map Interface

public class MapExample {
    public static void main(String[] args){      
        Map <String, String> partList = new TreeMap<>(); //keys are automatically sorted in TreeMap implementation of Map Interface
        
//Key value pairs (S001 - key & Blue Polo Shirt - value)        
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Polo Shirt");
        partList.put("H002", "Duke Hat");
        
        partList.put("S002", "Black T-Shirt"); //Overwrite a value
        
        Set<String> keys = partList.keySet();
        
        System.out.println("=== Part List ===");
        for (String key : keys){
             System.out.println("Key: " + key + " || Value: " + partList.get(key));
            
            
        }
        
        
    }
}
