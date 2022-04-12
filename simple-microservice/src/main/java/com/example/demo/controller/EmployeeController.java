package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Employee;
import com.example.demo.repository.SortType;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/employees")
	public List<Employee> addEmployee(@RequestParam Integer id, @RequestParam String name, @RequestParam String department, @RequestParam String address){
		return employeeService.add(id, name, department, address);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAll();
	}
	
	@GetMapping("/employees/{id}/employee")
	public Optional<Employee> getEmployeeById(@RequestParam Integer id){
		return employeeService.getEmployee(id);
	}
	
	@GetMapping("/employees/{role}/employees")
	public List<Employee> getEmployeeByRoles(@RequestParam String role){
		return employeeService.getByRole(role);
	}
	
	@GetMapping("/employess/{sort}/employees")
	public Optional<List<Employee>> getEmployeeByCriteria(@RequestParam SortType sort){
		return employeeService.filter(sort);
	}
	
	

}
