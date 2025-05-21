package lesson05;

public class Caller {
    
    public static void main(String[] args) {
    
//Below code results in compiler error because ElectronicDevice is an abstract class and therefore cannot be instantiated        
//         ElectronicDevice dev = new ElectronicDevice();//compiler error
       

ElectronicDevice dev2 = new Television();
        dev2.turnOn();

    }
}