package lesson04_1;

//CALLING STATIC METHODS

public class A02StaticMethodTest {

//When calling static methods, we qualify the location of the method 
//with a class name if its in a different class than the caller

    public static void main(String[] args) {
//Qualifying random() method call of java.lang.Math class with Math classname       
        double d = Math.random();
 
//Qualifying printMessage method with StaticHelper classname  
//Method accessed without instantiating a StaticHelper object
        StaticHelper.printMessage("hello");
    }
}


//STATIC VARIABLES
//Developer-supplied classes are typically loaded on demand i.e. on first use
//Static variables are initialized when their enclosing class is loaded
//Accessing a static class member can trigger the loading of a class
//Static variables are a single copy therefore all istances hare a single copy of any static variable
//Static methods store data in static variables