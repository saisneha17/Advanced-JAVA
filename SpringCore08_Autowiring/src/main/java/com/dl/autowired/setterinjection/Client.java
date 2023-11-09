package com.dl.autowired.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/autowired/setterinjection/applicationContext.xml");
		Honda honda = (Honda)context.getBean("honda");
		System.out.println(honda);
		context.close();

	}

}