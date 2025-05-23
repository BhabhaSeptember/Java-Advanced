package lesson07;

//GENERICS WITH TYPE INFERENCE DIAMOND

public class TestCacheAnyDiamond {
    
    public static void main(String args[]){
        //Generics
//On the right side of the statement we use empty angle brackets to indicate that type params are mirrored        
        CacheAny<String> myGenericMessage = new CacheAny<>(); 
        CacheAny<Shirt> myGenericShirt = new CacheAny<>(); 
 
        // Add data and print
        myGenericMessage.add("Save this for me"); // Generic            
        System.out.println("Diamond Infr Message is: " + myGenericMessage.get());        
        
        myGenericShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
        System.out.println("Diamond Infr Shirt Details:" + myGenericShirt.get().toString());
    }
}
