
package lesson04_1;

//DEFINING STATIC VARIABLES

public class StaticCounter {    
    
//Static variables are defined with the static keyword preceding the type definition     
    private static int counter = 0;
    
    public static int getCount() {
        return counter;
    }
    
    public static void increment(){
      counter++;
    }
}