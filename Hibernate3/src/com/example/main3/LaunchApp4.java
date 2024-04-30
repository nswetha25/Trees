package com.example.main3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity3.Student;

public class LaunchApp4 {

	public static void main(String[] args) {
		
		
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
		
		Student std1=session.load(Student.class, 5);//Here load method which is called Lazy loading - so first object is getting created and then only the other details
		//will trigger the db.
		
		System.out.println("student id :"+std1.getId()+"std name:"+std1.getName()+"std age:"+std1.getAge());
		
		session.close();

	}

}
