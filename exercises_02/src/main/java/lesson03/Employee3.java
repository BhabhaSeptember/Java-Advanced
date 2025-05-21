package lesson03;

public class Employee3 {

    private int empId;
    private String name;
    private String ssn;
    private double salary;
    
// We've removed all setter methods to prevent classes that use an instance of Employee to access the private fields
//We implement a consructor to ensure all fields are set before the instance is saved
//We created two methods     
    public Employee3 (int empId, String name, String ssn, double salary) {
         this.empId = empId;
         this.name = name;
         this.ssn = ssn;
        this.salary = salary;
     }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

   

    public int getEmpId() {
        return empId;
    }
    
    
    public void changeName(String newName) {
          if (newName != null) {
              this.name = newName;
          }
     }
 
     public void raiseSalary(double increase) {
         this.salary += increase;
     }
 }


