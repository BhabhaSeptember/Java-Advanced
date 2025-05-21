package lesson04_1;

//STATIC IMPORTS

//Static imports make static members of the class available under their simple name
import static java.lang.Math.*;

public class A05StaticImportTest {

//Static import above allows Math.random() method to be called without classname    
    public static void main(String[] args) {
        System.out.println("Random: " + random() * 10);
    }
}
