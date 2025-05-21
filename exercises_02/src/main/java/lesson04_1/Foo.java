package lesson04_1;

//PROTECTED ACCESS CONTROL: EXAMPLE
public class Foo {
    
//Protected access modifier provides access within package & subclasses in another package    
    protected int result = 20;
 
//Below has default access modifier aka package level access. 
//Only accessible within the same class or package
//Canot be subclassed outside its package    
    int num = 10;
}