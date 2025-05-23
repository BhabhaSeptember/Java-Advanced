package lesson07;

//SET INTERFACE
//A Set is an interface that contains only unique elements
//It has no index
import java.util.Set;
import java.util.TreeSet; //TreeSet provides sorted implementation

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three"); //will not be added because Sets do not allow duplicates

        for (String item : set) {
            System.out.println("Item: " + item);
        }

    }
}
