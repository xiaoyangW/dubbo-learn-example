package com.xiaoyang.dubboclient;

import com.xiaoyang.DubboService;
import org.springframework.boot.SpringApplication;

import javax.annotation.PostConstruct;
import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboClientApplication {
	/**
	 * url中的ip是发布服务中的ip可在启动server服务时的日志中看到
	 */
	@Reference(url = "dubbo://169.254.1.7:20880",version = "1.0.0")
  	private DubboService demoService;

	public static void main(String[] args) {

		SpringApplication.run(DubboClientApplication.class, args);
	}
	
    @PostConstruct
    public void init() {
    	String sayHello = demoService.sayHello("world");
    	System.err.println(sayHello);
    }
}
