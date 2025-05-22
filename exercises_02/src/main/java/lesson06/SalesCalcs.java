package lesson06;

//JAVA INTERFACES

//Java interfaces are used to define abstract types
//They are similar to abstract class and contain only public abstract methods
//They can contain constant fields
//Can be used as a reference type

//Classes that implement interfaces must implemeent all of its methods or be declared as an abstract class
public interface SalesCalcs {
    
 //Fields in an interface are implicitly public, static and final
//It is permitted to redundantly specify these modifiers though    
  public static final String reportTitle = "\n==Static List Report==";   

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
public default void printItemData2 () {
        System.out.println("--" + this.getName() + " Report--");
        System.out.println("Sales Price: R" + this.calcSalesPrice());
        System.out.println("Cost: R" + this.calcCost());
        System.out.println("Profit: R" + this.calcProfit());
}    
  

// STATIC METHODS IN AN INTERFACE
//Static methods allow us to create helper methods in the interface instead of in a separate class  
  public static void printItemArray(SalesCalcs[] items){
    System.out.println(reportTitle);
      for(SalesCalcs item:items){
        System.out.println("--" + item.getName() + " Report--");
        System.out.println("Sales Price: " + item.calcSalesPrice());
        System.out.println("Cost: " + item.calcCost());
        System.out.println("Profit: " + item.calcProfit());
      }
  }
        
}
