package com.cg.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee e=new Employee();
       e.setFirstName("panja");
       e.setLastName("Vinod");
       
       SessionFactory factory=buildSessionFactory(Employee.class);
       Session session=factory.openSession();
       session.save(e);
       Employee savedEmployee=(Employee) session.get(Employee.class,1);
       System.out.println("------------------");
       System.out.println("FistName  "+savedEmployee.getFirstName());
       System.out.println("LastName  "+savedEmployee.getLastName());
       System.out.println("------------------");
       
       session.close();
       factory.close();
       
    }
    
    private static SessionFactory buildSessionFactory(Class clazz) {
    	return new Configuration()
    		    	.configure()
    		    	.addAnnotatedClass(clazz)
    		    	.buildSessionFactory();
    	
    }
}
