package com.example;
import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Employee emp=(Employee) context.getBean("e1");
emp.show();
	}

}
