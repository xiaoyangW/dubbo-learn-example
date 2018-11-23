package com.xiaoyang.dubboclient;

import org.springframework.boot.SpringApplication;

import javax.annotation.PostConstruct;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboClientApplication {
    /**
     * url中的ip是发布服务中的ip可在启动server服务时的日志中看到
     */

    public static void main(String[] args) {
        SpringApplication.run(DubboClientApplication.class, args);
    }

}
