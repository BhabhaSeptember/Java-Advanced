package lesson10;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */

//NOTES:
//The anyMatch() method returns whether any elements of this stream match the 
//provided predicate. The method may not evaluate the predicate on all elements if
//it is not necessary for determining the result. If the stream is empty, false is 
//returned and the predicate is not evaluated. This is a short-cicuiting terminal
//operation

//SUMMARY
//This class demonstrates the use of anyMatch() and findFirst() with Java Streams to 
//conditionally retrieve and display the first Colorado-based executive employee.
public class A05AnyMatch {
    
    public static void main(String[] args) {
//1)eList: A list of Employee objects is created using Employee.createShortList()        
      List<Employee> eList = Employee.createShortList();
        
      System.out.println("\n== First CO Bonus ==");

//2)Check if any employee's state is "CO". If none are from CO, the program ends early 
//and doesn't perform further processing.
//If CO employees exist: A second stream is created:
//a)peek(...): Prints "Stream" for every item processed (for debugging/observation).
//b)filter(...): Filters for EXECUTIVE role and CO state.
//c)findFirst(): Returns the first matching Executive in CO, wrapped in an Optional.
      if (eList.stream().anyMatch(
          e -> e.getState().equals("CO"))){
            
        Optional<Employee> result = eList.stream()
          .peek(e -> System.out.println("Stream"))
          .filter(e -> e.getRole().equals(Role.EXECUTIVE))
          .filter(e -> e.getState().equals("CO"))
          .findFirst();

//3)If a matching Executive is found, their summary is printed using printSummary()        
        if (result.isPresent()){result.get().printSummary();}
      }
                
    }
    
}
