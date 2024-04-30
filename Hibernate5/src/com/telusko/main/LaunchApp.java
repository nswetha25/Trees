package com.telusko.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Springers;

public class LaunchApp {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory= new Configuration().configure("/hibernate.config.xml").addAnnotatedClass(Springers.class).buildSessionFactory();//
		//As we have used annotated class directly no need to specify this  <!-- Specifying mapping information -->
        //<mapping class="com.telusko.entity.Student"/> Its not just for date and time it can be used for any type
		
		Session session=sessionfactory.openSession();
		
		////Below I have created a new record and next lets update the existing record using update operation in config.xml file
		
//		Transaction transaction = session.beginTransaction();
//		
//		Springers sp=new  Springers();
		
		
		
//		sp.setId(4);
//		sp.setName("SN");
//		sp.setDt1(new Date());
//		
//		sp.setDt2(new Date());
//		
//		sp.setDt3(new Date());
//		
//		session.save(sp);
		
		//Lets do another operation  the existing one
		
		Integer id=4;
		
		Springers sp=session.get(Springers.class, id);
		
		if(sp!=null) {
			System.out.println(sp);
		}
		else {
			System.out.println("No relevant id");
		}
		
		
		
		
		
		
		session.close();
		
		
		
		
		
		
	}

}
