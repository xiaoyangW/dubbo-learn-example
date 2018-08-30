package com.xiaoyang.zookeeperserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZookeeperServerApplication {


	public static void main(String[] args) {
		// start embedded zookeeper server
		new EmbeddedZooKeeper(2181, false).start();
	}
	
}
