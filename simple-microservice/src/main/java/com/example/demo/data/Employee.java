package com.example.demo.data;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor  
@AllArgsConstructor  
@ToString
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private @Getter @Setter Integer employeeID; 
	private @Getter @Setter String employeeName;
	private @Getter @Setter String employeeRole;
	private @Getter @Setter String employeeAddress; 
	

}
