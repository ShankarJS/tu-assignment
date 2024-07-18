package com.tu;

import junit.framework.TestCase;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTests extends TestCase {

//    public void testWithoutHashCodeAndEquals() {
//        Employee emp1 = new Employee(1, "John", "Doe");
//        Employee emp2 = new Employee(1, "John", "Doe");
//
//        Set<Employee> employees = new HashSet<>();
//        employees.add(emp1);
//        employees.add(emp2);
//        System.out.println(employees.toString());
//
//        assertEquals("HashSet size should be 2", 2, employees.size());
//    }
    
//    public void testOnlyHashCodeImplemented() {
//        Employee emp1 = new Employee(1, "John", "Doe");
//        Employee emp2 = new Employee(1, "John", "Doe");
//
//        Set<Employee> employees = new HashSet<>();
//        employees.add(emp1);
//        employees.add(emp2);
//        System.out.println(employees.toString());
//
//        assertEquals("HashSet size should be 2", 2, employees.size());
//    }
    
//    public void testOnlyEqualsImplemented() {
//        Employee emp1 = new Employee(1, "John", "Doe");
//        Employee emp2 = new Employee(1, "John", "Doe");
//
//        Set<Employee> employees = new HashSet<>();
//        employees.add(emp1);
//        employees.add(emp2);
//        System.out.println(employees.toString());
//
//        assertEquals("HashSet size should be 2", 2, employees.size());
//    }
    
    public void testHashCodeAndEqualsImplemented() {
        Employee emp1 = new Employee(1, "John", "Doe");
        Employee emp2 = new Employee(1, "John", "Doe");

        Set<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        System.out.println(employees.toString());

        assertEquals("HashSet size should be 1", 1, employees.size());
    }
}
