package lesson07;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {  
  public static void main(String args[]){
 
//ArrayList is assigned to List type with type specified as Integer
//That prevents non-integer elements from being added to the list completely
    List<Integer> partList = new ArrayList<>(3);
    
    partList.add(new Integer(1111));
    partList.add(new Integer(2222));
    partList.add(new Integer(3333));
    partList.add(new Integer(4444)); // Arraylist auto grows

    System.out.println("First Part: " + partList.get(0)); // First item
    partList.add(0, new Integer(5555)); // Insert an item by index
    
//     partList.add("Bad Data");  // compile error now
    
    
// Print List

    for (Integer partNumberObj : partList){
        
//No casting required/Demonstrates auto-unboxing.
      int partNumber = partNumberObj; 
      
      System.out.println("Part number: " + partNumber);  
    } 
    
  }
}



