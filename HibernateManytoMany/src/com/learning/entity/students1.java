package com.learning.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class students1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String address;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<courses1> courses1;
	
	public students1() {
		System.out.println("students2 obj created");
	}

	@Override
	public String toString() {
		return "students1 [id=" + id + ", name=" + name + ", address=" + address + ", courses1=" + courses1 + "]";
	}

	public students1(String name, String address, Set<courses1> courses1) {
		super();
		this.name = name;
		this.address = address;
		this.courses1 = courses1;
	}
	
	
	
	
	

}
