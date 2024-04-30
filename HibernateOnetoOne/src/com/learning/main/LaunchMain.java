package com.learning.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Account;
import com.learning.entity.Employee;


public class LaunchMain {

	public static void main(String[] args) {
		
	//See all this session part and saving part can be done one in utility clas in order to avoid reducndacny like how we did in jdbc	
SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		Transaction transaction= session.beginTransaction();
		
		Account acc=new Account();
		
		acc.setAccName("Swetha");
		acc.setAccNo("T12");
		acc.setAccType("savings");
		
		Employee emp=new Employee();
		
		emp.setAccount(acc);
		
	emp.setEname("Swetha");
	emp.setEaddress("swetha@gmail.com");
	emp.setEsalary(3500.00f);
	
	session.save(emp); //Here I am only saving employee so by default account will get saved as its part of that
	//All these order of operation can be seen in console window like how the query got created because in config.xml we have sopecified show_sql also
	
	//so both these employee and account is linked in backend in hibernate side because of the private Account account; object it is able to map
	
	transaction.commit();
	
	session.close();
	
		
		
		
	}

}
//n Hibernate, when establishing a one-to-one association, the association is typically based on the primary key (ID) of the entities involved.
//Hibernate relies on the identifier (@Id) to establish relationships between entities. If you don't have an @Id in your entities, Hibernate will 
//have difficulty identifying unique records.