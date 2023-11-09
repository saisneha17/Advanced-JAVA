package com.dl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class SpringClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld hw = (HelloWorld)context.getBean("hello", HelloWorld.class);
		
		hw.setMessage("Hello World");
		hw.getMessage();
		
		System.out.println(hw.getMessage());
		
		((AbstractApplicationContext) context).close();
		
	}

}