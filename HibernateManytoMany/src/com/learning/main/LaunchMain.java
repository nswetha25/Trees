package com.learning.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.entity.courses1;
import com.learning.entity.students1;

public class LaunchMain {

	public static void main(String[] args) {
		
SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		Transaction transaction= session.beginTransaction();
		
		courses1 c1= new courses1("C01","Java",4567.9f);
		courses1 c2= new courses1("C02","python",4867.9f);
		courses1 c3= new courses1("C03","Data",3567.9f);
		
		Set<courses1> set1=new HashSet<>();
		set1.add(c1);
		set1.add(c2);
		set1.add(c3);
		
		Set<courses1> set2=new HashSet<>();
		set2.add(c1);
		set2.add(c2);
		//set2.add(c3);
		
		Set<courses1> set3=new HashSet<>();
		set3.add(c1);
		//set3.add(c2);
		set3.add(c3);
		
		
		//Multiple students multiple courses
		students1 st1=new students1("swetha","bang",set1);//Swetha took 3 courses
		
		students1 st2=new students1("akhil","bang",set2);
		
		students1 st3=new students1("deepthi","bang",set3);
		
		session.save(st1);
		session.save(st2);
		session.save(st3);
		
		transaction.commit();
		
		session.close();
		
		
		
		
		

	}

}
