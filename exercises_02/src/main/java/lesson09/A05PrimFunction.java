package lesson09;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author MikeW
 */

//RETURNING A PRIMITIVE TYPE
//There are primitive versions of all main interfaces
//They return a primitive and consume a primitive
//They are provided to avoid negative performance consequences of auto-boxing & unboxing

//SUMMARY
//The code demonstrates how to use functional interfaces: 
//(ToDoubleFunction and Function) to calculate discount and tax on a SalesTxn object

public class A05PrimFunction {
  
  public static void main(String[] args){ 

//1)Retrieves a list of sales transactions.
//Grabs the first transaction from the list.      
    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
           
//2)Using ToDoubleFunction<SalesTxn>:
//Defines a lambda that calculates discount amount.
//ToDoubleFunction<T> is a functional interface that takes a T (here, SalesTxn) and 
//returns a primitive double
    ToDoubleFunction<SalesTxn> discountFunction = 
        t -> t.getTransactionTotal() 
            * t.getDiscountRate();
    
//3)Applies the discount function using the interfaces 'applyAsDouble()' method 
//to the first transaction and prints the result.    
    System.out.println("\n== Discount");
    System.out.println("Discount Amount: R" + 
        discountFunction.applyAsDouble(first));

//4)This is a regular Function<T, R> that returns a Double object (not a primitive)
    Function<SalesTxn, Double> taxFunction = 
        t -> t.getTransactionTotal() * t.getTaxRate();
    
//This compiles and runs fine because Java autounboxes the Double to a double but
//ToDoubleFunction would be more efficient, avoiding unnecessary boxing/unboxing
    double tax = taxFunction.apply(first);   
  }
}
