package lesson04_1;

//USING STATIC VARIABLES
public class A03StaticCounterTest {

    public static void main(String[] args) {

//Access a static variable from a different by qualifying it with the classname        
        StaticCounter.getCount();
        System.out.println("Start: " + StaticCounter.getCount());
        StaticCounter.increment();
        StaticCounter.increment();
        StaticCounter.getCount();
        System.out.println("End: " + StaticCounter.getCount());
    }
}
