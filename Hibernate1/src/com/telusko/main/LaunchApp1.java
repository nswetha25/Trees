//JDBC did not allow to use oops concept but we will use in herbate
package com.telusko.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Student;

public class LaunchApp1 {

	public static void main(String[] args) {
		//Here we have to activate the hiberate means I have to use certain classes which hibernateteam has coded and I will use them . For that I will I need to 
		//use some configuarion file where I have to go to src-> New->create new xml file
		
		Student[] students = new Student[3];

        students[0] = new Student(5, "Nadella", 28, "bang");
        students[1] = new Student(6, "Gates", 25, "seattle");
        students[2] = new Student(7, "Bezos", 30, "seattle");

		
		
		//Activate the hibernate
		
		Configuration config= new Configuration();
		//loading the hibernate.config.xml file in to the configuration object
		config.configure("/hibernate.config.xml");
		
		//Build the session Factory object using configuration object
		//load and register driver, establish the connection and create the prepared statement
		SessionFactory sessionfactory=config.buildSessionFactory();
		
		
		//To perform task so we are creating one session object
		Session session=sessionfactory.openSession();
		
		//As I am performing insertion I need to use transaction . It should be used for all apart from select
		
		Transaction transaction=session.beginTransaction();
		
		//performing the insert operation
		//session.save(std);
		
		for (Student student : students) {
            session.save(student);
        }
	
		
		//Here I have to commit the operation
		
		transaction.commit();
		
		//close the session object
		session.close();
		
	}

}
