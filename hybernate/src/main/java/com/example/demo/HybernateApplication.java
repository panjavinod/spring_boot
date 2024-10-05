package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class HybernateApplication {

	public static void main(String[] args) {
		 Student s=new Student();
	       s.setId(101);
	       s.setFirstName("Panja");
	       s.setLastName("Vinod");
	       
	       Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
	       SessionFactory factory=con.buildSessionFactory();
	       Session session=factory.openSession();
	       try {
	    	   Transaction tx=session.beginTransaction();
	    	   
	    	   session.save(s);
	    	   
	    	   tx.commit();
	       }finally{
	    	   factory.close();
	       }
	}

}
