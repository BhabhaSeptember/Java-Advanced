package lesson07;

//GENERIC CACHE CLASS

//To create a generic class, add variable name <T> which stands for type
//Types are declared with the letter T so the class can store any type of object

public class CacheAny <T>{
      
    private T t; 
  
    public void add(T t){
        this.t = t;
    }
  
    public T get(){
        return this.t;
    }  
}
