package com.dl.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dl.client")
public class HelloWorldConfig {

	 @Bean
     public HelloWorldConfig myBean() {
        
		 return new HelloWorldConfig();
		 
     }
}