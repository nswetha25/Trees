package com.learning.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Branch;
import com.learning.entity.Students;

public class LaunchMain {

	public static void main(String[] args) {
		
SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		Transaction transaction= session.beginTransaction();
		
		//Lets create dependent object first because single branch giving to multiple students
		
		Branch b=new Branch();
		
		b.setBid("b1");
		b.setBranchname("Springers");
		
		b.setBlocation("Onsite");
		
		Students st=new Students("Swetha","Bang",b);
		Students st1=new Students("Nadella","chn",b);
		Students st2=new Students("akhil","hyd",b);
		Students st3=new Students("deepthi","del",b);
		Students st4=new Students("sasi","usa",b);
		
		session.save(st);
		session.save(st1);
		session.save(st2);
		session.save(st3);
		session.save(st4);
		
		transaction.commit();
		session.close();
		
		
		
	}

}
