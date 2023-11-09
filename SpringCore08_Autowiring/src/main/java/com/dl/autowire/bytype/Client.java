package com.dl.autowire.bytype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/autowire/bytype/applicationContext.xml");
		Honda honda = (Honda)context.getBean("honda");
		System.out.println(honda);
		context.close();

	}

}