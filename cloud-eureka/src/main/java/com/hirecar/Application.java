package com.hirecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer	//开启eureka服务 启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class Application {
	
	//spring boot入口	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
