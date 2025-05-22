package lesson06;

//EXTENDING INTERFACES

//Interfaces can extend interfaces

//A class that implements this interface must implement all methods of SalesCals
//..as well as the new methods of this WidgetSalesCalcs methods
public interface WidgetSalesCalcs extends SalesCalcs{
    
  public String getWidgetType();
}
