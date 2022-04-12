package com.example.demo.services;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.demo.data.Employee;
import com.example.demo.repository.EmployeeHelper;
import com.example.demo.repository.SortType;

@Service
public class EmployeeService {
	

	SortType filterType;

	

	public List<Employee> getAll() {

		return EmployeeHelper.getAll();
	}

	public List<Employee> getByRole(String department) {

		Stream<Employee> employees = EmployeeHelper.getAll().stream();
		return employees.filter(employe -> employe.getEmployeeRole().equals(department)).collect(Collectors.toList());
	}
	
	public Optional<Employee> getEmployee(Integer id) {

		Stream<Employee> employees = EmployeeHelper.getAll().stream();
		return employees.filter(e -> Objects.equals(e.getEmployeeID(), id)).findAny();
	}

	public Optional<List<Employee>> filter(SortType filterBy) {

		List<Employee> employees = EmployeeHelper.getAll();

		switch (filterBy)
		{

		case NAME:
			return Optional.ofNullable(employees.stream().sorted(Comparator.comparing(Employee::getEmployeeName))
			        .collect(Collectors.toList()));

		case DEPARTMENT:
			return Optional.ofNullable(employees.stream().sorted(Comparator.comparing(Employee::getEmployeeRole))
			        .collect(Collectors.toList()));

		}

		return Optional.ofNullable(employees);
	}

	public List<Employee> add(Integer id, String name, String department, String address) {

		return EmployeeHelper.add(id, name, department, address);
	}
}
