package lesson04_1;

/**
 *
 * @author anshenoy
 */
public class EmployeeTest {

    public static void main(String args[]) {

        Employee emp1 = new Employee(121, "Bhabha", "111-11-1111", 5000);
        System.out.println("Employee 1:  " + emp1.getDetails());
        
        System.out.println("");
        
        Employee emp2 = new Employee(122, "Tracy", "222-22-2222", 6000);
        System.out.println("Employee 2:  " + emp2.getDetails());

    }
}
