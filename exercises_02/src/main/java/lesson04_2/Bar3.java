package lesson04_2;

import lesson04_1.Foo3;

public class Bar3 extends Foo3 {
    
    private int sum = 10;
    
    public void reportSum() {
        sum += getResult();
    }
}