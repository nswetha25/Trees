package com.learning.main;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Telusko;

public class ImageRetrieval {

	public static void main(String[] args) throws IOException {
	
SessionFactory sessionfactory=new Configuration().configure("/hibernate.config.xml").addAnnotatedClass(Telusko.class).buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		Telusko t= session.get(Telusko.class, 3);
		
		System.out.println("Telusko id :"+t.getId());
		System.out.println("Telusko id :"+t.getName());
		
		byte image[]=t.getImg();
		
		FileOutputStream fos=new FileOutputStream("/Users/swethanadella/Downloads/instalogo.png");
		
		fos.write(image);
		
		fos.flush();
		
		char cr[]=t.getCharacters();
		FileWriter fw=new FileWriter("/Users/swethanadella/Downloads/telusko.txt");
		fw.write(cr);
		
		fw.flush();
		
		session.close();
		fos.close();
		fw.close();
		//Retrievel operation c=in config.xml we have to use update for launchingimage means string use create.
		//so when we run launchimage we have to make sure to have create in config.xml file and then once we have to images in db we have to use update
		//and run using ImageRetrieval
		
		
	}

}
