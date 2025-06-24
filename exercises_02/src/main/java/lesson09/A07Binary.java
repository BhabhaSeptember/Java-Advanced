package lesson09;

import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author MikeW
 */

//The binary version of the standard interfaces allows two generic types as input.
//In this example, the BiPredicate takes two parameters and returns a boolean

//SUMMARY
//This class demonstrates how to use the BiPredicate<T, U> functional interface to 
//test a condition involving two inputs

public class A07Binary {
  
  public static void main(String[] args){ 

//1)Retrieves a list of sales transactions.
//Gets the first transaction.
//Sets a test state value ("CA")
    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);            
    String testState = "CA";
    
//2)Defines a bi-predicate that:
//Takes a SalesTxn and a String
//Returns true if the transaction’s state string matches the provided state string (s)
//Here the provided state string (s) is "CA"
    BiPredicate<SalesTxn,String> stateBiPred = 
      (t, s) -> t.getState().getStr().equals(s);
    
//3)Prints whether the first transaction’s state is "CA" using the interfaces 'test()'
//method
    System.out.println("\n== First is CA?");
    System.out.println("Is first transactions state from CA: " + 
      stateBiPred.test(first, testState));
  }
}
