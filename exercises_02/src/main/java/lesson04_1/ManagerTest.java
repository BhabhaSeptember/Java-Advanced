package lesson04_1;

//INVOKING AN OVERRIDDEN METHOD
public class ManagerTest {

    public static void main(String args[]) {

        Manager mgr = new Manager(151, "Bhabha", "444-44-4444", 8000, "IT");

//If we comment out the overridden getDetails method in the subclass(Manager), then the superclass(Employee) method will be executed
        System.out.println("Manager: " + mgr.getDetails());

        
//VIRTUAL METHOD INVOCATION - POLYMORPHISM
//Compiler checks that each method & field is accessible based on strict definition of class
//Behavior of object is determined at runtime

//Therefore we create a Manager object then at runtime, the Manager getDetails method is invoked
//Even though the variable e is of type Employee (compiler checks if the Manager object can be of type Employee) but at run time it behaves as a Manager object
        Employee e = new Manager(102, "Bhabha September", "012-23-4567", 110_450.54, "IT");

        System.out.println(e.getDetails());
    }
}
