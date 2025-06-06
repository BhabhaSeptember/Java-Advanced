package lesson07;

public class TestCacheAny {

    public static void main(String args[]) {
        CacheString myMessage = new CacheString(); // Type
        CacheShirt myShirt = new CacheShirt();     // Type

        //Generics
        CacheAny<String> myGenericMessage = new CacheAny<String>();
        CacheAny<Shirt> myGenericShirt = new CacheAny<Shirt>();

        // Add data and print
        myMessage.add("Save this for me"); // Type
        myGenericMessage.add("Save this for me"); // Generic            
        System.out.println("Generic Message is: " + myGenericMessage.get());

        myGenericShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
        System.out.println("Generic Shirt Details:" + myGenericShirt.get().toString());

    }
}
