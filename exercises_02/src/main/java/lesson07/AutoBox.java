package lesson07;

//AUTOBOXING AND UNBOXING

//Simplifies syntax
//Produces cleaner, easier-to-read code

//SUMMARY: 
//Autoboxing & unboxing in Java is where there is automatic conversion between
//...primitive types and their wrapper classes

public class AutoBox {

    public static void main(String[] args) {
        Integer intObject = new Integer(1);
        int intPrimitive = 2;

        Integer tempInteger;
        int tempPrimitive;
        
//Example 1 :
//Boxing manually : (converting a primitve into an object)
        tempInteger = new Integer(intPrimitive); 
        
//Unboxing manually : (converting object to its primitive type)        
        tempPrimitive = (int) intObject.intValue(); 
//
//
//
//EXAMPLE 2 : 
//Autoboxing and auto-unboxing enable us to make sensible assignments without formal casting syntax as above
//Java provides the casts at compile time
//Autoboxing: int -> Integer 
        tempInteger = intPrimitive; 
        
//Auto-unboxing: Integer -> int        
        tempPrimitive = intObject; 

        System.out.println("Integer: " + tempInteger + " int: " + tempPrimitive);
    }
}
