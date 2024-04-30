package com.example.entity3;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



	@Entity(name="STUDENT")//This step means it is mapped with the tablemname in the db
	public class Student {

		//I will make my hinernate to take care of all the mapping in my database
		@Id
		@Column(name="ID")
		private Integer id;
		@Column(name="NAME")
		private String name;
		@Column(name="AGE")
		private Integer age;
		@Column(name="ADDRESS")// Here using @Column is also sufficient
		private String address;
		
		
		public Student()
		{
			System.out.println("student obj is created");
		}
		public Student(int id, String name, int age, String addr) {
			this.id=id;
			this.name=name;
			this.age=age;
			this.address=addr;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		
	}



