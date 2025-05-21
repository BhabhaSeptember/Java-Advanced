

package lesson03;


public class Employee {

//Encapsulation: Public and Private access Modifiers
    public int empId;
    public String name;
    public String ssn;
    public  double salary;

    public Employee() {
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



