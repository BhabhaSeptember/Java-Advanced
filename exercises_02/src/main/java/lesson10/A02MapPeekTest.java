package lesson10;

import java.util.List;

/**
 *
 * @author oracle
 */

//NOTES:
//The peek() method allows us to look at element data in the stream. After the
//method is called, all elements in the stream are returned to the stream and 
//are available to the next stream in the pipeline
//
//The peek() method performs the operation specified by the lambda expression
//and returns the elements to the stream. It is great for printing 
//intermediate results


//SUMMARY
//This class uses peek() to inspect and log intermediate stream elements 
//during processing — a useful feature for debugging or logging.
public class A02MapPeekTest {
    
    public static void main(String[] args) {

//1)Load Employee List
//Retrieve a list of test Employee objects.
        List<Employee> eList = Employee.createShortList();
                
//2)CO Executive Bonuses
//Filter for executives located in Colorado.
//Use peek() method to print the employee’s name during processing.
//Map employees to their calculated bonus.
//Print the final bonus.
        System.out.println("\n== CO Bonuses ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .peek(e -> System.out.print("(peek())Name: " 
              + e.getGivenName() + " " + e.getSurName()))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( s -> 
              System.out.printf(
                " (end stream) Bonus paid: $%,6.2f %n", s));
        
//3)Engineering Manager Bonuses
//Filter for managers in the Engineering department.
//Uses peek() to print their names before calculating bonuses
//Output the bonuses
        System.out.println("\n== Manager Bonus Report ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.MANAGER))
            .filter(e -> e.getDept().equals("Eng"))
            .peek(e -> System.out.print("(peek())Name: " 
              + e.getGivenName() + " " + e.getSurName()))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( 
                s -> System.out.printf(
                  " (end stream) Bonus paid: $%,6.2f %n", s));
    }  
}