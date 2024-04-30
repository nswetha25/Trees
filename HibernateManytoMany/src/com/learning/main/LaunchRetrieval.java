package com.learning.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.entity.students1;

public class LaunchRetrieval {

	public static void main(String[] args) {
		
SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		
		
		
		students1 st1=session.get(students1.class, 1);
		System.out.println(st1);
		System.out.println();
		System.out.println("*******************");
		
		students1 st2=session.get(students1.class, 2);
		System.out.println(st2);
		System.out.println();
		System.out.println("*******************");
		
		students1 st3=session.get(students1.class, 3);
		System.out.println(st3);
		System.out.println();
		System.out.println("*******************");
		
		session.close();
		
		//Output for the above  in the console. So as a java developer we dont want to write any queries using hibernate and no need to use any jdbc connection
		//i can do everytihin in config file and then using configuration we can do operations.
		
//		Hibernate: 
//		    select
//		        students1x0_.id as id1_1_0_,
//		        students1x0_.address as address2_1_0_,
//		        students1x0_.name as name3_1_0_ 
//		    from
//		        students1 students1x0_ 
//		    where
//		        students1x0_.id=?
//		students2 obj created
//		Hibernate: 
//		    select
//		        courses1x0_.students1_id as students1_2_0_,
//		        courses1x0_.courses1_courseid as courses2_2_0_,
//		        courses1x1_.courseid as courseid1_0_1_,
//		        courses1x1_.coursecost as courseco2_0_1_,
//		        courses1x1_.coursename as coursena3_0_1_ 
//		    from
//		        students1_courses1 courses1x0_ 
//		    inner join
//		        courses1 courses1x1_ 
//		            on courses1x0_.courses1_courseid=courses1x1_.courseid 
//		    where
//		        courses1x0_.students1_id=?
//		 courses are created
//		 courses are created
//		 courses are created
//		students1 [id=1, name=swetha, address=bang, courses1=[courses1 [courseid=C02, coursename=python, coursecost=4867.9], courses1 [courseid=C03, coursename=Data, coursecost=3567.9], courses1 [courseid=C01, coursename=Java, coursecost=4567.9]]]
//
//		*******************
//		Hibernate: 
//		    select
//		        students1x0_.id as id1_1_0_,
//		        students1x0_.address as address2_1_0_,
//		        students1x0_.name as name3_1_0_ 
//		    from
//		        students1 students1x0_ 
//		    where
//		        students1x0_.id=?
//		students2 obj created
//		Hibernate: 
//		    select
//		        courses1x0_.students1_id as students1_2_0_,
//		        courses1x0_.courses1_courseid as courses2_2_0_,
//		        courses1x1_.courseid as courseid1_0_1_,
//		        courses1x1_.coursecost as courseco2_0_1_,
//		        courses1x1_.coursename as coursena3_0_1_ 
//		    from
//		        students1_courses1 courses1x0_ 
//		    inner join
//		        courses1 courses1x1_ 
//		            on courses1x0_.courses1_courseid=courses1x1_.courseid 
//		    where
//		        courses1x0_.students1_id=?
//		students1 [id=2, name=akhil, address=bang, courses1=[courses1 [courseid=C02, coursename=python, coursecost=4867.9], courses1 [courseid=C03, coursename=Data, coursecost=3567.9], courses1 [courseid=C01, coursename=Java, coursecost=4567.9]]]
//
//		*******************
//		Hibernate: 
//		    select
//		        students1x0_.id as id1_1_0_,
//		        students1x0_.address as address2_1_0_,
//		        students1x0_.name as name3_1_0_ 
//		    from
//		        students1 students1x0_ 
//		    where
//		        students1x0_.id=?
//		students2 obj created
//		Hibernate: 
//		    select
//		        courses1x0_.students1_id as students1_2_0_,
//		        courses1x0_.courses1_courseid as courses2_2_0_,
//		        courses1x1_.courseid as courseid1_0_1_,
//		        courses1x1_.coursecost as courseco2_0_1_,
//		        courses1x1_.coursename as coursena3_0_1_ 
//		    from
//		        students1_courses1 courses1x0_ 
//		    inner join
//		        courses1 courses1x1_ 
//		            on courses1x0_.courses1_courseid=courses1x1_.courseid 
//		    where
//		        courses1x0_.students1_id=?
//		students1 [id=3, name=deepthi, address=bang, courses1=[courses1 [courseid=C02, coursename=python, coursecost=4867.9], courses1 [courseid=C03, coursename=Data, coursecost=3567.9], courses1 [courseid=C01, coursename=Java, coursecost=4567.9]]]
//
//		*******************
//
//		

	}

}
