package lesson08;

import java.util.List;

/**
 *
 * @author oracle
 */

//METHOD CHAINING

public class A04IterationTest {
    
    public static void main(String[] args) {
        
        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        System.out.println("\n== CA Transations for ACME ==");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA) && 
                t.getBuyer().getName().equals("Acme Electronics"))
            .forEach(SalesTxn::printSummary);
        
        System.out.println("\n===== EXAMPLE 2 =====");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .filter(t -> t.getBuyerName()
                .equals("Acme Electronics"))
            .forEach(SalesTxn::printSummary);       
    }  
}