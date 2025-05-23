package lesson07;

//SIMPLE CACHE CLASS WITHOUT GENERICS

public class CacheString {
  
    private String message;
  
    public void add(String message){
        this.message = message;
    }
  
    public String get(){
        return this.message;
    }  
  
}
