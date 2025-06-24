package lesson09;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author MikeW
 */

//The Supplier interface takes no parameters returns a generic type

//SUMMARY
//This code demonstrates how to use the Supplier<T> functional interface in Java, 
//which returns a value of type T without taking any input.

public class A04Supplier {
  
  public static void main(String[] args){ 

//1)List of Transactions
//A list of SalesTxn objects is created using a static method.
    List<SalesTxn> tList = SalesTxn.createTxnList();
    
//2)Supplier Definition
//A Supplier is defined to build and return a new SalesTxn object when get() is called.
//No parameters are passed
    Supplier<SalesTxn> txnSupplier = 
        () -> new SalesTxn.Builder()
            .txnId(101)
            .salesPerson("John Adams")
            .buyer(Buyer.getBuyerMap().get("PriceCo"))
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(8000)
            .txnDate(LocalDate.of(2013,11,10))
            .city("Boston")
            .state(State.MA)
            .code("02108")
            .build();
    
//3)Adding to the List
//The newly generated SalesTxn object is added to the transaction list using 
//the interfaces 'get()' method
    tList.add(txnSupplier.get());
    
//4)Printing All Transactions
//All transactions, including the new one, are printed using a method reference
//Remember: 
//SalesTxn::printSummary (uses '::' method reference operator)
//So it is equivalent to ( t -> t.printSummary() )
    System.out.println("\n== TList");
    tList.stream().forEach(SalesTxn::printSummary);
  }
}