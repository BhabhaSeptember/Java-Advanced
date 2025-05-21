/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

/**
 *
 * @author anshenoy
 */
public class EmployeeDemo {

    public static void main(String args[]) {
        Employee2 emp = new Employee2();

//        emp.salary = 2000; //compiler error - salary is private field
        emp.raiseSalary(2000);

    }
}
