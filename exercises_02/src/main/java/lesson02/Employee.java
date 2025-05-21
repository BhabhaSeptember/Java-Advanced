/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

//Notes: import keyword identifies classes we want to reference in our class
//Can import a single class or an entire package with *-wildcard
//Can include mulitple imports
//By default, class always imports "java.lang.*" package
import java.util.Date;
import java.util.*;
import java.util.Calendar;

/**
 *
 * @author User
 */
public class Employee { //class declaration
public static void main(String[] args) {
    Employee emp = new Employee();
    emp.empId = 101; //legal if field is public but not good object oriented programming pratice
    emp.setEmpId(101); //use method instead
    
    emp.setName("Bhabha September");
    emp.setSsn("011-22-3467");
    emp.setSalary(120345.27);
    
    System.out.println("Emp ID: " + emp.getEmpId());
    System.out.println("Name: " + emp.getName());
    System.out.println("SSN #: " + emp.getSsn());
    System.out.println("Salary: R" + emp.getSalary());
        
    }//end of main method

//    fields
    public int empId;
    private String name;
    private String ssn;
    private double salary;
    
//    Constructor (no-arg)
    public Employee () {
        
    }
    
//    Methods
//    Accessor/Getter and Mutator/Setter methods for empId field value
//    They are instance methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getEmpId () {
        return empId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}//end of Employee class
