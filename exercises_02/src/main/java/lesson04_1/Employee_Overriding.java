package lesson04_1;

import java.util.Objects;

//OVERRIDING OBJECT METHODS
//Root class of every Java class is java.lang.Object
//Root class contains several non-final methods
//The most important to consider overriding are: toString, equals & hashCode
public class Employee_Overriding {

    public int empId;
    public String name;
    public String ssn;
    public double salary;

    public Employee_Overriding(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

//OVERRIDING OBJECT HASHCODE
//Must be overridden if equals method is overridden to ensure objects and hashvalues are the same    
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 47 * hash + this.empId;
//        return hash;
//    }
    
    
    
//Object equals method compares only object references and not the contents of the object instance   
//Therefore we override the Object class equals method to compare every field for equality 

//Test to sensure the object passed in is not null & it is an instance of Employee_Overriding class
//Then cast the object to Employee_Overriding
//The check each field for equality using equals method for Strings to ensure equality with each character    
  
//@Override annotation instructs compiler that the method is overridden from superclass or interface    
    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if ((o != null) && (o instanceof Employee_Overriding)) {
            Employee_Overriding e = (Employee_Overriding) o;

            if ((e.empId == this.empId)
                    && (e.name.equals(this.name))
                    && (e.ssn.equals(this.ssn))
                    && (e.salary == this.salary)) {
                result = true;
            }
        }
        return result;
    }

    
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

//toString method returns String representation of object
//It is a better approach to get instance information than creating a getDetails method    
//println method is overloaded with many parameter types
//Invoking System.out.println(e), the method that takes and Object parameter is matched and invoked
//...then it invokes the toString() method on the object instance    
//To print out a class that executes a method, we use getClass() method
//To print out the fully qualified name of the runtime class we use getName() method   
    @Override
    public String toString() {
        return "\nEmployee id - " + empId
                + "\nEmployee name - " + name;
    }

//================================== MAIN METHOD ==================================    
    public static void main(String args[]) {

//TOSTRING METHOD EXAMPLE:        
        Employee_Overriding emp1 = new Employee_Overriding(121, "Bhabha", "ab123", 5000);
        System.out.print("Employee details: " + emp1);

//OBJECT EQUALS METHOD EXAMPLE:
//1) WITHOUT OVERRIDING EQUALS METHOD
        System.out.println("\n=== OBJECT EQUALS METHOD ===");
        Employee_Overriding x = new Employee_Overriding(1, "Sue", "111-11-1111", 10.0);
        Employee_Overriding y = x;

        System.out.println(x.equals(y));//this would have been true

        Employee_Overriding z = new Employee_Overriding(1, "Sue", "111-11-1111", 10.0);
        System.out.println(x.equals(z));//this would have been false

    }

}
