package lesson08;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class RoboCallTest07 {
  
  public static void main(String[] args){ 

    List<Person> pl = Person.createShortList();
    RoboCall05 robo = new RoboCall05();    
    
    System.out.println("\n=== Calling all Drivers Lambda ===");
    
//Using stream() method opens new operations on collections e.g. filter() method
//Filter method takes Predicate as a params and filters result
//Only collection elements matching Predicate criteria are returned to forEach loop
    pl.stream()
        .filter(p -> p.getAge() >= 23 && p.getAge() <= 65)
        .forEach(p -> robo.roboCall(p));
    
  }
}
