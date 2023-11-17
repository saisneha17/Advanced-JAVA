package com.dl.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class Select {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		HondaDao dao = (HondaDao)context.getBean("hondaDao");
		
		List<Honda> listVechiles = dao.listVechiles();
		
		for (Honda honda : listVechiles) {
			System.out.println(honda.getId());
			System.out.println(honda.getBikeName());
			System.out.println(honda.getBikeColor());
			System.out.println(honda.getCc());
		}
		context.close();
	}
}
