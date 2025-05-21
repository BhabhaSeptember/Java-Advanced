package lesson04_1;

//IMPLEMENTING STATIC METHODS

import java.time.LocalDate;

public class StaticHelper {
  
//Use static keyword before the method to declare it as a static method
//Care must be taken with static methods because they can be used before any instances of their enclosing class has been created
//Meaning the static context cannot access any instance components of the class
    
    public static void printMessage(String message) {
        System.out.println("Messsage for " +
         LocalDate.now() + ": " + message);
    }
    
}