package com.telusko.main1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.telusko.entity1.Human;

public class LaunchApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialy I created with this and next I updated using huaan id
//Human h=new Human();
//h.setId(1);
//h.setGender("Female");
//h.setAge(22);
		
		
		

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
//		session.save(h);//save is used for insertion operation
//		
//		
//	
//		
//		//Here I have to commit the operation
//		
//		transaction.commit();
		
//		 
		//But now I want to update based on the id so I am using it
		Human hm=new Human();
		hm.setId(2);
		hm.setAge(36);
		hm.setGender("Female");
		
		session.saveOrUpdate(hm);//if we use just save() then obvioulsy the primary key which is Id should be present
		
		transaction.commit();
		//close the session object
		session.close();
	}

}
