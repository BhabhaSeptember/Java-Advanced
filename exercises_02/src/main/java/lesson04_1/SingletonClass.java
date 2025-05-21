package lesson04_1;

//SINGLETON DESIGN PATTERN

//A design pattern whose class implementation can be instantiated only once
//i.e. only one instance can be created and provides global point of access to this instance

//Provide unique source of data/functionality ot other Java Objects

public class SingletonClass {

//We implement singleton design pattern with static & final reference 
//Ensuresit will never reference a different instance
    
    private static final SingletonClass instance
            = new SingletonClass();

//Also add a single private constructor to allow only 'same class' access    
    private SingletonClass() {
    }

//Add a public factory method to return copy of singleton reference    
    public static SingletonClass getInstance() {
        return instance;
    }
}
