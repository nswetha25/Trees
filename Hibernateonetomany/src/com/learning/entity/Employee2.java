package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee2 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	private String name;
	private float salary;
	
	private String address;

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
//As we are not using getters anywhere we are only using setters we can do like this. so we can use constructor

	public Employee2(String name, float salary, String address) {
		
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

}
