package lesson04_1;

//OVERRIDING METHODS
public class Manager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Manager(int empId, String name, String ssn, double salary, String dept) {
      super(empId, name, ssn, salary);
      deptName = dept;
    }

//Created method with same method signature as superclass and override it to specialize it for this subclass    
//Subclass invokes a parent method by using the super keyword
//This overridden method replaces superclass method and called for any Manager instance
//The super.geDetails() call, invokes the getDetails method of the parent class      
    
    @Override
    public String getDetails() {
      return super.getDetails () + 
        "\nDept - " + deptName;
    }

    @Override
    public String getAllDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }
}
