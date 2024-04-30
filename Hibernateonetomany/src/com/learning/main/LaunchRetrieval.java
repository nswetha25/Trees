package com.learning.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Department;
import com.learning.entity.Employee2;

public class LaunchRetrieval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
Department dept=session.get(Department.class,"D01");
//Generally for retrieval we use update right so when by mistake if I messit up then the table wil be gone so we have to use create and run the LaunchMaiin and then again
//use update and run LaunchRetrieval
		
		System.out.println(dept);
		
		session.close();

	}

}
