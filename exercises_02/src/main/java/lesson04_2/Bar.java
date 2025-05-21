package lesson04_2;

import lesson04_1.Foo;

public class Bar extends Foo {
    
    private int sum = 10;
    
    
    public void reportSum() {
//result field from Foo class is declared as a protected field making it available to all subclasses, even those in a different package
        sum += result;

//num field in Foo class is declared using default access and is only available to classes and subclasses declared in the same package        
//        sum += num;  //causes compiler error
    }
}