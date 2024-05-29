package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
    {	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	Student s = ac.getBean("std2", Student.class);
    	s.stdName();
    	//s.setName("Vinod");
    	//System.out.println(s.getName());
    	Teacher t = ac.getBean("tch", Teacher.class);
    	t.tchName();
        
    }
}
