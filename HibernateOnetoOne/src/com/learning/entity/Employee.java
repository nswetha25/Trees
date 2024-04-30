package com.learning.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empid;// To automatically generate id we use this GeneratedValue
	
	@Column
	private String ename;
	
	private Float esalary;
	
	
	@Column
	private String eaddress;//even if we dont give name in column it takes by default present here eaddress. 
	
	@OneToOne(cascade=CascadeType.ALL)
	private Account account; // To associtate Account class with this Employee class we use an annotation. Having cascade is optional here. Here ALL means
	//if employee is avalilable accoutn should be availabe and if he is gone and account also should be gone. But there are other options apart from 'ALL'
	
	


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", esalary=" + esalary + ", eaddress=" + eaddress
				+ ", account=" + account + "]";
	}


	public Integer getEmpid() {
		return empid;
	}


	public void setEmpid(Integer empid) {
		this.empid = empid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public Float getEsalary() {
		return esalary;
	}


	public void setEsalary(Float esalary) {
		this.esalary = esalary;
	}


	public String getEaddress() {
		return eaddress;
	}


	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
	
	
	
	
	

}
