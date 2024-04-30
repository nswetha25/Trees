package com.learning.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

//This is acutally unidirectional because it is going to Department to many employees
@Entity
public class Department {
    
	@Id
	private String deptId; // See genrally primary can be of any type not jus ID
	
	private String deptName;
	
	//As one dept have many employees we cant just use one variable because at a time a varibale can hold only one data
	
	// So we can go for collection and I dont wwant duplicates so I will go with set. Also apart from Employee2 I dont want any other type to be stored. so I am going
	//for generics here
	
	@OneToMany(cascade= CascadeType.ALL)
	private Set<Employee2> employee;

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", employee=" + employee + "]";
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee2> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee2> employee) {
		this.employee = employee;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
