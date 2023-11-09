package com.dl.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/qualifier/applicationContext.xml");
		Honda honda = (Honda)context.getBean("honda");
		System.out.println(honda);
		context.close();

	}

}