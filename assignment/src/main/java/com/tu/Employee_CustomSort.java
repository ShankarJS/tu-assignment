package com.tu;

import java.util.Comparator;
import java.util.TreeSet;

public class Employee_CustomSort {
    private int id;
    private String firstName;
    private String lastName;

    public Employee_CustomSort(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    

    @Override
    public String toString() {
        return "Employee{id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String[] args) {
        Comparator<Employee_CustomSort> firstNameComparator = new Comparator<Employee_CustomSort>() {
            @Override
            public int compare(Employee_CustomSort emp1, Employee_CustomSort emp2) {
                return emp1.getFirstName().compareTo(emp2.getFirstName());
            }
        };

        TreeSet<Employee_CustomSort> treeSet = new TreeSet<>(firstNameComparator);
        treeSet.add(new Employee_CustomSort(2, "John", "Doe"));
        treeSet.add(new Employee_CustomSort(1, "Jane", "Smith"));
        treeSet.add(new Employee_CustomSort(3, "Iriana", "Johnson"));

        System.out.println("Custom sorting (by firstname):");
        for (Employee_CustomSort emp : treeSet) {
            System.out.println(emp);
        }
    }
}

