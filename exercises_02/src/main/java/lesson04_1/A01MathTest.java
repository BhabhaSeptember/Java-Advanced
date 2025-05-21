package lesson04_1;

//STATIC KEYWORD & METHODS
//Static modifier used to declare fields & Methods as class-level resources
//Can be used without objcet instances
//Use when objects of same type need to share fields
//Usefule for APIs that are not object oriented e.g. java.lang.Math
//Static methods cannot access non-static members within same class
public class A01MathTest {

//All java.lang.Math methods & constants are static
//Therefore they can be called directly from class without instantiating a Math object    
    public static void main(String[] args) {
        System.out.println("Random: " + Math.random() * 10);
        System.out.println("Square root: " + Math.sqrt(9.0));
        System.out.println("Rounded random: "
                + Math.round(Math.random() * 100));
        System.out.println("Abs: " + Math.abs(-9));
    }
}
