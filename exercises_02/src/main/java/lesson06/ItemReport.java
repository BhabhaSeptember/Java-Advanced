package lesson06;

//INTERFACE CODE FLEXIBILITY


public class ItemReport {

//This is a utility class that references the interface so it can process any implementing class
//Hence the below method can retrieve the data below from the three classes
//This prevents repeating this type of method in each class    
    public void printItemData(SalesCalcs item) {
        System.out.println("--" + item.getName() + " Report--");
        System.out.println("Sales Price: R" + item.calcSalesPrice());
        System.out.println("Cost: R" + item.calcCost());
        System.out.println("Profit: R" + item.calcProfit());
    }

}
