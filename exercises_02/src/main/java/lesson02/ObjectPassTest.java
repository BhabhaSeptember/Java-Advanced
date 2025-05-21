/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author User
 */
public class ObjectPassTest {
    public static void main(String[] args) {
        
        ObjectPassTest test = new ObjectPassTest();
        Employee x = new Employee();
        
        x.setSalary(120_000.00);
        test.foo(x);
        System.out.println("Employee salary: R" + x.getSalary());
    }
    
//    Method
    public void foo(Employee e) {
        e.setSalary(130_000.00);
        e = new Employee();
        e.setSalary(140_000.00);
        System.out.println("Employee e Salary: R" + e.getSalary());
    }
  
//Garbage Collection Example  
//NOTES: Scope of an object reference depends where object is instantiated
//When below method completes, memory referenced by e is no longer accessible
//    Java's garbage collector recognizes when an instance is no longer accessible & eligible for collection
    public void someMethod() {
        Employee e = new Employee();
//        operations on e
    }
    
}
