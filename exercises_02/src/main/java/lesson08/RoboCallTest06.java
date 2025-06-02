package lesson08;

import java.util.List;

/**
 *
 * @author MikeW
 */

//COLLECTION ITERATION & LAMBDAS

public class RoboCallTest06 {
  
  public static void main(String[] args){ 

    List<Person> pl = Person.createShortList();
    
    System.out.println("\n=== Print List ===");
    
//forEacch method has been added to all collections which makes iteration easier
//Collection interface extends Iterable interface...
//...Iterable interface defines forEach method
    pl.forEach(p -> System.out.println(p));
        
  }
}
