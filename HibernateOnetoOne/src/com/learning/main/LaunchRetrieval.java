package com.learning.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Employee;

public class LaunchRetrieval {

	public static void main(String[] args) {
		
SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		//As this is the retrival part we have to change config.xml 'update' and no need of transaction
		//Lets go for eager loading
		
		Employee emp=session.get(Employee.class,1);
		
		System.out.println(emp);
		
		session.close();
		
		//Below is the output for this one to one mapping in hibernate
		
//		//Hibernate: 
//    select
//        employee0_.empid as empid1_1_0_,
//        employee0_.account_accNo as account_5_1_0_,
//        employee0_.eaddress as eaddress2_1_0_,
//        employee0_.ename as ename3_1_0_,
//        employee0_.esalary as esalary4_1_0_,
//        account1_.accNo as accno1_0_1_,
//        account1_.accName as accname2_0_1_,
//        account1_.accType as acctype3_0_1_ 
//    from
//        Employee employee0_ 
//    left outer join
//        Account account1_ 
//            on employee0_.account_accNo=account1_.accNo 
//    where
//        employee0_.empid=?
//Employee [empid=1, ename=Swetha, esalary=3500.0, eaddress=swetha@gmail.com, account=Account [accNo=T12, accName=Swetha, accType=savings]]
//		

	}

}
