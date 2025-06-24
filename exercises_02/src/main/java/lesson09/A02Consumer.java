package lesson09;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author MikeW
 */

//A Consumer takes a generic and returns nothing. It has a single method: accept

//SUMMARY
//The A02Consumer class: Uses a Consumer<SalesTxn> to define how to print specific 
//info from each transaction.
//First it applies the consumer to all transactions using .forEach(...).
//Then demonstrates the .accept(...) method on a single object to show 
//direct invocation of interface method

public class A02Consumer {
  
  public static void main(String[] args){ 

//1)Data Setup
//A list of sales transactions is obtained
    List<SalesTxn> tList = SalesTxn.createTxnList();
    
//The first transaction is also stored separately    
    SalesTxn first = tList.get(0);
    
//2)Consumer Definition
//A Consumer is a functional interface that performs an operation on a single input 
//and returns no result.
//It’s used here to print the transaction ID and buyer’s name
    Consumer<SalesTxn> buyerConsumer = t -> 
        System.out.println("Id: " + t.getTxnId() 
            + " - Buyer: " + t.getBuyerName());
    
//3). Using the Consumer with Streams
//The code applies the consumer to every transaction in the list using a stream
//This prints the transaction ID and buyer name for each item in the list.
    System.out.println("== Buyers - Lambda");
    tList.stream().forEach(buyerConsumer);
    
//4)Using the Consumer with a Single Item
//The consumer is then used directly on the first transaction using the accpet() method    
    System.out.println("\n== First Buyer - Method");
    buyerConsumer.accept(first);
  }
}
