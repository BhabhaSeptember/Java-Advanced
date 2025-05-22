package lesson06;

//IMPLEMENTING & EXTENDING

//Classes can extend a parent class & implement an interface
//In that case, the extends keyword comes first

public class WidgetPro extends Widget implements WidgetSalesCalcs{
  private String type;
  
  public WidgetPro(double salesPrice, double cost, long quantity, String type){
    super(salesPrice, cost, quantity);
    this.type = type;
  }
  
//Overriding method from WidgeSalesCalcs interface  
  @Override
  public String getWidgetType(){
    return type;
  }
  
}
