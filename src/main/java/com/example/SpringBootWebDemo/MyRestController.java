package com.example.SpringBootWebDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.NotificationService;

@RestController
public class MyRestController {
	
	NotificationService service;
	
	//setter based injection
	@Autowired
	public void setService(NotificationService service) {
		this.service = service;
	}
	
	@Value("${myPage.msg}")
	private String msg;
	

	@RequestMapping("/service")
	public String NotifService(){
		
		return service.toString() +"--"+msg;
	}
	
	@RequestMapping("/sai")
	public String hello(){
		
		return "Hello Sai Guru!!";
	}
	
	@RequestMapping("/guru")
	public String hello(String test){
		
		return " Guruvae Saranam!!";
	}
	
	
	
}
