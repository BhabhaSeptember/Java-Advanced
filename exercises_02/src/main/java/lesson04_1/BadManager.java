package lesson04_1;

//ACCESSIBILITY OF OVERRIDING METHODS
public class BadManager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public BadManager(int empId, String name, String ssn, double salary, String dept) {
      super(empId, name, ssn, salary);
      deptName = dept;
    }

//The overriding method cannot be less accessible than the method in the parent class
//Changing access of Manager getDetails method to private will cause compiler error! 
/*
    @Override
    private String getDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }
*/
    
    @Override
    public String getAllDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }
}
