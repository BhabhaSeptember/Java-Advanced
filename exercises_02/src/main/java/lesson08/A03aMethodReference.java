package lesson08;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A03aMethodReference {
    
    public static void main(String[] args) {
        
        List<SalesTxn> tList = SalesTxn.createTxnList();
                      
        System.out.println("\n== CA Transations Lambda ==");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .forEach(t -> t.printSummary()); 
        
        System.out.println("\n===== Example 2 =====");
//:: is method reference operator,
//a shorthand notation to call method/constructor by reference instead of full lambda expression
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .forEach(SalesTxn::printSummary); //class name then call method (same as line 18 above)
    }   
}
