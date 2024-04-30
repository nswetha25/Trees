package com.telusko.entity1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name="Human")
public class Human {
	
	@Id
	@Column(name="ID")
	private Integer id;
	@Column(name="GENDER")
	private String gender;
	@Column(name="AGE")
	private Integer age;
	
	public Human()
	{
		System.out.println("student obj is created");
	}
	@Override
	public String toString() {
		return "Human [id=" + id + ", gender=" + gender + ", age=" + age + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
	

}
