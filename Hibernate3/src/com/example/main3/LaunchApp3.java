
package com.example.main3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity3.Student;

public class LaunchApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

		Configuration config= new Configuration();
		//loading the hibernate.config.xml file in to the configuration object
		config.configure("/hibernate.config.xml");
		
		//Build the session Factory object using configuration object
		//load and register driver, establish the connection and create the prepared statement
		SessionFactory sessionfactory=config.buildSessionFactory();//This is a heavry object which will do many things
		
		// we can write the above three statmemtn in one line also
		//SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").buildSessionFactory();
		
		
		//To perform task so we are creating one session object
		Session session=sessionfactory.openSession();
		
		//As I am performing insertion I need to use transaction . It should be used for all apart from select
		
		//As we are fetching the data which means hibernate uses Select query internally so we dont wwant transaction object. It uses 2 methods get and load
		
		Student std=session.get(Student.class, 6); //Used get method here 
		
		System.out.println("std id :"+std.getId()+"std name :"+std.getName()+"std age :"+std.getAge());//see all the getters setters concept is being used in the aplication
		
		
			
			//close the session object
			session.close();
	}

}
