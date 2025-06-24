package lesson09;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author MikeW
 */

//Function takes one generic type and returns another. 
//The input type is declared first in the list, then the return type.
//The interface's 'apply()' method takes a T and returns an R


//SUMMARY
//This code demonstrates how to use the Function<T, R> functional interface in Java, 
//which takes an input of type T and returns a result of type R.

public class A03Function {
  
  public static void main(String[] args){ 

//1)Data Setup
//A list of SalesTxn objects is created.
//The first transaction in the list is stored in the first variable.
    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
        
//2)Function Definition
//This function takes a SalesTxn object and returns the buyer's name (String).
//This is the essence of Function<T, R>: input is SalesTxn, output is String.
    Function<SalesTxn, String> buyerFunction = 
        t -> t.getBuyerName();
    
//3)Function Application
//The function is applied to the first transaction by calling its apply() method
//It prints the buyer’s name of that transaction.
    System.out.println("\n== First Buyer");
    System.out.println("Buyer's Name: " +buyerFunction.apply(first));      
  }
}