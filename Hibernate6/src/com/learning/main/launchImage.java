package com.learning.main;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Telusko;

public class launchImage {

	public static void main(String[] args) throws IOException {
		
		SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").addAnnotatedClass(Telusko.class).buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		//First we have to get the image to our java program in order to store it in the database . Fr that we have to use File I/O
		
		Transaction trans=session.beginTransaction();
		
		Telusko t=new Telusko();
		
		t.setId(3);
		t.setName("Hyder");
		
		FileInputStream fis=new FileInputStream("/Users/swethanadella/Desktop/instalogo.png");
		
		byte byteArr[]=new byte[fis.available()];//size wil be how much ever bytes are generated our of this image that many images are added to this byte array
		
		fis.read(byteArr);
		
		t.setImg(byteArr);
		
		String textFile="This is texts from text file";
		
		char ar[]=textFile.toCharArray();
		
		t.setCharacters(ar);
		
		session.save(t);
		
		trans.commit();
		
		session.close();
		
		
		
		

	}
}
