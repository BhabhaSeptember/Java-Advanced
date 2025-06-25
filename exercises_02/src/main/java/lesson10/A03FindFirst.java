package lesson10;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */

//NOTES: 
//The findFirst() method of the Stream class fins the first element in the 
//stream specified by the filters in the pipeline. The method is a terminal,
//short-circuit operation meaning, intermediate operations are performed
//in a lazy manner, resulting in more efficient processing of the data in
//the stream whereas terminal operations end the processing of a pipeline

//SUMMARY
//This code demonstrates how to retrieve the first matching element from a stream 
//using the findFirst() method

public class A03FindFirst {
    
    public static void main(String[] args) {
        
//1)Load a list of employees
        List<Employee> eList = Employee.createShortList();
        
//2)Stream processing       
//Filter employees who are executives and located in Colorado (CO).
//Find the first matching employee (if any)
        System.out.println("\n== First CO Bonus ==");
        
        Optional<Employee> result = eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .findFirst();
        
//3)Check and print the result
//If a matching employee is found, their details are printed
        if (result.isPresent()){
            result.get().print();
        }
        
    }
    
}
