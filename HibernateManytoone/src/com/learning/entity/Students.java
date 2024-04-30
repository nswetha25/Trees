package com.learning.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	

	private String name;
	
	private String address;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Branch branch;
	
	public Students() {
		System.out.println("student obj is created");
	}

	
public Students(String name, String address, Branch branch) {
		
		this.name = name;
		this.address = address;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", address=" + address + ", branch=" + branch + "]";
	}
	
	
	
	
	
	
	
	
	

}
