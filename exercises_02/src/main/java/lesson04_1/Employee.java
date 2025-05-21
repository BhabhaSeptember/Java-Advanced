package lesson04_1;

//OVERRIDING METHODS
public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
      this.empId = empId;
      this.name = name;
      this.ssn = ssn;
      this.salary = salary;
    }

//Instead of only using getter methods, we can have a utility method to get specific details about the Employee object
//This can then be specialized for use by subclasses    
    public String getDetails() {
      return "\nID - " + empId + "\nName - " + name;
    }

    public String getAllDetails() {
        return "ID: " + empId + " Name: " + name 
          + " SSN: " + ssn + " Salary: " + salary;
    }
    
    public double getSalary(){
      return this.salary;
    }
}