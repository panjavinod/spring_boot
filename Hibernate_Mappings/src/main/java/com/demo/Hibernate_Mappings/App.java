package com.demo.Hibernate_Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Laptop lap=new Laptop();
    	lap.setId(101);
    	lap.setBrand("HP");
    	
       Student s=new Student();
       s.setRollNo(1);
       s.setName("don");
//       s.setLaptop(lap); @OneToOne
       s.getLaptop().add(lap);
       
       lap.getStudent().add(s);
       
       Configuration config=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       SessionFactory factory=config.buildSessionFactory();
       Session session=factory.openSession();
    		   
       Transaction tx=session.beginTransaction();
       session.save(lap);
       session.save(s);
       //get the data from database using hibernate
       //s=(Student)session.get(Student.class, 1);
       tx.commit();
    
       
    }
}
