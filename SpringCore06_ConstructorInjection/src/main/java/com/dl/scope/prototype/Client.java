package com.dl.scope.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/scope/prototype/applicationContext.xml");
		Honda h1 = (Honda)context.getBean("honda");
		System.out.println(h1.getVno());
		System.out.println(h1.getVname());
		System.out.println(h1.hashCode());
		
		Honda h2 = (Honda)context.getBean("honda");
		System.out.println(h2.getVno());
		System.out.println(h2.getVname());
		System.out.println(h2.hashCode());
		
		context.close();
	}
}