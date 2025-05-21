package lesson04_1;

public class VirtualInvokeTest01 {

//Think: Inheritance 
//Virtual method invocation or late-binding, enables a caller to dynamically call a method
//As long as the method has been declared in a generic class base type
    
  public static void main(String[] args) {
    Employee e = new Employee(101, "Jim Smith", 
        "011-12-2345", 100_000.00);
    Manager m = new Manager(102, "Joan Kern", 
        "012-23-4567", 110_450.54, "Marketing");
    
    System.out.println(e.getDetails());
    System.out.println(m.getDetails()); //the virtual method(?)
  }
}
