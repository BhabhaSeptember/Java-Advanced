package lesson10;

import java.util.List;

/**
 *
 * @author oracle
 */

//NOTES:
//The map method is used to extract data from a field and perorm a calculation
//or operation. The results of the mapping operation are returned as a stream
//A map takes one Function as an argument. A Function takes one generic and
//returns something else


//SUMMARY
//This code demonstrates Java Stream API in action to calculate employee 
//bonuses using filtering and mapping operations on a list of Employee objects


public class A01MapTest {
    
    public static void main(String[] args) {

//1)Retrieve a predefined list of employees       
        List<Employee> eList = Employee.createShortList();
                      
//2)Bonuses for Executives in Colorado(CO)   
//Filter for employees who are EXECUTIVES and live in Colorado.
//Map their salary to a calculated bonus based on role.
//Print each bonus
        System.out.println("\n== CO Bonuses ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( s -> System.out.printf("Bonus paid: $%,6.2f %n", s));
        
//3)Bonuses for Engineering Managers
//Filter for employees who are MANAGERS in the Engineering department.
//Compute bonuses based on their role.
//Print the result
        System.out.println("\n== Eng Manager Bonus ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.MANAGER))
            .filter(e -> e.getDept().equals("Eng"))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( 
                s -> System.out.printf("Bonus paid: $%,6.2f %n", s)
            );

    }
    
}