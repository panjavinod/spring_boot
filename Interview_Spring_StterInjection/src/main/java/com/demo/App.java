package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("home.xml");
      Employe e=context.getBean(Employe.class);
      e.show();
      
//      System.out.println(e.hashCode());
//      Employe e1=context.getBean(Employe.class);
//      System.out.println(e1.hashCode());
    }
}
