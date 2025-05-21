package lesson05;

//FINAL VARIABLES

//Final variables can never have their values modified after initializing preventing bugs in program
//Immutability of final variables prevents issues with concurrent access by multiple-threads
//It prevents reference from pointing to another object and being null
//Also preventing object from being available for garbage collection

import java.util.Date;

public class VariableExampleClass {

//Final fields(instance variables) must be assigned a value when declared or...
//..assigned a value in every constructor   
    
    private final int field;
    
//    private final int forgottenField; //hasnt been initialized with a value nor assigned one in constructor therefore 
    
    private final Date date = new Date(); //initializing a final instance variable with a value
    
    
    public static final int JAVA_CONSTANT = 10;

    public VariableExampleClass() {
        field = 100; //assigning final instance field a value in constructor
    }

    public void changeValues(final int param) {
//        param = 1; // compile time error

//Final references must always reference the same object
        date.setTime(0); // allowed
//        date = new Date(); // compile time error


//Final reference contents may not be modified
        final int localVar;
        localVar = 42;
//        localVar = 43; // compile time error
    }
}
