package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.data.Employee;

@Repository
public class EmployeeHelper {
	
	private EmployeeHelper() {
		
	}
	
	public static List<Employee> employee = new ArrayList<>();

	static {
		
		employee.add(new Employee(1, "vishwas", "supervisor", "Add 1"));
		employee.add(new Employee(2, "nisha", "supervisor", "Add 1"));
		employee.add(new Employee(3, "eliza", "supervisor", "Add 1"));
		employee.add(new Employee(4, "eliza2", "supervisor", "Add 1"));
	}

	public static List<Employee> getAll() {		
		return employee;
	}

	public static List<Employee> add(Integer id , String name, String department, String address) {
		employee.add(new Employee(id, name, department, address));
		return employee;

	}

}
