package lesson08;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A03IterationTest {
    
    public static void main(String[] args) {
        
        List<SalesTxn> tList = SalesTxn.createTxnList();
                      
        System.out.println("\n== CA Transations Lambda ==");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .forEach(SalesTxn::printSummary);    
    }   
}
