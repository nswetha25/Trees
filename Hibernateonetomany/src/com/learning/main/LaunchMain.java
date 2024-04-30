package com.learning.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Department;
import com.learning.entity.Employee2;

public class LaunchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		Transaction transaction= session.beginTransaction();
		
		//First I ahve to create Employees so it can be given to department class
		
		Employee2 emp=new Employee2("Swetha",45600.9f,"Arts Dept");
		Employee2 emp1=new Employee2("Akhil",49600.9f,"Ops Dept");
		Employee2 emp2=new Employee2("Deepthi",5600.9f,"IT Dept");
		Employee2 emp3=new Employee2("vamsi",65600.9f,"Dev Dept");
		
		//These things I have to add in the collection 
		
		Set<Employee2> set= new HashSet<Employee2>();
		set.add(emp);
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		
		Department dep=new Department();
		
		dep.setDeptId("D01");
		dep.setDeptName("Ed-Tech");
		dep.setEmployee(set);
		
		session.save(dep);
		
		transaction.commit();
		
		session.close();
		
		
		
		
		
	}

}
