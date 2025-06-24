package lesson09;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */

//SUMMARY
//This class demonstrates how to use a predicate to filter items from a list using
//two approaches: a stream-based (functional) approach and a traditional for-loop. 
//The goal is to filter sales transactions (represented by the SalesTxn objects) 
//that occurred in a specific state (in this example, Massachusetts, represented by 
//State.MA).
public class A01Predicate {
  
  public static void main(String[] args){ 
      
//1) Data Source
//The code obtains a list of sales transactions by calling: SalesTxn.createTxnList().
//This list (tList) holds instances of SalesTxn, each of which contains information 
//about a sales transaction (including a state)
    List<SalesTxn> tList = SalesTxn.createTxnList();

//2) Predicate Definition
//A predicate in Java is a functional interface with a single method test(T t) that 
//returns a boolean.
//Here, a predicate called massSales is defined using a lambda expression:   
//This predicate takes a SalesTxn object and returns true if the transaction’s state 
//equals State.MA (meaning it occurred in Massachusetts) and false otherwise.
    Predicate<SalesTxn> massSales = t -> t.getState().equals(State.MA);
    
    
//3) Filtering with Streams
//The code first demonstrates using Java 8 streams to filter the transactions:
//a) tList.stream() creates a stream from the list.
//b) .filter(massSales) uses the defined predicate to filter the transactions.
//c) .forEach(t -> t.printSummary()) applies an action (printing a summary of the sale)
//on each transaction that matches the predicate.
    System.out.println("\n== Sales - Stream");
    tList.stream()
        .filter(massSales)
        .forEach(t -> t.printSummary());
    
    
//4) Filtering with a Traditional For Loop
//Next, the code shows how to achieve the same result using a traditional loop:  
//For each transaction in the list, it calls massSales.test(t).
//If the test returns true (meaning the transaction is from MA), 
//then t.printSummary() is called to print the transaction summary
    System.out.println("\n== Sales - Method Call");    
    for(SalesTxn t:tList){

        if (massSales.test(t)){
            t.printSummary();
        }
    }
  }
}

