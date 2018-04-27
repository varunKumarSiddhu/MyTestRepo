package com.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.application")
//@EnableDiscoveryClient
@EnableEurekaClient
public class MySpringBootStarter {

	public static void main(String[] args) {
		//used to boot strap app..means self sustaing the app by extrnl cmd
		
		SpringApplication.run(MySpringBootStarter.class, args);

	}

}
