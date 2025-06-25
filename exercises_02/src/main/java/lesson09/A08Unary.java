package lesson09;

import java.util.List;
import java.util.function.UnaryOperator;

/**
 *
 * @author MikeW
 */

//The UnaryOperator interface takes a class as input and returns an object of
//the same class

//SUMMARY
//This class demonstrates the use of the UnaryOperator<T> functional interface to 
//transform a single input of type T and return the same type.

public class A08Unary {
  
  public static void main(String[] args){ 

//1)Creates a list of sales transactions.
//Retrieves the first transaction from the list.      
    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
      
//2)Defines a UnaryOperator that converts a string to uppercase.    
    UnaryOperator<String> unaryStr = 
        s -> s.toUpperCase();
    
//3)Applies the operator to the buyer’s name of the first transaction using the 
//interfaces 'apply()' method
//Prints the uppercase version of the buyer's name    
      System.out.println("== Upper Buyer");
      System.out.println(
          unaryStr.apply("Buyers Name: " + first.getBuyerName()));
  }
}
