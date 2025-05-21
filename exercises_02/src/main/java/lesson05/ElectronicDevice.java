package lesson05;

//DEFINING ABSTRACT CLASSES

//We declare abstract classes with abstract keyword
//Abstract classes can be subclassed and used as a reference type
//But they cannot be instantiated
public abstract class ElectronicDevice {
 
    
//Declaring the methods below as abstract with the abstract keyword
//The methods have no body
//They are overridden in subclasses    
    public abstract void turnOn();
    
    public abstract void turnOff();
    
    
//Abstract classes can have both abstract & non-abstract classes    
    
}
