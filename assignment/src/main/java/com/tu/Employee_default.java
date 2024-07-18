package com.tu;

import java.util.TreeSet;

public class Employee_default implements Comparable<Employee_default> {
    private int id;
    private String firstName;
    private String lastName;

    public Employee_default(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters

    @Override
    public int compareTo(Employee_default other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }

    public static void main(String[] args) {
        TreeSet<Employee_default> treeSet = new TreeSet<>();
        treeSet.add(new Employee_default(2, "John", "Doe"));
        treeSet.add(new Employee_default(1, "Jane", "Smith"));
        treeSet.add(new Employee_default(3, "Michael", "Johnson"));

        System.out.println("Default sorting (by id):");
        for (Employee_default emp : treeSet) {
            System.out.println(emp);
        }
    }
}

