package com.tu;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public Set<Employee> hashSetDemo() {
		Set<Employee> emp = new HashSet();
		emp.add(new Employee(001, "John", "Doe"));
		emp.add(new Employee(002, "Sachin", "Tendulkar"));
		emp.add(new Employee(001, "John", "Doe"));
		return emp;
	}
	
	

}
