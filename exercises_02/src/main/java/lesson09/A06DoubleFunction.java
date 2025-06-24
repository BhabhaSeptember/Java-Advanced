package lesson09;

import java.util.function.DoubleFunction;

//PROCESS A PRIMITIVE TYPE
//This class specifies one generic type (whereas a Function takes two)
//The 'apply()' method takes a double and returns a generic type

//SUMMARY
//This class demonstrates the use of the DoubleFunction<T> functional interface in 
//Java, which accepts a double as input and returns a generic result of type T

public class A06DoubleFunction {

  public static void main(String[] args) {
        
//1)Creates an instance of the class (though it's unused here).      
    A06DoubleFunction test = new A06DoubleFunction();
      
//2)Defines a lambda expression that:
//a)Takes a double value t
//b)Multiplies it by 3
//c)Converts the result to a String
//d)Returns the string result    
    DoubleFunction<String> calc = 
          t -> String.valueOf(t * 3);
       
//3)Applies the function to the value 20 using the interfaces 'apply()' method    
    String result = calc.apply(20);
    
//4)Prints the result     
    System.out.println("New value is: " + result);        
  }      
}
