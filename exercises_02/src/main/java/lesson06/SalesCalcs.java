package lesson06;

//JAVA INTERFACES

//Java interfaces are used to define abstract types
//They are similar to abstract class and contain only public abstract methods
//They can contain constant fields
//Can be used as a reference type

//Classes that implement interfaces must implemeent all of its methods or be declared as an abstract class
public interface SalesCalcs {

//Interface methods are not implemented i.e. no curly braces allowed
//Method signature specifies what is passed in & what is returned
//All methods must be public and are implicitly abstract    
    public String getName();

    public double calcSalesPrice();

    public double calcCost();

    public double calcProfit();
    
    
//DEFAULT METHODS IN INTERFACES
//Default methods in interfaces allows for fully implemented methods to be provided to all implementing classes
//Instead of having a separate utility class like ItemReport    
public default void printItemData2 (SalesCalcs item) {
        System.out.println("--" + item.getName() + " Report--");
        System.out.println("Sales Price: R" + item.calcSalesPrice());
        System.out.println("Cost: R" + item.calcCost());
        System.out.println("Profit: R" + item.calcProfit());
    }    
}
