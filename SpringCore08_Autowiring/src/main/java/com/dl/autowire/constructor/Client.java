package com.dl.autowire.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/autowire/constructor/applicationContext.xml");
		Honda honda = (Honda)context.getBean("honda");
		System.out.println(honda);
		context.close();

	}

}