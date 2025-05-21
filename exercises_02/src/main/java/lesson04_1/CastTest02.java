package lesson04_1;

//UPWARD & DOWNWARD CASTING RULES
public class CastTest02 {

    public static void main(String[] args) {
//EXAMPLE1:    
//Upward casts are always permitted and do not require a cast operator
//NOTE: Director extends Manager, and Manager extends Employee
Employee e = new Employee(102, "Joan Kern",
                "012-23-4567", 110_450.54); 
Manager m = new Manager(102, "Lisa Kudrow",
                "012-23-4567", 110_450.54, "Marketing"); 
Director d = new Director(102, "Chandler Bing",
                "012-23-4567", 110_450.54, "Marketing", "Spar"); 

Employee e2 = (Manager) e; //compilable
Manager m2 = (Director) m; //compilable
Employee e2_1 = (Director) e; //compilable

//Think of: 
//A Manager object is an employee, but an Employee object is not a Manager
//A Director is a manager, but a Manager is not a Director
//Manager m3 = (Employee) m; //compiler error
//Director d3 = (Manager) d; //compiler error

//EXAMPLE2: 
//For downward casts, the compiler myst ensure that a cast is possible
//NOTE: Manager and Engineer both extend Employee only

        Employee emp = new Manager(102, "Joan Kern",
                "012-23-4567", 110_450.54, "Marketing");

//Below is casting down to a subclass and cast will succeed        
        Manager mng = (Manager) emp; // ok
 
//Below cast is outside the class hierarchy and will compiler will fail
//Engineer and Manager are subclasses of Employee and not each other
//        Engineer eng = (Manager) emp; // Compile error
        System.out.println(mng.getDetails());
    }
}
