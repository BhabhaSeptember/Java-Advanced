package lesson08;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class RoboCallTest08 {
  
  public static void main(String[] args){ 

    List<Person> pl = Person.createShortList();
    RoboCall05 robo = new RoboCall05();
    
// Predicates
//Storing lambda expression in a variable to be used or reused later    
    Predicate<Person> allPilots = 
        p -> p.getAge() >= 23 && p.getAge() <= 65;
    
    System.out.println("\n=== Calling all Drivers Variable ===");
    pl.stream().filter(allPilots) //using lambda expression variable
        .forEach(p -> robo.roboCall(p));       
  }
}
