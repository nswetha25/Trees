package com.telusko.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Student;

//Basically we can do bulk operations and diff stuff using hibernate but we will focus on important stuff
public class LaunchApp {

	public static void main(String[] args) {
		//Lets do delete operation here 
		
		SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").buildSessionFactory();
		

		
		//As its delete operation transactions are required

		Session session= sessionfactory.openSession();
		
		Student st=session.get(Student.class,7);//I am doing eager loading here
		
		if(st!=null) {
		
			Transaction transaction=session.beginTransaction();
		    session.delete(st);
		    
		    transaction.commit();//I have to commit because based on the transaction allt he operation should happen or none of the operation should happen
		
		
		}
		
		//As we are using if else we avoided null pointer exception becasue if we dont have that record instead of giving exception I just printed the message
		else {
			System.out.println("Record of the mentioned id is not available ");
		}
		session.close();

	}

}
