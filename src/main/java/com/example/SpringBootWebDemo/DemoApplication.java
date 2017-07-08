package com.example.SpringBootWebDemo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.service.User;

@ComponentScan({"com.example.SpringBootWebDemo,com.example.service"})
@SpringBootApplication
public class DemoApplication {
	
	@Bean("MyUser")
	public User loadUser(){
		return new User("Kreshav", "Karthik");
	}
	
	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(DemoApplication.class, args);
		
		String[] beanNames = ctxt.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String bean : beanNames){
			System.out.println("BEAN NAME ::"+bean);
		}
		
		System.out.println(ctxt.getBean("MyUser").toString());
	}
}
