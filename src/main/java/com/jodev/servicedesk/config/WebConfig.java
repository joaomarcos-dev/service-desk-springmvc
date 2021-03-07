package com.jodev.servicedesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.jodev.servicedesk.controller.Controller01;

/**This class will be used by the root IOC to get the configuration for each bean under the root IOC management*/
@PropertySource("classpath:application.properties")
@Configuration
@ComponentScan(basePackages= {"com.jodev.spring.springmvc", "com.jodev.spring.springmvc.controllers"}) 
@EnableWebMvc
public class WebConfig{
	
	//Configuring a Controller bean
	@Bean
	public Controller01 controller01() {
		return new Controller01();
	}
}
