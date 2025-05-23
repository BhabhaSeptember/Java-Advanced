package lesson07;

//ARRAYLIST WITHOUT GENERICS
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OldStyleArrayList {

    public static void main(String args[]) {
//Declare and initialize a partList ArrayList with no type definition
        List partList = new ArrayList(3);

//Adding items to ArrayList.Any type of object can be placed in this list 
//since type is not specified in the definition    
        partList.add(new Integer(1111));
        partList.add(new Integer(2222));
        partList.add(new Integer(3333));
//        partList.add("Oops a string!");

        Iterator elements = partList.iterator();
//Iterator used to iterate through list of items 

        while (elements.hasNext()) {
//While loop continues until there are no more objects/elements in the arrayList to iterate through    

            Integer partNumberObject = (Integer) (elements.next());
//Object in list is cast to an Integer object
//An error would occur with the final element because it is of type String
//i.e. ClassCastException

            int partNumber = (int) partNumberObject.intValue();
//Integer object cast/unboxed into it's primitive type

            System.out.println("Part number: " + partNumber);
        }
    }
}
