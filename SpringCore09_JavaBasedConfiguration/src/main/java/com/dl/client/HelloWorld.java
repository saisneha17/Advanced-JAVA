package com.dl.client;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloWorld {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}