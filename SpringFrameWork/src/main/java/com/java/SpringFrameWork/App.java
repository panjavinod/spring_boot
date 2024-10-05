package com.java.SpringFrameWork;

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
       ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//       Vahicle obj=(Vahicle) context.getBean("vahicle");
//       obj.show();
       Tyre obj=(Tyre)context.getBean("tyre");
       System.out.println(obj);
    }
}
