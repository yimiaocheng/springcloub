package com.csair.interFromApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableDiscoveryClient           //通过该注解，实现服务发现，注册
@EnableEurekaClient				//通过注解@EnableEurekaClient 表明自己是一个eurekaclient. 服务提供者
@SpringBootApplication  
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
