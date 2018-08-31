package com.xiaoyang.dubboclient;

import org.springframework.boot.SpringApplication;

import javax.annotation.PostConstruct;
import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaoyang.HelloService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboClientApplication {

	@Reference(version = "1.0.0", url = "dubbo://localhost:20880")
  	private HelloService demoService;

	public static void main(String[] args) {
		
		SpringApplication.run(DubboClientApplication.class, args);
	}
	
    @PostConstruct
    public void init() {
    	String sayHello = demoService.sayHello("world");
    	System.err.println(sayHello);
    }
}
