package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Resource resource=new ClassPathResource("applicationContext.xml");
BeanFactory beanFactory=new XmlBeanFactory(resource);
Employee emp=(Employee) beanFactory.getBean("e2");
emp.show();
	}

}
