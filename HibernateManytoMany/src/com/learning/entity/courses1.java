package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class courses1 {
	
	@Id
	private String courseid;
	
	private String coursename;
	
	private Float coursecost;
	
	public courses1() {
		System.out.println(" courses are created");
	}

	

	public courses1(String courseid, String coursename, Float coursecost) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursecost = coursecost;
	}
	
	@Override
	public String toString() {
		return "courses1 [courseid=" + courseid + ", coursename=" + coursename + ", coursecost=" + coursecost + "]";
	}
	
	
	

}
