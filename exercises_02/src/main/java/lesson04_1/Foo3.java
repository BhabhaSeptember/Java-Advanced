package lesson04_1;

//ACCESS CONTROL: GOOD PRACTICE
public class Foo3 {
//The idea is to limit access of the field 'result' to classes & subclasses within the same package
//Therefore we define a method purposefully written for package & subclass-level access    
    private int result = 20;
    
    protected int getResult() {
        return this.result;
    }
}